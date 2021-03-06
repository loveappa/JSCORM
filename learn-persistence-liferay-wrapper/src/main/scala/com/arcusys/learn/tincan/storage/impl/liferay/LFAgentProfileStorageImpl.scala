package com.arcusys.learn.tincan.storage.impl.liferay

import com.arcusys.learn.storage.impl.KeyedEntityStorage
import com.arcusys.learn.tincan.model.{Account, Agent, AgentProfile}
import com.arcusys.learn.persistence.liferay.service.{LFTincanLrsDocumentLocalServiceUtil, LFTincanActorLocalServiceUtil, LFTincanLrsAgentProfileLocalServiceUtil}
import com.arcusys.learn.persistence.liferay.model.LFTincanLrsAgentProfile
import scala.collection.JavaConverters._
import com.arcusys.learn.tincan.storage.impl.liferay.mapper.{DocumentMapper, ActorMapper}
import java.util.Date
import com.arcusys.learn.tincan.storage.ActorStorage
import org.json4s.{Extraction, DefaultFormats, Formats}
import org.json4s.jackson.JsonMethods._
import com.arcusys.learn.tincan.model.Account
import com.arcusys.learn.tincan.model.Agent
import com.arcusys.learn.tincan.model.AgentProfile
import com.arcusys.learn.util.JsonSerializer.AccountSerializer

trait LFAgentProfileStorageImpl extends KeyedEntityStorage[AgentProfile] {

  def actorStorage: ActorStorage

  def documentStorage: LFDocumentStorageImpl

  def serializeAccount(account: Account) = {
    implicit val jsonFormats: Formats = DefaultFormats + new AccountSerializer
    compact(render(Extraction.decompose(account)))
  }

  def extract(lfEntity: LFTincanLrsAgentProfile): AgentProfile = {
    AgentProfile(
      lfEntity.getProfileId,
      ActorMapper.mapToAgent(LFTincanActorLocalServiceUtil.getLFTincanActor(lfEntity.getAgentId.toLong)),
      DocumentMapper.map(LFTincanLrsDocumentLocalServiceUtil.getLFTincanLrsDocument(lfEntity.getDocumentId.toLong))
    )
  }

  def renew() {
    LFTincanLrsAgentProfileLocalServiceUtil.removeAll()
  }

  private def findAgents(agent: Agent) = {
    LFTincanActorLocalServiceUtil.findAgent(
      agent.objectType,
      agent.mbox.getOrElse(null),
      agent.mbox_sha1sum.getOrElse(null),
      agent.openid.getOrElse(null),
      if(agent.account.isDefined) serializeAccount(agent.account.get) else null
    ).asScala.toSeq
  }

  def getByID(id: Int, parameters: (String, Any)*): Option[AgentProfile] = {
    Option(LFTincanLrsAgentProfileLocalServiceUtil.getLFTincanLrsAgentProfile(id.toLong)).map(extract)
  }

  def getOne(parameters: (String, Any)*): Option[AgentProfile] = parameters match {
    case Seq(("profileId", (profileId: String)), ("agent", (agent: Agent))) => {
      val actorIds = findAgents(agent).map(_.getId)
      actorIds.map(actorId => Option(LFTincanLrsAgentProfileLocalServiceUtil.findByAgentIdAndProfileId(actorId.toInt, profileId))).flatMap(o => o).headOption.map(extract)
    }
  }

  def delete(parameters: (String, Any)*) {
    parameters match {
      case Seq(("profileId", profileId: String), ("agent", agent: Agent)) => {
        val actorIds = findAgents(agent).map(_.getId)
        val agentProfileIds = actorIds.map(actorId => LFTincanLrsAgentProfileLocalServiceUtil.findByAgentIdAndProfileId(actorId.toInt, profileId)).filter(_ != null).map(_.getId)
        agentProfileIds.foreach(LFTincanLrsAgentProfileLocalServiceUtil.deleteLFTincanLrsAgentProfile)
      }
    }
  }

  def create(entity: AgentProfile, parameters: (String, Any)*) {
    createAndGetID(entity, parameters: _*)
  }

  def createAndGetID(entity: AgentProfile, parameters: (String, Any)*) = {
    LFTincanLrsAgentProfileLocalServiceUtil.createLFTincanLrsActivityProfile(
      actorStorage.createAndGetID(entity.agent),
      entity.profileId,
      documentStorage.createAndGetID(entity.content)
    ).getId.toInt
  }

  def modify(entity: AgentProfile, parameters: (String, Any)*) {
    val actorIds = findAgents(entity.agent).map(_.getId)
    val agentProfileOption = actorIds.map(actorId => LFTincanLrsAgentProfileLocalServiceUtil.findByAgentIdAndProfileId(actorId.toInt, entity.profileId)).find(_ != null)

    agentProfileOption match {
      case agentProfile: LFTincanLrsAgentProfile => {
        val document = LFTincanLrsDocumentLocalServiceUtil.getLFTincanLrsDocument(agentProfile.getDocumentId.toLong)
        document.setContentType(entity.content.cType.name)
        document.setContent(entity.content.contents)
        LFTincanLrsDocumentLocalServiceUtil.updateLFTincanLrsDocument(document)
      }
      case None => Nil
    }
  }


  def getAll(parameters: (String, Any)*): Seq[AgentProfile] = parameters match {
    case Seq(("agent", (agent: Agent)), ("since", since: Option[Date])) => {

           findAgents(agent)
             .flatMap(a => LFTincanLrsAgentProfileLocalServiceUtil.findByAgentId(a.getId.toInt).asScala)
             .filter(ap => !since.isDefined
              || LFTincanLrsDocumentLocalServiceUtil.getLFTincanLrsDocument(ap.getDocumentId.toInt).getUpdate.compareTo(since.get) >= 0)
             .map(extract)

    }


  }

  def createAndGetID(parameters: (String, Any)*): Int = throw new UnsupportedOperationException()

  def create(parameters: (String, Any)*) {
    throw new UnsupportedOperationException()
  }

  def modify(parameters: (String, Any)*) {
    throw new UnsupportedOperationException()
  }

  def execute(sqlKey: String, parameters: (String, Any)*) {
    throw new UnsupportedOperationException()
  }

  def getAll(sqlKey: String, parameters: (String, Any)*): Seq[AgentProfile] = throw new UnsupportedOperationException()

  def getOne(sqlKey: String, parameters: (String, Any)*): Option[AgentProfile] = throw new UnsupportedOperationException()

  def modify(sqlKey: String, parameters: (String, Any)*) {
    throw new UnsupportedOperationException()
  }
}
