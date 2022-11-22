//window는 웹브라우저를 뜻한다. 이를 이용해 브라우저 기능에 접근할 수 있다.

window.alert("비밀번호 5회 이상 틀렸습니다!")

// log(x) :  x를 콘솔 화면 상에 기록해 둔다! (== 출력기능)
console.log("콘솔 화면에 이 내용을 기록해두자")

/*
var와 let은 모두 자바스크립트 변수를 만드는 키워드이다
*/

let myName;
myName = "박찬양";
console.log(myName)
myName = "차냥"
console.log(myName)

/*
     var와let의 차이?

     초기에는 var만 있었고, 그걸로 변수를 만들었다.

     var는 코드 블록(영역)간의 구분이 명확하게 처리되지 않아
     때때로 기대했던 결과와 다른 결과를 초래하기도 했다.
     그래서 이를 보완한 let이 등장했다.

*/

//상수는 바꾸지 않는다. 따라서 선언과 초기화를 동시에 한다
const GOAT = "리오넬 메시"

GOAT = "날강두" // 에러유발

console.log(GOAT)

// prompt(x) : 사용자로부터 메시지를 입력받는 창을 띄운다

const MY_MESSAGE = "당신이 생각하는 최고의 음식은?"
window.prompt(MY_MESSAGE)

//아무것도 안 쓰고 확인 누르면 빈 문자열 반환
// 무언가를 쓰고도 취소 누르면 null 바노한
const UR_MESSAGE = prompt(MY_MESSAGE)
console.log(UR_MESSAGE)



