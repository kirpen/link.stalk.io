var currentTab;
var composeCount = 0;
var Application = {
      appId : $('#stalkAppId').val()
};
var chatObj={};
var viewObject= {
  //channel : visitor(<a>)
};

var chatContainer = '<li>';
chatContainer += '<div class="chatMsg clearfix ${msgClass}">';
chatContainer +=  '<div class="" style="height: 16px"><span class="sender">${sender}</span></div>';
chatContainer +=  '<img src="${picture}" class="msgProfileImg"></img>';
chatContainer +=  '<div class="message ${msgClass}">${message}';
chatContainer +=  '<div class="timestamp">${timestamp}</div>';
chatContainer +=  '</div>';
chatContainer += '</div>';
chatContainer += '</li>';

var operatorTmpl = '<a src="#" class="list-group-item"><img src="${pic}"></img>${userNm}</a>';
var visitorTmpl = '<a id="${id}" href="#${tabId}" onclick="showTab(\'${tabId}\',this)" class="list-group-item" ><img src="${image}"></img>${name}</a>'

var Users = {};
var userId = $('#email').val();
Users[userId]={
                userId : $('#email').val(),
                password: 'qwer',
                deviceId: 'WEB',
                picture: $('#picture').val(),
                name: $('#name').val()
              };

$('#chatContent').append('<div class="tab-pane active" id="empty"><div class="col-lg-12" style="text-align: center;">There is no client. waiting...<br/> We will be support mobile apps very soon.</div></div>');

function getTimeStamp() {
      var d = new Date();

      var s =
        leadingZeros(d.getFullYear(), 4) + '-' +
        leadingZeros(d.getMonth() + 1, 2) + '-' +
        leadingZeros(d.getDate(), 2) + ' ' +

        leadingZeros(d.getHours(), 2) + ':' +
        leadingZeros(d.getMinutes(), 2) + ':' +
        leadingZeros(d.getSeconds(), 2);

      return s;
}

function leadingZeros(n, digits) {
      var zero = '';
      n = n.toString();

      if (n.length < digits) {
        for (i = 0; i < digits - n.length; i++)
          zero += '0';
      }
      return zero + n;
}


function openChatArea(data) {

    var tabId = "tab" + composeCount; //this is id on tab content div where the
    chatObj[data.channel] = tabId;
    composeCount++;


    var fromMessage = decodeURIComponent(data.data.message);
    var pageName = data.channel.split('^')[2];

    var timestamp = getTimeStamp();
    //var clientId = data.data.sender;
    var clientId = data.data.user.id;
    var clientNm = data.data.user.name;
    var pic = data.data.user.image;

    var location = "To-do";
    var ipAddress = "To-do";

    var tabContent = "";
    tabContent+='<div class="tab-pane" id="' + tabId + '">                                                                                           ';
    tabContent+='    <div class="col-lg-12">                                                                                                        ';
    tabContent+='        <div class="panel panel-primary">                                                                                         ';
    tabContent+='            <div class="panel-heading">                                                                                           ';
    tabContent+='                <span class="fa fa-comment"></span>'+clientNm+'('+pageName+')';
    tabContent+='                <div class="btn-group pull-right">                                                                                ';
    tabContent+='                    <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">                  ';
    tabContent+='                        <span class="fa fa-chevron-down"></span>                                                                  ';
    tabContent+='                    </button>                                                                                                     ';
    // tabContent+='                    <ul class="dropdown-menu slidedown">                                                                          ';
    // tabContent+='                        <li><a href="#"><span class="fa fa-refresh"></span>Refresh</a></li>                                       ';
    // tabContent+='                    </ul>                                                                                                         ';
    tabContent+='                </div>                                                                                                            ';
    tabContent+='            </div>                                                                                                                ';
    tabContent+='            <ul id="panel'+tabId+'" class="panel-body panel-body-chat">                                                                              ';
    tabContent+= $.tmpl(chatContainer, {timestamp : timestamp, message: fromMessage, sender: clientNm, msgClass: 'from-visitor', picture: pic}).get(0).outerHTML;
    //tabContent+='                <div class="timestamp">'+timestamp+'</div>                                                        ';
    //tabContent+='                <div class="message from-visitor">'+fromMessage+'</div>                                                                  ';
    tabContent+='            </ul>                                                                                                                ';
    tabContent+='            <div class="panel-footer">                                                                                            ';
    tabContent+='                <div class="input-group">                                                                                         ';
    tabContent+='                    <input type="text" id="input'+tabId+'" class="form-control input-sm" placeholder="Type your message here..." />    ';
    tabContent+='                    <span class="input-group-btn">                                                                                ';
    tabContent+="                        <button class='btn btn-primary btn-sm' id='btn"+tabId+"'";
    //tabContent+='onclick=sendMsg(';
    //tabContent+='"'+tabId+'"';
    //tabContent+=',"'+data.channel+'");>';
    tabContent+= '>';

    tabContent+='                            Send</button>                                                                                         ';
    tabContent+='                    </span>                                                                                                       ';
    tabContent+='                </div>                                                                                                            ';
    tabContent+='            </div>                                                                                                                ';
    tabContent+='        </div>                                                                                                                    ';
    tabContent+='    </div>                                                                                                                        ';
    // tabContent+='    <div class="well well-sm">                                                                                                    ';
    // tabContent+='        <div class="media">                                                                                                       ';
    // tabContent+='            <a class="thumbnail pull-left" href="#">                                                                              ';
    // tabContent+='                <img class="media-object" src="http://www.gravatar.com/avatar/a13ac7aed64918b6354f48da59490e3a?s=80">             ';
    // tabContent+='            </a>                                                                                                                  ';
    // tabContent+='            <div class="media-body">                                                                                              ';
    // tabContent+='                <h3 class="media-heading">'+clientId+'</h3>                                                                      ';
    // tabContent+='                <p>'+location+'</p>                                                                                           ';
    // tabContent+='                <p><b>This is a returning customer</b></p>                                                                        ';
    // tabContent+='                <p>This is your first conversation.</p>                                                                           ';
    // tabContent+='                <p><b>Viewed 1 page since a few seconds ago</b></p>                                                               ';
    // tabContent+='                <p>looking at localhost:9000/chefServer?code=&msg=                                                                ';
    // tabContent+='                    referred from localhost:9000/chefServer/node/sw?swType=SMS</p>                                                ';
    // tabContent+='                <p><b>Advanced Info</b></p>                                                                                       ';
    // tabContent+='                <p>IP Address: '+ipAddress+'</p>                                                                                   ';
    // tabContent+='            </div>                                                                                                                ';
    // tabContent+='        </div>                                                                                                                    ';
    // tabContent+='    </div>                                                                                                                        ';
    tabContent+='</div>                                                                                                                            ';

    $('#myTab').append('<li onclick=clearTwinkle(this);showTab("'+tabId+'");><a href="#' + tabId + '"><button class="close closeTab" type="button" >×</button>' + clientNm + '</a></li>');
    $('#chatContent').append(tabContent);

    $('#chatContent').find('#btn'+tabId).click(function(){
      sendMsg(tabId,data.channel);
    });

    $(this).tab('show');
    //showTab(tabId);
    registerCloseEvent();
    setEnterKeyEvent(tabId);
    return tabId;
}

function setEnterKeyEvent(tabId){
    $('#input'+tabId).on('keydown', function(e) {
        if (e.which == 13) {
            e.preventDefault();
            $('#btn'+tabId).click();

        }
    });
}
function emailToFlatStr(em){
    return em.replace("@","").replace(".","");
}
//this method will register event on close icon on the tab..
function registerCloseEvent() {

    $(".closeTab").click(function () {

        //there are multiple elements which has .closeTab icon so close the tab whose close icon is clicked
        var tabContentId = $(this).parent().attr("href");
        $(this).parent().parent().remove(); //remove li of tab
        $('#myTab a:last').tab('show'); // Select first tab
        $(tabContentId).remove(); //remove respective tab content

        for(var o in chatObj){
            if(chatObj[o]==tabContentId.replace("#","")){
                Library.leaveChannel(userId,o);

                $("#"+emailToFlatStr(o.split("^")[2])).remove();
                $('#recent'+emailToFlatStr(o.split("^")[2])).remove();
            }
        }

    });
}

//shows the tab with passed content div id..paramter tabid indicates the div where the content resides
function showTab(tabId,target) {
  $('#menuTabContent a.list-group-item.active').removeClass('active');
  $('#myTab a[href="#' + tabId + '"]').tab('show');
  if(target) {
    $(target).find('.badge').remove();
    $(target).addClass('active');
  }
}
//return current active tab
function getCurrentTab() {
    return currentTab;
}

//This function will create a new tab here and it will load the url content in tab content div.
function craeteNewTabAndLoadUrl(parms, url, loadDivSelector) {

    $("" + loadDivSelector).load(url, function (response, status, xhr) {
        if (status == "error") {
            var msg = "Sorry but there was an error getting details ! ";
            $("" + loadDivSelector).html(msg + xhr.status + " " + xhr.statusText);
            $("" + loadDivSelector).html("Load Ajax Content Here...");
        }
    });

}

function getElement(selector) {
    var tabContentId = $currentTab.attr("href");
    return $("" + tabContentId).find("" + selector);

}


function removeCurrentTab() {
    var tabContentId = $currentTab.attr("href");
    $currentTab.parent().remove(); //remove li of tab
    $('#myTab a:last').tab('show'); // Select first tab
    $(tabContentId).remove(); //remove respective tab content
}


var sessionServer = 'http://chat.stalk.io:8000';
//### Restful API 목록
var API = {
  // #### Session Socket Server 주소 가져오기.
  // Session Server 로부터 App ID와 User ID를 기준으로 Session Socket Server 주소를 가져 옵니다.
  // b -> connection 연결 true, connection 끊김 false
  // ##### <code>GET</code> /session/ [App ID] / [User ID] / 
  auth: function (_userId, b, callback) {

    var params = {
      app:  Application.appId,
      userId: Users[_userId].userId,
      deviceId: Users[_userId].deviceId,
      _csrf:$("#_csrf").val()
    };
    console.log(params);
    $.post("/auth"+'/'+b
        , params
        , function(data) {
              callback(data, _userId);
          });

  },

  // #### Message Socket Server 주소 가져오기.
  // Session Server 로부터 App ID 와 Channel명을 기준으로 Message Socket Server 주소를 가져 옵니다.
  //
  // ##### <code>GET</code> /node/ [App명] / [Channel명]
  node: function (_app, _channel, callback) {
    var url = sessionServer+'/node/'+encodeURIComponent(_app)+'/'+_channel;
    console.log(" == API.node == "+url);


    $.get(url,{},function(data) {
          console.log(" == API.node  return == ");
          console.log(data);
          callback(data);
        },'json');
    }

};



var socketOptions ={
          transports: ['websocket'],
          'force new connection': true
        };

// ### 기능 구현 목록
var Library = {

  // #### 로그인하기.
  connect_session_socket: function(_userId, callback) {
    console.log(_userId);
    console.log(Users[_userId]);
    // Session Socket Server 주소 가져오기. ( /node/session/ [User ID] )
    API.auth(Users[_userId].userId, true, function (data, _userId) {
      console.log("===== API.auth : ",data);
      var query =
        'app='+Application.appId+'&'+
            'userId='+encodeURIComponent(Users[_userId].userId)+'&'+
        'deviceId='+Users[_userId].deviceId+'&'+
        'token='+data.result.token;
      console.log(query);
      console.log(data.result.serverUrl+'/session?'+query, socketOptions);
      // Session Socket 연결하기.
      Users[_userId].sessionSocket = io.connect(data.result.serverUrl+'/session?'+query, socketOptions);

      // Socket에 connect 이벤트 등록 ( connect 이벤트 발생 )
      Users[_userId].sessionSocket.on('connect', function() {
        callback();
      });

      Users[_userId].sessionSocket.on('disconnect', function() {
        API.auth(Users[_userId].userId, false, function (data, _userId) {
        });
      });

      Users[_userId].sessionSocket.on('_event', function (data) {
        console.info('\t NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));
        var u = data.data.user;
        //$("#visitor").append("<span id="+emailToFlatStr(data.data.sender)+">"+data.data.sender+"<span><br/>");
        //$("#visitor").append("<span id="+name+">"+name+"<span><br/>");
        var t = viewObject[ data.channel ];
        if( !t ){
          t = viewObject[ data.channel ] =  {};
          playSound();
          u.tabId = openChatArea(data);
          joinChannel(data.channel);
          t.visitor = $.tmpl(visitorTmpl, u);
          $("#visitor").append( t.visitor );
        }
        if( $("#visitor .active").length < 1){
          showTab(u.tabId,t.visitor);
        }
        receivedMsg(data);
        $('#tabVisitor').tab('show');
      });
    });
  },

  // #### Channel 목록 가져오기.
  // User ID 가 포함되어 있는 모든 Channel 목록을 가져오기.
  //
  // ( **user-login** 이벤트 호출 이후에 사용 가능 ).
  channels: function(_userId, callback) {

    // **channal-list** 이벤트 호출.
    console.log("channeeelkwlell")
    Users[_userId].sessionSocket.emit('listChannel',{key:Application.appId}, function (data) {
        console.info('\t channels : '+JSON.stringify(data));
      callback(data);
    });

  },

  // #### Channel 생성하기.
  createChannel: function(_userId, _channel, _userIds, callback) {

    // **channel-create** 이벤트 호출
    var param = {
      channel:  _channel,           // channel : channel ID
      users:    _userIds            // users : userId 배열, **생성자의 User ID도 포함**되어야 한다.
    };

    Users[_userId].sessionSocket.emit('channel-create', param, function (data) {
        console.info('\t create channel : '+JSON.stringify(data));
      callback(data);
    });

  },

  // #### Channel 참여하기.
  connect_channel_socket: function(_userId, _channel, callback) {
    // Message Socket Server 주소 가져오기. ( /node/ [App ID] / [Channel ID] )
  console.log(" == connect_channel_socket == "+_userId + '  '+ _channel);
    API.node(Application.appId, _channel, function (data) {

      var query =
                'app='+Application.appId+'&'+
                'channel='+data.result.channel+'&'+
                'server='+data.result.server+'&'+
                'userId='+encodeURIComponent(Users[_userId].userId)+'&'+
                'deviceId='+Users[_userId].deviceId;
      console.log(query);
      Users[_userId][_channel] = io.connect(data.result.server.url+'/channel?'+query, socketOptions);
      Users[_userId][_channel].on('connect', function(data) {
        callback(data);
      });

      Users[_userId][_channel].on('message', function (data) {
        console.info('\t MESSAGE ('+_userId+') : '+JSON.stringify(data));
        data.timestamp = getTimeStamp();
        //var chatText = '<div class="timestamp">'+getTimeStamp()+':'+data.sender+'</div>';
        // var msgClass = data.sender==_userId?'from-op':'from-visitor';
        data.msgClass = data.sender == 'operator' ? 'from-op':'from-visitor';
        //chatText +='<div class="message '+msgClass+'">'+decodeURIComponent(data.message)+'</div>';

        if(data.msgClass == 'from-op'){
          data.picture = Users[userId].picture;
        }else{
          data.sender = data.user.name;
          data.picture = data.user.image;
        }

        //{"message":"a","sender":"","channel":""}
        //{"user":{"id":"","name":"","url":"","image":""},"message":"","channel":""} 

        data.message = decodeURIComponent(data.message);
        var chat = $.tmpl(chatContainer, data);
        // if(data.msgClass == 'from-op'){
          // chat.find('img').attr('src',Users[userId].picture);
        // }

        //$('#panel'+chatObj[data.channel]).append(chatText);
        $('#panel'+chatObj[data.channel]).append(chat);

        var div_message = document.getElementById('panel'+chatObj[data.channel]);
        div_message.scrollTop = div_message.scrollHeight;

        receivedMsg(data);
        /*
        $('a').each(function(){
            if($(this).attr('href')=='#'+chatObj[data.channel] && !$(this).parent().hasClass('active')){
                blinkTab($(this).parent());
            }
        });
        */
      });

      Users[_userId][_channel].on('_event', function (data) {
          console.info('\t CHANNLEL SOCKET NOTIFICATION ('+_userId+') :  - '+JSON.stringify(data));

          if(data.event=="DISCONNECT"){

              var chatText = '<div class="timestamp">'+getTimeStamp()+'</div>';
              chatText +='<div class="message from-visitor">Disconnected</div>';


              $('#panel'+chatObj[data.channel]).append(chatText);
              var div_message = document.getElementById('panel'+chatObj[data.channel]);
              div_message.scrollTop = div_message.scrollHeight;

              delete chatObj[data.channel];
              $('#'+emailToFlatStr(data.userId)).remove();
              $('#recent'+emailToFlatStr(data.userId)).remove();
          }

      });



    });
  },

  // #### Channel 에서 나가기.
  leaveChannel: function(_userId,_channel) {
    delete chatObj[_channel];
    Users[_userId][_channel].disconnect();
  },

  // #### Channel 에 메시지 전송.
  sendMessage: function(_userId, _channel, _name, _datas, callback) {

    var param = {
      app:      Application.appId,  // app : Application ID
      channel:  _channel,           // channel : Channel ID
      name:     _name,              // name : 이벤트 발생 ID
      data:     _datas };           // data : 전송할 데이터

    Users[_userId][_channel].emit('send', param, function (data) {
      callback(data);
    });

  },

  unReadMessage: function(_userId, callback) {
    Users[_userId][_channel].emit('message-unread', function (data) {
      console.info('\t UNREAD MESSAGE ('+_userId+') : '+JSON.stringify(data));
      callback(data);
    });

  },

  exitChannel: function(_userId, _channel, callback) {
    Users[_userId].sessionSocket.emit('channel-exit', {channel: _channel}, function (data) {
      callback(data);
    });
  }


};

Library.connect_session_socket(userId, function(result){
    channels();

});

function channels(){
    Library.channels(userId, function(result){

        if(result.result.length<1){
            //Library.createChannel(userId, null, [userId], function(result){

                //joinChannel(result.result[0].channel);
             // });
        }else{
            //joinChannel(result.result[0].channel);
        }
    });
}

function joinChannel(channel){
    Library.connect_channel_socket(userId,channel, function(result){

      });
}

function sendMsg(tabId, channel){


    var msg = $('#input'+tabId).val();
    msg = getEscapeHtml(msg.replace(/^\s+|\s+$/g, ''));

    var spanId = emailToFlatStr(channel.split("^")[2]);
    /*
    if(!document.getElementById("recent"+spanId)&&chatObj[channel]){
        $("#"+spanId).remove();
        $("#recent").append("<span id=recent"+spanId+">"+channel.split("^")[2]+"<span><br/>");
    }
    */
    if(chatObj[channel]){
        //Library.sendMessage(userId, channel, 'message', { message: msg, sender: userId}, function(result){});
        Library.sendMessage(userId, channel, 'message', { message: msg, sender: 'operator', user: { id: userId, name : Users[userId].name , image: Users[userId].picture} }, function(result){});
    }

    $('#input'+tabId).val('');
}

function receivedMsg(data){
  console.log('receivedMsg');
  console.log(data);
  var a = viewObject[ data.channel ].visitor;
  if( !a.hasClass('active') ){
    if(a.find('.badge').length>0){
      $(a.find('.badge').get(0)).html( parseInt($(a.find('.badge').get(0)).html())+1 );
    }else{
      a.append ('<span class="badge badge-danger">1</span>'); 
    }
  }

}

var blinkTimeout = '';
function blinkTab(aObj,isDone){
  if(isDone){
    clearInterval(blinkTimeout);
    aObj.removeClass('twinkle');
  }else{
    clearInterval(blinkTimeout);
    blinkTimeout =
      setInterval(function(){

        if(aObj.hasClass('twinkle')){
            aObj.removeClass('twinkle');
        }else{
            aObj.addClass('twinkle');
        }
      },1000);
  }
}

function clearTwinkle(li){
    blinkTab($(li),true);

}

function getOperators(){
    $.get("/operator/"+$('#key').val(),function(data){
        console.log("=== operator");
        console.log(data);
        var ophtml = "";
        var jd = data.users;
	console.log( jd );
        for(var d in jd){
          // ophtml+=jd[d].userNm;
          // ophtml+="<br/>";
          $("#operator").html( $.tmpl(operatorTmpl, jd[d]) );
        }
        //$("#operator").html(ophtml);
    })
}
function playSound(){
    document.getElementById("sound").innerHTML='<audio autoplay="autoplay"><source src="/audio/noti.mp3" type="audio/mpeg" /><embed hidden="true" autostart="true" loop="false" src="/audio/noti.mp3" /></audio>';
}

function getEscapeHtml (html) {
      return String(html)
        .replace(/&/g, '&amp;')
        .replace(/"/g, '&quot;')
        .replace(/'/g, '&#39;')
        .replace(/</g, '&lt;')
        .replace(/>/g, '&gt;');
      }

getOperators();

function pageOut(){
  API.auth(userId, false, function (data, _userId) {
  });
}

$(window).on('beforeunload', function(){
      return 'Are you sure you want to leave?';
});

$(window).on('unload', function(){
  pageOut();
});



