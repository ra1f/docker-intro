var express = require('express'); http = require('http')

// Constants
var DEFAULT_PORT = 8080;
var PORT = process.env.PORT || DEFAULT_PORT;
var HOST = 'localhost'
process.argv.forEach(function (val, index, array) {
  if (index == 2) {
  	HOST = val
  }
})

// App
var app = express();
var server = http.createServer(app);

// HTTP handler
app.get('/', function (req, res) {
  res.send('You (' + req.ip + ') pinged me (' + HOST + ')\n');
});

// Start Webserver
server.listen(PORT);
console.log('Running on http://' + HOST + ':' + PORT);