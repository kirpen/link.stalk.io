
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object top extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.1*/("""<!-- start header -->
<header>
       <div class="navbar navbar-default navbar-static-top">
           <div class="container">
               <div class="navbar-header">
                   <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                       <span class="icon-bar"></span>
                       <span class="icon-bar"></span>
                       <span class="icon-bar"></span>
                   </button>
                   <a class="navbar-brand" href="index()"><span>stalk.</span>io</a>
               </div>
               <div class="navbar-collapse collapse ">
                   <ul class="nav navbar-nav">
                       <li><a href=""""),_display_(Seq[Any](/*15.38*/routes/*15.44*/.Application.index())),format.raw/*15.64*/("""">Home</a></li>
                       <li><a href=""""),_display_(Seq[Any](/*16.38*/routes/*16.44*/.Application.feature())),format.raw/*16.66*/("""">Features</a></li>
                       <li><a href=""""),_display_(Seq[Any](/*17.38*/routes/*17.44*/.Application.install())),format.raw/*17.66*/("""">Install</a></li>
                       <li><a href=""""),_display_(Seq[Any](/*18.38*/routes/*18.44*/.Application.pricing())),format.raw/*18.66*/("""">Pricing</a></li>
                       <li><a href=""""),_display_(Seq[Any](/*19.38*/routes/*19.44*/.Application.contact())),format.raw/*19.66*/("""">Contact</a></li>
                       
                       """),_display_(Seq[Any](/*21.25*/if(session().get("email")==null)/*21.57*/{_display_(Seq[Any](format.raw/*21.58*/("""
						    <li><a href=""""),_display_(Seq[Any](/*22.25*/routes/*22.31*/.Application.signup())),format.raw/*22.52*/("""">Sign up!</a></li>
                       		<li><a href=""""),_display_(Seq[Any](/*23.40*/routes/*23.46*/.Application.login())),format.raw/*23.66*/("""">Login</a></li>
						""")))}/*24.8*/else/*24.12*/{_display_(Seq[Any](format.raw/*24.13*/("""
							<li><a href=""""),_display_(Seq[Any](/*25.22*/routes/*25.28*/.Application.info())),format.raw/*25.47*/("""">Info</a></li>
							
						    <li><a href=""""),_display_(Seq[Any](/*27.25*/routes/*27.31*/.Application.logout())),format.raw/*27.52*/("""">Logout</a></li>
						""")))})),format.raw/*28.8*/("""
                       
                   </ul>
               </div>
           </div>
       </div>
</header>
<!-- end header -->"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 12 16:40:57 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/top.scala.html
                    HASH: 826efaf28cad1f27ade496a13f76a3aa4d52abe0
                    MATRIX: 853->0|1613->724|1628->730|1670->750|1759->803|1774->809|1818->831|1911->888|1926->894|1970->916|2062->972|2077->978|2121->1000|2213->1056|2228->1062|2272->1084|2375->1151|2416->1183|2455->1184|2516->1209|2531->1215|2574->1236|2669->1295|2684->1301|2726->1321|2768->1345|2781->1349|2820->1350|2878->1372|2893->1378|2934->1397|3018->1445|3033->1451|3076->1472|3132->1497
                    LINES: 29->1|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|55->27|55->27|55->27|56->28
                    -- GENERATED --
                */
            