'use strict';

var kraken = require('kraken-js'),
    db = require('./lib/database'),
    passport = require('passport'),
    auth = require('./lib/auth'),
    flash = require('connect-flash'),
    User = require('./models/user'),
    io      = require('socket.io-client'),
    stalk = require('./config/stalk'),
    app = {};

app.configure = function configure(nconf, next) {
    // Async method run on startup.
    db.config(nconf.get('databaseConfig'));
    //Add two users to the system.
   
    //Ignore errors. In this case, the errors will be for duplicate keys as we run this app more than once.
    
    //Tell passport to use our newly created local strategy for authentication
    passport.use(auth.localStrategy());

    //Give passport a way to serialize and deserialize a user. In this case, by the user's id.
    passport.serializeUser(function (user, done) {
        done(null, user.id);
    });

    passport.deserializeUser(function (id, done) {
        User.findOne({_id: id}, function (err, user) {
            done(null, user);
        });
    });
    next(null);
};


app.requestStart = function requestStart(server) {
    // Run before most express middleware has been registered.
};

var locales = ['en-US', 'ko-KR', 'ja-JP'];
var defaultLocale = 'en-US';

function isExistLocale(local){
    for(var i = 0 ; i < locales.length ; i++){
        if(local == locales[i]) return true;
    }
    return false;
}

app.requestBeforeRoute = function requestBeforeRoute(server) {
    // Run before any routes have been added.
    server.use(passport.initialize());
    server.use(passport.session());
    server.use(flash());
    server.use(auth.injectUser);

    server.use(function(req,res,next){
        if(!req.session.local){
            var lang = req.headers["accept-language"];
            lang = lang.split(',')[0];
            lang = lang.split('-')[0] +'-'+ lang.split('-')[1].toUpperCase();
            req.session.local = isExistLocale(lang) == true ? lang : defaultLocale;
        }
        res.locals.context = { locality: req.session.local };
        next();
    });
};


app.requestAfterRoute = function requestAfterRoute(server) {
    // Run after all routes have been added.
};
if (require.main === module) {
    kraken.create(app).listen(80,function (err, server) {
        if (err) {
            console.error(err);
        }


    });
}
module.exports = app;
