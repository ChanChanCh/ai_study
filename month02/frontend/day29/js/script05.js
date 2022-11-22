// let myAge = 18
// let urAge = prompt("난 18인데, 네 나이는 어떻게 돼?")

// if(myAge == urAge){
//     alert("우린 동갑 내기 친구!!!")
// }else{
//     alert("나이는 다르지만 친하게 지내자!")
// }


// window.parseInt(문자열) : 숫자로 변경

let cAge = parseInt(prompt("승객의 나이는?"))

// getElementById = #안써도 id를 쓰겠다라고 알아챔
// let p =  document.getElementById("text")
let p =  document.querySelector("#text")


if(cAge < 8){
    p.textContent = "너는 어리니까 무료!"
    // 자바스크립트 스타일 속성은 카멜 표기법을 쓴다
    p.style.color = "teal"
    p.style.backgroundColor = "orange"
}else if(cAge < 20){
    p.textContent = "700언!"
    p.style.color = "teal"
    p.style.backgroundColor = "orange"
}else if(cAge < 80){
    p.textContent = "1250언!"
    p.style.color = "teal"
    p.style.backgroundColor = "orange"
}else{
    p.textContent = " 무료!"
    p.style.color = "teal"
    p.style.backgroundColor = "orange"
}