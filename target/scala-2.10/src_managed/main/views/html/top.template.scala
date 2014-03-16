
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
                   <a class="navbar-brand" href=""""),_display_(Seq[Any](/*11.51*/routes/*11.57*/.Application.index())),format.raw/*11.77*/(""""><img src=""""),_display_(Seq[Any](/*11.90*/routes/*11.96*/.Assets.at("images/stalkio_logo.png"))),format.raw/*11.133*/("""""/></a>
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
						    <li><a href=""""),_display_(Seq[Any](/*26.25*/routes/*26.31*/.Application.logout())),format.raw/*26.52*/("""">Logout</a></li>
						""")))})),format.raw/*27.8*/("""
                       
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
                    DATE: Thu Mar 13 22:57:58 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/top.scala.html
                    HASH: dd1427068b629148cb5e0fe8ca25a87a93c338b4
                    MATRIX: 853->0|1418->529|1433->535|1475->555|1524->568|1539->574|1599->611|1805->781|1820->787|1862->807|1951->860|1966->866|2010->888|2103->945|2118->951|2162->973|2254->1029|2269->1035|2313->1057|2405->1113|2420->1119|2464->1141|2567->1208|2608->1240|2647->1241|2708->1266|2723->1272|2766->1293|2861->1352|2876->1358|2918->1378|2960->1402|2973->1406|3012->1407|3070->1429|3085->1435|3126->1454|3202->1494|3217->1500|3260->1521|3316->1546
                    LINES: 29->1|39->11|39->11|39->11|39->11|39->11|39->11|43->15|43->15|43->15|44->16|44->16|44->16|45->17|45->17|45->17|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|50->22|50->22|50->22|51->23|51->23|51->23|52->24|52->24|52->24|53->25|53->25|53->25|54->26|54->26|54->26|55->27
                    -- GENERATED --
                */
            