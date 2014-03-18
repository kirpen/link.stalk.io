
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
object chat extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template1[String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(appId:String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*3.1*/("""
"""),_display_(Seq[Any](/*4.2*/main("Todo list")/*4.19*/ {_display_(Seq[Any](format.raw/*4.21*/("""
<style>
.well """),format.raw/*6.7*/("""{"""),format.raw/*6.8*/("""
min-height: 20px;
padding: 19px;
margin-bottom: 20px;
background-color: #E4F6E9;
border: 0px;
border-radius: 4px;
-webkit-box-shadow: inset 0 1px 1px rgba(0,0,0,.05);
box-shadow: inset 0 1px 1px rgba(0,0,0,.05);
"""),format.raw/*15.1*/("""}"""),format.raw/*15.2*/("""

.nav-tabs """),format.raw/*17.11*/("""{"""),format.raw/*17.12*/("""
	border-bottom: none;
	margin-top: -1px;
"""),format.raw/*20.1*/("""}"""),format.raw/*20.2*/("""

.chat
"""),format.raw/*23.1*/("""{"""),format.raw/*23.2*/("""
    list-style: none;
    margin: 0;
    padding: 0;
"""),format.raw/*27.1*/("""}"""),format.raw/*27.2*/("""
 
.chat li
"""),format.raw/*30.1*/("""{"""),format.raw/*30.2*/("""
    margin-bottom: 10px;
    padding-bottom: 5px;
    border-bottom: 1px dotted #B3A9A9;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
 
.chat li.left .chat-body
"""),format.raw/*37.1*/("""{"""),format.raw/*37.2*/("""
    margin-left: 60px;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
 
.chat li.right .chat-body
"""),format.raw/*42.1*/("""{"""),format.raw/*42.2*/("""
    margin-right: 60px;
"""),format.raw/*44.1*/("""}"""),format.raw/*44.2*/("""
 
.chat li .chat-body p
"""),format.raw/*47.1*/("""{"""),format.raw/*47.2*/("""
    margin: 0;
    color: #777777;
"""),format.raw/*50.1*/("""}"""),format.raw/*50.2*/("""
 
.panel .slidedown .fa, .chat .fa
"""),format.raw/*53.1*/("""{"""),format.raw/*53.2*/("""
    margin-right: 5px;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
 
.panel-body-chat
"""),format.raw/*58.1*/("""{"""),format.raw/*58.2*/("""
    overflow-y: scroll;
    height: 350px;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
 
.panel-body h4"""),format.raw/*63.15*/("""{"""),format.raw/*63.16*/("""
  background-image: -webkit-linear-gradient(bottom,#fff,#eee);
"""),format.raw/*65.1*/("""}"""),format.raw/*65.2*/("""

::-webkit-scrollbar-track
"""),format.raw/*68.1*/("""{"""),format.raw/*68.2*/("""
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
    background-color: #F5F5F5;
"""),format.raw/*71.1*/("""}"""),format.raw/*71.2*/("""
 
::-webkit-scrollbar
"""),format.raw/*74.1*/("""{"""),format.raw/*74.2*/("""
    width: 12px;
    background-color: #F5F5F5;
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""
 
::-webkit-scrollbar-thumb
"""),format.raw/*80.1*/("""{"""),format.raw/*80.2*/("""
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
    background-color: #555;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""



.nav-tabs > li .close """),format.raw/*87.23*/("""{"""),format.raw/*87.24*/("""
    margin: -2px 0 0 10px;
    font-size: 18px;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""
.marginBottom """),format.raw/*91.15*/("""{"""),format.raw/*91.16*/("""
    margin-bottom :1px !important;
"""),format.raw/*93.1*/("""}"""),format.raw/*93.2*/("""
.operationDiv """),format.raw/*94.15*/("""{"""),format.raw/*94.16*/("""
    padding:5px 10px 5px 5px;
"""),format.raw/*96.1*/("""}"""),format.raw/*96.2*/("""
.operationDivWrapper """),format.raw/*97.22*/("""{"""),format.raw/*97.23*/("""
    margin-top:-1px;
"""),format.raw/*99.1*/("""}"""),format.raw/*99.2*/("""


.from-visitor """),format.raw/*102.15*/("""{"""),format.raw/*102.16*/("""
float: left;
background: #eee;
border: 1px solid #ccc;
"""),format.raw/*106.1*/("""}"""),format.raw/*106.2*/("""

.message """),format.raw/*108.10*/("""{"""),format.raw/*108.11*/("""
border-radius: 5px;
padding: 8px;
clear: both;
max-width: 300px;
text-overflow: ellipsis;
overflow-x: hidden;
margin-bottom: 8px;
word-wrap: break-word;
"""),format.raw/*117.1*/("""}"""),format.raw/*117.2*/("""

.from-op """),format.raw/*119.10*/("""{"""),format.raw/*119.11*/("""
float: right;
background: #e7f5f9;
border: 1px solid #bde4f0;
"""),format.raw/*123.1*/("""}"""),format.raw/*123.2*/("""

div.timestamp """),format.raw/*125.15*/("""{"""),format.raw/*125.16*/("""
clear: both;
text-align: center;
color: #ccc;
font-size: 12px;
"""),format.raw/*130.1*/("""}"""),format.raw/*130.2*/("""

.twinkle"""),format.raw/*132.9*/("""{"""),format.raw/*132.10*/("""
background-color: salmon;
"""),format.raw/*134.1*/("""}"""),format.raw/*134.2*/("""
</style>
  <section id="content">
  <!-- <div class="map">
    <iframe src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Kuningan,+Jakarta+Capital+Region,+Indonesia&amp;aq=3&amp;oq=kuningan+&amp;sll=37.0625,-95.677068&amp;sspn=37.410045,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=Kuningan&amp;t=m&amp;z=14&amp;ll=-6.238824,106.830177&amp;output=embed">
    </iframe>
  </div> -->
  
  <div class="container container-full">
    
	  <div id="sound"></div>
      <div class="col-lg-3">
        
          <div class="panel panel-default">
            <div class="panel-heading">
              <span class="fa fa-user"></span> Operators
            </div>
            <div class="panel-body" id="operator">
              
            </div>
          </div>
        
          <div class="panel panel-warning">
            <div class="panel-heading">
              <span class="fa fa-user"></span> Recent Conversations
            </div>
            <div class="panel-body" id="recent">
              
            </div>
          </div>
        
          <div class="panel panel-danger">
            <div class="panel-heading">
              <span class="fa fa-user"></span> Visitors
            </div>
            <div class="panel-body" id="visitor">
            </div>
          </div>
         
      </div>

      <div class="col-lg-9">
        
        <div class="tabbable">
         
          <div class="tab-content">
            
          </div>
   		   <ul class="nav nav-tabs" id="myTab">
          </ul>
        </div>

        </div>


        
  </div>
  <input type="hidden" id="stalkAppId" value ='"""),_display_(Seq[Any](/*191.49*/appId)),format.raw/*191.54*/("""'/>       
      
  </section>
  <script src=""""),_display_(Seq[Any](/*194.17*/routes/*194.23*/.Assets.at("js/socket.io.js"))),format.raw/*194.52*/("""" type="text/javascript"></script>
  <script type="text/javascript">
	  var currentTab;
	  var composeCount = 0;
	  var Application = """),format.raw/*198.22*/("""{"""),format.raw/*198.23*/("""
			  appId : $('#stalkAppId').val()
	  """),format.raw/*200.4*/("""}"""),format.raw/*200.5*/(""";  
	  var chatObj="""),format.raw/*201.16*/("""{"""),format.raw/*201.17*/("""}"""),format.raw/*201.18*/(""";
	  
	  var userId = '"""),_display_(Seq[Any](/*203.19*/session()/*203.28*/.get("email"))),format.raw/*203.41*/("""';
	  var Users = """),format.raw/*204.16*/("""{"""),format.raw/*204.17*/("""
	      '"""),_display_(Seq[Any](/*205.10*/session()/*205.19*/.get("email"))),format.raw/*205.32*/("""': """),format.raw/*205.35*/("""{"""),format.raw/*205.36*/("""
	      								userId : '"""),_display_(Seq[Any](/*206.27*/session()/*206.36*/.get("email"))),format.raw/*206.49*/("""',
	    								password: 'qwer',
	    								deviceId: 'web'
	  								 """),format.raw/*209.13*/("""}"""),format.raw/*209.14*/("""
	
		"""),format.raw/*211.3*/("""}"""),format.raw/*211.4*/(""";

	function getTimeStamp() """),format.raw/*213.26*/("""{"""),format.raw/*213.27*/("""
		  var d = new Date();
	
		  var s =
		    leadingZeros(d.getFullYear(), 4) + '-' +
		    leadingZeros(d.getMonth() + 1, 2) + '-' +
		    leadingZeros(d.getDate(), 2) + ' ' +
	
		    leadingZeros(d.getHours(), 2) + ':' +
		    leadingZeros(d.getMinutes(), 2) + ':' +
		    leadingZeros(d.getSeconds(), 2);
	
		  return s;
	"""),format.raw/*226.2*/("""}"""),format.raw/*226.3*/("""

	function leadingZeros(n, digits) """),format.raw/*228.35*/("""{"""),format.raw/*228.36*/("""
		  var zero = '';
		  n = n.toString();
	
		  if (n.length < digits) """),format.raw/*232.28*/("""{"""),format.raw/*232.29*/("""
		    for (i = 0; i < digits - n.length; i++)
		      zero += '0';
		  """),format.raw/*235.5*/("""}"""),format.raw/*235.6*/("""
		  return zero + n;
	"""),format.raw/*237.2*/("""}"""),format.raw/*237.3*/("""




	function openChatArea(data) """),format.raw/*242.30*/("""{"""),format.raw/*242.31*/("""
		
	    var tabId = "tab" + composeCount; //this is id on tab content div where the
	    chatObj[data.channel] = tabId;
	   	composeCount++;
		
		
	    var fromMessage = decodeURIComponent(data.data.message);
	    
	    var timestamp = getTimeStamp();
	    var clientId = data.data.sender;
	
	    var location = "To-do";
	    var ipAddress = "To-do";
	
	    var tabContent = "";
	    tabContent+='<div class="tab-pane" id="' + tabId + '">                                                                                           ';
	    tabContent+='    <div class="col-lg-7">                                                                                                        ';
	    tabContent+='        <div class="panel panel-info">                                                                                         ';
	    tabContent+='            <div class="panel-heading">                                                                                           ';
	    tabContent+='                <span class="fa fa-comment"></span> Chat                                                                          ';
	    tabContent+='                <div class="btn-group pull-right">                                                                                ';
	    tabContent+='                    <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">                  ';
	    tabContent+='                        <span class="fa fa-chevron-down"></span>                                                                  ';
	    tabContent+='                    </button>                                                                                                     ';
	    tabContent+='                    <ul class="dropdown-menu slidedown">                                                                          ';
	    tabContent+='                        <li><a href="#"><span class="fa fa-refresh"></span>Refresh</a></li>                                       ';
	    tabContent+='                    </ul>                                                                                                         ';
	    tabContent+='                </div>                                                                                                            ';
	    tabContent+='            </div>                                                                                                                ';
	    tabContent+='            <div id="panel'+tabId+'" class="panel-body panel-body-chat">                                                                              ';
	    tabContent+='                <div class="timestamp">'+timestamp+'</div>                                                        ';
	    tabContent+='                <div class="message from-visitor">'+fromMessage+'</div>                                                                  ';
	    tabContent+='            </div>                                                                                                                ';
	    tabContent+='            <div class="panel-footer">                                                                                            ';
	    tabContent+='                <div class="input-group">                                                                                         ';
	    tabContent+='                    <input type="text" id="input'+tabId+'" class="form-control input-sm" placeholder="Type your message here..." />    ';
	    tabContent+='                    <span class="input-group-btn">                                                                                ';
	    tabContent+="                        <button class='btn btn-warning btn-sm' id='btn"+tabId+"'";
	    tabContent+='onclick=sendMsg(';
	    tabContent+='"'+tabId+'"';
	    tabContent+=',"'+data.channel+'");>';
	    
	    tabContent+='                            Send</button>                                                                                         ';
	    tabContent+='                    </span>                                                                                                       ';
	    tabContent+='                </div>                                                                                                            ';
	    tabContent+='            </div>                                                                                                                ';
	    tabContent+='        </div>                                                                                                                    ';
	    tabContent+='    </div>                                                                                                                        ';
	    tabContent+='    <div class="col-lg-5">                                                                                                        ';
	    tabContent+='    <div class="well well-sm">                                                                                                    ';
	    tabContent+='        <div class="media">                                                                                                       ';
	    tabContent+='            <a class="thumbnail pull-left" href="#">                                                                              ';
	    tabContent+='                <img class="media-object" src="http://www.gravatar.com/avatar/a13ac7aed64918b6354f48da59490e3a?s=80">             ';
	    tabContent+='            </a>                                                                                                                  ';
	    tabContent+='            <div class="media-body">                                                                                              ';
	    tabContent+='                <h3 class="media-heading">'+clientId+'</h3>                                                                      ';
	    tabContent+='                <p>'+location+'</p>                                                                                           ';
	    tabContent+='                <p><b>This is a returning customer</b></p>                                                                        ';
	    tabContent+='                <p>This is your first conversation.</p>                                                                           ';
	    tabContent+='                <p><b>Viewed 1 page since a few seconds ago</b></p>                                                               ';
	    tabContent+='                <p>looking at localhost:9000/chefServer?code=&msg=                                                                ';
	    tabContent+='                    referred from localhost:9000/chefServer/node/sw?swType=SMS</p>                                                ';
	    tabContent+='                <p><b>Advanced Info</b></p>                                                                                       ';
	    tabContent+='                <p>IP Address: '+ipAddress+'</p>                                                                                   ';
	    tabContent+='            </div>                                                                                                                ';
	    tabContent+='        </div>                                                                                                                    ';
	    tabContent+='    </div>                                                                                                                        ';
	    tabContent+='  </div>                                                                                                                          ';
	    tabContent+='</div>                                                                                                                            ';
	
	    $('.nav-tabs').append('<li onclick=clearTwinkle(this);showTab("'+tabId+'");><a href="#' + tabId + '"><button class="close closeTab" type="button" >×</button>' + clientId + '</a></li>');
	    $('.tab-content').append(tabContent);
	
	  
	    $(this).tab('show');
	    showTab(tabId);
	    registerCloseEvent();
	    setEnterKeyEvent(tabId);
	"""),format.raw/*321.2*/("""}"""),format.raw/*321.3*/("""

	function setEnterKeyEvent(tabId)"""),format.raw/*323.34*/("""{"""),format.raw/*323.35*/("""
		$('#input'+tabId).on('keydown', function(e) """),format.raw/*324.47*/("""{"""),format.raw/*324.48*/(""" 
	    	if (e.which == 13) """),format.raw/*325.26*/("""{"""),format.raw/*325.27*/(""" 
	    		e.preventDefault(); 
	    		$('#btn'+tabId).click();
	    		
	    	"""),format.raw/*329.7*/("""}"""),format.raw/*329.8*/(""" 
	    """),format.raw/*330.6*/("""}"""),format.raw/*330.7*/(""");
	"""),format.raw/*331.2*/("""}"""),format.raw/*331.3*/("""
	function emailToFlatStr(em)"""),format.raw/*332.29*/("""{"""),format.raw/*332.30*/("""
		return em.replace("@","").replace(".","");
	"""),format.raw/*334.2*/("""}"""),format.raw/*334.3*/("""
	//this method will register event on close icon on the tab..
	function registerCloseEvent() """),format.raw/*336.32*/("""{"""),format.raw/*336.33*/("""
	
	    $(".closeTab").click(function () """),format.raw/*338.39*/("""{"""),format.raw/*338.40*/("""
	
	        //there are multiple elements which has .closeTab icon so close the tab whose close icon is clicked
	        var tabContentId = $(this).parent().attr("href"); 
	        $(this).parent().parent().remove(); //remove li of tab
	        $('#myTab a:last').tab('show'); // Select first tab
	        $(tabContentId).remove(); //remove respective tab content
	        
	        for(var o in chatObj)"""),format.raw/*346.31*/("""{"""),format.raw/*346.32*/("""
	        	if(chatObj[o]==tabContentId.replace("#",""))"""),format.raw/*347.55*/("""{"""),format.raw/*347.56*/("""
	        		Library.leaveChannel(userId,o);
	        		
	        		$("#"+emailToFlatStr(o.split("^")[2])).remove();
	        		$('#recent'+emailToFlatStr(o.split("^")[2])).remove();
	        	"""),format.raw/*352.11*/("""}"""),format.raw/*352.12*/("""
	        """),format.raw/*353.10*/("""}"""),format.raw/*353.11*/("""
	
	    """),format.raw/*355.6*/("""}"""),format.raw/*355.7*/(""");
	"""),format.raw/*356.2*/("""}"""),format.raw/*356.3*/("""

	//shows the tab with passed content div id..paramter tabid indicates the div where the content resides
	function showTab(tabId) """),format.raw/*359.26*/("""{"""),format.raw/*359.27*/("""
	    $('#myTab a[href="#' + tabId + '"]').tab('show');
	"""),format.raw/*361.2*/("""}"""),format.raw/*361.3*/("""
	//return current active tab
	function getCurrentTab() """),format.raw/*363.27*/("""{"""),format.raw/*363.28*/("""
	    return currentTab;
	"""),format.raw/*365.2*/("""}"""),format.raw/*365.3*/("""

	//This function will create a new tab here and it will load the url content in tab content div.
	function craeteNewTabAndLoadUrl(parms, url, loadDivSelector) """),format.raw/*368.63*/("""{"""),format.raw/*368.64*/("""
	
	    $("" + loadDivSelector).load(url, function (response, status, xhr) """),format.raw/*370.73*/("""{"""),format.raw/*370.74*/("""
	        if (status == "error") """),format.raw/*371.33*/("""{"""),format.raw/*371.34*/("""
	            var msg = "Sorry but there was an error getting details ! ";
	            $("" + loadDivSelector).html(msg + xhr.status + " " + xhr.statusText);
	            $("" + loadDivSelector).html("Load Ajax Content Here...");
	        """),format.raw/*375.10*/("""}"""),format.raw/*375.11*/("""
	    """),format.raw/*376.6*/("""}"""),format.raw/*376.7*/(""");
	
	"""),format.raw/*378.2*/("""}"""),format.raw/*378.3*/("""

	function getElement(selector) """),format.raw/*380.32*/("""{"""),format.raw/*380.33*/("""
	    var tabContentId = $currentTab.attr("href");
	    return $("" + tabContentId).find("" + selector);
	
	"""),format.raw/*384.2*/("""}"""),format.raw/*384.3*/("""


	function removeCurrentTab() """),format.raw/*387.30*/("""{"""),format.raw/*387.31*/("""
	    var tabContentId = $currentTab.attr("href");
	    $currentTab.parent().remove(); //remove li of tab
	    $('#myTab a:last').tab('show'); // Select first tab
	    $(tabContentId).remove(); //remove respective tab content
	    
	    
	"""),format.raw/*394.2*/("""}"""),format.raw/*394.3*/("""
</script>

<script>

var sessionServer = 'http://chat.stalk.io:8000';
//### Restful API 목록
var API = """),format.raw/*401.11*/("""{"""),format.raw/*401.12*/("""
  // #### Session Socket Server 주소 가져오기.
  // Session Server 로부터 App ID와 User ID를 기준으로 Session Socket Server 주소를 가져 옵니다.
  //
  // ##### <code>GET</code> /session/ [App ID] / [User ID]
  auth: function (_userId, callback) """),format.raw/*406.38*/("""{"""),format.raw/*406.39*/("""
    
    var params = """),format.raw/*408.18*/("""{"""),format.raw/*408.19*/("""
      app: 'stalk-io',
      userId: Users[_userId].userId,
      deviceId: Users[_userId].deviceId
    """),format.raw/*412.5*/("""}"""),format.raw/*412.6*/(""";   
    console.log(params);
    $.post(""""),_display_(Seq[Any](/*414.14*/routes/*414.20*/.Stalk.auth())),format.raw/*414.33*/(""""
 		, params
 		, function(data) """),format.raw/*416.21*/("""{"""),format.raw/*416.22*/("""
 	        
 	          callback(data, _userId);
 	        
 	      """),format.raw/*420.9*/("""}"""),format.raw/*420.10*/(""");
   
  """),format.raw/*422.3*/("""}"""),format.raw/*422.4*/(""",
  
  // #### Message Socket Server 주소 가져오기.
  // Session Server 로부터 App ID 와 Channel명을 기준으로 Message Socket Server 주소를 가져 옵니다.
  //
  // ##### <code>GET</code> /node/ [App명] / [Channel명]
  node: function (_app, _channel, callback) """),format.raw/*428.45*/("""{"""),format.raw/*428.46*/("""
	  
	var url = sessionServer+'/node/'+encodeURIComponent(_app)+'/'+_channel;
    
	$.get(url, 
		function(data) """),format.raw/*433.18*/("""{"""),format.raw/*433.19*/("""
			callback(data);

		"""),format.raw/*436.3*/("""}"""),format.raw/*436.4*/(""");
	"""),format.raw/*437.2*/("""}"""),format.raw/*437.3*/("""
  
"""),format.raw/*439.1*/("""}"""),format.raw/*439.2*/(""";



var socketOptions ="""),format.raw/*443.20*/("""{"""),format.raw/*443.21*/("""
		  transports: ['websocket'],
		  'force new connection': true
		"""),format.raw/*446.3*/("""}"""),format.raw/*446.4*/(""";

// ### 기능 구현 목록
var Library = """),format.raw/*449.15*/("""{"""),format.raw/*449.16*/("""

  // #### 로그인하기.
  connect_session_socket: function(_userId, callback) """),format.raw/*452.55*/("""{"""),format.raw/*452.56*/("""
	console.log(_userId);
	console.log(Users[_userId]);
    // Session Socket Server 주소 가져오기. ( /node/session/ [User ID] )
    API.auth(Users[_userId].userId, function (data, _userId) """),format.raw/*456.62*/("""{"""),format.raw/*456.63*/("""
      
      var query = 
    	'app='+'stalk-io'+'&'+
			'userId='+encodeURIComponent(Users[_userId].userId)+'&'+
    	'deviceId='+Users[_userId].deviceId+'&'+
    	'token='+data.result.token;
      console.log(query);
      console.log(data.result.serverUrl+'/session?'+query, socketOptions);
      // Session Socket 연결하기.
      Users[_userId].sessionSocket = io.connect(data.result.serverUrl+'/session?'+query, socketOptions);
      
      // Socket에 connect 이벤트 등록 ( connect 이벤트 발생 )
      Users[_userId].sessionSocket.on('connect', function() """),format.raw/*469.61*/("""{"""),format.raw/*469.62*/("""
        callback();
      """),format.raw/*471.7*/("""}"""),format.raw/*471.8*/(""");
      
      Users[_userId].sessionSocket.on('_event', function (data) """),format.raw/*473.65*/("""{"""),format.raw/*473.66*/("""
            console.info('\t NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
            
            $("#visitor").append("<span id="+emailToFlatStr(data.data.sender)+">"+data.data.sender+"<span><br/>");
            playSound();
            openChatArea(data);
            joinChannel(data.channel);
	  """),format.raw/*480.4*/("""}"""),format.raw/*480.5*/(""");
      
      
      
      
    """),format.raw/*485.5*/("""}"""),format.raw/*485.6*/(""");
  """),format.raw/*486.3*/("""}"""),format.raw/*486.4*/(""",

  // #### Channel 목록 가져오기.
  // User ID 가 포함되어 있는 모든 Channel 목록을 가져오기.
  //
  // ( **user-login** 이벤트 호출 이후에 사용 가능 ).
  channels: function(_userId, callback) """),format.raw/*492.41*/("""{"""),format.raw/*492.42*/("""
    
    // **channal-list** 이벤트 호출.
	console.log("channeeelkwlell")
    Users[_userId].sessionSocket.emit('listChannel',"""),format.raw/*496.53*/("""{"""),format.raw/*496.54*/("""key:Application.appId"""),format.raw/*496.75*/("""}"""),format.raw/*496.76*/(""", function (data) """),format.raw/*496.94*/("""{"""),format.raw/*496.95*/("""
        console.info('\t channels : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*499.5*/("""}"""),format.raw/*499.6*/(""");
    
  """),format.raw/*501.3*/("""}"""),format.raw/*501.4*/(""",

  // #### Channel 생성하기.
  createChannel: function(_userId, _channel, _userIds, callback) """),format.raw/*504.66*/("""{"""),format.raw/*504.67*/("""

    // **channel-create** 이벤트 호출
    var param = """),format.raw/*507.17*/("""{"""),format.raw/*507.18*/("""
      channel:  _channel,           // channel : channel ID
      users:    _userIds            // users : userId 배열, **생성자의 User ID도 포함**되어야 한다.
    """),format.raw/*510.5*/("""}"""),format.raw/*510.6*/(""";

    Users[_userId].sessionSocket.emit('channel-create', param, function (data) """),format.raw/*512.80*/("""{"""),format.raw/*512.81*/("""
        console.info('\t create channel : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*515.5*/("""}"""),format.raw/*515.6*/(""");

  """),format.raw/*517.3*/("""}"""),format.raw/*517.4*/(""",

  // #### Channel 참여하기.
  connect_channel_socket: function(_userId, _channel, callback) """),format.raw/*520.65*/("""{"""),format.raw/*520.66*/("""
    
    // Message Socket Server 주소 가져오기. ( /node/ [App ID] / [Channel ID] )
    API.node('stalk-io', _channel, function (data) """),format.raw/*523.52*/("""{"""),format.raw/*523.53*/("""
      
      var query = 
    			'app='+'stalk-io'+'&'+
      			'channel='+data.result.channel+'&'+
      			'server='+data.result.server+'&'+
				'userId='+encodeURIComponent(Users[_userId].userId)+'&'+
    			'deviceId='+Users[_userId].deviceId;
      console.log(query);
      Users[_userId][_channel] = io.connect(data.result.server.url+'/channel?'+query, socketOptions);
      Users[_userId][_channel].on('connect', function(data) """),format.raw/*533.61*/("""{"""),format.raw/*533.62*/("""
        callback(data);
        
      """),format.raw/*536.7*/("""}"""),format.raw/*536.8*/(""");

      Users[_userId][_channel].on('message', function (data) """),format.raw/*538.62*/("""{"""),format.raw/*538.63*/("""
	        console.info('\t MESSAGE ('+_userId+') : '+JSON.stringify(data));
	        
	        var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
	        var msgClass = data.sender==_userId?'from-op':'from-visitor';
	        
	        
	        chatText +='<div class="message '+msgClass+'">'+decodeURIComponent(data.message)+'</div>';

	    	$('#panel'+chatObj[data.channel]).append(chatText);
	    	
	    	var div_message = document.getElementById('panel'+chatObj[data.channel]);
	        div_message.scrollTop = div_message.scrollHeight;
	        
	        $('a').each(function()"""),format.raw/*552.32*/("""{"""),format.raw/*552.33*/("""
	        	if($(this).attr('href')=='#'+chatObj[data.channel] && !$(this).parent().hasClass('active'))"""),format.raw/*553.102*/("""{"""),format.raw/*553.103*/("""
	        		blinkTab($(this).parent());
	        	"""),format.raw/*555.11*/("""}"""),format.raw/*555.12*/("""	
	        	
	        """),format.raw/*557.10*/("""}"""),format.raw/*557.11*/(""");
        
      """),format.raw/*559.7*/("""}"""),format.raw/*559.8*/(""");
      
      Users[_userId][_channel].on('_event', function (data) """),format.raw/*561.61*/("""{"""),format.raw/*561.62*/("""
    	  console.info('\t CHANNLEL SOCKET NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
    	  
    	  if(data.event=="DISCONNECT")"""),format.raw/*564.36*/("""{"""),format.raw/*564.37*/("""
    		  
    		  var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
    	      chatText +='<div class="message from-visitor">Disconnected</div>';
    	        
    	      
    	 	  $('#panel'+chatObj[data.channel]).append(chatText);
    	 	  var div_message = document.getElementById('panel'+chatObj[data.channel]);
    	      div_message.scrollTop = div_message.scrollHeight;
    		  
    	      delete chatObj[data.channel];
    	      $('#'+emailToFlatStr(data.userId)).remove();
    	      $('#recent'+emailToFlatStr(data.userId)).remove();
    	      
    	      
    	  """),format.raw/*579.8*/("""}"""),format.raw/*579.9*/("""
    	  
    	  
    	     
    	  
      """),format.raw/*584.7*/("""}"""),format.raw/*584.8*/(""");
      
    

    """),format.raw/*588.5*/("""}"""),format.raw/*588.6*/(""");
  """),format.raw/*589.3*/("""}"""),format.raw/*589.4*/(""",
  
  // #### Channel 에서 나가기.
  leaveChannel: function(_userId,_channel) """),format.raw/*592.44*/("""{"""),format.raw/*592.45*/("""
	delete chatObj[_channel];
    Users[_userId][_channel].disconnect();
  """),format.raw/*595.3*/("""}"""),format.raw/*595.4*/(""",
  
  // #### Channel 에 메시지 전송.
  sendMessage: function(_userId, _channel, _name, _datas, callback) """),format.raw/*598.69*/("""{"""),format.raw/*598.70*/("""
        
    var param = """),format.raw/*600.17*/("""{"""),format.raw/*600.18*/("""
      app:      'stalk-io',  // app : Application ID
      channel:  _channel,           // channel : Channel ID
      name:     _name,              // name : 이벤트 발생 ID
      data:     _datas """),format.raw/*604.24*/("""}"""),format.raw/*604.25*/(""";           // data : 전송할 데이터
	
    Users[_userId][_channel].emit('send', param, function (data) """),format.raw/*606.66*/("""{"""),format.raw/*606.67*/("""
      callback(data);
    """),format.raw/*608.5*/("""}"""),format.raw/*608.6*/(""");

  """),format.raw/*610.3*/("""}"""),format.raw/*610.4*/(""",

  unReadMessage: function(_userId, callback) """),format.raw/*612.46*/("""{"""),format.raw/*612.47*/("""
    Users[_userId][_channel].emit('message-unread', function (data) """),format.raw/*613.69*/("""{"""),format.raw/*613.70*/("""
      console.info('\t UNREAD MESSAGE ('+_userId+') : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*616.5*/("""}"""),format.raw/*616.6*/(""");

  """),format.raw/*618.3*/("""}"""),format.raw/*618.4*/(""",

  exitChannel: function(_userId, _channel, callback) """),format.raw/*620.54*/("""{"""),format.raw/*620.55*/("""
    Users[_userId].sessionSocket.emit('channel-exit', """),format.raw/*621.55*/("""{"""),format.raw/*621.56*/("""channel: _channel"""),format.raw/*621.73*/("""}"""),format.raw/*621.74*/(""", function (data) """),format.raw/*621.92*/("""{"""),format.raw/*621.93*/("""
      callback(data);
    """),format.raw/*623.5*/("""}"""),format.raw/*623.6*/(""");
  """),format.raw/*624.3*/("""}"""),format.raw/*624.4*/("""


"""),format.raw/*627.1*/("""}"""),format.raw/*627.2*/(""";

Library.connect_session_socket(userId, function(result)"""),format.raw/*629.56*/("""{"""),format.raw/*629.57*/("""
	channels();
	
"""),format.raw/*632.1*/("""}"""),format.raw/*632.2*/(""");

function channels()"""),format.raw/*634.20*/("""{"""),format.raw/*634.21*/("""
	Library.channels(userId, function(result)"""),format.raw/*635.43*/("""{"""),format.raw/*635.44*/("""
    	
    	if(result.result.length<1)"""),format.raw/*637.32*/("""{"""),format.raw/*637.33*/("""
    		//Library.createChannel(userId, null, [userId], function(result)"""),format.raw/*638.71*/("""{"""),format.raw/*638.72*/("""
    	        
    	        //joinChannel(result.result[0].channel);
    	     // """),format.raw/*641.14*/("""}"""),format.raw/*641.15*/(""");
    	"""),format.raw/*642.6*/("""}"""),format.raw/*642.7*/("""else"""),format.raw/*642.11*/("""{"""),format.raw/*642.12*/("""
    		//joinChannel(result.result[0].channel);
    	"""),format.raw/*644.6*/("""}"""),format.raw/*644.7*/("""
    """),format.raw/*645.5*/("""}"""),format.raw/*645.6*/(""");
"""),format.raw/*646.1*/("""}"""),format.raw/*646.2*/("""

function joinChannel(channel)"""),format.raw/*648.30*/("""{"""),format.raw/*648.31*/("""
	Library.connect_channel_socket(userId,channel, function(result)"""),format.raw/*649.65*/("""{"""),format.raw/*649.66*/("""
        
      """),format.raw/*651.7*/("""}"""),format.raw/*651.8*/(""");
"""),format.raw/*652.1*/("""}"""),format.raw/*652.2*/("""

function sendMsg(tabId, channel)"""),format.raw/*654.33*/("""{"""),format.raw/*654.34*/("""
	
	
	var msg = $('#input'+tabId).val();
	msg = getEscapeHtml(msg.replace(/^\s+|\s+$/g, '')); 
		
	var spanId = emailToFlatStr(channel.split("^")[2]);
	
	
	if(!document.getElementById("recent"+spanId)&&chatObj[channel])"""),format.raw/*663.65*/("""{"""),format.raw/*663.66*/("""
		$("#"+spanId).remove();
		$("#recent").append("<span id=recent"+spanId+">"+channel.split("^")[2]+"<span><br/>");
		
		
	"""),format.raw/*668.2*/("""}"""),format.raw/*668.3*/("""
	
	if(chatObj[channel])"""),format.raw/*670.22*/("""{"""),format.raw/*670.23*/("""
		Library.sendMessage(userId, channel, 'message', """),format.raw/*671.51*/("""{"""),format.raw/*671.52*/(""" message: msg, sender: userId"""),format.raw/*671.81*/("""}"""),format.raw/*671.82*/(""", function(result)"""),format.raw/*671.100*/("""{"""),format.raw/*671.101*/("""}"""),format.raw/*671.102*/(""");
	"""),format.raw/*672.2*/("""}"""),format.raw/*672.3*/("""
	
	$('#input'+tabId).val('');
	
	
"""),format.raw/*677.1*/("""}"""),format.raw/*677.2*/("""

var blinkTimeout = '';
function blinkTab(aObj,isDone)"""),format.raw/*680.31*/("""{"""),format.raw/*680.32*/("""
  if(isDone)"""),format.raw/*681.13*/("""{"""),format.raw/*681.14*/("""
    clearInterval(blinkTimeout);
    aObj.removeClass('twinkle');
  """),format.raw/*684.3*/("""}"""),format.raw/*684.4*/("""else"""),format.raw/*684.8*/("""{"""),format.raw/*684.9*/("""
    clearInterval(blinkTimeout);
    blinkTimeout =
      setInterval(function()"""),format.raw/*687.29*/("""{"""),format.raw/*687.30*/("""
        
        if(aObj.hasClass('twinkle'))"""),format.raw/*689.37*/("""{"""),format.raw/*689.38*/("""
        	aObj.removeClass('twinkle');
        """),format.raw/*691.9*/("""}"""),format.raw/*691.10*/("""else"""),format.raw/*691.14*/("""{"""),format.raw/*691.15*/("""
        	aObj.addClass('twinkle');
        """),format.raw/*693.9*/("""}"""),format.raw/*693.10*/("""
      """),format.raw/*694.7*/("""}"""),format.raw/*694.8*/(""",1000);
  """),format.raw/*695.3*/("""}"""),format.raw/*695.4*/("""
"""),format.raw/*696.1*/("""}"""),format.raw/*696.2*/("""

function clearTwinkle(li)"""),format.raw/*698.26*/("""{"""),format.raw/*698.27*/("""
	blinkTab($(li),true);
	
"""),format.raw/*701.1*/("""}"""),format.raw/*701.2*/("""

function getOperators()"""),format.raw/*703.24*/("""{"""),format.raw/*703.25*/("""
	$.get("/operator","""),format.raw/*704.20*/("""{"""),format.raw/*704.21*/("""appId:$('#stalkAppId').val()"""),format.raw/*704.49*/("""}"""),format.raw/*704.50*/(""",function(data)"""),format.raw/*704.65*/("""{"""),format.raw/*704.66*/("""
		
		var ophtml = "";
		var jd = JSON.parse(data);
		
		for(var d in jd)"""),format.raw/*709.19*/("""{"""),format.raw/*709.20*/("""
			ophtml+=jd[d].userId;
			ophtml+="<br/>";
		"""),format.raw/*712.3*/("""}"""),format.raw/*712.4*/("""
		$("#operator").html(ophtml);
	"""),format.raw/*714.2*/("""}"""),format.raw/*714.3*/(""")
"""),format.raw/*715.1*/("""}"""),format.raw/*715.2*/("""
function playSound()"""),format.raw/*716.21*/("""{"""),format.raw/*716.22*/("""   
    document.getElementById("sound").innerHTML='<audio autoplay="autoplay"><source src=""""),_display_(Seq[Any](/*717.90*/routes/*717.96*/.Assets.at("audio/noti.mp3"))),format.raw/*717.124*/("""" type="audio/mpeg" /><embed hidden="true" autostart="true" loop="false" src=""""),_display_(Seq[Any](/*717.203*/routes/*717.209*/.Assets.at("audio/noti.mp3"))),format.raw/*717.237*/("""" /></audio>';
"""),format.raw/*718.1*/("""}"""),format.raw/*718.2*/("""

function getEscapeHtml (html) """),format.raw/*720.31*/("""{"""),format.raw/*720.32*/("""
	  return String(html)
	    .replace(/&/g, '&amp;')
	    .replace(/"/g, '&quot;')
	    .replace(/'/g, '&#39;')
	    .replace(/</g, '&lt;')
	    .replace(/>/g, '&gt;');
	  """),format.raw/*727.4*/("""}"""),format.raw/*727.5*/("""

getOperators();
</script>
      
""")))})),format.raw/*732.2*/("""
"""))}
    }
    
    def render(appId:String): play.api.templates.HtmlFormat.Appendable = apply(appId)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (appId) => apply(appId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 16 14:34:34 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/chat.scala.html
                    HASH: afe07996a8dee2c4f2752af9f5f4e973e5448bb2
                    MATRIX: 773->1|897->15|924->33|960->35|985->52|1024->54|1065->69|1092->70|1332->283|1360->284|1400->296|1429->297|1498->339|1526->340|1561->348|1589->349|1670->403|1698->404|1737->416|1765->417|1882->507|1910->508|1965->536|1993->537|2044->561|2072->562|2128->591|2156->592|2208->617|2236->618|2288->643|2316->644|2379->680|2407->681|2470->717|2498->718|2549->742|2577->743|2624->763|2652->764|2723->808|2751->809|2796->826|2825->827|2916->891|2944->892|2999->920|3027->921|3141->1008|3169->1009|3219->1032|3247->1033|3323->1082|3351->1083|3407->1112|3435->1113|3545->1196|3573->1197|3627->1223|3656->1224|3732->1273|3760->1274|3803->1289|3832->1290|3895->1326|3923->1327|3966->1342|3995->1343|4053->1374|4081->1375|4131->1397|4160->1398|4209->1420|4237->1421|4283->1438|4313->1439|4397->1495|4426->1496|4466->1507|4496->1508|4678->1662|4707->1663|4747->1674|4777->1675|4868->1738|4897->1739|4942->1755|4972->1756|5064->1820|5093->1821|5131->1831|5161->1832|5216->1859|5245->1860|6929->3507|6957->3512|7041->3559|7057->3565|7109->3594|7272->3728|7302->3729|7370->3769|7399->3770|7447->3789|7477->3790|7507->3791|7568->3815|7587->3824|7623->3837|7670->3855|7700->3856|7747->3866|7766->3875|7802->3888|7834->3891|7864->3892|7928->3919|7947->3928|7983->3941|8087->4016|8117->4017|8150->4022|8179->4023|8236->4051|8266->4052|8619->4377|8648->4378|8713->4414|8743->4415|8843->4486|8873->4487|8973->4559|9002->4560|9053->4583|9082->4584|9145->4618|9175->4619|17559->12975|17588->12976|17652->13011|17682->13012|17758->13059|17788->13060|17844->13087|17874->13088|17978->13164|18007->13165|18042->13172|18071->13173|18103->13177|18132->13178|18190->13207|18220->13208|18295->13256|18324->13257|18447->13351|18477->13352|18547->13393|18577->13394|19010->13798|19040->13799|19124->13854|19154->13855|19375->14047|19405->14048|19444->14058|19474->14059|19510->14067|19539->14068|19571->14072|19600->14073|19760->14204|19790->14205|19875->14262|19904->14263|19989->14319|20019->14320|20073->14346|20102->14347|20292->14508|20322->14509|20426->14584|20456->14585|20518->14618|20548->14619|20817->14859|20847->14860|20881->14866|20910->14867|20944->14873|20973->14874|21035->14907|21065->14908|21201->15016|21230->15017|21291->15049|21321->15050|21588->15289|21617->15290|21748->15392|21778->15393|22030->15616|22060->15617|22112->15640|22142->15641|22275->15746|22304->15747|22384->15790|22400->15796|22436->15809|22499->15843|22529->15844|22625->15912|22655->15913|22692->15922|22721->15923|22982->16155|23012->16156|23154->16269|23184->16270|23235->16293|23264->16294|23296->16298|23325->16299|23357->16303|23386->16304|23439->16328|23469->16329|23564->16396|23593->16397|23655->16430|23685->16431|23787->16504|23817->16505|24028->16687|24058->16688|24635->17236|24665->17237|24720->17264|24749->17265|24852->17339|24882->17340|25224->17654|25253->17655|25316->17690|25345->17691|25378->17696|25407->17697|25597->17858|25627->17859|25778->17981|25808->17982|25858->18003|25888->18004|25935->18022|25965->18023|26081->18111|26110->18112|26148->18122|26177->18123|26298->18215|26328->18216|26408->18267|26438->18268|26617->18419|26646->18420|26757->18502|26787->18503|26909->18597|26938->18598|26972->18604|27001->18605|27121->18696|27151->18697|27310->18827|27340->18828|27807->19266|27837->19267|27905->19307|27934->19308|28028->19373|28058->19374|28685->19972|28715->19973|28847->20075|28878->20076|28957->20126|28987->20127|29038->20149|29068->20150|29114->20168|29143->20169|29242->20239|29272->20240|29442->20381|29472->20382|30092->20974|30121->20975|30191->21017|30220->21018|30268->21038|30297->21039|30330->21044|30359->21045|30462->21119|30492->21120|30593->21193|30622->21194|30752->21295|30782->21296|30837->21322|30867->21323|31089->21516|31119->21517|31245->21614|31275->21615|31330->21642|31359->21643|31393->21649|31422->21650|31499->21698|31529->21699|31627->21768|31657->21769|31791->21875|31820->21876|31854->21882|31883->21883|31968->21939|31998->21940|32082->21995|32112->21996|32158->22013|32188->22014|32235->22032|32265->22033|32320->22060|32349->22061|32382->22066|32411->22067|32442->22070|32471->22071|32558->22129|32588->22130|32632->22146|32661->22147|32713->22170|32743->22171|32815->22214|32845->22215|32912->22253|32942->22254|33042->22325|33072->22326|33183->22408|33213->22409|33249->22417|33278->22418|33311->22422|33341->22423|33422->22476|33451->22477|33484->22482|33513->22483|33544->22486|33573->22487|33633->22518|33663->22519|33757->22584|33787->22585|33831->22601|33860->22602|33891->22605|33920->22606|33983->22640|34013->22641|34261->22860|34291->22861|34442->22984|34471->22985|34524->23009|34554->23010|34634->23061|34664->23062|34722->23091|34752->23092|34800->23110|34831->23111|34862->23112|34894->23116|34923->23117|34986->23152|35015->23153|35099->23208|35129->23209|35171->23222|35201->23223|35298->23292|35327->23293|35359->23297|35388->23298|35498->23379|35528->23380|35603->23426|35633->23427|35708->23474|35738->23475|35771->23479|35801->23480|35873->23524|35903->23525|35938->23532|35967->23533|36005->23543|36034->23544|36063->23545|36092->23546|36148->23573|36178->23574|36232->23600|36261->23601|36315->23626|36345->23627|36394->23647|36424->23648|36481->23676|36511->23677|36555->23692|36585->23693|36687->23766|36717->23767|36793->23815|36822->23816|36883->23849|36912->23850|36942->23852|36971->23853|37021->23874|37051->23875|37181->23968|37197->23974|37249->24002|37366->24081|37383->24087|37435->24115|37478->24130|37507->24131|37568->24163|37598->24164|37798->24336|37827->24337|37895->24373
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|43->15|43->15|45->17|45->17|48->20|48->20|51->23|51->23|55->27|55->27|58->30|58->30|62->34|62->34|65->37|65->37|67->39|67->39|70->42|70->42|72->44|72->44|75->47|75->47|78->50|78->50|81->53|81->53|83->55|83->55|86->58|86->58|89->61|89->61|91->63|91->63|93->65|93->65|96->68|96->68|99->71|99->71|102->74|102->74|105->77|105->77|108->80|108->80|111->83|111->83|115->87|115->87|118->90|118->90|119->91|119->91|121->93|121->93|122->94|122->94|124->96|124->96|125->97|125->97|127->99|127->99|130->102|130->102|134->106|134->106|136->108|136->108|145->117|145->117|147->119|147->119|151->123|151->123|153->125|153->125|158->130|158->130|160->132|160->132|162->134|162->134|219->191|219->191|222->194|222->194|222->194|226->198|226->198|228->200|228->200|229->201|229->201|229->201|231->203|231->203|231->203|232->204|232->204|233->205|233->205|233->205|233->205|233->205|234->206|234->206|234->206|237->209|237->209|239->211|239->211|241->213|241->213|254->226|254->226|256->228|256->228|260->232|260->232|263->235|263->235|265->237|265->237|270->242|270->242|349->321|349->321|351->323|351->323|352->324|352->324|353->325|353->325|357->329|357->329|358->330|358->330|359->331|359->331|360->332|360->332|362->334|362->334|364->336|364->336|366->338|366->338|374->346|374->346|375->347|375->347|380->352|380->352|381->353|381->353|383->355|383->355|384->356|384->356|387->359|387->359|389->361|389->361|391->363|391->363|393->365|393->365|396->368|396->368|398->370|398->370|399->371|399->371|403->375|403->375|404->376|404->376|406->378|406->378|408->380|408->380|412->384|412->384|415->387|415->387|422->394|422->394|429->401|429->401|434->406|434->406|436->408|436->408|440->412|440->412|442->414|442->414|442->414|444->416|444->416|448->420|448->420|450->422|450->422|456->428|456->428|461->433|461->433|464->436|464->436|465->437|465->437|467->439|467->439|471->443|471->443|474->446|474->446|477->449|477->449|480->452|480->452|484->456|484->456|497->469|497->469|499->471|499->471|501->473|501->473|508->480|508->480|513->485|513->485|514->486|514->486|520->492|520->492|524->496|524->496|524->496|524->496|524->496|524->496|527->499|527->499|529->501|529->501|532->504|532->504|535->507|535->507|538->510|538->510|540->512|540->512|543->515|543->515|545->517|545->517|548->520|548->520|551->523|551->523|561->533|561->533|564->536|564->536|566->538|566->538|580->552|580->552|581->553|581->553|583->555|583->555|585->557|585->557|587->559|587->559|589->561|589->561|592->564|592->564|607->579|607->579|612->584|612->584|616->588|616->588|617->589|617->589|620->592|620->592|623->595|623->595|626->598|626->598|628->600|628->600|632->604|632->604|634->606|634->606|636->608|636->608|638->610|638->610|640->612|640->612|641->613|641->613|644->616|644->616|646->618|646->618|648->620|648->620|649->621|649->621|649->621|649->621|649->621|649->621|651->623|651->623|652->624|652->624|655->627|655->627|657->629|657->629|660->632|660->632|662->634|662->634|663->635|663->635|665->637|665->637|666->638|666->638|669->641|669->641|670->642|670->642|670->642|670->642|672->644|672->644|673->645|673->645|674->646|674->646|676->648|676->648|677->649|677->649|679->651|679->651|680->652|680->652|682->654|682->654|691->663|691->663|696->668|696->668|698->670|698->670|699->671|699->671|699->671|699->671|699->671|699->671|699->671|700->672|700->672|705->677|705->677|708->680|708->680|709->681|709->681|712->684|712->684|712->684|712->684|715->687|715->687|717->689|717->689|719->691|719->691|719->691|719->691|721->693|721->693|722->694|722->694|723->695|723->695|724->696|724->696|726->698|726->698|729->701|729->701|731->703|731->703|732->704|732->704|732->704|732->704|732->704|732->704|737->709|737->709|740->712|740->712|742->714|742->714|743->715|743->715|744->716|744->716|745->717|745->717|745->717|745->717|745->717|745->717|746->718|746->718|748->720|748->720|755->727|755->727|760->732
                    -- GENERATED --
                */
            