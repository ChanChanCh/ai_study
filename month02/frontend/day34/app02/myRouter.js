const express = require("express")
const app = express()

// Router를 모듈화해서 코드양 줄여보기

const myRouter = express.Router()

myRouter.route("/").get((request, response) => {
    response.send("랜딩 페이지에 들어오셨습니다.")
})

myRouter.route("/sise").get((request, response) => {
    response.send("국내 증시 페이지에 들어오셨습니다.")
})

myRouter.route("/world").get((request, response) => {
    response.send("해외 증시 페이지에 들어오셨습니다.")
})

module.exports = myRouter

