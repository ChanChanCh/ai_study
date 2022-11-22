/*
    클래스가 존재하는 모든 언어에서
    클래스 내 생성자의 주된 목적은 
    멤버의 초기화다
*/

class Person{
    constructor(job){
        this.job = job
    }
    introduce(){
        console.log(`내 직업은 ${this.job}!`)
    }
}

// 상속에는 역시 IS-A 관계가 바람직하다
class Player extends Person{
    constructor(){
        // 자바스크립트에서도 자식 객체 생성은 곧 부모 객체 생성
        super("축구선수") 
    }
}

const a = new Player("축구선수")
a.intro

