/*
    초기 셋팅
    1. npm init -y
    2. npm install express
    3. index.js 생성

*/

// 파일 실행시  node 파일이름.js로 실행시킴    // node index.js 
//json에서 스크립트변경 "dev": "nodemon index.js"

const express = require("express")
const app = express()

const bodyParser = require('body-parser')
// post 방식으로 받은 요청 데이터는 parsing 작업을 거쳐야한다!

//데이터 중첩시 중첩된 데이터까지 해석할지 여부 
app.use(bodyParser.urlencoded({extended:false}))
// json형태로 parsing 하겠다는 뜻
app.use(bodyParser.json())


// 요청이 오면 처리해보자 (미들웨어라고도 함)
// use : 데이터전달 (request : response)
app.use((request, response) => {

    // console.log(request.query)
    const { name, town} = request.body
    response.send(`${town}에 사는 ${name}씨 반가워요!`)

    // console.log(request.body.name)
    // console.log(request.body.town)
    // response.send("니가 보낸 GET 요청은 잘 받았어") 
    
})

app.listen(4000, () => {
    console.log("4000번 포트에서 서버 구동 됨!")
})