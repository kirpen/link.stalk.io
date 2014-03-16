// @SOURCE:/Users/eskozz/xpush/stalk.io/conf/routes
// @HASH:9249f4d17198602977cc3ee57f9ddcfd7df404f2
// @DATE:Thu Mar 13 15:13:11 KST 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseStalk {
    

// @LINE:20
def deleteStalkUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "delete")
}
                                                

// @LINE:21
def auth(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "auth")
}
                                                

// @LINE:17
def signup(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:19
def registStalkUser(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "regist")
}
                                                

// @LINE:22
def operator(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "operator")
}
                                                

// @LINE:18
def login(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def feature(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "feature")
}
                                                

// @LINE:8
def install(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "install")
}
                                                

// @LINE:11
def signup(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "signup")
}
                                                

// @LINE:15
def chat(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "chat")
}
                                                

// @LINE:13
def logout(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "logout")
}
                                                

// @LINE:9
def pricing(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "pricing")
}
                                                

// @LINE:14
def info(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "info")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                

// @LINE:10
def contact(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "contact")
}
                                                

// @LINE:12
def login(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "login")
}
                                                
    
}
                          
}
                  


// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseStalk {
    

// @LINE:20
def deleteStalkUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stalk.deleteStalkUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "delete"})
      }
   """
)
                        

// @LINE:21
def auth : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stalk.auth",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "auth"})
      }
   """
)
                        

// @LINE:17
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stalk.signup",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:19
def registStalkUser : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stalk.registStalkUser",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "regist"})
      }
   """
)
                        

// @LINE:22
def operator : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stalk.operator",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "operator"})
      }
   """
)
                        

// @LINE:18
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Stalk.login",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def feature : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.feature",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "feature"})
      }
   """
)
                        

// @LINE:8
def install : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.install",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "install"})
      }
   """
)
                        

// @LINE:11
def signup : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.signup",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
      }
   """
)
                        

// @LINE:15
def chat : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.chat",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "chat"})
      }
   """
)
                        

// @LINE:13
def logout : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.logout",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
      }
   """
)
                        

// @LINE:9
def pricing : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pricing",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pricing"})
      }
   """
)
                        

// @LINE:14
def info : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.info",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "info"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

// @LINE:10
def contact : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.contact",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
      }
   """
)
                        

// @LINE:12
def login : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.login",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:26
// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:26
class ReverseAssets {
    

// @LINE:26
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:22
// @LINE:21
// @LINE:20
// @LINE:19
// @LINE:18
// @LINE:17
class ReverseStalk {
    

// @LINE:20
def deleteStalkUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stalk.deleteStalkUser(), HandlerDef(this, "controllers.Stalk", "deleteStalkUser", Seq(), "POST", """""", _prefix + """delete""")
)
                      

// @LINE:21
def auth(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stalk.auth(), HandlerDef(this, "controllers.Stalk", "auth", Seq(), "POST", """""", _prefix + """auth""")
)
                      

// @LINE:17
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stalk.signup(), HandlerDef(this, "controllers.Stalk", "signup", Seq(), "POST", """""", _prefix + """signup""")
)
                      

// @LINE:19
def registStalkUser(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stalk.registStalkUser(), HandlerDef(this, "controllers.Stalk", "registStalkUser", Seq(), "POST", """""", _prefix + """regist""")
)
                      

// @LINE:22
def operator(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stalk.operator(), HandlerDef(this, "controllers.Stalk", "operator", Seq(), "GET", """""", _prefix + """operator""")
)
                      

// @LINE:18
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Stalk.login(), HandlerDef(this, "controllers.Stalk", "login", Seq(), "POST", """""", _prefix + """login""")
)
                      
    
}
                          

// @LINE:15
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {
    

// @LINE:7
def feature(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.feature(), HandlerDef(this, "controllers.Application", "feature", Seq(), "GET", """""", _prefix + """feature""")
)
                      

// @LINE:8
def install(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.install(), HandlerDef(this, "controllers.Application", "install", Seq(), "GET", """""", _prefix + """install""")
)
                      

// @LINE:11
def signup(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.signup(), HandlerDef(this, "controllers.Application", "signup", Seq(), "GET", """""", _prefix + """signup""")
)
                      

// @LINE:15
def chat(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.chat(), HandlerDef(this, "controllers.Application", "chat", Seq(), "GET", """""", _prefix + """chat""")
)
                      

// @LINE:13
def logout(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.logout(), HandlerDef(this, "controllers.Application", "logout", Seq(), "GET", """""", _prefix + """logout""")
)
                      

// @LINE:9
def pricing(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pricing(), HandlerDef(this, "controllers.Application", "pricing", Seq(), "GET", """""", _prefix + """pricing""")
)
                      

// @LINE:14
def info(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.info(), HandlerDef(this, "controllers.Application", "info", Seq(), "GET", """""", _prefix + """info""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

// @LINE:10
def contact(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.contact(), HandlerDef(this, "controllers.Application", "contact", Seq(), "GET", """""", _prefix + """contact""")
)
                      

// @LINE:12
def login(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.login(), HandlerDef(this, "controllers.Application", "login", Seq(), "GET", """""", _prefix + """login""")
)
                      
    
}
                          
}
        
    