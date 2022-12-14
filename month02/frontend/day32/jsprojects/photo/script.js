// 요소 선택
const beginning = document.getElementById("beginning")
const callBtn = document.getElementById("call-btn")
const prevBtn = document.getElementById("prev")
const nextBtn = document.getElementById("next")
const photoDiv = document.getElementById("photo")

// 사용 데이터 선언
const photos = []
const numOfPhoto = 8 // 50까지만 가능!
let photoIndex = 0
const request = new XMLHttpRequest()
const api = `https://dog.ceo/api/breeds/image/random/${numOfPhoto}`
let isPushed = false

// 응답이 로드되었을 때의 이벤트 핸들링
request.addEventListener("load", function(){
  const responseJson = JSON.parse(request.responseText)
  responseJson.message.forEach(function(element){
    photos.push(element)
  })

   //사진 표시 역역에다가 사진표시하기 (배경으로 표시하는 방식)
  photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
})

// callPhotos 함수 - 요청 초기화 
function callPhotos(){
  request.open("GET", api)
  request.send()
}

// CALL 버튼 클릭 이벤트 핸들링
callBtn.addEventListener("click", function(){
  if(isPushed){
    return; // 이미 버튼이 눌려진 상태에서 또 누른 거라면, 이 함수는 강제종료!
  }
  isPushed = true;

  callPhotos() 
  setTimeout(function(){
    beginning.classList.remove("beginning")
    //버튼있는 역역 사라지라는 명령
  }, 1500)
})

// prev와 next 버튼 클릭 이벤트 핸들링 
prevBtn.addEventListener("click", function(){
  
  if(photoIndex == 0){
    photoIndex = numOfPhoto - 1
    photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
    return;
  }

  photoIndex -= 1
  photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
})

nextBtn.addEventListener("click", function(){
    
  // 인덱스가 배열을 벗어나지 않게
  if(photoIndex == numOfPhoto - 1){
    photoIndex = 0
    photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
    return;
  }

  photoIndex += 1
  photoDiv.style.backgroundImage = `url(${photos[photoIndex]})`
})