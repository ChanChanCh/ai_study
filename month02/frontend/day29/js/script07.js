// 함수 선언식 : 호이스팅(hoisting)이 가능하다
function sayHEllo(){
    console.log("Hello~")
}

// 호이스팅이란, 함수 정의가 호출보다 뒤에 와도 되는 것
// sayHEllo()
// sayBye()


// 함수 표현식 : 호이스팅(hoisting)이 불가능
const sayBye = function(){
    console.log("Bye~")
}

function setText(text){
    let p = document.querySelector("p#text")
    p.textContent = text
}

function setFoodText(food){
    return `맛있는 ${food}`
}

setText(setFoodText(prompt("좋아하는 음식을 써봐요")))


// let myFood = "돈까스"
// let desc = "맛있고 바삭한"
// myFood = `${desc} ${myFood}`
// p.textContent = myFood

