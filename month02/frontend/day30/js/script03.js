/*
생성자 : 객체를 만들기 위해 필요한 함수

자바스크립트에는 두 가지 유형의 생성자가 있다

1. 일반 함수를 생성자로 사용하기
2. 클래스 내부에 생성자를 포함시켜 사용하기

*/

function sayHello(){
    console.log("Hello!")
}

function Dog(n, b){
    this.dname = n
    this.breed = b
}

new Dog() // 생성자에 정의된 내용을 토대로 객체 생성


let d = new Dog("콩이","시츄")
 // 생성자에 정의된 내용을 토대로 객체 생성
console.log(d.dname)
console.log(d.breed)

/*
생성자 개념을 알아야 하는 이유

 * 자바 스크립트에는 new 키워드를 붙여서 호출하면
객체가 만들어지는 함수들이 미리 정의되어 있다
(표준 라이브러리).

그것들을 적절히 활용하면 유용한 기능을 
손쉽게 구현할 수 있음을 이해해야 한다.
 */

