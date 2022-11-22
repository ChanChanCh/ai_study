let dooly = {
    character : "둘리",
    species :   " 공룡",
    birth:  new Date(1980, 10, 10)
}

let dooly_str = `{
    "character":  "둘리",
    "species":    " 공룡",
    "birth":  "1980년 10월 10일"
}`

console.log(JSON.stringify(dooly))
console.log( JSON.parse(dooly_str))

// 할일 배열을 문자열 형식으로 바꿔보자
const todos = [{
    todoContent: "밥먹기",
    todoDate: new Date()
},{
    todoContent: "독서하기",
    todoDate: new Date()
}]

console.log(JSON.stringify(todos))