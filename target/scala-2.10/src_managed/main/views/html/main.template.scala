
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
    	<meta charset="utf-8">
    	<meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>stalk.io</title>
        <!-- css -->
		<link href=""""),_display_(Seq[Any](/*11.16*/routes/*11.22*/.Assets.at("css/bootstrap.min.css"))),format.raw/*11.57*/("""" rel="stylesheet" />
		<link href=""""),_display_(Seq[Any](/*12.16*/routes/*12.22*/.Assets.at("css/fancybox/jquery.fancybox.css"))),format.raw/*12.68*/("""" rel="stylesheet">
		
		<link href=""""),_display_(Seq[Any](/*14.16*/routes/*14.22*/.Assets.at("css/flexslider.css"))),format.raw/*14.54*/("""" rel="stylesheet" />
		<link href=""""),_display_(Seq[Any](/*15.16*/routes/*15.22*/.Assets.at("css/style.css"))),format.raw/*15.49*/("""" rel="stylesheet" />
		
		
		<!-- Theme skin -->
		<link href=""""),_display_(Seq[Any](/*19.16*/routes/*19.22*/.Assets.at("skins/default.css"))),format.raw/*19.53*/("""" rel="stylesheet" />
		<script src=""""),_display_(Seq[Any](/*20.17*/routes/*20.23*/.Assets.at("js/jquery.js"))),format.raw/*20.49*/("""" type="text/javascript"></script>
		
		<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
		<!--[if lt IE 9]>
		      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		    <![endif]-->
		
		</head>        
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*29.59*/routes/*29.65*/.Assets.at("images/stalk-favicon.png"))),format.raw/*29.103*/("""">
        
        <!-- javascript
		    ================================================== -->
		
    </head>
    <body>
  		<div id="wrapper">
  			"""),_display_(Seq[Any](/*37.7*/top())),format.raw/*37.12*/("""
        	"""),_display_(Seq[Any](/*38.11*/content)),format.raw/*38.18*/("""
        	
  		</div>  	
    	
    </body>
    <!-- Placed at the end of the document so the pages load faster -->
		
		<script src=""""),_display_(Seq[Any](/*45.17*/routes/*45.23*/.Assets.at("js/jquery.easing.1.3.js"))),format.raw/*45.60*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*46.17*/routes/*46.23*/.Assets.at("js/bootstrap.min.js"))),format.raw/*46.56*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*47.17*/routes/*47.23*/.Assets.at("js/jquery.fancybox.pack.js"))),format.raw/*47.63*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*48.17*/routes/*48.23*/.Assets.at("js/jquery.fancybox-media.js"))),format.raw/*48.64*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*49.17*/routes/*49.23*/.Assets.at("js/google-code-prettify/prettify.js"))),format.raw/*49.72*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*50.17*/routes/*50.23*/.Assets.at("js/portfolio/jquery.quicksand.js"))),format.raw/*50.69*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*51.17*/routes/*51.23*/.Assets.at("js/portfolio/setting.js"))),format.raw/*51.60*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*52.17*/routes/*52.23*/.Assets.at("js/jquery.flexslider.js"))),format.raw/*52.60*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*53.17*/routes/*53.23*/.Assets.at("js/animate.js"))),format.raw/*53.50*/("""" type="text/javascript"></script>
		<script src=""""),_display_(Seq[Any](/*54.17*/routes/*54.23*/.Assets.at("js/custom.js"))),format.raw/*54.49*/("""" type="text/javascript"></script>
        
        <script type="text/javascript">
        $(document).ready(function()"""),format.raw/*57.37*/("""{"""),format.raw/*57.38*/("""
        	var url = window.location.pathname;
        	$('ul.nav a[href="'+url+'"]').parent().addClass('active');
        """),format.raw/*60.9*/("""}"""),format.raw/*60.10*/(""")
        
        </script>
        
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 13 21:57:18 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/main.scala.html
                    HASH: 491f12bea45f62d31931dddf4971bf6aa42dfa69
                    MATRIX: 778->1|902->31|1147->240|1162->246|1219->281|1292->318|1307->324|1375->370|1449->408|1464->414|1518->446|1591->483|1606->489|1655->516|1756->581|1771->587|1824->618|1898->656|1913->662|1961->688|2304->995|2319->1001|2380->1039|2567->1191|2594->1196|2641->1207|2670->1214|2840->1348|2855->1354|2914->1391|3001->1442|3016->1448|3071->1481|3158->1532|3173->1538|3235->1578|3322->1629|3337->1635|3400->1676|3487->1727|3502->1733|3573->1782|3660->1833|3675->1839|3743->1885|3830->1936|3845->1942|3904->1979|3991->2030|4006->2036|4065->2073|4152->2124|4167->2130|4216->2157|4303->2208|4318->2214|4366->2240|4514->2360|4543->2361|4692->2483|4721->2484
                    LINES: 26->1|29->1|39->11|39->11|39->11|40->12|40->12|40->12|42->14|42->14|42->14|43->15|43->15|43->15|47->19|47->19|47->19|48->20|48->20|48->20|57->29|57->29|57->29|65->37|65->37|66->38|66->38|73->45|73->45|73->45|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|77->49|77->49|77->49|78->50|78->50|78->50|79->51|79->51|79->51|80->52|80->52|80->52|81->53|81->53|81->53|82->54|82->54|82->54|85->57|85->57|88->60|88->60
                    -- GENERATED --
                */
            