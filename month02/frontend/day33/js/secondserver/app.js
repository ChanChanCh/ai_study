const express = require("express")
const app = express()

// app.use() : 서버에 추가 동작을 정의하는 메소드
app.use((req, res) => {
    console.log(req.query) // 요청 매개변수
    res.send("요청 잘 받았어요!")
})


app.listen(4003, () =>{
    console.log("4003번 포트에서 구동 중")
})