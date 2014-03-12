
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
object info extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[StalkApplication],play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(apps: List[StalkApplication]):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.32*/("""


"""),format.raw/*5.1*/("""
"""),_display_(Seq[Any](/*6.2*/main("Todo list")/*6.19*/ {_display_(Seq[Any](format.raw/*6.21*/("""
<section id="inner-headline">
	<div class="container">
		<div class="row">
			<div class="col-lg-12">
				<ul class="breadcrumb">
					<li><a href="#"><i class="fa fa-home"></i></a><i class="icon-angle-right"></i></li>
					<li><a href="#">Info</a></li>
					
				</ul>
			</div>
		</div>
	</div>
	</section>
	<section id="content">
	<div class="container">
		<div class="col-lg-12">
			<div class="row">	
			
				<h3>Your stalk.io info</h3>
				<p>Regist URL & Enjoy</p>
			</div>
			
			<div class="row">
				<div class="col-lg-12">
                    <div class="table-responsive">
                        <table class="table table-bordered table-striped">
                            <thead>
                                <tr>
                                    <th>
                                    </th>
                                    <th>
                                       ID
                                    </th>
                                    <th>
                                       Name
                                    </th>
                                    <th>
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(Seq[Any](/*48.30*/form(action = routes.Stalk.deleteStalkUser(), 'id -> "delForm")/*48.93*/{_display_(Seq[Any](format.raw/*48.94*/("""
                                   		<input type="hidden" id="deleteId" name="deleteId" value=""/>
                                   """)))})),format.raw/*50.37*/("""
                            """),_display_(Seq[Any](/*51.30*/for(app <- apps) yield /*51.46*/ {_display_(Seq[Any](format.raw/*51.48*/("""
                                <tr>
                                	<td><button type="button" onclick="deleteStalkUser('"""),_display_(Seq[Any](/*53.87*/app/*53.90*/.get_id())),format.raw/*53.99*/("""');" class="btn btn-default btn-danger"><i class="fa fa-times"></i></button></td>
                                    <td>"""),_display_(Seq[Any](/*54.42*/app/*54.45*/.getApp())),format.raw/*54.54*/("""</td>
                                    <td><pre class="prettyprint linenums">
&lt;script src="http://www.stalk.io/stalk.js"&gt;&lt;/script&gt;
var conf = """),format.raw/*57.12*/("""{"""),format.raw/*57.13*/("""
            key: '"""),_display_(Seq[Any](/*58.20*/app/*58.23*/.getApp())),format.raw/*58.32*/("""',
            id: '페이지타이틀',
            userId: """),_display_(Seq[Any](/*60.22*/app/*60.25*/.getUserId())),format.raw/*60.37*/("""
        """),format.raw/*61.9*/("""}"""),format.raw/*61.10*/(""";
&lt;script&gt;STALK.init(conf);&lt;/script&gt;</pre></td>  
                                    <td>
                                    	<button class="btn btn-primary" ><a href=""""),_display_(Seq[Any](/*64.81*/routes/*64.87*/.Application.chat())),format.raw/*64.106*/("""?appId="""),_display_(Seq[Any](/*64.114*/app/*64.117*/.getApp())),format.raw/*64.126*/("""">Go Chat!</a></button>
                                    </td>
                                    
                                </tr>
                            """)))})),format.raw/*68.30*/("""
                            </tbody>
                        </table>
                        <button class="btn btn-primary" id="newUrl">New</button>
                    </div>
                 </div>
			</div>
		
		</div>

		
		
	</div>
	</section>
	
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
           
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Regist New Site</h4>
                </div>
                <div class="modal-body">
                        <h3>URL</h3>
					    <div class="form-group input-group">
					    	<input class="form-control"  type="text" id="url" name="url" value=''>
                            
                        </div>

						
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" id="saveBtn">Save changes</button>
                </div>
            </div>
			
            <!-- /.modal-content -->
        </div>
        <!-- /.modal-dialog -->
    </div>
	
"""),_display_(Seq[Any](/*111.2*/footer())),format.raw/*111.10*/("""

	 <script type="text/javascript">
	 
        $(function()"""),format.raw/*115.21*/("""{"""),format.raw/*115.22*/("""
        	$('#newUrl').click(function()"""),format.raw/*116.39*/("""{"""),format.raw/*116.40*/("""
        		$('#myModal').modal('show');
        	"""),format.raw/*118.10*/("""}"""),format.raw/*118.11*/(""");
        	
        	$('#saveBtn').click(function()"""),format.raw/*120.40*/("""{"""),format.raw/*120.41*/("""
        		var url = $('#url').val();
        		
        		$.post(""""),_display_(Seq[Any](/*123.20*/routes/*123.26*/.Stalk.registStalkUser())),format.raw/*123.50*/(""""
	    		, """),format.raw/*124.10*/("""{"""),format.raw/*124.11*/("""'app' : $('#url').val()"""),format.raw/*124.34*/("""}"""),format.raw/*124.35*/("""
	    		, function(result) """),format.raw/*125.27*/("""{"""),format.raw/*125.28*/("""
	    			
	    			if(result == "ok")"""),format.raw/*127.27*/("""{"""),format.raw/*127.28*/("""
	    				alert("Success Saved");
	    				document.location.href='/info'
	    			"""),format.raw/*130.9*/("""}"""),format.raw/*130.10*/("""else """),format.raw/*130.15*/("""{"""),format.raw/*130.16*/("""
	    				alert("Fail");
	    				
	    			"""),format.raw/*133.9*/("""}"""),format.raw/*133.10*/("""
	    		"""),format.raw/*134.8*/("""}"""),format.raw/*134.9*/(""");
        		
        		
        	"""),format.raw/*137.10*/("""}"""),format.raw/*137.11*/(""");
        	
        	
        """),format.raw/*140.9*/("""}"""),format.raw/*140.10*/(""")
        function deleteStalkUser(stalkId)"""),format.raw/*141.42*/("""{"""),format.raw/*141.43*/("""
    		$('#deleteId').val(stalkId);
    		alert(stalkId)
    		if(confirm("Are you sure?"))"""),format.raw/*144.35*/("""{"""),format.raw/*144.36*/("""
    			$("#delForm").submit();
    		"""),format.raw/*146.7*/("""}"""),format.raw/*146.8*/("""
    	"""),format.raw/*147.6*/("""}"""),format.raw/*147.7*/("""
        </script>
""")))})),format.raw/*149.2*/("""
"""))}
    }
    
    def render(apps:List[StalkApplication]): play.api.templates.HtmlFormat.Appendable = apply(apps)
    
    def f:((List[StalkApplication]) => play.api.templates.HtmlFormat.Appendable) = (apps) => apply(apps)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 12 16:17:21 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/info.scala.html
                    HASH: 4923bc33765b36dabb913340f08cc7d455fdfabc
                    MATRIX: 789->1|929->31|958->51|994->53|1019->70|1058->72|2387->1365|2459->1428|2498->1429|2666->1565|2732->1595|2764->1611|2804->1613|2964->1737|2976->1740|3007->1749|3166->1872|3178->1875|3209->1884|3394->2041|3423->2042|3479->2062|3491->2065|3522->2074|3608->2124|3620->2127|3654->2139|3690->2148|3719->2149|3938->2332|3953->2338|3995->2357|4040->2365|4053->2368|4085->2377|4287->2547|5729->3953|5760->3961|5848->4020|5878->4021|5946->4060|5976->4061|6054->4110|6084->4111|6165->4163|6195->4164|6300->4232|6316->4238|6363->4262|6403->4273|6433->4274|6485->4297|6515->4298|6571->4325|6601->4326|6666->4362|6696->4363|6806->4445|6836->4446|6870->4451|6900->4452|6971->4495|7001->4496|7037->4504|7066->4505|7129->4539|7159->4540|7218->4571|7248->4572|7320->4615|7350->4616|7470->4707|7500->4708|7566->4746|7595->4747|7629->4753|7658->4754|7710->4774
                    LINES: 26->1|30->1|33->5|34->6|34->6|34->6|76->48|76->48|76->48|78->50|79->51|79->51|79->51|81->53|81->53|81->53|82->54|82->54|82->54|85->57|85->57|86->58|86->58|86->58|88->60|88->60|88->60|89->61|89->61|92->64|92->64|92->64|92->64|92->64|92->64|96->68|139->111|139->111|143->115|143->115|144->116|144->116|146->118|146->118|148->120|148->120|151->123|151->123|151->123|152->124|152->124|152->124|152->124|153->125|153->125|155->127|155->127|158->130|158->130|158->130|158->130|161->133|161->133|162->134|162->134|165->137|165->137|168->140|168->140|169->141|169->141|172->144|172->144|174->146|174->146|175->147|175->147|177->149
                    -- GENERATED --
                */
            