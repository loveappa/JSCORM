package com.arcusys.learn.web

import org.scalatra.ScalatraServlet
import com.arcusys.scala.scalatra.json.JsonSupport
import com.escalatesoft.subcut.inject.{Injectable, BindingModule}
import com.arcusys.learn.service.util.{SessionHandlerContract}
import org.joda.time.DateTime
import java.util.Date

//import org.slf4j.LoggerFactory

import com.arcusys.learn.storage.StorageFactoryContract

abstract class ServletBase(configuration: BindingModule) extends ScalatraServlet with JsonSupport with Injectable {
  before() {
    response.setHeader("Cache-control", "must-revalidate,no-cache,no-store")
    response.setHeader("Expires", "-1")
  }

  implicit val bindingModule = configuration
  val storageFactory = inject[StorageFactoryContract]
  val sessionHandler = inject[SessionHandlerContract]

  class JsonModelBuilder[T](transform: T => Map[String, Any]) {
    def apply(entity: T): String = json(transform(entity))

    def apply(entities: Seq[T]): String = json(entities.map(transform(_)))

    def apply(entityOption: Option[T]): String = entityOption match {
      case Some(entity) => json(transform(entity))
      case None => halt(404, "Entity not found for given parameters")
    }

    def map(entity: T): Map[String, Any] = transform(entity)

    def map(entities: Seq[T]): Seq[Map[String, Any]] = entities.map(transform(_))
  }

  class ParameterBase(name: String) {
    def required = params.getOrElse(name, halt(400, "Required parameter '" + name + "' is not specified"))

    def withDefault(default: String) = params.getOrElse(name, default)

    def longRequired = try {
      required.toLong
    } catch {
      case _ => halt(405, "Long parameter '" + name + "' could not be parsed")
    }

    def intRequired = try {
      required.toInt
    } catch {
      case _ => halt(405, "Integer parameter '" + name + "' could not be parsed")
    }

    def option: Option[String] = params.get(name)

    def intOption(none: String): Option[Int] = {
      val value = params.getOrElse(name, none)
      if (value == none) None
      else Some(try {
        value.toInt
      } catch {
        case _ => halt(405, "Integer parameter '" + name + "' could not be parsed")
      })
    }

    def intOption(none: Int): Option[Int] = intOption(none.toString)

    def bigDecimalOption(none: String): Option[BigDecimal] = {
      val value = params.getOrElse(name, none)
      if (value == none) None
      else Some(try {
        BigDecimal(value.toDouble)
      } catch {
        case _ => halt(405, "BigDecimal parameter '" + name + "' could not be parsed")
      })
    }

    def booleanRequired = try {
      required.toBoolean
    } catch {
      case _ => halt(405, "Boolean parameter '" + name + "' could not be parsed")
    }

    def booleanOption(none: String): Option[Boolean] = {
      val value = params.getOrElse(name, none)
      if (value == none) None
      else Some(try {
        value.toBoolean
      } catch {
        case _ => halt(405, "Integer parameter '" + name + "' could not be parsed")
      })
    }

    def dateOption(none: String): Option[Date] = {
      val value = params.getOrElse(name, none)
      if (value == none) None
      else Some(try {
        new DateTime(value).toDate
      } catch {
        case _ => halt(405, "Integer parameter '" + name + "' could not be parsed")
      })
    }

    def multiRequired()={
      multiParams.get(name)
    }

    def contains() = params.contains(name)
  }

  def parameter(name: String) = new ParameterBase(name)

  def isAdmin = try {
    sessionHandler.getAttribute(request.getCookies, "isAdmin").asInstanceOf[Boolean]
  } catch {
    case e: Exception => false
  }

  def hasTeacherPermissions = try {
    sessionHandler.getAttribute(request.getCookies, "hasTeacherPermissions").asInstanceOf[Boolean]
  } catch {
    case e: Exception => false
  }

  def getCompanyId = { //try {
    val company = request.cookies.get("COMPANY_ID")
    company.getOrElse("-1").toInt
  }

  def getSessionUserID = try {
    sessionHandler.getAttribute(request.getCookies, "userID").asInstanceOf[String].toInt
  } catch {
    case e:Exception => -1 // guest
  }

  def requireAdmin() {
    if (!isAdmin) halt(401)
  }

  def requireTeacherPermissions() {
    if (!hasTeacherPermissions) halt(401)
  }
}
