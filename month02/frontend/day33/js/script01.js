// 화살표 함수 (자바의 람다와 같다고 봐도 무방)

// const introduce = function(){
//     console.log("강윤호라고 합니다")
// }

const introduce = ()=>{
    console.log("root라고 합니다")
}

introduce()

// const introduce1 = (n) => {
//     console.log(`${n}입니다`)
// }

// 1. 매개변수 소괄호 생략 가능 (1개일때)

// const introduce1 = n => {
//     console.log(`${n}입니다`)
// }

// 2. 명령문이 하나면 중괄호 생략 가능

const introduce1 = n => console.log(`${n}입니다`)

introduce1("root")

const introduce2 = (n,a) => {
    console.log(`제 이름은 ${n}이고`)
    console.log(`나이는 ${a}살입니다`)
}
introduce2("박국희",3)

const introduce3 = (n = "짱구",a = 5) => {
    console.log(`제 이름은 ${n}이고`)
    console.log(`나이는 ${a}살입니다`)
}
introduce3()
introduce3("손오공")
introduce3("손오반",18)


// 구조분해와 리터럴
// [] 와 {} 에따라 다르니 주의해서 볼 것!
    // 구조 분해
const pet = {
    dog: "강아지", cat: "고양이", turtle: "거북이"
}

// 

// let dog = pet.dog
let { dog, cat , turtle } = pet
console.log(dog, cat, turtle)

// 네임을 이런식으로 지정해서 바꾼뒤 가져올 수도 있음
let { dog : d, cat : c , turtle : f } = pet
console.log(d, c, f)

const cafe = ["스타벅스", "커피빈", "이디야"]
let [star, bean , ediy, pasc ="파스쿠찌"] = cafe
console.log(star,bean, ediy, pasc)

// 향상된 객체 리터럴 (변수만 넣어서 객체 완성하기)

let ray = "레이"
let sm5 = "에스엠파이브"
let genesis = "제네시스"

let cars = { ray, sm5, genesis }
console.log(cars)











