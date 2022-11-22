const ul = document.querySelector("ul")
const form = document.querySelector("form")
let myTodos = [] // 할일 넣어줌

// 전달된 id에 해당하는 애만 빼고 나머지를 남기자!
function handleDelete(clickedId){
    myTodos = myTodos.filter((aTodo)=>{

        if(aTodo.todoId != clickedId){
            return true
        }else{
            return false
        }
    })
    paintTodos()
}

// 전달된 id에 해당하는 할일의 상태를 바꾸자!
function handleClick(clickedId){
    myTodos = myTodos.map((aTodo) => {
        if(aTodo.todoId == clickedId){
            return {
                ...aTodo, todoDone: true
            } 
            }else {
                return aTodo
        }
    })
    paintTodos()
}

function paintTodos(){
    ul.innerHTML = ""
    myTodos.forEach((aTodo) => {
        const todoDelBtn = document.createElement('span')
        const todoItem = document.createElement("li")
        todoDelBtn.innerText = 'x'
        todoDelBtn.title = '클릭시 삭제'
        todoItem.innerText = aTodo.todoText
        todoItem.title = '클릭시 완료'
          
        todoItem.classList.add(aTodo.todoDone == true ? "done" : "yet")
        todoItem.textContent = aTodo.todoText
        todoDelBtn.addEventListener('click', function(){
            handleTodoDelBtnClick(aTodo.todoId)
          })
        todoItem.addEventListener("click", function(){
            // todoID를 기반으로 특정 할일의 클래스를 변경하자!
            handleClick(aTodo.todoId)
            // todoID를 기반으로 특정 할일을 삭제하자!
            // handleDelete(aTodo.todoId)
        })
        ul.appendChild(todoItem)
    })
}


form.addEventListener("submit", function(e){

    e.preventDefault()

    let addTodo = {
        todoText : form.todo.value,
        todoDone: false,
        todoId: new Date().getTime() // 현재 시점을 초 단위로 환산
    }
    myTodos.push(addTodo)

    paintTodos();
    
})



// handleTodoDelBtnClick 함수
function handleTodoDelBtnClick(clickedId){
  myTodos = myTodos.filter(function(aTodo){
    return aTodo.todoId !== clickedId
  })
  paintTodos()
  saveTodos()
}

// handleTodoItemClick 함수
function handleTodoItemClick(clickedId){
  myTodos = myTodos.map(function(aTodo){
    return aTodo.todoId !== clickedId ? 
    aTodo : { ...aTodo, todoDone: !aTodo.todoDone } 
  })
  paintTodos()
  saveTodos()
}

// saveTodos 함수
function saveTodos(){
  const todoSting = JSON.stringify(myTodos)
  localStorage.setItem('myTodos', todoSting)
}

// loadTodos 함수
function loadTodos(){
  const myTodos = localStorage.getItem('myTodos') 
  myTodos = myTodos !== null ? JSON.parse(myTodos) : myTodos
  paintTodos()
}

// 할일 입력 후 제출하면 발생하는 이벤트 핸들링
todoForm.addEventListener('submit', function(e){
  e.preventDefault()
  const toBeAdded = {
    todoText: todoForm.todo.value,
    todoId: new Date().getTime(),
    todoDone: false
  }
  todoForm.todo.value = ""
  myTodos.push(toBeAdded)
  paintTodos()
  saveTodos()
})

loadTodos() // 시작할 때 한번만!


