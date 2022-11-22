//  window.confirm() : 사용자로부터 참/거짓 중 하나를 받음

// while(confirm("반복하고 싶나요?")){
//     console.log("반복중이다~")
// }

//querySelectorAll : 해당하는 거 모두 선택
let items = document.querySelectorAll("li")
console.log(items)

for(let i = 0; i<5; i+= 1){
    items[i].textContent = prompt("입력해주시오")
}

