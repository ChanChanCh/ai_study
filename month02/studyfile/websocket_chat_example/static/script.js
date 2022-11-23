// 여기에서 사용되는 웹소켓은 ws가 아닌 WEB API이다

const webSocket = new WebSocket(`ws://${window.location.host}`)

const form = document.querySelector("form")
const ul = document.querySelector("ul")

form.addEventListener("submit", function(e){
  e.preventDefault()
  const input = form.querySelector("input")
  webSocket.send(input.value)
  input.value = ""
})

webSocket.addEventListener("open", (socket) => {
  // console.log(socket)
})

webSocket.addEventListener("message", (message) => {
  console.log(message.data)
  const li = document.createElement("li")
  li.textContent = message.data
  ul.appendChild(li)
})
