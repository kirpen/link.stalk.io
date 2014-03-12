
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
.chat
"""),format.raw/*7.1*/("""{"""),format.raw/*7.2*/("""
    list-style: none;
    margin: 0;
    padding: 0;
"""),format.raw/*11.1*/("""}"""),format.raw/*11.2*/("""
 
.chat li
"""),format.raw/*14.1*/("""{"""),format.raw/*14.2*/("""
    margin-bottom: 10px;
    padding-bottom: 5px;
    border-bottom: 1px dotted #B3A9A9;
"""),format.raw/*18.1*/("""}"""),format.raw/*18.2*/("""
 
.chat li.left .chat-body
"""),format.raw/*21.1*/("""{"""),format.raw/*21.2*/("""
    margin-left: 60px;
"""),format.raw/*23.1*/("""}"""),format.raw/*23.2*/("""
 
.chat li.right .chat-body
"""),format.raw/*26.1*/("""{"""),format.raw/*26.2*/("""
    margin-right: 60px;
"""),format.raw/*28.1*/("""}"""),format.raw/*28.2*/("""
 
.chat li .chat-body p
"""),format.raw/*31.1*/("""{"""),format.raw/*31.2*/("""
    margin: 0;
    color: #777777;
"""),format.raw/*34.1*/("""}"""),format.raw/*34.2*/("""
 
.panel .slidedown .fa, .chat .fa
"""),format.raw/*37.1*/("""{"""),format.raw/*37.2*/("""
    margin-right: 5px;
"""),format.raw/*39.1*/("""}"""),format.raw/*39.2*/("""
 
.panel-body-chat
"""),format.raw/*42.1*/("""{"""),format.raw/*42.2*/("""
    overflow-y: scroll;
    height: 350px;
"""),format.raw/*45.1*/("""}"""),format.raw/*45.2*/("""
 
.panel-body h4"""),format.raw/*47.15*/("""{"""),format.raw/*47.16*/("""
  background-image: -webkit-linear-gradient(bottom,#fff,#eee);
"""),format.raw/*49.1*/("""}"""),format.raw/*49.2*/("""

::-webkit-scrollbar-track
"""),format.raw/*52.1*/("""{"""),format.raw/*52.2*/("""
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,0.3);
    background-color: #F5F5F5;
"""),format.raw/*55.1*/("""}"""),format.raw/*55.2*/("""
 
::-webkit-scrollbar
"""),format.raw/*58.1*/("""{"""),format.raw/*58.2*/("""
    width: 12px;
    background-color: #F5F5F5;
"""),format.raw/*61.1*/("""}"""),format.raw/*61.2*/("""
 
::-webkit-scrollbar-thumb
"""),format.raw/*64.1*/("""{"""),format.raw/*64.2*/("""
    -webkit-box-shadow: inset 0 0 6px rgba(0,0,0,.3);
    background-color: #555;
"""),format.raw/*67.1*/("""}"""),format.raw/*67.2*/("""



.nav-tabs > li .close """),format.raw/*71.23*/("""{"""),format.raw/*71.24*/("""
    margin: -2px 0 0 10px;
    font-size: 18px;
"""),format.raw/*74.1*/("""}"""),format.raw/*74.2*/("""
.marginBottom """),format.raw/*75.15*/("""{"""),format.raw/*75.16*/("""
    margin-bottom :1px !important;
"""),format.raw/*77.1*/("""}"""),format.raw/*77.2*/("""
.operationDiv """),format.raw/*78.15*/("""{"""),format.raw/*78.16*/("""
    padding:5px 10px 5px 5px;
"""),format.raw/*80.1*/("""}"""),format.raw/*80.2*/("""
.operationDivWrapper """),format.raw/*81.22*/("""{"""),format.raw/*81.23*/("""
    margin-top:-1px;
"""),format.raw/*83.1*/("""}"""),format.raw/*83.2*/("""


.from-visitor """),format.raw/*86.15*/("""{"""),format.raw/*86.16*/("""
float: left;
background: #eee;
border: 1px solid #ccc;
"""),format.raw/*90.1*/("""}"""),format.raw/*90.2*/("""

.message """),format.raw/*92.10*/("""{"""),format.raw/*92.11*/("""
border-radius: 5px;
padding: 8px;
clear: both;
max-width: 300px;
text-overflow: ellipsis;
overflow-x: hidden;
margin-bottom: 8px;
word-wrap: break-word;
"""),format.raw/*101.1*/("""}"""),format.raw/*101.2*/("""

.from-op """),format.raw/*103.10*/("""{"""),format.raw/*103.11*/("""
float: right;
background: #e7f5f9;
border: 1px solid #bde4f0;
"""),format.raw/*107.1*/("""}"""),format.raw/*107.2*/("""

div.timestamp """),format.raw/*109.15*/("""{"""),format.raw/*109.16*/("""
clear: both;
text-align: center;
color: #ccc;
font-size: 12px;
"""),format.raw/*114.1*/("""}"""),format.raw/*114.2*/("""
</style>
  <section id="content">
  <!-- <div class="map">
    <iframe src="https://maps.google.com/maps?f=q&amp;source=s_q&amp;hl=en&amp;geocode=&amp;q=Kuningan,+Jakarta+Capital+Region,+Indonesia&amp;aq=3&amp;oq=kuningan+&amp;sll=37.0625,-95.677068&amp;sspn=37.410045,86.572266&amp;ie=UTF8&amp;hq=&amp;hnear=Kuningan&amp;t=m&amp;z=14&amp;ll=-6.238824,106.830177&amp;output=embed">
    </iframe>
  </div> -->
  
  <div class="container container-full">
    

      <div class="col-lg-3">
        
          <div class="panel panel-primary">
            <div class="panel-heading">
              <span class="fa fa-user"></span> Operator
            </div>
            <div class="panel-body">
              asdf
            </div>
          </div>
        
          <div class="panel panel-primary">
            <div class="panel-heading">
              <span class="fa fa-user"></span> Recent Conversions
            </div>
            <div class="panel-body">
              asdf
            </div>
          </div>
        
          <div class="panel panel-primary">
            <div class="panel-heading">
              <span class="fa fa-user"></span> Visitors
            </div>
            <div class="panel-body">
              asdf
            </div>
          </div>
        
      </div>

      <div class="col-lg-9">
        
        <div class="tabbable">
          <ul class="nav nav-tabs" id="myTab">
              
             
          </ul>
          <div class="tab-content">
            
          </div>
   
        </div>

        </div>


        
  </div>
  <input type="hidden" id="stalkAppId" value ='"""),_display_(Seq[Any](/*174.49*/appId)),format.raw/*174.54*/("""'/>       
      
  </section>
  <script src=""""),_display_(Seq[Any](/*177.17*/routes/*177.23*/.Assets.at("js/socket.io.js"))),format.raw/*177.52*/("""" type="text/javascript"></script>
  <script type="text/javascript">
  
 

  var currentTab;
  var composeCount = 0;
  
  var Application = """),format.raw/*185.21*/("""{"""),format.raw/*185.22*/("""
		  appId : $('#stalkAppId').val()
  """),format.raw/*187.3*/("""}"""),format.raw/*187.4*/(""";
  
	
	// 테스트 사용자 정보들 (4명)
	//
	// 편의를 위하여 userId 를 간단하게 표기하였다.
	var Users = """),format.raw/*193.14*/("""{"""),format.raw/*193.15*/("""
	  '"""),_display_(Seq[Any](/*194.6*/session()/*194.15*/.get("email"))),format.raw/*194.28*/("""': """),format.raw/*194.31*/("""{"""),format.raw/*194.32*/("""
	    userId : '"""),_display_(Seq[Any](/*195.17*/session()/*195.26*/.get("email"))),format.raw/*195.39*/("""',
	    password: 'qwer',
	    deviceId: 'web'
	  """),format.raw/*198.4*/("""}"""),format.raw/*198.5*/("""
	
	"""),format.raw/*200.2*/("""}"""),format.raw/*200.3*/(""";
//initilize tabs
$(function () """),format.raw/*202.15*/("""{"""),format.raw/*202.16*/("""

    //when ever any tab is clicked this method will be call
    $("#myTab").on("click", "a", function (e) """),format.raw/*205.47*/("""{"""),format.raw/*205.48*/("""
        e.preventDefault();

        $(this).tab('show');
        $currentTab = $(this);
    """),format.raw/*210.5*/("""}"""),format.raw/*210.6*/(""");


    //registerComposeButtonEvent();
    registerCloseEvent();
"""),format.raw/*215.1*/("""}"""),format.raw/*215.2*/(""");

function getTimeStamp() """),format.raw/*217.25*/("""{"""),format.raw/*217.26*/("""
	  var d = new Date();

	  var s =
	    leadingZeros(d.getFullYear(), 4) + '-' +
	    leadingZeros(d.getMonth() + 1, 2) + '-' +
	    leadingZeros(d.getDate(), 2) + ' ' +

	    leadingZeros(d.getHours(), 2) + ':' +
	    leadingZeros(d.getMinutes(), 2) + ':' +
	    leadingZeros(d.getSeconds(), 2);

	  return s;
	"""),format.raw/*230.2*/("""}"""),format.raw/*230.3*/("""
function leadingZeros(n, digits) """),format.raw/*231.34*/("""{"""),format.raw/*231.35*/("""
	  var zero = '';
	  n = n.toString();

	  if (n.length < digits) """),format.raw/*235.27*/("""{"""),format.raw/*235.28*/("""
	    for (i = 0; i < digits - n.length; i++)
	      zero += '0';
	  """),format.raw/*238.4*/("""}"""),format.raw/*238.5*/("""
	  return zero + n;
	"""),format.raw/*240.2*/("""}"""),format.raw/*240.3*/("""

var chatObj="""),format.raw/*242.13*/("""{"""),format.raw/*242.14*/("""}"""),format.raw/*242.15*/("""

//this method will demonstrate how to add tab dynamically
function openChatArea(data) """),format.raw/*245.29*/("""{"""),format.raw/*245.30*/("""
    /* just for this demo */
	 
	
    var tabId = "tab" + composeCount; //this is id on tab content div where the
    chatObj[data.channel] = tabId;
   	composeCount++;
	
	
    var fromMessage = data.data.message;
    
    var timestamp = getTimeStamp();
    var clientId = data.data.sender+tabId;

    var location = "To-do";
    var ipAddress = "To-do";

    var tabContent = "";
    tabContent+='<div class="tab-pane" id="' + tabId + '">                                                                                           ';
    tabContent+='    <div class="col-lg-7">                                                                                                        ';
    tabContent+='        <div class="panel panel-primary">                                                                                         ';
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

	
    

    $('.nav-tabs').append('<li><a href="#' + tabId + '"><button class="close closeTab" type="button" >×</button>' + clientId + '</a></li>');

    $('.tab-content').append(tabContent);

    //craeteNewTabAndLoadUrl("", "./SamplePage.html", "#" + tabId);

    //$('#btn'+tabId).click(function()"""),format.raw/*327.39*/("""{"""),format.raw/*327.40*/("""
     
      
    //  sendMsg(data.channel, $('#input'+tabId).val());

    //"""),format.raw/*332.7*/("""}"""),format.raw/*332.8*/(""");


    $(this).tab('show');
    showTab(tabId);
    registerCloseEvent();
    setEnterKeyEvent(tabId);
"""),format.raw/*339.1*/("""}"""),format.raw/*339.2*/("""

function setEnterKeyEvent(tabId)"""),format.raw/*341.33*/("""{"""),format.raw/*341.34*/("""
	$('#input'+tabId).on('keydown', function(e) """),format.raw/*342.46*/("""{"""),format.raw/*342.47*/(""" 
    	if (e.which == 13) """),format.raw/*343.25*/("""{"""),format.raw/*343.26*/(""" 
    		e.preventDefault(); 
    		$('#btn'+tabId).click();
    		
    	"""),format.raw/*347.6*/("""}"""),format.raw/*347.7*/(""" 
    """),format.raw/*348.5*/("""}"""),format.raw/*348.6*/(""");
"""),format.raw/*349.1*/("""}"""),format.raw/*349.2*/("""

//this method will register event on close icon on the tab..
function registerCloseEvent() """),format.raw/*352.31*/("""{"""),format.raw/*352.32*/("""

    $(".closeTab").click(function () """),format.raw/*354.38*/("""{"""),format.raw/*354.39*/("""

        //there are multiple elements which has .closeTab icon so close the tab whose close icon is clicked
        var tabContentId = $(this).parent().attr("href");
        $(this).parent().parent().remove(); //remove li of tab
        $('#myTab a:last').tab('show'); // Select first tab
        $(tabContentId).remove(); //remove respective tab content

    """),format.raw/*362.5*/("""}"""),format.raw/*362.6*/(""");
"""),format.raw/*363.1*/("""}"""),format.raw/*363.2*/("""

//shows the tab with passed content div id..paramter tabid indicates the div where the content resides
function showTab(tabId) """),format.raw/*366.25*/("""{"""),format.raw/*366.26*/("""
    $('#myTab a[href="#' + tabId + '"]').tab('show');
"""),format.raw/*368.1*/("""}"""),format.raw/*368.2*/("""
//return current active tab
function getCurrentTab() """),format.raw/*370.26*/("""{"""),format.raw/*370.27*/("""
    return currentTab;
"""),format.raw/*372.1*/("""}"""),format.raw/*372.2*/("""

//This function will create a new tab here and it will load the url content in tab content div.
function craeteNewTabAndLoadUrl(parms, url, loadDivSelector) """),format.raw/*375.62*/("""{"""),format.raw/*375.63*/("""

    $("" + loadDivSelector).load(url, function (response, status, xhr) """),format.raw/*377.72*/("""{"""),format.raw/*377.73*/("""
        if (status == "error") """),format.raw/*378.32*/("""{"""),format.raw/*378.33*/("""
            var msg = "Sorry but there was an error getting details ! ";
            $("" + loadDivSelector).html(msg + xhr.status + " " + xhr.statusText);
            $("" + loadDivSelector).html("Load Ajax Content Here...");
        """),format.raw/*382.9*/("""}"""),format.raw/*382.10*/("""
    """),format.raw/*383.5*/("""}"""),format.raw/*383.6*/(""");

"""),format.raw/*385.1*/("""}"""),format.raw/*385.2*/("""

//this will return element from current tab
//example : if there are two tabs having  textarea with same id or same class name then when $("#someId") whill return both the text area from both tabs
//to take care this situation we need get the element from current tab.
function getElement(selector) """),format.raw/*390.31*/("""{"""),format.raw/*390.32*/("""
    var tabContentId = $currentTab.attr("href");
    return $("" + tabContentId).find("" + selector);

"""),format.raw/*394.1*/("""}"""),format.raw/*394.2*/("""


function removeCurrentTab() """),format.raw/*397.29*/("""{"""),format.raw/*397.30*/("""
    var tabContentId = $currentTab.attr("href");
    $currentTab.parent().remove(); //remove li of tab
    $('#myTab a:last').tab('show'); // Select first tab
    $(tabContentId).remove(); //remove respective tab content
"""),format.raw/*402.1*/("""}"""),format.raw/*402.2*/("""
</script>

<script>

var sessionServer = 'http://chat.stalk.io:8000';
//### Restful API 목록
var API = """),format.raw/*409.11*/("""{"""),format.raw/*409.12*/("""
  // #### Session Socket Server 주소 가져오기.
  // Session Server 로부터 App ID와 User ID를 기준으로 Session Socket Server 주소를 가져 옵니다.
  //
  // ##### <code>GET</code> /session/ [App ID] / [User ID]
  auth: function (_userId, callback) """),format.raw/*414.38*/("""{"""),format.raw/*414.39*/("""
    
    var params = """),format.raw/*416.18*/("""{"""),format.raw/*416.19*/("""
      app: Application.appId,
      userId: Users[_userId].userId,
      deviceId: Users[_userId].deviceId
    """),format.raw/*420.5*/("""}"""),format.raw/*420.6*/(""";   
    console.log(params);
    $.post(""""),_display_(Seq[Any](/*422.14*/routes/*422.20*/.Stalk.auth())),format.raw/*422.33*/(""""
 		, params
 		, function(data) """),format.raw/*424.21*/("""{"""),format.raw/*424.22*/("""
 	        
 	          callback(data, _userId);
 	        
 	      """),format.raw/*428.9*/("""}"""),format.raw/*428.10*/(""");
   
  """),format.raw/*430.3*/("""}"""),format.raw/*430.4*/(""",
  
  // #### Message Socket Server 주소 가져오기.
  // Session Server 로부터 App ID 와 Channel명을 기준으로 Message Socket Server 주소를 가져 옵니다.
  //
  // ##### <code>GET</code> /node/ [App명] / [Channel명]
  node: function (_app, _channel, callback) """),format.raw/*436.45*/("""{"""),format.raw/*436.46*/("""
	  
	var url = sessionServer+'/node/'+encodeURIComponent(_app)+'/'+_channel;
    
	$.get(url, 
		function(data) """),format.raw/*441.18*/("""{"""),format.raw/*441.19*/("""
			callback(data);

		"""),format.raw/*444.3*/("""}"""),format.raw/*444.4*/(""");
	"""),format.raw/*445.2*/("""}"""),format.raw/*445.3*/("""
  
"""),format.raw/*447.1*/("""}"""),format.raw/*447.2*/(""";



var socketOptions ="""),format.raw/*451.20*/("""{"""),format.raw/*451.21*/("""
		  transports: ['websocket'],
		  'force new connection': true
		"""),format.raw/*454.3*/("""}"""),format.raw/*454.4*/(""";

// ### 기능 구현 목록
var Library = """),format.raw/*457.15*/("""{"""),format.raw/*457.16*/("""

  // #### 로그인하기.
  connect_session_socket: function(_userId, callback) """),format.raw/*460.55*/("""{"""),format.raw/*460.56*/("""
	
    // Session Socket Server 주소 가져오기. ( /node/session/ [User ID] )
    API.auth(Users[_userId].userId, function (data, _userId) """),format.raw/*463.62*/("""{"""),format.raw/*463.63*/("""
      
      var query = 
    	'app='+Application.appId+'&'+
			'userId='+Users[_userId].userId+'&'+
    	'deviceId='+Users[_userId].deviceId+'&'+
    	'token='+data.result.token;
      
      // Session Socket 연결하기.
      Users[_userId].sessionSocket = io.connect(data.result.serverUrl+'/session?'+query, socketOptions);
      
      // Socket에 connect 이벤트 등록 ( connect 이벤트 발생 )
      Users[_userId].sessionSocket.on('connect', function() """),format.raw/*475.61*/("""{"""),format.raw/*475.62*/("""
    	
    	 
        callback();
      """),format.raw/*479.7*/("""}"""),format.raw/*479.8*/(""");
      
      Users[_userId].sessionSocket.on('_event', function (data) """),format.raw/*481.65*/("""{"""),format.raw/*481.66*/("""
            console.info('\t NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
            
            
            
            openChatArea(data);
            joinChannel(data.channel);
	  """),format.raw/*488.4*/("""}"""),format.raw/*488.5*/(""");
      
      
      
      
    """),format.raw/*493.5*/("""}"""),format.raw/*493.6*/(""");
  """),format.raw/*494.3*/("""}"""),format.raw/*494.4*/(""",

  // #### Channel 목록 가져오기.
  // User ID 가 포함되어 있는 모든 Channel 목록을 가져오기.
  //
  // ( **user-login** 이벤트 호출 이후에 사용 가능 ).
  channels: function(_userId, callback) """),format.raw/*500.41*/("""{"""),format.raw/*500.42*/("""
    
    // **channal-list** 이벤트 호출.
	
    Users[_userId].sessionSocket.emit('channel-list', function (data) """),format.raw/*504.71*/("""{"""),format.raw/*504.72*/("""
        console.info('\t channels : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*507.5*/("""}"""),format.raw/*507.6*/(""");
    
  """),format.raw/*509.3*/("""}"""),format.raw/*509.4*/(""",

  // #### Channel 생성하기.
  createChannel: function(_userId, _channel, _userIds, callback) """),format.raw/*512.66*/("""{"""),format.raw/*512.67*/("""

    // **channel-create** 이벤트 호출
    var param = """),format.raw/*515.17*/("""{"""),format.raw/*515.18*/("""
      channel:  _channel,           // channel : channel ID
      users:    _userIds            // users : userId 배열, **생성자의 User ID도 포함**되어야 한다.
    """),format.raw/*518.5*/("""}"""),format.raw/*518.6*/(""";

    Users[_userId].sessionSocket.emit('channel-create', param, function (data) """),format.raw/*520.80*/("""{"""),format.raw/*520.81*/("""
        console.info('\t create channel : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*523.5*/("""}"""),format.raw/*523.6*/(""");

  """),format.raw/*525.3*/("""}"""),format.raw/*525.4*/(""",

  // #### Channel 참여하기.
  connect_channel_socket: function(_userId, _channel, callback) """),format.raw/*528.65*/("""{"""),format.raw/*528.66*/("""
    
    // Message Socket Server 주소 가져오기. ( /node/ [App ID] / [Channel ID] )
    API.node(Application.appId, _channel, function (data) """),format.raw/*531.59*/("""{"""),format.raw/*531.60*/("""
      
      var query = 
    	'app='+Application.appId+'&'+
      'channel='+data.result.channel+'&'+
      'server='+data.result.server+'&'+
			'userId='+Users[_userId].userId+'&'+
    	'deviceId='+Users[_userId].deviceId;
      
	  
      
      
      Users[_userId][_channel] = io.connect(data.result.server.url+'/channel?'+query, socketOptions);
      Users[_userId][_channel].on('connect', function(data) """),format.raw/*544.61*/("""{"""),format.raw/*544.62*/("""
        
        
        callback(data);
        
      """),format.raw/*549.7*/("""}"""),format.raw/*549.8*/(""");

      Users[_userId][_channel].on('message', function (data) """),format.raw/*551.62*/("""{"""),format.raw/*551.63*/("""
        console.info('\t MESSAGE ('+_userId+') : '+JSON.stringify(data));
        
        
        var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
        var msgClass = data.sender==_userId?'from-op':'from-visitor';
        chatText +='<div class="message '+msgClass+'">'+data.message+'</div>';
        
        
    	$('#panel'+chatObj[data.channel]).append(chatText);
    	
    	var div_message = document.getElementById('panel'+chatObj[data.channel]);
        div_message.scrollTop = div_message.scrollHeight;
    	
    	
      """),format.raw/*566.7*/("""}"""),format.raw/*566.8*/(""");
      
      Users[_userId][_channel].on('_event', function (data) """),format.raw/*568.61*/("""{"""),format.raw/*568.62*/("""
    	  console.info('\t CHANNLEL SOCKET NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
    	  
    	  if(data.event=="DISCONNECT")"""),format.raw/*571.36*/("""{"""),format.raw/*571.37*/("""
    		  
    		  var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
    	      chatText +='<div class="message from-visitor">Disconnected</div>';
    	        
    	      
    	 	  $('#panel'+chatObj[data.channel]).append(chatText);
    	 	  var div_message = document.getElementById('panel'+chatObj[data.channel]);
    	      div_message.scrollTop = div_message.scrollHeight;
    		  
    	  """),format.raw/*581.8*/("""}"""),format.raw/*581.9*/("""
    	  
    	  
    	     
    	  
      """),format.raw/*586.7*/("""}"""),format.raw/*586.8*/(""");
      
    

    """),format.raw/*590.5*/("""}"""),format.raw/*590.6*/(""");
  """),format.raw/*591.3*/("""}"""),format.raw/*591.4*/(""",
  
  // #### Channel 에서 나가기.
  leaveChannel: function(_channel) """),format.raw/*594.36*/("""{"""),format.raw/*594.37*/("""
    Users[_userId][_channel].disconnect();
  """),format.raw/*596.3*/("""}"""),format.raw/*596.4*/(""",
  
  // #### Channel 에 메시지 전송.
  sendMessage: function(_userId, _channel, _name, _datas, callback) """),format.raw/*599.69*/("""{"""),format.raw/*599.70*/("""
        
    var param = """),format.raw/*601.17*/("""{"""),format.raw/*601.18*/("""
      app:      Application.appId,  // app : Application ID
      channel:  _channel,           // channel : Channel ID
      name:     _name,              // name : 이벤트 발생 ID
      data:     _datas """),format.raw/*605.24*/("""}"""),format.raw/*605.25*/(""";           // data : 전송할 데이터
	console.log(param);
    Users[_userId][_channel].emit('send', param, function (data) """),format.raw/*607.66*/("""{"""),format.raw/*607.67*/("""
      callback(data);
    """),format.raw/*609.5*/("""}"""),format.raw/*609.6*/(""");

  """),format.raw/*611.3*/("""}"""),format.raw/*611.4*/(""",

  unReadMessage: function(_userId, callback) """),format.raw/*613.46*/("""{"""),format.raw/*613.47*/("""
    Users[_userId][_channel].emit('message-unread', function (data) """),format.raw/*614.69*/("""{"""),format.raw/*614.70*/("""
      console.info('\t UNREAD MESSAGE ('+_userId+') : '+JSON.stringify(data));
      callback(data);
    """),format.raw/*617.5*/("""}"""),format.raw/*617.6*/(""");

  """),format.raw/*619.3*/("""}"""),format.raw/*619.4*/(""",

  exitChannel: function(_userId, _channel, callback) """),format.raw/*621.54*/("""{"""),format.raw/*621.55*/("""
    Users[_userId].sessionSocket.emit('channel-exit', """),format.raw/*622.55*/("""{"""),format.raw/*622.56*/("""channel: _channel"""),format.raw/*622.73*/("""}"""),format.raw/*622.74*/(""", function (data) """),format.raw/*622.92*/("""{"""),format.raw/*622.93*/("""
      callback(data);
    """),format.raw/*624.5*/("""}"""),format.raw/*624.6*/(""");
  """),format.raw/*625.3*/("""}"""),format.raw/*625.4*/("""


"""),format.raw/*628.1*/("""}"""),format.raw/*628.2*/(""";
var userId = 'esko@esko.com';
Library.connect_session_socket(userId, function(result)"""),format.raw/*630.56*/("""{"""),format.raw/*630.57*/("""
	channels();
	
"""),format.raw/*633.1*/("""}"""),format.raw/*633.2*/(""");

function channels()"""),format.raw/*635.20*/("""{"""),format.raw/*635.21*/("""
	Library.channels(userId, function(result)"""),format.raw/*636.43*/("""{"""),format.raw/*636.44*/("""
    	
    	if(result.result.length<1)"""),format.raw/*638.32*/("""{"""),format.raw/*638.33*/("""
    		Library.createChannel(userId, null, [userId], function(result)"""),format.raw/*639.69*/("""{"""),format.raw/*639.70*/("""
    	        
    	        //joinChannel(result.result[0].channel);
    	      """),format.raw/*642.12*/("""}"""),format.raw/*642.13*/(""");
    	"""),format.raw/*643.6*/("""}"""),format.raw/*643.7*/("""else"""),format.raw/*643.11*/("""{"""),format.raw/*643.12*/("""
    		//joinChannel(result.result[0].channel);
    	"""),format.raw/*645.6*/("""}"""),format.raw/*645.7*/("""
    """),format.raw/*646.5*/("""}"""),format.raw/*646.6*/(""");
"""),format.raw/*647.1*/("""}"""),format.raw/*647.2*/("""

function joinChannel(channel)"""),format.raw/*649.30*/("""{"""),format.raw/*649.31*/("""
	Library.connect_channel_socket(userId,channel, function(result)"""),format.raw/*650.65*/("""{"""),format.raw/*650.66*/("""
        
      """),format.raw/*652.7*/("""}"""),format.raw/*652.8*/(""");
"""),format.raw/*653.1*/("""}"""),format.raw/*653.2*/("""

function sendMsg(tabId, channel)"""),format.raw/*655.33*/("""{"""),format.raw/*655.34*/("""
	
	
	var msg = $('#input'+tabId).val();
	
	
	Library.sendMessage(userId, channel, 'message', """),format.raw/*661.50*/("""{"""),format.raw/*661.51*/(""" message: msg, sender: userId"""),format.raw/*661.80*/("""}"""),format.raw/*661.81*/(""", function(result)"""),format.raw/*661.99*/("""{"""),format.raw/*661.100*/("""}"""),format.raw/*661.101*/(""");
	$('#input'+tabId).val('');
	
"""),format.raw/*664.1*/("""}"""),format.raw/*664.2*/("""



</script>
      
""")))})),format.raw/*670.2*/("""
"""))}
    }
    
    def render(appId:String): play.api.templates.HtmlFormat.Appendable = apply(appId)
    
    def f:((String) => play.api.templates.HtmlFormat.Appendable) = (appId) => apply(appId)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Mar 12 16:25:08 KST 2014
                    SOURCE: /Users/eskozz/xpush/stalk.io/app/views/chat.scala.html
                    HASH: ecf09b2ff016fce7649ba45b8a39bdf0a7eec546
                    MATRIX: 773->1|897->15|924->33|960->35|985->52|1024->54|1065->69|1092->70|1173->124|1201->125|1240->137|1268->138|1385->228|1413->229|1468->257|1496->258|1547->282|1575->283|1631->312|1659->313|1711->338|1739->339|1791->364|1819->365|1882->401|1910->402|1973->438|2001->439|2052->463|2080->464|2127->484|2155->485|2226->529|2254->530|2299->547|2328->548|2419->612|2447->613|2502->641|2530->642|2644->729|2672->730|2722->753|2750->754|2826->803|2854->804|2910->833|2938->834|3048->917|3076->918|3130->944|3159->945|3235->994|3263->995|3306->1010|3335->1011|3398->1047|3426->1048|3469->1063|3498->1064|3556->1095|3584->1096|3634->1118|3663->1119|3712->1141|3740->1142|3785->1159|3814->1160|3897->1216|3925->1217|3964->1228|3993->1229|4175->1383|4204->1384|4244->1395|4274->1396|4365->1459|4394->1460|4439->1476|4469->1477|4561->1541|4590->1542|6259->3174|6287->3179|6371->3226|6387->3232|6439->3261|6608->3401|6638->3402|6704->3440|6733->3441|6840->3519|6870->3520|6912->3526|6931->3535|6967->3548|6999->3551|7029->3552|7083->3569|7102->3578|7138->3591|7216->3641|7245->3642|7277->3646|7306->3647|7368->3680|7398->3681|7535->3789|7565->3790|7687->3884|7716->3885|7811->3952|7840->3953|7897->3981|7927->3982|8268->4295|8297->4296|8360->4330|8390->4331|8486->4398|8516->4399|8613->4468|8642->4469|8692->4491|8721->4492|8764->4506|8794->4507|8824->4508|8941->4596|8971->4597|17262->12859|17292->12860|17397->12937|17426->12938|17559->13043|17588->13044|17651->13078|17681->13079|17756->13125|17786->13126|17841->13152|17871->13153|17971->13225|18000->13226|18034->13232|18063->13233|18094->13236|18123->13237|18245->13330|18275->13331|18343->13370|18373->13371|18763->13733|18792->13734|18823->13737|18852->13738|19010->13867|19040->13868|19123->13923|19152->13924|19235->13978|19265->13979|19317->14003|19346->14004|19534->14163|19564->14164|19666->14237|19696->14238|19757->14270|19787->14271|20051->14507|20081->14508|20114->14513|20143->14514|20175->14518|20204->14519|20534->14820|20564->14821|20696->14925|20725->14926|20785->14957|20815->14958|21065->15180|21094->15181|21225->15283|21255->15284|21507->15507|21537->15508|21589->15531|21619->15532|21759->15644|21788->15645|21868->15688|21884->15694|21920->15707|21983->15741|22013->15742|22109->15810|22139->15811|22176->15820|22205->15821|22466->16053|22496->16054|22638->16167|22668->16168|22719->16191|22748->16192|22780->16196|22809->16197|22841->16201|22870->16202|22923->16226|22953->16227|23048->16294|23077->16295|23139->16328|23169->16329|23271->16402|23301->16403|23461->16534|23491->16535|23961->16976|23991->16977|24059->17017|24088->17018|24191->17092|24221->17093|24449->17293|24478->17294|24541->17329|24570->17330|24603->17335|24632->17336|24822->17497|24852->17498|24991->17608|25021->17609|25137->17697|25166->17698|25204->17708|25233->17709|25354->17801|25384->17802|25464->17853|25494->17854|25673->18005|25702->18006|25813->18088|25843->18089|25965->18183|25994->18184|26028->18190|26057->18191|26177->18282|26207->18283|26373->18420|26403->18421|26845->18834|26875->18835|26961->18893|26990->18894|27084->18959|27114->18960|27694->19512|27723->19513|27822->19583|27852->19584|28022->19725|28052->19726|28489->20135|28518->20136|28588->20178|28617->20179|28665->20199|28694->20200|28727->20205|28756->20206|28851->20272|28881->20273|28955->20319|28984->20320|29114->20421|29144->20422|29199->20448|29229->20449|29458->20649|29488->20650|29633->20766|29663->20767|29718->20794|29747->20795|29781->20801|29810->20802|29887->20850|29917->20851|30015->20920|30045->20921|30179->21027|30208->21028|30242->21034|30271->21035|30356->21091|30386->21092|30470->21147|30500->21148|30546->21165|30576->21166|30623->21184|30653->21185|30708->21212|30737->21213|30770->21218|30799->21219|30830->21222|30859->21223|30975->21311|31005->21312|31049->21328|31078->21329|31130->21352|31160->21353|31232->21396|31262->21397|31329->21435|31359->21436|31457->21505|31487->21506|31596->21586|31626->21587|31662->21595|31691->21596|31724->21600|31754->21601|31835->21654|31864->21655|31897->21660|31926->21661|31957->21664|31986->21665|32046->21696|32076->21697|32170->21762|32200->21763|32244->21779|32273->21780|32304->21783|32333->21784|32396->21818|32426->21819|32549->21913|32579->21914|32637->21943|32667->21944|32714->21962|32745->21963|32776->21964|32837->21997|32866->21998|32920->22020
                    LINES: 26->1|30->1|31->3|32->4|32->4|32->4|35->7|35->7|39->11|39->11|42->14|42->14|46->18|46->18|49->21|49->21|51->23|51->23|54->26|54->26|56->28|56->28|59->31|59->31|62->34|62->34|65->37|65->37|67->39|67->39|70->42|70->42|73->45|73->45|75->47|75->47|77->49|77->49|80->52|80->52|83->55|83->55|86->58|86->58|89->61|89->61|92->64|92->64|95->67|95->67|99->71|99->71|102->74|102->74|103->75|103->75|105->77|105->77|106->78|106->78|108->80|108->80|109->81|109->81|111->83|111->83|114->86|114->86|118->90|118->90|120->92|120->92|129->101|129->101|131->103|131->103|135->107|135->107|137->109|137->109|142->114|142->114|202->174|202->174|205->177|205->177|205->177|213->185|213->185|215->187|215->187|221->193|221->193|222->194|222->194|222->194|222->194|222->194|223->195|223->195|223->195|226->198|226->198|228->200|228->200|230->202|230->202|233->205|233->205|238->210|238->210|243->215|243->215|245->217|245->217|258->230|258->230|259->231|259->231|263->235|263->235|266->238|266->238|268->240|268->240|270->242|270->242|270->242|273->245|273->245|355->327|355->327|360->332|360->332|367->339|367->339|369->341|369->341|370->342|370->342|371->343|371->343|375->347|375->347|376->348|376->348|377->349|377->349|380->352|380->352|382->354|382->354|390->362|390->362|391->363|391->363|394->366|394->366|396->368|396->368|398->370|398->370|400->372|400->372|403->375|403->375|405->377|405->377|406->378|406->378|410->382|410->382|411->383|411->383|413->385|413->385|418->390|418->390|422->394|422->394|425->397|425->397|430->402|430->402|437->409|437->409|442->414|442->414|444->416|444->416|448->420|448->420|450->422|450->422|450->422|452->424|452->424|456->428|456->428|458->430|458->430|464->436|464->436|469->441|469->441|472->444|472->444|473->445|473->445|475->447|475->447|479->451|479->451|482->454|482->454|485->457|485->457|488->460|488->460|491->463|491->463|503->475|503->475|507->479|507->479|509->481|509->481|516->488|516->488|521->493|521->493|522->494|522->494|528->500|528->500|532->504|532->504|535->507|535->507|537->509|537->509|540->512|540->512|543->515|543->515|546->518|546->518|548->520|548->520|551->523|551->523|553->525|553->525|556->528|556->528|559->531|559->531|572->544|572->544|577->549|577->549|579->551|579->551|594->566|594->566|596->568|596->568|599->571|599->571|609->581|609->581|614->586|614->586|618->590|618->590|619->591|619->591|622->594|622->594|624->596|624->596|627->599|627->599|629->601|629->601|633->605|633->605|635->607|635->607|637->609|637->609|639->611|639->611|641->613|641->613|642->614|642->614|645->617|645->617|647->619|647->619|649->621|649->621|650->622|650->622|650->622|650->622|650->622|650->622|652->624|652->624|653->625|653->625|656->628|656->628|658->630|658->630|661->633|661->633|663->635|663->635|664->636|664->636|666->638|666->638|667->639|667->639|670->642|670->642|671->643|671->643|671->643|671->643|673->645|673->645|674->646|674->646|675->647|675->647|677->649|677->649|678->650|678->650|680->652|680->652|681->653|681->653|683->655|683->655|689->661|689->661|689->661|689->661|689->661|689->661|689->661|692->664|692->664|698->670
                    -- GENERATED --
                */
            