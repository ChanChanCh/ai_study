// https://dog.ceo/api/breeds/image/random

const button = document.querySelector("button")
const request = new XMLHttpRequest()

button.addEventListener("click", function(){
    request.open("get", "https://dog.ceo/api/breeds/image/random/3")
    request.send()
})

request.addEventListener("load", function(e){
    const data = JSON.parse(e.target.response)
    data.message

    //아래 배열을 토대로 이미지 생성 작업을 반복하자
    data.message
    console.log(data)


data.message.forEach(function(aDog){
    let img = document.createElement("img")
    img.src = aDog
    img.style.width = "200px"
    img.style.height = "200px"
    document.body.appendChild(img)
    
    })
})
