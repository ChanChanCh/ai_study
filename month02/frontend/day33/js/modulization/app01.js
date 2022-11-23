const http = require("http")    



const server = http.createServer() // 서버 앱 생성
                    // listen은 서버  ,콜백함수를 받음
server. listen(4000, () => {
    console.log("내 서버가 4000번 포트에서 잘 돌아가는 중")
})


