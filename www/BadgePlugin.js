var exec = require('cordova/exec');

function BadgePlugin() {};

BadgePlugin.prototype.set = function(num, cb){
    exec(function(result){
        cb(null, {success: true})
    },
    function(err){
        cb(err, null);
    },"BadgePlugin", "set",[num]);
}

BadgePlugin.prototype.clear = function(cb) {
    exec(function(result) {
        cb(null, {success: false});
    }, function(err) {
        cb({success: false}, null);
    }, "BadgePlugin", "clear", [])
}

module.exports = new BadgePlugin();