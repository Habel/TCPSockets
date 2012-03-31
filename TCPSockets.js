var TCPSockets = function() {};

TCPSockets.prototype.sendMessage = function(port, host, message, successCallback, failureCallback) {
    return PhoneGap.exec(successCallback,
                         failureCallback,
                         'TCPSocketsPlugin',
                         'sendMessage',
                         {
                            port: this.port,
                            host: this.host,
                            message: this.message
                         };
    )
}

PhoneGap.addConstructor(function() {
    PhoneGap.addPlugin("TCPSockets", new TCPSockets());
});
