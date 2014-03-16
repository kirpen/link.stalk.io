
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
object feature extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*2.1*/("""
"""),_display_(Seq[Any](/*3.2*/main("Todo list")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""


	<section id="content">
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<h3>with Social Network Service</h3>
				<p>Those who access your web sites will be able to talk to each other after login with Facebook / Twitter / Google+.</p>
			</div>
			<div class="col-lg-9">
                 <img src=""""),_display_(Seq[Any](/*14.29*/routes/*14.35*/.Assets.at("img/stalk/ss001.png"))),format.raw/*14.68*/("""" style="max-width: 100%; height: auto;" />
            </div>


		</div>

		<div class="row">
			<div class="col-lg-3">
				<h3>for Every Web Browsers</h3>
                <p>"stalk.io service" works in <strong>IE 6+, chrome, safari and all mobile browsers</strong>. <br/><em>" Cross Browser Compatibility "</em><br/></p>
                
            </div>
			<div class="col-lg-9">
				<img src=""""),_display_(Seq[Any](/*27.16*/routes/*27.22*/.Assets.at("img/stalk/ss002.jpg"))),format.raw/*27.55*/("""" style="max-width: 100%; height: auto;" />
			</div>
			
		</div>
		
	</div>
	</section>
	"""),_display_(Seq[Any](/*34.3*/footer())),format.raw/*34.11*/("""
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 13 22:26:04 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/feature.scala.html
                    HASH: dde0b372c11f74bc2394c5d72c1b3ea777b554c2
                    MATRIX: 873->17|909->19|934->36|973->38|1337->366|1352->372|1407->405|1843->805|1858->811|1913->844|2040->936|2070->944
                    LINES: 30->2|31->3|31->3|31->3|42->14|42->14|42->14|55->27|55->27|55->27|62->34|62->34
                    -- GENERATED --
                */
            