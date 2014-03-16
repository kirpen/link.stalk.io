
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
object install extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template0[play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply():play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""


	<section id="content">
	<div class="container">
		
		<div class="row">
			<div class="col-lg-12">
				<h2><i class="fa fa-code"></i>&nbsp;How to install</h2>
				<p class="lead">Very simple scripts that you can add to your Web pages in minutes, no knowing coding required.
Just copy the script code and paste it into your HTML code.</p>
				<p>
					<em>
					Put the tags and the javascript codes before the last &lt;/body&gt; tag in your HTML page </em>
				</p>
				<pre class="prettyprint linenums">
&lt;script src="http://www.stalk.io/stalk.js"&gt;&lt;/script&gt;
&lt;script&gt;TALK.init();&lt;/script&gt;</pre>
				<dl class="dl-horizontal">
					<dt>How <b>SIMPLE</b>, isn't it?</dt>
				</dl>
				
			</div>
		</div>



		<div class="row">

			<div class="col-lg-12">
				<h4><i class="fa fa-arrow-down"></i> More detailed </h4>
				<ul class="nav nav-tabs">
					<li class="active"><a href="#one" data-toggle="tab"><i class="icon-briefcase"></i> Default Mode</a></li>
					<li><a href="#two" data-toggle="tab">Inner Mode</a></li>
					
				</ul>
				<div class="tab-content">

					<div class="tab-pane active" id="one">
						<div class="col-lg-6">
							<p>This is the simplest way in the world to install the live web chat service on your website.</p>
	                        <p><strong>Put the tags and the javascript codes before the last <em>&lt;/body&gt;</em> tag in your HTML page.</strong> And then, You can see the dark little box on the right bottom like this page.</p>
	                        
	                        <pre class="prettyprint linenums">
&lt;script src="http://www.stalk.io/stalk.js"&gt;&lt;/script&gt;
&lt;script&gt;TALK.init();&lt;/script&gt;</pre>
						</div>
                    	<div class="col-lg-6">
	                        <img src=""""),_display_(Seq[Any](/*52.37*/routes/*52.43*/.Assets.at("img/stalk/install01.jpg"))),format.raw/*52.80*/("""" alt="example for blogger.com" style="max-width: 100%; height: auto;" />
	                    </div>    
                    </div>
                   
					<div class="tab-pane" id="two">
						<div class="col-lg-6">
							<p>You can locate the live chat box in the location you specified. </p>
                            <p>At the first, <strong>Put <code>&lt;div&gt;</code> tag in the location you want.</strong></p>
                            
                            <pre class="prettyprint linenums">
&lt;div id="STALK_SCREEN"&gt;&lt;/div&gt;</pre>;
						
                            
                            <p>And, <strong>Put the tags and the javascript codes before the last <em>&lt;/body&gt;</em> tag in your HTML page.</strong> And then, You can see the live chat box dark in the location you specified.</p> 

	                        <pre class="prettyprint linenums">
&lt;script src="http://www.stalk.io/stalk.js"&gt;&lt;/script&gt;
&lt;script>
    var conf = """),format.raw/*70.16*/("""{"""),format.raw/*70.17*/("""
        screenMode:'inner', // mandatory
        height: '200px', // optional (default 200px)
        width: '100%'    // optional (default 100%)
    """),format.raw/*74.5*/("""}"""),format.raw/*74.6*/(""";
    STALK.init(conf);
&lt;/script&gt;	                        
						</div>
                    	<div class="col-lg-6">
	                        <img src=""""),_display_(Seq[Any](/*79.37*/routes/*79.43*/.Assets.at("img/stalk/install02.jpg"))),format.raw/*79.80*/("""" alt="example for blogger.com" style="max-width: 100%; height: auto;" />
	                    </div>    
					</div>
					
				</div>
			</div>
		</div>
		<div class="row">
                <div class="col-md-12 text-left">
                    <h4>You can install this right where you want it.  For Wordpress, Tumblr, Blogger and your ALL websites.</h4> 
                    <p>You can check out <a href="http://stalk-io.blogspot.com/2013/03/InstallLiveChatServiceForYourBlog.html" target="_blank">this link</a> 
			or watch <a href="https://vimeo.com/63335017" target="_blank">this video</a> for more detail.</p>
                </div>
            </div>
            
            <div class="row" style="margin-bottom: 40px;">
                <div class="col-md-6 text-center">
                    <br>
                    <p>sample for blogger.com</p>
                    <img src=""""),_display_(Seq[Any](/*98.32*/routes/*98.38*/.Assets.at("img/stalk/si001.png"))),format.raw/*98.71*/("""" alt="example for blogger.com" style="max-width: 100%; height: auto;" />
                </div>
                <div class="col-md-6 text-center">
                    <br>
                    <p>sample for tumblr</p>
                    <p id="videoStalk" style="margin-top: 18px;">
                    <iframe src="//player.vimeo.com/video/63335017?portrait=0" width="500" height="375" frameborder="0" webkitallowfullscreen mozallowfullscreen allowfullscreen></iframe>
                    </p>
                    
                </div>
            </div>
	</div>

	</section>
	"""),_display_(Seq[Any](/*112.3*/footer())),format.raw/*112.11*/("""
""")))})),format.raw/*113.2*/("""
"""))}
    }
    
    def render(): play.api.templates.HtmlFormat.Appendable = apply()
    
    def f:(() => play.api.templates.HtmlFormat.Appendable) = () => apply()
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 13 22:25:52 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/install.scala.html
                    HASH: 43fb06e14e93699c92429db7a603bc0104dca913
                    MATRIX: 873->18|909->20|934->37|973->39|2797->1827|2812->1833|2871->1870|3886->2857|3915->2858|4093->3009|4121->3010|4315->3168|4330->3174|4389->3211|5310->4096|5325->4102|5380->4135|5998->4717|6029->4725|6063->4727
                    LINES: 30->3|31->4|31->4|31->4|79->52|79->52|79->52|97->70|97->70|101->74|101->74|106->79|106->79|106->79|125->98|125->98|125->98|139->112|139->112|140->113
                    -- GENERATED --
                */
            