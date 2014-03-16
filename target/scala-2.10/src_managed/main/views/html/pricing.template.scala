
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
object pricing extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""

	<section id="content">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<h4>Example on <strong>3 columns</strong></h4>
			</div>
			<div class="col-lg-4">
				<div class="pricing-box-alt">
					<div class="pricing-heading">
						<h3>Very <strong>Basic</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;15.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-4">
				<div class="pricing-box-alt special">
					<div class="pricing-heading">
						<h3>Good <strong>Choice</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;25.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-4">
				<div class="pricing-box-alt">
					<div class="pricing-heading">
						<h3>Just <strong>Happy</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;35.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
		</div>
		<!-- divider -->
		<div class="row">
			<div class="col-lg-12">
				<div class="solidline">
				</div>
			</div>
		</div>
		<!-- end divider -->
		<div class="row">
			<div class="col-lg-12">
				<h4>Example on <strong>4 columns</strong></h4>
			</div>
			<div class="col-lg-3">
				<div class="pricing-box-alt">
					<div class="pricing-heading">
						<h3>Very <strong>Basic</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;15.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="pricing-box-alt">
					<div class="pricing-heading">
						<h3>Simple <strong>Choice</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;20.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="pricing-box-alt special">
					<div class="pricing-heading">
						<h3>Special <strong>Choice</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;15.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="pricing-box-alt">
					<div class="pricing-heading">
						<h3>Just <strong>Happy</strong></h3>
					</div>
					<div class="pricing-terms">
						<h6>&#36;15.00 / Month</h6>
					</div>
					<div class="pricing-content">
						<ul>
							<li><i class="icon-ok"></i> 100 applications</li>
							<li><i class="icon-ok"></i> 24x7 support available</li>
							<li><i class="icon-ok"></i> No hidden fees</li>
							<li><i class="icon-ok"></i> Free 30-days trial</li>
							<li><i class="icon-ok"></i> Stop anytime easily</li>
						</ul>
					</div>
					<div class="pricing-action">
						<a href="#" class="btn btn-medium btn-theme"><i class="icon-bolt"></i> Register now</a>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	"""),_display_(Seq[Any](/*182.3*/footer())),format.raw/*182.11*/("""
""")))})),format.raw/*183.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 13 22:25:42 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/pricing.scala.html
                    HASH: e776a256ffeb60edb012814a2e6a7c933d9070ef
                    MATRIX: 873->18|909->20|934->37|973->39|6765->5795|6796->5803|6830->5805
                    LINES: 30->3|31->4|31->4|31->4|209->182|209->182|210->183
                    -- GENERATED --
                */
            