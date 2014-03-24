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
    app.get('/info',auth.isAuthenticated('admin'), function (req, res) {

        console.log(req.user.login);

        
        var query = {userId : req.user.login};
        AppModel.find(query, function(err, apps) {
            res.render('info', {apps:apps});
        });

    	
    });

    /**
     * Receive the login credentials and authenticate.
     * Successful authentications will go to /profile or if the user was trying to access a secured resource, the URL
     * that was originally requested.
     *
     * Failed authentications will go back to the login page with a helpful error message to be displayed.
     */

/*
            
           */


    app.post('/regist',auth.isAuthenticated('admin'), function (request, response) {

    	
       	var email = request.user.login;
    	var app = request.param("app");
    	var url = request.param("url");
        var password = request.user.password;
    

        var client = restify.createJsonClient({
            url: stalk.sessionServer || 'http://chat.stalk.io:8000',
            version: '*'
        });

        
        var param = {
            app: "stalk-io",
            url : url,
            userId: email,
            deviceId: 'WEB',
            password: password
        }

        var saveObj = {
            app: "stalk-io",
            url : url,
            userId: email,
            deviceId: 'WEB',
            password: password
        }
        client.post('/user/register', param, function (err, req, res, data) {
            if(err) {
                console.log("An error ocurred:", err);
            }

            if(data.status=="ok"){
                
                var app = new AppModel(saveObj);
                app.save();
            }
            response.json({"msg":data.status});
        });
    	
        
    });

    app.post('/delete',auth.isAuthenticated('admin'), function (request, response) {

        
        
        var deleteId = request.param("deleteId");
        
        var query = {'_id':deleteId};
        console.log(query);
        AppModel.findOne(query, function(err, doc){
    
            if (err) {
                
            }
            console.log(doc);
            if(doc) doc.remove();
            
        });

        
        response.redirect("/info");
        
        
        
    });

};
