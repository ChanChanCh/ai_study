const express = require("express")
const app = express()

// get post 방식 차이알아둘것

// Router를 모듈화해서 코드양 줄여보기

const myRouter = require("./myRouter")


// 홈 주소를 축으로 마이라우터가 라우팅을 처리하겠다!
app.use("/", myRouter)

app.listen(4003, () => console.log("4003에서 구동 중.... "))

