const express = require('express')
const WebSocket = require('ws')
const http = require('http') // 노드 기본 내장 서버 모듈 http! 

const app = express()

// 서버는 익스프레스, 프론트는 pug! 
app.set("view engine", "pug")
app.set("views", __dirname + "/views")
app.use('/static', express.static(__dirname + '/static'))
app.get("/", (_, res) => res.render("home"))

// http 서버 기반으로 웹 소켓 서버 완성
const httpServer = http.createServer(app)
const wsServer = new WebSocket.Server({ server: httpServer })

const sockets = []

//  on() : 이벤트 헨들러 등록 메소드
wsServer.on("connection", (socket) => { 
  sockets.push(socket)
  console.log("Connected to Browser ✅")
  socket.on("close", () => console.log("Disconnected from the Browser ❌"))
  socket.on('message', msg => { 
    console.log(msg.toString())
    sockets.forEach(aSocket => 
      aSocket.send(msg.toString())
    )
  })
 })
httpServer.listen(3002, () => console.log("running..."))