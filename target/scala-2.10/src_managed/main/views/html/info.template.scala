
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
                                    <th>
                                    </th>
                                </tr>
                            </thead>
                            <tbody>
                            """),_display_(Seq[Any](/*38.30*/form(action = routes.Stalk.deleteStalkUser(), 'id -> "delForm")/*38.93*/{_display_(Seq[Any](format.raw/*38.94*/("""
                                   		<input type="hidden" id="deleteId" name="deleteId" value=""/>
                                   """)))})),format.raw/*40.37*/("""
                            """),_display_(Seq[Any](/*41.30*/for(app <- apps) yield /*41.46*/ {_display_(Seq[Any](format.raw/*41.48*/("""
                                <tr>
                                	<td><button type="button" onclick="deleteStalkUser('"""),_display_(Seq[Any](/*43.87*/app/*43.90*/.get_id())),format.raw/*43.99*/("""');" class="btn btn-default btn-danger"><i class="fa fa-times"></i></button></td>
                                    <td>"""),_display_(Seq[Any](/*44.42*/app/*44.45*/.getApp())),format.raw/*44.54*/("""</td>
                                    <td><pre class="prettyprint linenums">
&lt;script src="http://www.stalk.io/stalk.js"&gt;&lt;/script&gt;
var conf = """),format.raw/*47.12*/("""{"""),format.raw/*47.13*/("""
            key: '"""),_display_(Seq[Any](/*48.20*/app/*48.23*/.getApp())),format.raw/*48.32*/("""',
            id: 'Page Title',
            userId: 'Your Client ID'
        """),format.raw/*51.9*/("""}"""),format.raw/*51.10*/(""";
&lt;script&gt;STALK.init(conf);&lt;/script&gt;</pre></td>  
                                    <td>
                                    	<button class="btn btn-default" >Add Operators</button>
                                    </td>
                                    
                                    <td>
                                    	<button class="btn btn-primary" ><a href=""""),_display_(Seq[Any](/*58.81*/routes/*58.87*/.Application.chat())),format.raw/*58.106*/("""?appId="""),_display_(Seq[Any](/*58.114*/app/*58.117*/.getApp())),format.raw/*58.126*/("""">Go Chat!</a></button>
                                    </td>
                                    
                                </tr>
                            """)))})),format.raw/*62.30*/("""
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
	<div class="modal fade" id="opModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
           
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                    <h4 class="modal-title" id="myModalLabel">Add Operators</h4>
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
"""),_display_(Seq[Any](/*131.2*/footer())),format.raw/*131.10*/("""

	 <script type="text/javascript">
	 
        $(function()"""),format.raw/*135.21*/("""{"""),format.raw/*135.22*/("""
        	$('#newUrl').click(function()"""),format.raw/*136.39*/("""{"""),format.raw/*136.40*/("""
        		$('#myModal').modal('show');
        	"""),format.raw/*138.10*/("""}"""),format.raw/*138.11*/(""");
        	
        	$('#saveBtn').click(function()"""),format.raw/*140.40*/("""{"""),format.raw/*140.41*/("""
        		var url = $('#url').val();
        		
        		$.post(""""),_display_(Seq[Any](/*143.20*/routes/*143.26*/.Stalk.registStalkUser())),format.raw/*143.50*/(""""
	    		, """),format.raw/*144.10*/("""{"""),format.raw/*144.11*/("""'app' : $('#url').val()"""),format.raw/*144.34*/("""}"""),format.raw/*144.35*/("""
	    		, function(result) """),format.raw/*145.27*/("""{"""),format.raw/*145.28*/("""
	    			
	    			if(result == "ok")"""),format.raw/*147.27*/("""{"""),format.raw/*147.28*/("""
	    				alert("Success Saved");
	    				document.location.href='/info'
	    			"""),format.raw/*150.9*/("""}"""),format.raw/*150.10*/("""else """),format.raw/*150.15*/("""{"""),format.raw/*150.16*/("""
	    				alert("Fail");
	    				
	    			"""),format.raw/*153.9*/("""}"""),format.raw/*153.10*/("""
	    		"""),format.raw/*154.8*/("""}"""),format.raw/*154.9*/(""");
        		
        		
        	"""),format.raw/*157.10*/("""}"""),format.raw/*157.11*/(""");
        	
        	
        """),format.raw/*160.9*/("""}"""),format.raw/*160.10*/(""")
        function deleteStalkUser(stalkId)"""),format.raw/*161.42*/("""{"""),format.raw/*161.43*/("""
    		$('#deleteId').val(stalkId);
    		alert(stalkId)
    		if(confirm("Are you sure?"))"""),format.raw/*164.35*/("""{"""),format.raw/*164.36*/("""
    			$("#delForm").submit();
    		"""),format.raw/*166.7*/("""}"""),format.raw/*166.8*/("""
    	"""),format.raw/*167.6*/("""}"""),format.raw/*167.7*/("""
        </script>
""")))})),format.raw/*169.2*/("""
"""))}
    }
    
    def render(apps:List[StalkApplication]): play.api.templates.HtmlFormat.Appendable = apply(apps)
    
    def f:((List[StalkApplication]) => play.api.templates.HtmlFormat.Appendable) = (apps) => apply(apps)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Mar 13 22:25:03 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/info.scala.html
                    HASH: a56273fc328b5494896b2cfb2a6b6837ad0b3960
                    MATRIX: 789->1|929->31|958->51|994->53|1019->70|1058->72|2163->1141|2235->1204|2274->1205|2442->1341|2508->1371|2540->1387|2580->1389|2740->1513|2752->1516|2783->1525|2942->1648|2954->1651|2985->1660|3170->1817|3199->1818|3255->1838|3267->1841|3298->1850|3403->1928|3432->1929|3864->2325|3879->2331|3921->2350|3966->2358|3979->2361|4011->2370|4213->2540|6800->5091|6831->5099|6919->5158|6949->5159|7017->5198|7047->5199|7125->5248|7155->5249|7236->5301|7266->5302|7371->5370|7387->5376|7434->5400|7474->5411|7504->5412|7556->5435|7586->5436|7642->5463|7672->5464|7737->5500|7767->5501|7877->5583|7907->5584|7941->5589|7971->5590|8042->5633|8072->5634|8108->5642|8137->5643|8200->5677|8230->5678|8289->5709|8319->5710|8391->5753|8421->5754|8541->5845|8571->5846|8637->5884|8666->5885|8700->5891|8729->5892|8781->5912
                    LINES: 26->1|30->1|33->5|34->6|34->6|34->6|66->38|66->38|66->38|68->40|69->41|69->41|69->41|71->43|71->43|71->43|72->44|72->44|72->44|75->47|75->47|76->48|76->48|76->48|79->51|79->51|86->58|86->58|86->58|86->58|86->58|86->58|90->62|159->131|159->131|163->135|163->135|164->136|164->136|166->138|166->138|168->140|168->140|171->143|171->143|171->143|172->144|172->144|172->144|172->144|173->145|173->145|175->147|175->147|178->150|178->150|178->150|178->150|181->153|181->153|182->154|182->154|185->157|185->157|188->160|188->160|189->161|189->161|192->164|192->164|194->166|194->166|195->167|195->167|197->169
                    -- GENERATED --
                */
            