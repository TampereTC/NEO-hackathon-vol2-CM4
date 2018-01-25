var express = require('express');
var app = express();

app.use(express.static('public'));

app.post('/', (req, res) => {
   res.send('POST request received\n');
})

app.get('/list', (req, res) => {
   res.send('GET request received for list\n');
})

var server = app.listen(8081, () => {
   var host = server.address().address
   var port = server.address().port
   
   console.log("Example app listening at http://%s:%s", host, port)
})
