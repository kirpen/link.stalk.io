// @SOURCE:/Users/eskozz/xpush/stalk.io/conf/routes
// @HASH:a09aeb75770b257fff15e78e1df5149e2fa104d5
// @DATE:Sun Mar 16 15:45:10 KST 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:7
private[this] lazy val controllers_Application_feature1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("feature"))))
        

// @LINE:8
private[this] lazy val controllers_Application_install2 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("install"))))
        

// @LINE:9
private[this] lazy val controllers_Application_pricing3 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pricing"))))
        

// @LINE:10
private[this] lazy val controllers_Application_contact4 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("contact"))))
        

// @LINE:11
private[this] lazy val controllers_Application_signup5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:12
private[this] lazy val controllers_Application_login6 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:13
private[this] lazy val controllers_Application_logout7 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("logout"))))
        

// @LINE:14
private[this] lazy val controllers_Application_info8 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("info"))))
        

// @LINE:15
private[this] lazy val controllers_Application_chat9 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("chat"))))
        

// @LINE:17
private[this] lazy val controllers_Stalk_signup10 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("signup"))))
        

// @LINE:18
private[this] lazy val controllers_Stalk_login11 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("login"))))
        

// @LINE:19
private[this] lazy val controllers_Stalk_registStalkUser12 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("regist"))))
        

// @LINE:20
private[this] lazy val controllers_Stalk_deleteStalkUser13 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("delete"))))
        

// @LINE:21
private[this] lazy val controllers_Stalk_auth14 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("auth"))))
        

// @LINE:22
private[this] lazy val controllers_Stalk_operator15 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("operator"))))
        

// @LINE:27
private[this] lazy val controllers_Assets_at16 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """feature""","""controllers.Application.feature()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """install""","""controllers.Application.install()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pricing""","""controllers.Application.pricing()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """contact""","""controllers.Application.contact()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Application.signup()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Application.login()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """logout""","""controllers.Application.logout()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """info""","""controllers.Application.info()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """chat""","""controllers.Application.chat()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """signup""","""controllers.Stalk.signup()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """login""","""controllers.Stalk.login()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """regist""","""controllers.Stalk.registStalkUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """delete""","""controllers.Stalk.deleteStalkUser()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """auth""","""controllers.Stalk.auth()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """operator""","""controllers.Stalk.operator()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:7
case controllers_Application_feature1(params) => {
   call { 
        invokeHandler(controllers.Application.feature(), HandlerDef(this, "controllers.Application", "feature", Nil,"GET", """""", Routes.prefix + """feature"""))
   }
}
        

// @LINE:8
case controllers_Application_install2(params) => {
   call { 
        invokeHandler(controllers.Application.install(), HandlerDef(this, "controllers.Application", "install", Nil,"GET", """""", Routes.prefix + """install"""))
   }
}
        

// @LINE:9
case controllers_Application_pricing3(params) => {
   call { 
        invokeHandler(controllers.Application.pricing(), HandlerDef(this, "controllers.Application", "pricing", Nil,"GET", """""", Routes.prefix + """pricing"""))
   }
}
        

// @LINE:10
case controllers_Application_contact4(params) => {
   call { 
        invokeHandler(controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Nil,"GET", """""", Routes.prefix + """contact"""))
   }
}
        

// @LINE:11
case controllers_Application_signup5(params) => {
   call { 
        invokeHandler(controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Nil,"GET", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:12
case controllers_Application_login6(params) => {
   call { 
        invokeHandler(controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Nil,"GET", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:13
case controllers_Application_logout7(params) => {
   call { 
        invokeHandler(controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Nil,"GET", """""", Routes.prefix + """logout"""))
   }
}
        

// @LINE:14
case controllers_Application_info8(params) => {
   call { 
        invokeHandler(controllers.Application.info(), HandlerDef(this, "controllers.Application", "info", Nil,"GET", """""", Routes.prefix + """info"""))
   }
}
        

// @LINE:15
case controllers_Application_chat9(params) => {
   call { 
        invokeHandler(controllers.Application.chat(), HandlerDef(this, "controllers.Application", "chat", Nil,"GET", """""", Routes.prefix + """chat"""))
   }
}
        

// @LINE:17
case controllers_Stalk_signup10(params) => {
   call { 
        invokeHandler(controllers.Stalk.signup(), HandlerDef(this, "controllers.Stalk", "signup", Nil,"POST", """""", Routes.prefix + """signup"""))
   }
}
        

// @LINE:18
case controllers_Stalk_login11(params) => {
   call { 
        invokeHandler(controllers.Stalk.login(), HandlerDef(this, "controllers.Stalk", "login", Nil,"POST", """""", Routes.prefix + """login"""))
   }
}
        

// @LINE:19
case controllers_Stalk_registStalkUser12(params) => {
   call { 
        invokeHandler(controllers.Stalk.registStalkUser(), HandlerDef(this, "controllers.Stalk", "registStalkUser", Nil,"POST", """""", Routes.prefix + """regist"""))
   }
}
        

// @LINE:20
case controllers_Stalk_deleteStalkUser13(params) => {
   call { 
        invokeHandler(controllers.Stalk.deleteStalkUser(), HandlerDef(this, "controllers.Stalk", "deleteStalkUser", Nil,"POST", """""", Routes.prefix + """delete"""))
   }
}
        

// @LINE:21
case controllers_Stalk_auth14(params) => {
   call { 
        invokeHandler(controllers.Stalk.auth(), HandlerDef(this, "controllers.Stalk", "auth", Nil,"POST", """""", Routes.prefix + """auth"""))
   }
}
        

// @LINE:22
case controllers_Stalk_operator15(params) => {
   call { 
        invokeHandler(controllers.Stalk.operator(), HandlerDef(this, "controllers.Stalk", "operator", Nil,"GET", """""", Routes.prefix + """operator"""))
   }
}
        

// @LINE:27
case controllers_Assets_at16(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     