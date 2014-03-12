
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

<section id="inner-headline">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<ul class="breadcrumb">
					<li><a href="#"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
					<li><a href="#">Features</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	</section>
	<section id="content">
	<div class="container">
		<div class="row">
			<div class="col-lg-3">
				<h3>with Social Network Service</h3>
				<p>Those who access your web sites will be able to talk to each other after login with Facebook / Twitter / Google+.</p>
			</div>
			<div class="col-lg-9">
                 <img src=""""),_display_(Seq[Any](/*26.29*/routes/*26.35*/.Assets.at("img/stalk/ss001.png"))),format.raw/*26.68*/("""" style="max-width: 100%; height: auto;" />
            </div>


		</div>

		<div class="row">
			<div class="col-lg-3">
				<h3>for Every Web Browsers</h3>
                <p>"stalk.io service" works in <strong>IE 6+, chrome, safari and all mobile browsers</strong>. <br/><em>" Cross Browser Compatibility "</em><br/></p>
                
            </div>
			<div class="col-lg-9">
				<img src=""""),_display_(Seq[Any](/*39.16*/routes/*39.22*/.Assets.at("img/stalk/ss002.jpg"))),format.raw/*39.55*/("""" style="max-width: 100%; height: auto;" />
			</div>
			
		</div>
		
	</div>
	</section>
	"""),_display_(Seq[Any](/*46.3*/footer())),format.raw/*46.11*/("""
""")))})))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 08 20:35:39 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/feature.scala.html
                    HASH: d7c5f19a87508efd366c2ed9543870e1ca011b2c
                    MATRIX: 873->17|909->19|934->36|973->38|1649->678|1664->684|1719->717|2155->1117|2170->1123|2225->1156|2352->1248|2382->1256
                    LINES: 30->2|31->3|31->3|31->3|54->26|54->26|54->26|67->39|67->39|67->39|74->46|74->46
                    -- GENERATED --
                */
            