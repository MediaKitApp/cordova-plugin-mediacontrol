var exec = require('cordova/exec');

exports.SPEAKER = 'speaker';
exports.NORMAL = 'normal';



exports.setModeAudio = function (mode) {
	cordova.exec(null, null, 'MediaControls', 'setModeAudio', [mode]);
};