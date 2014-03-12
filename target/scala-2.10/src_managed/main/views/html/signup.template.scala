
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
object signup extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
<link href=""""),_display_(Seq[Any](/*5.14*/routes/*5.20*/.Assets.at("css/stalk.css"))),format.raw/*5.47*/("""" rel="stylesheet" />
<section id="content">
	<!-- <div class="map">
		<iframe src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Kuningan,+Jakarta+Capital+Region,+Indonesia&amp;aq=3&amp;oq=kuningan+&amp;sll=37.0625,-95.677068&amp;sspn=37.410045,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=Kuningan&amp;t=m&amp;z=14&amp;ll=-6.238824,106.830177&amp;output=embed">
		</iframe>
	</div> -->
	<div class="container container-full">
		<div class="row">
			<div class="col-lg-12">
				<div>
					<h1>Now we’re talking!</h1>
					<div class="team-member">
						<figure class="member-photo"><img src=""""),_display_(Seq[Any](/*17.47*/routes/*17.53*/.Assets.at("img/stalk/stalk_1.jpg"))),format.raw/*17.88*/("""" alt="" /></figure>
					</div>
		          	
		          
		          	<div class="col-lg-3"></div>
				
		          	
		          	"""),_display_(Seq[Any](/*24.15*/form(action = routes.Stalk.signup(), 'id -> "contactform", 'class -> "col-lg-6")/*24.95*/{_display_(Seq[Any](format.raw/*24.96*/("""
		          	
		          		
		          		<div class="panel panel-primary">
		          		   <div class="panel-heading">
						    <h3 class="panel-title">Fill your inforamtion</h3>
						  </div>
						  <div class="panel-body">
							
							<div class="form-group">
			                """),_display_(Seq[Any](/*34.21*/if(flash.contains("error"))/*34.48*/ {_display_(Seq[Any](format.raw/*34.50*/("""
			          			<div class="alert alert-dnager">
		          					"""),_display_(Seq[Any](/*36.19*/flash/*36.24*/.get("error"))),format.raw/*36.37*/("""
			          			</div>
			          		""")))})),format.raw/*38.17*/("""
							</div> 
							
							
							<!-- <p>What is your website URL?</p> -->
							<div class="col-lg-12 margintop10  field">
								<input type="text" name="email" placeholder="* Enter your email address" data-rule="email" data-msg="Please enter a valid email" />
								<div class="validation">
								</div>
							</div>
							<!-- <h4>What is your email address?</h4> -->
							<div class="col-lg-12 margintop10  field">
								<input type="text" name="name" placeholder="* Enter your name" data-rule="maxlen:4" data-msg="Please enter at least 4 chars" />
								<div class="validation">
								</div>
							</div>
							<!-- <h4>Names are great! Pick a username</h4> -->
							<div class="col-lg-12 margintop10  field">
								<input type="password" name="password" placeholder="* Enter your super secret password" data-rule="maxlen:4" data-msg="Please enter at least 4 chars" />
								<div class="validation">
								</div>
							</div>
							<!-- <h4>Pick a super secret password</h4> -->
							<div class="col-lg-12 margintop10  field">
								<input type="password" name="repassword" placeholder="* Re enter your password" data-rule="maxlen:4" data-msg="Please enter at least 4 chars" />
								<div class="validation">
								</div>
							</div>
							<!-- <h4>Re-enter your super secret password</h4> -->
							<div class="col-lg-3"></div>
							<button type="submit" id="saveBtn" class="col-lg-6 btn btn-warning btn-lg">Save</button>
							<div class="col-lg-3"></div>
						  </div>
						  
						</div>

						
		          """)))})),format.raw/*75.14*/("""	
		          <div class="col-lg-3"></div>
				</div>

			</div>
		</div>

	</div>
	</section>
	"""),_display_(Seq[Any](/*84.3*/footer())),format.raw/*84.11*/("""
""")))})),format.raw/*85.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 08 20:35:39 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/signup.scala.html
                    HASH: 7db00264f919f9e95b3344e4c2786706bcc566d6
                    MATRIX: 872->18|908->20|933->37|972->39|1021->53|1035->59|1083->86|1740->707|1755->713|1812->748|1983->883|2072->963|2111->964|2439->1256|2475->1283|2515->1285|2619->1353|2633->1358|2668->1371|2740->1411|4343->2982|4475->3079|4505->3087|4538->3089
                    LINES: 30->3|31->4|31->4|31->4|32->5|32->5|32->5|44->17|44->17|44->17|51->24|51->24|51->24|61->34|61->34|61->34|63->36|63->36|63->36|65->38|102->75|111->84|111->84|112->85
                    -- GENERATED --
                */
            