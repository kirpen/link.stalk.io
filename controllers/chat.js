'use strict';

var User = require('../models/user'),
	AppModel = require('../models/app'),
    XpushModel = require('../models/xpushuser'),
    stalk = require('../config/stalk'),
    auth = require('../lib/auth'),
    async   = require('async'),
    restify = require('restify');
    


module.exports = function (app) {

    /**
     * Display the login page. We also want to display any error messages that result from a failed login attempt.
     */
    app.get('/chat/:appId',auth.isAuthenticated('admin'), function (req, res) {

        var appId = req.params.appId;

        
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

        

        
        client.post('/auth', param, function (err, req, res, data) {
            if(err) {
                console.log("An error ocurred:", err);
            }
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

            response.json(doc);
        });

    });

    app.get('/operator/session/:url', function (request, response) {
        
        var url = request.params.url;
        var cb = request.query.callback;

        var sessions = request.sessionStore.sessions;
        
        var allOperators=[];

        var count = Object.keys(sessions).length;
        var opCnt = 0;
        var cnt = 0;

        console.log(sessions);

               
    
        async.waterfall([
            function (callback){
                AppModel.find({url:url}, function(err, apps){   
                    
                    callback(null, apps)
                });
            },
            function (apps, callback){
                var cnt=0;
                var operators = [];
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
                        callback(null,operators,apps);
                    }
                    cnt++
                } 
            },
            function (operatros, apps, callback){
                var userArray = [];
                for(var app in apps){
                    userArray[app] = apps[app].userId;
                    if(app==apps.length-1){
                        callback(null, userArray);
                    }
                }

            },
            function (userArray, callback){
                console.log(userArray);

                XpushModel.find( { app:'stalk-io', userId:{$in:userArray} }
                                ,{ userId: 1, deviceId: 1, token:1, _id:0 }, function(err, xUsers){
                    callback(null, xUsers);
                });
             
            },
            function (xUsers, callback){
                callback(null, xUsers);
            }

        ],function (err, result){

            response.send(cb+'('+JSON.stringify(result)+')');

        });

        function getUser(k, id,callback){
            User.findOne({_id:id}, function(err, doc){
    
                if (err) {
                    
                }
                
                AppModel.findOne({userId:doc.login,url:url}, function(err, d){   

                    if(d){
                        
                        callback(k,{userId:d.userId,name:doc.name});    
                    }else{
                        callback(k,null);
                    } 
                });
            });
        }


        
        function getXpushUser(userId,userName,callback){
            XpushModel.find({app:'stalk-io',userId:userId},{ userId: 1, deviceId: 1, token:1, _id:0 }, function(err, xUsers){
                    
                for(var xu in xUsers){

                    allOperators.push({deviceId:xUsers[xu].deviceId, userId:xUsers[xu].userId, name:userName, token:xUsers[xu].token});
                    
                }
                callback();
                
            });   


        }

            
    });

    app.get('/operator/session2/:url', function (request, response) {
        
        var url = request.params.url;
        var cb = request.query.callback;

        var sessions = request.sessionStore.sessions;
        var operators = [];
        var allOperators=[];

        var count = Object.keys(sessions).length;
        var opCnt = 0;
        var cnt = 0;

        console.log(sessions);

        if(count==0) response.send(cb+'('+JSON.stringify(operators)+')');
    
        async.waterfall([
            function (callback){
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
                        callback(null,operators);
                    }
                    cnt++
                }
            },
            function(operators, callback){
                var opcnt = 0;
                if(operators.length==0){
                    response.send(cb+'('+JSON.stringify(operators)+')');   
                }
                for(var o in operators){
                    getUser(o,operators[o].user, function(k, doc){
                        
                        if(doc){
                            console.log(doc);
                            operators[k].userId = doc.userId;
                            operators[k].deviceId = 'WEB';
                            operators[k].name = doc.name;
                            
                        }
                        
                        if(opcnt==operators.length-1){
                             callback(null,operators);
                        }
                        opcnt++
                    });
                }

            },
            function(operators, callback){
                var cnt=0;
                for(var op in operators){
                    var userId = operators[op].userId;
                    var userName = operators[op].name;
                    getXpushUser(userId,userName,function(){
                        
                        if(cnt==operators.length-1){
                            callback(null);
                        }
                        cnt++;
                    });
                    
                }
             
            }

        ],function(err, result){

            response.send(cb+'('+JSON.stringify(allOperators)+')');

        });

        function getUser(k, id,callback){
            User.findOne({_id:id}, function(err, doc){
    
                if (err) {
                    
                }
                
                AppModel.findOne({userId:doc.login,url:url}, function(err, d){   

                    if(d){
                        
                        callback(k,{userId:d.userId,name:doc.name});    
                    }else{
                        callback(k,null);
                    } 
                });
            });
        }


        
        function getXpushUser(userId,userName,callback){
            XpushModel.find({app:'stalk-io',userId:userId},{ userId: 1, deviceId: 1, token:1, _id:0 }, function(err, xUsers){
                    
                for(var xu in xUsers){

                    allOperators.push({deviceId:xUsers[xu].deviceId, userId:xUsers[xu].userId, name:userName, token:xUsers[xu].token});
                    
                }
                callback();
                
            });   


        }

            
    });



    
};
