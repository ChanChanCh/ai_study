// const { response } = require("express")
const express = require("express")
const app = express()
const myRouter = express.Router()

app.set("views", __dirname + "/views")
app.set("view engine", "pug")

myRouter.route("/").get((req, res)=>{
    res.render("index")
})

app.use("/", myRouter)

// // 정적 경로를 지정하는 static 메소드
// // __dirname : 프로젝트 폴더 주소
// app.use("/page", express.static(__dirname + "/views/index.html"))


// //정적 파일을 제공하는 sendFile메서드
// // sendFile : 요청에대한 응답으로써 사용할 수 있음
// myRouter.get("/",(req, res)=>{
//     res.sendFile(__dirname + "/views/index.html")
// })

app.listen(4002, () => {
    console.log("4002번 포트에서 구동 중...")
})
