//this가 가르키는 것 확인해보기

console.log(this)
document.querySelector("button").addEventListener("click",function(){

console.log(this)

})

class Dog{
    breed = "시바견"
    bark(){
        console.log(this)
        console.log("멍멍!")
    }
}

const d1 = new Dog()
console.log(d1.breed)
d1.bark()