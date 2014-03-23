
$(document).ready(function(){

    

    function appGet(appId, callback){
        $.get("/app/get/"+appId,function(data){
            if(callback) callback(data);
        });    
    }

    function appList(callback){
        $.get("/app/list",function(data){
            console.log(data);
            if(callback) callback(data);
        });
    }
    
    function appCreate(appId, callback){
        $.post("/app/create", {appNm : appId,_csrf:$("#csrf").val()}, function(data){
            
            if(callback) callback(data);
        });    
    }
    

    function appRemove(appId, callback){
        $.post("/app/remove", {appId : appId,_csrf:$("#csrf").val()}, function(data){
            
            if(callback) callback(data);
        });
    }
    

    var reloadList = function(data){
        
        var compiled = dust.compile("{?apps}"+
                                        "{#apps}"+
                                        "<div class='col-lg-4'>"+
                                            "<div class='alert alert-dismissable alert-info'>"+
                                                "<button type='button' class='close' data-dismiss='alert' value='{appId}''>&times;</button>"+
                                                "<strong>{appNm}</strong> <a href='#' id='{appId}' class='alert-link'>{appId}</a>"+
                                            "</div>"+
                                        "</div>"+
                                        "{/apps}"+
                                    "{/apps}", "tmp_skill");
        dust.loadSource(compiled);
        dust.render("tmp_skill", data, function(err, html_out) {
        $('#page').html('');
        $('#page').html(html_out);
        setBtn();
            
        });
    }

    appList(reloadList);

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
    });

});




/*
app.post('/app/create', auth.isAuthenticated(), function (request, response) {
        client.post('/app/create',{ appNm: request.params.appNm },function (err, req, res, data) {
            if(err) console.log("An error ocurred:", err);
            else console.log('Server returned: %j', data);
            model= new AppModel();
            model.app = data;
            response.json(model);
        });
    });

    app.post('/app/remove', auth.isAuthenticated(), function (request, response) {
        client.post('/app/remove',{ appId: request.params.appId },function (err, req, res, data) {
            if(err) console.log("An error ocurred:", err);
            else console.log('Server returned: %j', data);
            model= new AppModel();
            model.app = data;
            response.json(model);
        });
    });*/