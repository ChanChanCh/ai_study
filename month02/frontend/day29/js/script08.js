let input = document.querySelector("input[type='text']")
let button = document.getElementById("push")

let content = "고양이"

button.onclick = function(){
    this.value = content 
}

// this는 이벤트 핸들러 내부에서 이벤트 타겟을 참조한다.
input.onkeyup = function(){

    console.log(this)
    console.log("!")

}

