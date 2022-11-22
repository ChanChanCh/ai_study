let todoList = []

document.querySelector("form").addEventListener("submit", function(e){

    // 새로고침 방지
    e.preventDefault()

    let todo = {
        todoContent: e.target.todo.value,
        todoDate: new Date()
    }

    todoList = [...todoList, todo]
    console.log(todoList)

    // ul에 할일 하나하나가 li요소로 표시되도록 해보자!

    let ul = document.querySelector('ul')
    ul.innerHTML = ""
    todoList.forEach(function(aTodo){
    let li = document.createElement('li')

    li.textContent = `${aTodo.todoContent} (${aTodo.todoDate})`
    ul.appendChild(li)
})
})


