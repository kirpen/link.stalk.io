
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
object login extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
<link href=""""),_display_(Seq[Any](/*5.14*/routes/*5.20*/.Assets.at("css/stalk.css"))),format.raw/*5.47*/("""" rel="stylesheet" />
<section id="content">
<div class="container container-full">
		<div class="row">
			<div class="col-lg-12">
				<div>
					<h1>LOGIN</h1>
					
		          	<div class="col-lg-3"></div>
				
		          	"""),_display_(Seq[Any](/*15.15*/form(action = routes.Stalk.login(), 'id -> "contactform", 'class -> "col-lg-6")/*15.94*/{_display_(Seq[Any](format.raw/*15.95*/("""	
		          		
		          		<div class="panel panel-primary">
		          		  <div class="form-group">
			                """),_display_(Seq[Any](/*19.21*/if(flash.contains("error"))/*19.48*/ {_display_(Seq[Any](format.raw/*19.50*/("""
			          			<div class="alert alert-dnager">
		          					"""),_display_(Seq[Any](/*21.19*/flash/*21.24*/.get("error"))),format.raw/*21.37*/("""
			          			</div>
			          		""")))})),format.raw/*23.17*/("""
							</div> 
						  <div class="panel-body">
						  
							<div class="col-lg-12 margintop10  field">
								<input type="text" name="email" placeholder="* Email" data-rule="emails" data-msg="Please enter a valid email" />
								<div class="validation">
								</div>
							</div>
							<!-- <p>What is your website URL?</p> -->
							<div class="col-lg-12 margintop10  field">
								<input type="password" name="password" placeholder="* Password" />
								<div class="validation">
								</div>
							</div>
							
							<!-- <h4>Re-enter your super secret password</h4> -->
							<div class="col-lg-3"></div>
							<button type="submit" id="saveBtn" class="col-lg-6 btn btn-warning btn-lg">Sign in</button>
							<div class="col-lg-3"></div>
						  </div>
						  
						</div>

						
		         """)))})),format.raw/*48.13*/("""
		          <div class="col-lg-3"></div>
				</div>

			</div>
		</div>

	</div>
	</section>
	"""),_display_(Seq[Any](/*57.3*/footer())),format.raw/*57.11*/("""
""")))})),format.raw/*58.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 08 20:35:39 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/login.scala.html
                    HASH: a2754cf489042a2252cd6e2fb30f5697cba529d2
                    MATRIX: 871->18|907->20|932->37|971->39|1020->53|1034->59|1082->86|1346->314|1434->393|1473->394|1635->520|1671->547|1711->549|1815->617|1829->622|1864->635|1936->675|2793->1500|2924->1596|2954->1604|2987->1606
                    LINES: 30->3|31->4|31->4|31->4|32->5|32->5|32->5|42->15|42->15|42->15|46->19|46->19|46->19|48->21|48->21|48->21|50->23|75->48|84->57|84->57|85->58
                    -- GENERATED --
                */
            