
$(document).ready(function(){


    var socketOptions ={
      transports: ['websocket'],
      'force new connection': true
    };
    
    console.log(io);
    var socket = io.connect('http://10.62.73.60:8000');
        
    setInterval(function(){
        socket.emit('reload',{});

    },2000);

    socket.on('channels', function (data) {
        
        reloadList(data);
        //socket.emit('my other event', { my: 'data' });
    });

    socket.on('session-change', function (data) {
        
        reloadList(data);
        //socket.emit('my other event', { my: 'data' });
    });
    
    var reloadList = function(data){
        
        var compiled = dust.compile("{?channels}"+
                                        "{#channels.result}"+

                                        '<div class="col-lg-3">'+

                                            '<div class="panel panel-info">'+

                                              '<div class="panel-heading">'+
                                                '<div class="row">'+
                                                    '<div class="col-xs-12">'+
                                                        '<p class="announcement-text">{appNm}:{app}</p>'+
                                                     '</div>'+
                                                '</div>'+
                                                '<div class="row">'+
                                                
                                                  '<div class="col-xs-6">'+
                                                    '<i class="fa fa-comments fa-5x"></i>'+
                                                  '</div>'+
                                                  '<div class="col-xs-6 text-right">'+
                                                    
                                                    '<p class="announcement-heading">{count}</p>'+
                                                    '<p class="announcement-text">Users!</p>'+
                                                  '</div>'+
                                                '</div>'+
                                              '</div>'+
                                              /*'<a href="#">'+*/
                                                '<div class="panel-footer announcement-bottom">'+
                                                  '<div class="row">'+
                                                    '<div class="col-xs-6">'+
                                                      'Server No. {server}'+
                                                    '</div>'+
                                                    '<div class="col-xs-6 text-right">'+
                                                      '<i class="fa fa-arrow-circle-right"></i>'+
                                                    '</div>'+
                                                  '</div>'+
                                                '</div>'+
                                              /*'</a>'+*/
                                            '</div>'+
                                        '</div>'+

                                        "{/channels.result}"+
                                    "{/channels}", "tmp_skill");
        dust.loadSource(compiled);
        dust.render("tmp_skill", data, function(err, html_out) {
        $('#page').html('');
        $('#page').html(html_out);
        //setBtn();
            
        });
    }

    
/*
    function setBtn(){
        $('.alert-link').click(function(event){
            
            appGet(this.id, function(data){
                console.log(data);
                alert(JSON.stringify(data));
            })
        });

        $('.close').click(function(event){
            if(confirm("Are you sure delete?")){

                appRemove(this.value, function (data){
                    appList(reloadList);
                });
            }
            
        });    
    }
    
    $('#appCreate').click(function(event){
        
        appCreate($('#appNm').val(), function (data){
            appList(reloadList);
            $('#appNm').val("");
        });
    });*/

});


