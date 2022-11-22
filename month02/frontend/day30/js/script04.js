// 생성자 함수 호출 시에는 앞에다가 new 해야 객체 생김
// const now = new Date()

// console.log(now)

// const year = now.getFullYear()
// let month = now.getMonth() + 1
// let day = now.getDay()
// let hour = now.getHours()
// let minute = now.getMinutes()
// let second = now.getSeconds()

// month = month < 10 ? `0${month}` : `${month}`
// month = day < 10 ? `0${day}` : `${day}`
// month = hour < 10 ? `0${hour}` : `${hour}`
// month = minute < 10 ? `0${minute}` : `${minute}`
// month = second < 10 ? `0${second}` : `${second}`

// let h1 = document.createElement("h1")
// h1.textContent = `${year}/${month}/${day} ${hour}:${minute}:${second}`

// document.body.appendChild(h1)



// let timerId = setInterval(function(){
//     console.log("타임 아웃!")
// }, 500)

// clearInterval(timerId)

let h1 = document.createElement("h1")
document.body.appendChild(h1)

setInterval(function(){
    const now = new Date()

console.log(now)

const year = now.getFullYear()
let month = now.getMonth() + 1
let day = now.getDay()
let hour = now.getHours()
let minute = now.getMinutes()
let second = now.getSeconds()

month = month < 10 ? `0${month}` : `${month}`
day = day < 10 ? `0${day}` : `${day}`
hour = hour < 10 ? `0${hour}` : `${hour}`
minute = minute < 10 ? `0${minute}` : `${minute}`
second = second < 10 ? `0${second}` : `${second}`

h1.textContent = `${year}/${month}/${day} ${hour}:${minute}:${second}`

}, 1000)

