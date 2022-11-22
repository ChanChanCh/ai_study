const button = document.getElementById("push")
const img = document.getElementById("dog")
const url = "https://dog.ceo/api/breeds/image/random"

const getDog = new Promise((resolve, reject) => {

    const request = new XMLHttpRequest()
    request.open("get", url)
    request.addEventListener("load", () => {
       // 상태 코드에 따른 성공 실패 구분
        if(request.status == 200){
            resolve(console.log(
                JSON.parse(request.response)))
        }else{  
            reject("요청 실패!")
        }

    })
    request.send()
})
// JSON.parse(request.response)= {message: 'https://images.dog.ceo/breeds/pembroke/n02113023_6312.jpg', status: 'success'}
// 미션 : 프로미스 호출을 버튼 클릭시에 하도록 하자
// 그리고 성공시에는 img 태그에 이미지 src를 지정하게끔 하자

// getDog.then((resolveData) => {
//     console.log(resolveData)
// })
// .catch((rejectedData)=>{
//     console.log(rejectedData)
// })


button.addEventListener("click", () => {

    getDog.then((resolveData) => {
        console.log(resolveData)
        img.src = resolveData.message
    })
    .catch((rejectedData)=>{
        console.log(rejectedData)
    })

})


