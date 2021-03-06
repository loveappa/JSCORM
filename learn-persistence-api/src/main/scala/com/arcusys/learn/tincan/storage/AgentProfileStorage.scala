package com.arcusys.learn.tincan.storage

import java.util.Date

import com.arcusys.learn.tincan.model.{Person, AgentProfile, Agent}


trait AgentProfileStorage {


  def get(profileId: String, agent: Agent): Option[AgentProfile]
  def getIds(agent: Agent, since: Option[Date]): Seq[String]
  def create(entity: AgentProfile)
  def modify(entity: AgentProfile)
  def delete(profileId: String, agent: Agent)
  def renew()
}
