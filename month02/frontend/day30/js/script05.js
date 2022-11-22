let p = document.querySelector("p")

p.classList.add("goal")
p.classList.remove("paragraph")
console.log(p.classList.contains("text"))

document.querySelector("button").addEventListener("click",
function(){
    
    p.classList.toggle("text")

})