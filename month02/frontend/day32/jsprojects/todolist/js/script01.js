
//생성자 함수를 토대로 객체 만들기
function Dog(){}
new Dog()

//객체 리터럴을 토대로 객체 만들기
const Cat = {
    cname: "국희",
    cage: 3,
    ctown: "신탄진",
    scratch: function(){
        console.log("자꾸 건들면 할퀸다옹")
    }
}

console.log(typeof Cat)

Cat.scratch()

Cat["scratch"]()

// 할일(to-do)을 표현한다면?

const todo = {
    todoContent: "공부하기",
    todoDone: false,
    todoDate: new Date(),
    todoWith: ["pcy","kuj"]
}



const cafes = ["스타벅스", "파스쿠찌", "투썸플레이스", "이디야커피"]

const newCafes = [...cafes, "백다방"]

console.log(newCafes)

const pet = {
    species: "강아지",
    breed: "시츄",
    age: 13
}

// 키의 중복은 불가하므로, 나중에 쓰여진 키의 내용으로 덮어쓰기 한다.
const newPet = {...pet, name: "콩이", age: 14 }
