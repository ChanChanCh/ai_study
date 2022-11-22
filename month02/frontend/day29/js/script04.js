
// 유효한 css 선택자로 요소 선택하기
let h1 = document.querySelector("h1")

console.log(h1.textContent)
h1.textContent = "원래 제목이 있던 곳"

let text = document.querySelector("p.text")
console.log(text.textContent)

//id로 선택하기
let center = document.getElementById("center")
console.log(center.textContent)

