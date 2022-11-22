let todoList = []

    // 만일 저장되어 있는 내용이 이미 있다면, 일단 가져오자

let data = localStorage.getItem("todoList")

todoList = data == null ? [] : JSON.parse(data)
let ul = document.querySelector('ul')
ul.innerHTML = ""
todoList.forEach(function(aTodo){
let li = document.createElement('li')
li.textContent = `${aTodo.todoContent} (${aTodo.todoDate})`
// appendChild = 추가한 자식반환 append 반환 x
ul.appendChild(li)
})



document.querySelector("form").addEventListener("submit", function(e){

    // 새로고침 방지
    e.preventDefault()

    let todo = {
        todoContent: e.target.todo.value,
        todoDate: new Date()
    }

    todoList = [...todoList, todo]
    console.log(todoList)

    localStorage.setItem("todoList", JSON.stringify(todoList))

    // ul에 할일 하나하나가 li요소로 표시되도록 해보자!

    let ul = document.querySelector('ul')
    ul.innerHTML = ""
    todoList.forEach(function(aTodo){
    let li = document.createElement('li')

    li.textContent = `${aTodo.todoContent} (${aTodo.todoDate})`
    ul.appendChild(li)
})
})
