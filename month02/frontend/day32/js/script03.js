// https://dog.ceo/api/breed/Redbone/images/random

let myBreed = "beagle"
let myUrl = `https://dog.ceo/api/breed/${myBreed}/images/random`

// 값을 뽑아올때 e추가후 traget.value추가
document.querySelector("select").addEventListener("change", function(e){

    myBreed = e.target.value

})

const request = new XMLHttpRequest()
const button = document.querySelector("button")

button.addEventListener("click",function(){
    myUrl = `https://dog.ceo/api/breed/${myBreed}/images/random`
    console.log(myUrl)
    request.open("get", myUrl)
    request.send()
})

request.addEventListener("load", function(){
    const data = JSON.parse(request.response)
    let img = document.createElement("img")
    img.src = data.message
    img.style.width = "200px"
    img.style.height = "200px"
    document.body.appendChild(img)

})