'use strict';

var User = require('../models/user'),
	AppModel = require('../models/app'),
    stalk = require('../config/stalk'),
    auth = require('../lib/auth'),
    restify = require('restify');
    


module.exports = function (app) {

    /**
     * Display the login page. We also want to display any error messages that result from a failed login attempt.
     */
    app.get('/chat/:appId',auth.isAuthenticated('admin'), function (req, res) {

        var appId = req.params.appId;

        console.log(appId);
        res.render('chat', {appId:appId, email:req.user.login});
    	
    });

    app.post('/auth',auth.isAuthenticated('admin'), function (request, response) {
        
        var app = request.param("app");
        var userId = request.param("userId");
        var deviceId = request.param("deviceId");
        var password = request.user.password;

        var client = restify.createJsonClient({
            url: stalk.sessionServer || 'http://chat.stalk.io:8000',
            version: '*'
        });

        
        var param = {
            app: app,
            userId: userId,
            deviceId: deviceId,
            password: password
        }

        console.log(param);

        
        client.post('/auth', param, function (err, req, res, data) {
            if(err) {
                console.log("An error ocurred:", err);
            }

            console.log(data);
            

            User.findOne({login:userId}, function(err, doc){
        
                if (err) {}

                if(doc){
                    
                    
                    var sessions = request.sessionStore.sessions;
                    var count = Object.keys(sessions).length;
                    var cnt = 0;
                    for(var s in sessions){
                        var sessionObj = JSON.parse(sessions[s]);
                        
                        if(sessionObj.passport.user==doc._id){
                    
                            sessionObj.passport.auth=true; 
                            sessions[s] = JSON.stringify(sessionObj);
                        
                        }
                        if(cnt==count-1){
                            console.log(":::::::");
                            console.log(sessions);
                        }
                        cnt++

                    }
                }
                
            });    

            
            
           
            response.json(data);  
            
        });

    });
   
    app.get('/operator/:url', function (request, response) {
        
        var url = request.params.url;

        var query = {app:url};
        
        AppModel.find(query, function(err, doc){
    
            if (err) {
                
            }
            
            console.log(doc);
            response.json(doc);
        });

    });

    app.get('/operator/session/:url', function (request, response) {
        
        var url = request.params.url;

        var callback = request.query.callback;



        var sessions = request.sessionStore.sessions;
        var operators = [];
        var cnt = 0;


        var count = Object.keys(sessions).length;
        
        console.log(sessions);

        if(count==0) response.send(callback+'('+JSON.stringify(operators)+')');

        for(var s in sessions){
            var sessionObj = JSON.parse(sessions[s]);
            
            if('user' in sessionObj.passport){
                var _id = sessionObj.passport.user;
                if('auth' in sessionObj.passport){
                    var op = {user:_id, auth:sessionObj.passport.auth};
                    operators.push(op);    
                }
                
            }
            if(cnt==count-1){
                getOperator(operators);      
            }
            cnt++
        }

        function getOperator(operators){
            var opcnt = 0;
            if(operators.length==0){
                response.send(callback+'('+JSON.stringify(operators)+')');   
            }
            for(var o in operators){
                getUser(o,operators[o].user, function(k, doc){
                    if(doc){
                        operators[k].userId = doc.userId;
                        operators[k].deviceId = 'WEB';
                        
                    }
                    
                    if(opcnt==operators.length-1){
                        response.send(callback+'('+JSON.stringify(operators)+')');        
                    }
                    opcnt++
                });
            }
        }
        


        function getUser(k, id,callback){
            User.findOne({_id:id}, function(err, doc){
    
                if (err) {
                    
                }
                
                console.log(doc);
                AppModel.findOne({userId:doc.login,url:url}, function(err, d){

                    
                    if(d){
                        callback(k,d);    
                    }else{
                        callback(k,null);
                    }
                    
                });
                
                
            });
        }

            
    });



    
};
