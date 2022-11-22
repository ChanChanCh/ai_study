/*
    백틱(`)을 이용해 만든 문자열은
    중간에 값을 삽입하는 문자열 포맷팅이 가능한 문자열이다.
    포맷팅을 하지 않을 경우에는 보통의 문자열과 동일하게 사용 가능하다.


*/

const str1 = `그냥 보통의 문자열`

const number = 500
const str2 = `데이터 하나 삽입 : ${number}`

console.log(str1, str2)

const str3 = `내가 가장 좋아하는 음식은 : ${prompt("음식명")}`

console.log(str3)

let myName = undefined; // 미정 상태를 나타냄
console.log(myName)

myName = Null // 없음을 나타냄
console.log(myName)

//typeof : 자료형 이름 반환
console.log(typeof true)

