const pet = ["강아지","고양이","거북이","열대어"]



// 두번째 매개변수는 인덱스 번호이다.  forEach(요소의 값 , 인덱스 번호)

pet.forEach(function(aPet, idx){
    console.log(aPet, idx)
})

// 배열.map(함수) : 함수 호출 결과를 모은 새로운 배열 생성!
// map은 return을포함해서 값을 내보낼 수 있음
let result1 = pet.map(function(aPet, idx){
    return `귀여운 ${aPet}` 
})
console.log(result1)

// 배열.filter(함수) : 함수 호출 결과가 true인 요소만 모아서 배열 생성!

let result2 = pet.filter(function(aPet, idx){
    if(idx % 2 == 1){
        return true;
    }else{
        return false;
    }
})

console.log(result2)

let result3 = pet.filter((aPet, idx) => {

    if(aPet == "강아지" || aPet == "거북이"){
        return true
    }else {
        return false
}

})
console.log(result3)