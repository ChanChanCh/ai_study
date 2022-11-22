// let container = document.querySelector(".container")

// let p = document.createElement("p")

// p.textContent = "군자는 자신을 탓하고, 소인은 남을 탓한다"

// // append는 문자열추가도 가능
// console.log(container.append(p))

// container.append("논어의 한 구절")



// let btn = document.createElement("button")
// btn.textContent = "PUSH"

// let cnt = 0

// btn.addEventListener("click",function(){
//     /*
//         버튼 클릭할 때 마다 "클릭" 이라고 쓰여 있는 p 요소가
//         body 안에 추가되도록 해 보자!
//     */

//         if(cnt == 5){
//             return;
//         }

//         let p = document.createElement("p")
//         // p.textContent = "클릭"
//         p.innerText = "클릭"
//         document.body.append(p)

//         cnt += 1

// })

// document.body.append(btn)


// 음식이름을 작성한 후 전송버튼을 누르면 해당 음식이름이 표시된
// <li> 요소가 <ul> 안에 추가되도록 해보자!

//form선택
let form = document.querySelector("form")

let ul = document.querySelector("ul")

form.addEventListener("submit",function(e){
    //새로고침 방지할때 사용
    e.preventDefault()

    // make
    let li = document.createElement("li")
    li.textContent = form.food.value
    // 입력후 초기화
    form.food.value = ""

    ul.appendChild(li)

})

// ul.appendChild(li)
// li.textContent = input.value

