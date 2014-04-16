'use strict';


var IndexModel = require('../models/index'),
    auth = require('../lib/auth'),
	events       = require('events'),
	AppModel = require('../models/app'),
	restify = require('restify');
	
var locales = {
	kr : 'ko-KR',
	en : 'en-US',
	jp : 'ja-JP'
};

var defaultLocal = 'en';

module.exports = function (app) {

	var model = new AppModel();

    app.get('/', function (req, res) {
<<<<<<< HEAD
		res.render('redirect', model);
		//res.render('index', model);
    });
    app.get('/*', function(req, res,next){
	var path = req.params[0];
	if( path && path.length ==2  ){
		var locale = locales[ path.split('/')[0] ] || locales[defaultLocal];
		res.locals.context = { locality : locale };
		return res.render('index', model);
	}
	next();
     });

=======
		res.render('index', model);
		//res.render('index', model);
    });
    /*
	app.get('/*', function(req, res,next){
		console.log( req.headers["accept-language"] );
		var path = req.params[0];
		if( path && path.length ==2  ){
			var locale = locales[ path.split('/')[0] ] || locales[defaultLocal];
			res.locals.context = { locality: locale };
			return res.render('index', model);
		}
		next();
	});
*/
>>>>>>> 999675008e4daf98fdebeba91e74bcad3848e034
    app.get('/feature', function (req, res) {
		res.render('feature', model);
    });

    app.get('/install', function (req, res) {
		res.render('install', model);
    });

    app.get('/pricing', function (req, res) {
		res.render('pricing', model);
    });

    app.get('/contact', function (req, res) {
		res.render('contact', model);
    });
    
};
