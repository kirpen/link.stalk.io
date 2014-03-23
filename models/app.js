'use strict';
var mongoose = require('mongoose');

var appModel = function () {
   	
   	var appSchema = mongoose.Schema({
        userId: String,
        app: String,
        url: String,
        deviceId: String,
        password: String        
    });

    return mongoose.model('App', appSchema);

};

module.exports = new appModel();
