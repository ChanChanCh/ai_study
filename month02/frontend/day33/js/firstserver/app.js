const express = require('express');
const app = express(); // 익스프레스 기반의 서버 어플리케이션 객체 반환

handleListening = () => console.log("Now I am Listening on 4000")
app.listen(4000, handleListening);

