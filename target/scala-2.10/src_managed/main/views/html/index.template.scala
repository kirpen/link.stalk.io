
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
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
    <!-- end header -->
	<section id="featured">
	<!-- start slider -->
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
	<!-- Slider -->
        <div id="main-slider" class="flexslider">
            <ul class="slides">
              <li>
              
              
              
                <img src=""""),_display_(Seq[Any](/*18.28*/routes/*18.34*/.Assets.at("img/opcon_front.png"))),format.raw/*18.67*/("""" alt="" />
                <div class="flex-caption">
                    <h3>stalk.io</h3> 
					<p>You can install this right where you want it.
For Wordpress, Tumblr, Blogger and your Any Web Sites</p> 
					<a href="#" class="btn btn-theme">Learn More</a>
                </div>
              </li>
              
            </ul>
        </div>
	<!-- end slider -->
			</div>
		</div>
	</div>	
	
	

	</section>
	<section class="callaction">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="big-cta">
					<div class="cta-text">
						<h2><span>stalk.io</span> Live web chat service on your web page</h2>
					</div>
				</div>
			</div>
		</div>
	</div>
	</section>
	<section id="content">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<div class="row">
					<div class="col-lg-3">
						<div class="box">
							<div class="box-bottom">
								<h4>No Active-X</h4>
							</div>
							<div class="box-gray aligncenter">
								
								<div class="icon">
								<i class="fa fa-code fa-3x"></i>
								</div>
								<p>
								 It’s a useful communication tool for your web sites that lets you create free and multi-user live chat with no Active-X and no plugins
								</p>
									
							</div>
							
						</div>
					</div>


					<div class="col-lg-3">
						<div class="box">
							<div class="box-bottom">
								<h4>Responsive</h4>
							</div>
							<div class="box-gray aligncenter">
								
								<div class="icon">
								<i class="fa fa-terminal fa-3x"></i>
								</div>
								<p>
								 Anyone who visits the same URL in your web sites can join the chat.
								</p>
									
							</div>
							
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-bottom">
								<h4>Customizable</h4>
							</div>
							<div class="box-gray aligncenter">
								
								<div class="icon">
								<i class="fa fa-edit fa-3x"></i>
								</div>
								<p>
								Make Customers Happy, One Chat At A Time
								
								</p>
									
							</div>
							
						</div>
					</div>
					<div class="col-lg-3">
						<div class="box">
							<div class="box-bottom">
								<h4>Install</h4>
							</div>
							<div class="box-gray aligncenter">
								
								<div class="icon">
								<i class="fa fa-bolt fa-3x"></i>
								</div>
								<p>
								 Very simple installation.<br/>&nbsp;
								</p>
									
							</div>
							
						</div>
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
		<!-- Portfolio Projects -->
		<div class="row">
			<div class="col-lg-12">
				<h4 class="heading">Recent Works</h4>
				<div class="row">
					<section id="projects">
					<ul id="thumbs" class="portfolio">
						<!-- Item Project and Filter Name -->
						<li class="col-lg-3 design" data-id="id-0" data-type="web">
						<div class="item-thumbs">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 1" href=""""),_display_(Seq[Any](/*152.90*/routes/*152.96*/.Assets.at("img/works/1.jpg"))),format.raw/*152.125*/("""">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src=""""),_display_(Seq[Any](/*157.18*/routes/*157.24*/.Assets.at("img/works/1.jpg"))),format.raw/*157.53*/("""" alt="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus quis elementum odio. Curabitur pellentesque, dolor vel pharetra mollis.">
						</div>
						</li>
						<!-- End Item Project -->
						<!-- Item Project and Filter Name -->
						<li class="item-thumbs col-lg-3 design" data-id="id-1" data-type="icon">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 2" href=""""),_display_(Seq[Any](/*164.90*/routes/*164.96*/.Assets.at("img/works/2.jpg"))),format.raw/*164.125*/("""">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src=""""),_display_(Seq[Any](/*169.18*/routes/*169.24*/.Assets.at("img/works/2.jpg"))),format.raw/*169.53*/("""" alt="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus quis elementum odio. Curabitur pellentesque, dolor vel pharetra mollis.">
						</li>
						<!-- End Item Project -->
						<!-- Item Project and Filter Name -->
						<li class="item-thumbs col-lg-3 photography" data-id="id-2" data-type="illustrator">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 3" href=""""),_display_(Seq[Any](/*175.90*/routes/*175.96*/.Assets.at("img/works/3.jpg"))),format.raw/*175.125*/("""">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src=""""),_display_(Seq[Any](/*180.18*/routes/*180.24*/.Assets.at("img/works/3.jpg"))),format.raw/*180.53*/("""" alt="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus quis elementum odio. Curabitur pellentesque, dolor vel pharetra mollis.">
						</li>
						<!-- End Item Project -->
						<!-- Item Project and Filter Name -->
						<li class="item-thumbs col-lg-3 photography" data-id="id-2" data-type="illustrator">
						<!-- Fancybox - Gallery Enabled - Title - Full Image -->
						<a class="hover-wrap fancybox" data-fancybox-group="gallery" title="Work 4" href=""""),_display_(Seq[Any](/*186.90*/routes/*186.96*/.Assets.at("img/works/4.jpg"))),format.raw/*186.125*/("""">
						<span class="overlay-img"></span>
						<span class="overlay-img-thumb font-icon-plus"></span>
						</a>
						<!-- Thumb Image and Description -->
						<img src=""""),_display_(Seq[Any](/*191.18*/routes/*191.24*/.Assets.at("img/works/4.jpg"))),format.raw/*191.53*/("""" alt="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Phasellus quis elementum odio. Curabitur pellentesque, dolor vel pharetra mollis.">
						</li>
						<!-- End Item Project -->
					</ul>
					</section>
				</div>
			</div>
		</div>

	</div>
	</section>
	"""),_display_(Seq[Any](/*202.3*/footer())),format.raw/*202.11*/("""
""")))})),format.raw/*203.2*/("""	"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sat Mar 08 20:35:39 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/index.scala.html
                    HASH: 68135cc016bf8095598a2ef3ee04f9ad29428864
                    MATRIX: 871->18|907->20|932->37|971->39|1342->374|1357->380|1412->413|4659->3623|4675->3629|4728->3658|4940->3833|4956->3839|5008->3868|5525->4348|5541->4354|5594->4383|5806->4558|5822->4564|5874->4593|6390->5072|6406->5078|6459->5107|6671->5282|6687->5288|6739->5317|7255->5796|7271->5802|7324->5831|7536->6006|7552->6012|7604->6041|7912->6313|7943->6321|7977->6323
                    LINES: 30->3|31->4|31->4|31->4|45->18|45->18|45->18|179->152|179->152|179->152|184->157|184->157|184->157|191->164|191->164|191->164|196->169|196->169|196->169|202->175|202->175|202->175|207->180|207->180|207->180|213->186|213->186|213->186|218->191|218->191|218->191|229->202|229->202|230->203
                    -- GENERATED --
                */
            