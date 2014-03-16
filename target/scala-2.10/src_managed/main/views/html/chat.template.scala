
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
      app: Application.appId,
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
    	'app='+Application.appId+'&'+
			'userId='+Users[_userId].userId+'&'+
    	'deviceId='+Users[_userId].deviceId+'&'+
    	'token='+data.result.token;
      
      // Session Socket 연결하기.
      Users[_userId].sessionSocket = io.connect(data.result.serverUrl+'/session?'+query, socketOptions);
      
      // Socket에 connect 이벤트 등록 ( connect 이벤트 발생 )
      Users[_userId].sessionSocket.on('connect', function() """),format.raw/*468.61*/("""{"""),format.raw/*468.62*/("""
        callback();
      """),format.raw/*470.7*/("""}"""),format.raw/*470.8*/(""");
      
      Users[_userId].sessionSocket.on('_event', function (data) """),format.raw/*472.65*/("""{"""),format.raw/*472.66*/("""
            console.info('\t NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
            
            $("#visitor").append("<span id="+emailToFlatStr(data.data.sender)+">"+data.data.sender+"<span><br/>");
            playSound();
            openChatArea(data);
            joinChannel(data.channel);
	  """),format.raw/*479.4*/("""}"""),format.raw/*479.5*/(""");
      
      
      
      
    """),format.raw/*484.5*/("""}"""),format.raw/*484.6*/(""");
  """),format.raw/*485.3*/("""}"""),format.raw/*485.4*/(""",

  // #### Channel 목록 가져오기.
  // User ID 가 포함되어 있는 모든 Channel 목록을 가져오기.
  //
  // ( **user-login** 이벤트 호출 이후에 사용 가능 ).
  channels: function(_userId, callback) """),format.raw/*491.41*/("""{"""),format.raw/*491.42*/("""
    
    // **channal-list** 이벤트 호출.
	
    Users[_userId].sessionSocket.emit('channel-list', function (data) """),format.raw/*495.71*/("""{"""),format.raw/*495.72*/("""
        console.info('\t channels : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*498.5*/("""}"""),format.raw/*498.6*/(""");
    
  """),format.raw/*500.3*/("""}"""),format.raw/*500.4*/(""",

  // #### Channel 생성하기.
  createChannel: function(_userId, _channel, _userIds, callback) """),format.raw/*503.66*/("""{"""),format.raw/*503.67*/("""

    // **channel-create** 이벤트 호출
    var param = """),format.raw/*506.17*/("""{"""),format.raw/*506.18*/("""
      channel:  _channel,           // channel : channel ID
      users:    _userIds            // users : userId 배열, **생성자의 User ID도 포함**되어야 한다.
    """),format.raw/*509.5*/("""}"""),format.raw/*509.6*/(""";

    Users[_userId].sessionSocket.emit('channel-create', param, function (data) """),format.raw/*511.80*/("""{"""),format.raw/*511.81*/("""
        console.info('\t create channel : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*514.5*/("""}"""),format.raw/*514.6*/(""");

  """),format.raw/*516.3*/("""}"""),format.raw/*516.4*/(""",

  // #### Channel 참여하기.
  connect_channel_socket: function(_userId, _channel, callback) """),format.raw/*519.65*/("""{"""),format.raw/*519.66*/("""
    
    // Message Socket Server 주소 가져오기. ( /node/ [App ID] / [Channel ID] )
    API.node(Application.appId, _channel, function (data) """),format.raw/*522.59*/("""{"""),format.raw/*522.60*/("""
      
      var query = 
    			'app='+Application.appId+'&'+
      			'channel='+data.result.channel+'&'+
      			'server='+data.result.server+'&'+
				'userId='+Users[_userId].userId+'&'+
    			'deviceId='+Users[_userId].deviceId;
      
      Users[_userId][_channel] = io.connect(data.result.server.url+'/channel?'+query, socketOptions);
      Users[_userId][_channel].on('connect', function(data) """),format.raw/*532.61*/("""{"""),format.raw/*532.62*/("""
        callback(data);
        
      """),format.raw/*535.7*/("""}"""),format.raw/*535.8*/(""");

      Users[_userId][_channel].on('message', function (data) """),format.raw/*537.62*/("""{"""),format.raw/*537.63*/("""
	        console.info('\t MESSAGE ('+_userId+') : '+JSON.stringify(data));
	        
	        var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
	        var msgClass = data.sender==_userId?'from-op':'from-visitor';
	        
	        
	        chatText +='<div class="message '+msgClass+'">'+decodeURIComponent(data.message)+'</div>';

	    	$('#panel'+chatObj[data.channel]).append(chatText);
	    	
	    	var div_message = document.getElementById('panel'+chatObj[data.channel]);
	        div_message.scrollTop = div_message.scrollHeight;
	        
	        $('a').each(function()"""),format.raw/*551.32*/("""{"""),format.raw/*551.33*/("""
	        	if($(this).attr('href')=='#'+chatObj[data.channel] && !$(this).parent().hasClass('active'))"""),format.raw/*552.102*/("""{"""),format.raw/*552.103*/("""
	        		blinkTab($(this).parent());
	        	"""),format.raw/*554.11*/("""}"""),format.raw/*554.12*/("""	
	        	
	        """),format.raw/*556.10*/("""}"""),format.raw/*556.11*/(""");
        
      """),format.raw/*558.7*/("""}"""),format.raw/*558.8*/(""");
      
      Users[_userId][_channel].on('_event', function (data) """),format.raw/*560.61*/("""{"""),format.raw/*560.62*/("""
    	  console.info('\t CHANNLEL SOCKET NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
    	  
    	  if(data.event=="DISCONNECT")"""),format.raw/*563.36*/("""{"""),format.raw/*563.37*/("""
    		  
    		  var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
    	      chatText +='<div class="message from-visitor">Disconnected</div>';
    	        
    	      
    	 	  $('#panel'+chatObj[data.channel]).append(chatText);
    	 	  var div_message = document.getElementById('panel'+chatObj[data.channel]);
    	      div_message.scrollTop = div_message.scrollHeight;
    		  
    	      delete chatObj[data.channel];
    	      $('#'+emailToFlatStr(data.userId)).remove();
    	      $('#recent'+emailToFlatStr(data.userId)).remove();
    	      
    	      
    	  """),format.raw/*578.8*/("""}"""),format.raw/*578.9*/("""
    	  
    	  
    	     
    	  
      """),format.raw/*583.7*/("""}"""),format.raw/*583.8*/(""");
      
    

    """),format.raw/*587.5*/("""}"""),format.raw/*587.6*/(""");
  """),format.raw/*588.3*/("""}"""),format.raw/*588.4*/(""",
  
  // #### Channel 에서 나가기.
  leaveChannel: function(_userId,_channel) """),format.raw/*591.44*/("""{"""),format.raw/*591.45*/("""
	delete chatObj[_channel];
    Users[_userId][_channel].disconnect();
  """),format.raw/*594.3*/("""}"""),format.raw/*594.4*/(""",
  
  // #### Channel 에 메시지 전송.
  sendMessage: function(_userId, _channel, _name, _datas, callback) """),format.raw/*597.69*/("""{"""),format.raw/*597.70*/("""
        
    var param = """),format.raw/*599.17*/("""{"""),format.raw/*599.18*/("""
      app:      Application.appId,  // app : Application ID
      channel:  _channel,           // channel : Channel ID
      name:     _name,              // name : 이벤트 발생 ID
      data:     _datas """),format.raw/*603.24*/("""}"""),format.raw/*603.25*/(""";           // data : 전송할 데이터
	
    Users[_userId][_channel].emit('send', param, function (data) """),format.raw/*605.66*/("""{"""),format.raw/*605.67*/("""
      callback(data);
    """),format.raw/*607.5*/("""}"""),format.raw/*607.6*/(""");

  """),format.raw/*609.3*/("""}"""),format.raw/*609.4*/(""",

  unReadMessage: function(_userId, callback) """),format.raw/*611.46*/("""{"""),format.raw/*611.47*/("""
    Users[_userId][_channel].emit('message-unread', function (data) """),format.raw/*612.69*/("""{"""),format.raw/*612.70*/("""
      console.info('\t UNREAD MESSAGE ('+_userId+') : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*615.5*/("""}"""),format.raw/*615.6*/(""");

  """),format.raw/*617.3*/("""}"""),format.raw/*617.4*/(""",

  exitChannel: function(_userId, _channel, callback) """),format.raw/*619.54*/("""{"""),format.raw/*619.55*/("""
    Users[_userId].sessionSocket.emit('channel-exit', """),format.raw/*620.55*/("""{"""),format.raw/*620.56*/("""channel: _channel"""),format.raw/*620.73*/("""}"""),format.raw/*620.74*/(""", function (data) """),format.raw/*620.92*/("""{"""),format.raw/*620.93*/("""
      callback(data);
    """),format.raw/*622.5*/("""}"""),format.raw/*622.6*/(""");
  """),format.raw/*623.3*/("""}"""),format.raw/*623.4*/("""


"""),format.raw/*626.1*/("""}"""),format.raw/*626.2*/(""";

Library.connect_session_socket(userId, function(result)"""),format.raw/*628.56*/("""{"""),format.raw/*628.57*/("""
	channels();
	
"""),format.raw/*631.1*/("""}"""),format.raw/*631.2*/(""");

function channels()"""),format.raw/*633.20*/("""{"""),format.raw/*633.21*/("""
	Library.channels(userId, function(result)"""),format.raw/*634.43*/("""{"""),format.raw/*634.44*/("""
    	
    	if(result.result.length<1)"""),format.raw/*636.32*/("""{"""),format.raw/*636.33*/("""
    		Library.createChannel(userId, null, [userId], function(result)"""),format.raw/*637.69*/("""{"""),format.raw/*637.70*/("""
    	        
    	        //joinChannel(result.result[0].channel);
    	      """),format.raw/*640.12*/("""}"""),format.raw/*640.13*/(""");
    	"""),format.raw/*641.6*/("""}"""),format.raw/*641.7*/("""else"""),format.raw/*641.11*/("""{"""),format.raw/*641.12*/("""
    		//joinChannel(result.result[0].channel);
    	"""),format.raw/*643.6*/("""}"""),format.raw/*643.7*/("""
    """),format.raw/*644.5*/("""}"""),format.raw/*644.6*/(""");
"""),format.raw/*645.1*/("""}"""),format.raw/*645.2*/("""

function joinChannel(channel)"""),format.raw/*647.30*/("""{"""),format.raw/*647.31*/("""
	Library.connect_channel_socket(userId,channel, function(result)"""),format.raw/*648.65*/("""{"""),format.raw/*648.66*/("""
        
      """),format.raw/*650.7*/("""}"""),format.raw/*650.8*/(""");
"""),format.raw/*651.1*/("""}"""),format.raw/*651.2*/("""

function sendMsg(tabId, channel)"""),format.raw/*653.33*/("""{"""),format.raw/*653.34*/("""
	
	
	var msg = $('#input'+tabId).val();
	msg = getEscapeHtml(msg.replace(/^\s+|\s+$/g, '')); 
		
	var spanId = emailToFlatStr(channel.split("^")[2]);
	
	
	if(!document.getElementById("recent"+spanId)&&chatObj[channel])"""),format.raw/*662.65*/("""{"""),format.raw/*662.66*/("""
		$("#"+spanId).remove();
		$("#recent").append("<span id=recent"+spanId+">"+channel.split("^")[2]+"<span><br/>");
		
		
	"""),format.raw/*667.2*/("""}"""),format.raw/*667.3*/("""
	
	if(chatObj[channel])"""),format.raw/*669.22*/("""{"""),format.raw/*669.23*/("""
		Library.sendMessage(userId, channel, 'message', """),format.raw/*670.51*/("""{"""),format.raw/*670.52*/(""" message: msg, sender: userId"""),format.raw/*670.81*/("""}"""),format.raw/*670.82*/(""", function(result)"""),format.raw/*670.100*/("""{"""),format.raw/*670.101*/("""}"""),format.raw/*670.102*/(""");
	"""),format.raw/*671.2*/("""}"""),format.raw/*671.3*/("""
	
	$('#input'+tabId).val('');
	
	
"""),format.raw/*676.1*/("""}"""),format.raw/*676.2*/("""

var blinkTimeout = '';
function blinkTab(aObj,isDone)"""),format.raw/*679.31*/("""{"""),format.raw/*679.32*/("""
  if(isDone)"""),format.raw/*680.13*/("""{"""),format.raw/*680.14*/("""
    clearInterval(blinkTimeout);
    aObj.removeClass('twinkle');
  """),format.raw/*683.3*/("""}"""),format.raw/*683.4*/("""else"""),format.raw/*683.8*/("""{"""),format.raw/*683.9*/("""
    clearInterval(blinkTimeout);
    blinkTimeout =
      setInterval(function()"""),format.raw/*686.29*/("""{"""),format.raw/*686.30*/("""
        
        if(aObj.hasClass('twinkle'))"""),format.raw/*688.37*/("""{"""),format.raw/*688.38*/("""
        	aObj.removeClass('twinkle');
        """),format.raw/*690.9*/("""}"""),format.raw/*690.10*/("""else"""),format.raw/*690.14*/("""{"""),format.raw/*690.15*/("""
        	aObj.addClass('twinkle');
        """),format.raw/*692.9*/("""}"""),format.raw/*692.10*/("""
      """),format.raw/*693.7*/("""}"""),format.raw/*693.8*/(""",1000);
  """),format.raw/*694.3*/("""}"""),format.raw/*694.4*/("""
"""),format.raw/*695.1*/("""}"""),format.raw/*695.2*/("""

function clearTwinkle(li)"""),format.raw/*697.26*/("""{"""),format.raw/*697.27*/("""
	blinkTab($(li),true);
	
"""),format.raw/*700.1*/("""}"""),format.raw/*700.2*/("""

function getOperators()"""),format.raw/*702.24*/("""{"""),format.raw/*702.25*/("""
	$.get("/operator","""),format.raw/*703.20*/("""{"""),format.raw/*703.21*/("""appId:$('#stalkAppId').val()"""),format.raw/*703.49*/("""}"""),format.raw/*703.50*/(""",function(data)"""),format.raw/*703.65*/("""{"""),format.raw/*703.66*/("""
		
		var ophtml = "";
		var jd = JSON.parse(data);
		
		for(var d in jd)"""),format.raw/*708.19*/("""{"""),format.raw/*708.20*/("""
			ophtml+=jd[d].userId;
			ophtml+="<br/>";
		"""),format.raw/*711.3*/("""}"""),format.raw/*711.4*/("""
		$("#operator").html(ophtml);
	"""),format.raw/*713.2*/("""}"""),format.raw/*713.3*/(""")
"""),format.raw/*714.1*/("""}"""),format.raw/*714.2*/("""
function playSound()"""),format.raw/*715.21*/("""{"""),format.raw/*715.22*/("""   
    document.getElementById("sound").innerHTML='<audio autoplay="autoplay"><source src=""""),_display_(Seq[Any](/*716.90*/routes/*716.96*/.Assets.at("audio/noti.mp3"))),format.raw/*716.124*/("""" type="audio/mpeg" /><embed hidden="true" autostart="true" loop="false" src=""""),_display_(Seq[Any](/*716.203*/routes/*716.209*/.Assets.at("audio/noti.mp3"))),format.raw/*716.237*/("""" /></audio>';
"""),format.raw/*717.1*/("""}"""),format.raw/*717.2*/("""

function getEscapeHtml (html) """),format.raw/*719.31*/("""{"""),format.raw/*719.32*/("""
	  return String(html)
	    .replace(/&/g, '&amp;')
	    .replace(/"/g, '&quot;')
	    .replace(/'/g, '&#39;')
	    .replace(/</g, '&lt;')
	    .replace(/>/g, '&gt;');
	  """),format.raw/*726.4*/("""}"""),format.raw/*726.5*/("""

getOperators();
</script>
      
""")))})),format.raw/*731.2*/("""
"""))}
    }
    
    def render(appId:String): play.api.templates.HtmlFormat.Appendable = apply(appId)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (appId) => apply(appId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Sun Mar 16 10:18:51 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/chat.scala.html
                    HASH: c68238c85f086c16e65e8761c06ca741cff82b2e
                    MATRIX: 773->1|897->15|924->33|960->35|985->52|1024->54|1065->69|1092->70|1332->283|1360->284|1400->296|1429->297|1498->339|1526->340|1561->348|1589->349|1670->403|1698->404|1737->416|1765->417|1882->507|1910->508|1965->536|1993->537|2044->561|2072->562|2128->591|2156->592|2208->617|2236->618|2288->643|2316->644|2379->680|2407->681|2470->717|2498->718|2549->742|2577->743|2624->763|2652->764|2723->808|2751->809|2796->826|2825->827|2916->891|2944->892|2999->920|3027->921|3141->1008|3169->1009|3219->1032|3247->1033|3323->1082|3351->1083|3407->1112|3435->1113|3545->1196|3573->1197|3627->1223|3656->1224|3732->1273|3760->1274|3803->1289|3832->1290|3895->1326|3923->1327|3966->1342|3995->1343|4053->1374|4081->1375|4131->1397|4160->1398|4209->1420|4237->1421|4283->1438|4313->1439|4397->1495|4426->1496|4466->1507|4496->1508|4678->1662|4707->1663|4747->1674|4777->1675|4868->1738|4897->1739|4942->1755|4972->1756|5064->1820|5093->1821|5131->1831|5161->1832|5216->1859|5245->1860|6929->3507|6957->3512|7041->3559|7057->3565|7109->3594|7272->3728|7302->3729|7370->3769|7399->3770|7447->3789|7477->3790|7507->3791|7568->3815|7587->3824|7623->3837|7670->3855|7700->3856|7747->3866|7766->3875|7802->3888|7834->3891|7864->3892|7928->3919|7947->3928|7983->3941|8087->4016|8117->4017|8150->4022|8179->4023|8236->4051|8266->4052|8619->4377|8648->4378|8713->4414|8743->4415|8843->4486|8873->4487|8973->4559|9002->4560|9053->4583|9082->4584|9145->4618|9175->4619|17559->12975|17588->12976|17652->13011|17682->13012|17758->13059|17788->13060|17844->13087|17874->13088|17978->13164|18007->13165|18042->13172|18071->13173|18103->13177|18132->13178|18190->13207|18220->13208|18295->13256|18324->13257|18447->13351|18477->13352|18547->13393|18577->13394|19010->13798|19040->13799|19124->13854|19154->13855|19375->14047|19405->14048|19444->14058|19474->14059|19510->14067|19539->14068|19571->14072|19600->14073|19760->14204|19790->14205|19875->14262|19904->14263|19989->14319|20019->14320|20073->14346|20102->14347|20292->14508|20322->14509|20426->14584|20456->14585|20518->14618|20548->14619|20817->14859|20847->14860|20881->14866|20910->14867|20944->14873|20973->14874|21035->14907|21065->14908|21201->15016|21230->15017|21291->15049|21321->15050|21588->15289|21617->15290|21748->15392|21778->15393|22030->15616|22060->15617|22112->15640|22142->15641|22282->15753|22311->15754|22391->15797|22407->15803|22443->15816|22506->15850|22536->15851|22632->15919|22662->15920|22699->15929|22728->15930|22989->16162|23019->16163|23161->16276|23191->16277|23242->16300|23271->16301|23303->16305|23332->16306|23364->16310|23393->16311|23446->16335|23476->16336|23571->16403|23600->16404|23662->16437|23692->16438|23794->16511|23824->16512|24035->16694|24065->16695|24535->17136|24565->17137|24620->17164|24649->17165|24752->17239|24782->17240|25124->17554|25153->17555|25216->17590|25245->17591|25278->17596|25307->17597|25497->17758|25527->17759|25666->17869|25696->17870|25812->17958|25841->17959|25879->17969|25908->17970|26029->18062|26059->18063|26139->18114|26169->18115|26348->18266|26377->18267|26488->18349|26518->18350|26640->18444|26669->18445|26703->18451|26732->18452|26852->18543|26882->18544|27048->18681|27078->18682|27513->19088|27543->19089|27611->19129|27640->19130|27734->19195|27764->19196|28391->19794|28421->19795|28553->19897|28584->19898|28663->19948|28693->19949|28744->19971|28774->19972|28820->19990|28849->19991|28948->20061|28978->20062|29148->20203|29178->20204|29798->20796|29827->20797|29897->20839|29926->20840|29974->20860|30003->20861|30036->20866|30065->20867|30168->20941|30198->20942|30299->21015|30328->21016|30458->21117|30488->21118|30543->21144|30573->21145|30802->21345|30832->21346|30958->21443|30988->21444|31043->21471|31072->21472|31106->21478|31135->21479|31212->21527|31242->21528|31340->21597|31370->21598|31504->21704|31533->21705|31567->21711|31596->21712|31681->21768|31711->21769|31795->21824|31825->21825|31871->21842|31901->21843|31948->21861|31978->21862|32033->21889|32062->21890|32095->21895|32124->21896|32155->21899|32184->21900|32271->21958|32301->21959|32345->21975|32374->21976|32426->21999|32456->22000|32528->22043|32558->22044|32625->22082|32655->22083|32753->22152|32783->22153|32892->22233|32922->22234|32958->22242|32987->22243|33020->22247|33050->22248|33131->22301|33160->22302|33193->22307|33222->22308|33253->22311|33282->22312|33342->22343|33372->22344|33466->22409|33496->22410|33540->22426|33569->22427|33600->22430|33629->22431|33692->22465|33722->22466|33970->22685|34000->22686|34151->22809|34180->22810|34233->22834|34263->22835|34343->22886|34373->22887|34431->22916|34461->22917|34509->22935|34540->22936|34571->22937|34603->22941|34632->22942|34695->22977|34724->22978|34808->23033|34838->23034|34880->23047|34910->23048|35007->23117|35036->23118|35068->23122|35097->23123|35207->23204|35237->23205|35312->23251|35342->23252|35417->23299|35447->23300|35480->23304|35510->23305|35582->23349|35612->23350|35647->23357|35676->23358|35714->23368|35743->23369|35772->23370|35801->23371|35857->23398|35887->23399|35941->23425|35970->23426|36024->23451|36054->23452|36103->23472|36133->23473|36190->23501|36220->23502|36264->23517|36294->23518|36396->23591|36426->23592|36502->23640|36531->23641|36592->23674|36621->23675|36651->23677|36680->23678|36730->23699|36760->23700|36890->23793|36906->23799|36958->23827|37075->23906|37092->23912|37144->23940|37187->23955|37216->23956|37277->23988|37307->23989|37507->24161|37536->24162|37604->24198
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|34->6|34->6|43->15|43->15|45->17|45->17|48->20|48->20|51->23|51->23|55->27|55->27|58->30|58->30|62->34|62->34|65->37|65->37|67->39|67->39|70->42|70->42|72->44|72->44|75->47|75->47|78->50|78->50|81->53|81->53|83->55|83->55|86->58|86->58|89->61|89->61|91->63|91->63|93->65|93->65|96->68|96->68|99->71|99->71|102->74|102->74|105->77|105->77|108->80|108->80|111->83|111->83|115->87|115->87|118->90|118->90|119->91|119->91|121->93|121->93|122->94|122->94|124->96|124->96|125->97|125->97|127->99|127->99|130->102|130->102|134->106|134->106|136->108|136->108|145->117|145->117|147->119|147->119|151->123|151->123|153->125|153->125|158->130|158->130|160->132|160->132|162->134|162->134|219->191|219->191|222->194|222->194|222->194|226->198|226->198|228->200|228->200|229->201|229->201|229->201|231->203|231->203|231->203|232->204|232->204|233->205|233->205|233->205|233->205|233->205|234->206|234->206|234->206|237->209|237->209|239->211|239->211|241->213|241->213|254->226|254->226|256->228|256->228|260->232|260->232|263->235|263->235|265->237|265->237|270->242|270->242|349->321|349->321|351->323|351->323|352->324|352->324|353->325|353->325|357->329|357->329|358->330|358->330|359->331|359->331|360->332|360->332|362->334|362->334|364->336|364->336|366->338|366->338|374->346|374->346|375->347|375->347|380->352|380->352|381->353|381->353|383->355|383->355|384->356|384->356|387->359|387->359|389->361|389->361|391->363|391->363|393->365|393->365|396->368|396->368|398->370|398->370|399->371|399->371|403->375|403->375|404->376|404->376|406->378|406->378|408->380|408->380|412->384|412->384|415->387|415->387|422->394|422->394|429->401|429->401|434->406|434->406|436->408|436->408|440->412|440->412|442->414|442->414|442->414|444->416|444->416|448->420|448->420|450->422|450->422|456->428|456->428|461->433|461->433|464->436|464->436|465->437|465->437|467->439|467->439|471->443|471->443|474->446|474->446|477->449|477->449|480->452|480->452|484->456|484->456|496->468|496->468|498->470|498->470|500->472|500->472|507->479|507->479|512->484|512->484|513->485|513->485|519->491|519->491|523->495|523->495|526->498|526->498|528->500|528->500|531->503|531->503|534->506|534->506|537->509|537->509|539->511|539->511|542->514|542->514|544->516|544->516|547->519|547->519|550->522|550->522|560->532|560->532|563->535|563->535|565->537|565->537|579->551|579->551|580->552|580->552|582->554|582->554|584->556|584->556|586->558|586->558|588->560|588->560|591->563|591->563|606->578|606->578|611->583|611->583|615->587|615->587|616->588|616->588|619->591|619->591|622->594|622->594|625->597|625->597|627->599|627->599|631->603|631->603|633->605|633->605|635->607|635->607|637->609|637->609|639->611|639->611|640->612|640->612|643->615|643->615|645->617|645->617|647->619|647->619|648->620|648->620|648->620|648->620|648->620|648->620|650->622|650->622|651->623|651->623|654->626|654->626|656->628|656->628|659->631|659->631|661->633|661->633|662->634|662->634|664->636|664->636|665->637|665->637|668->640|668->640|669->641|669->641|669->641|669->641|671->643|671->643|672->644|672->644|673->645|673->645|675->647|675->647|676->648|676->648|678->650|678->650|679->651|679->651|681->653|681->653|690->662|690->662|695->667|695->667|697->669|697->669|698->670|698->670|698->670|698->670|698->670|698->670|698->670|699->671|699->671|704->676|704->676|707->679|707->679|708->680|708->680|711->683|711->683|711->683|711->683|714->686|714->686|716->688|716->688|718->690|718->690|718->690|718->690|720->692|720->692|721->693|721->693|722->694|722->694|723->695|723->695|725->697|725->697|728->700|728->700|730->702|730->702|731->703|731->703|731->703|731->703|731->703|731->703|736->708|736->708|739->711|739->711|741->713|741->713|742->714|742->714|743->715|743->715|744->716|744->716|744->716|744->716|744->716|744->716|745->717|745->717|747->719|747->719|754->726|754->726|759->731
                    -- GENERATED --
                */
            