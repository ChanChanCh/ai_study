// https://dog.ceo/api/breeds/image/random

//  http 방식을 기반으로 요청을 보낼 수 있는 객체(요청 도구)
const request = new XMLHttpRequest()

// 보낼 요청을 준비
request.open("get", "https://dog.ceo/api/breeds/image/random")

request.addEventListener("load", () => {
    const data = JSON.parse(request.response)
    console.log(data.message)

    let img = document.createElement('img')
    img.src = data.message
    document.body.appendChild(img)
    

})

// 보내기 
request.send()


