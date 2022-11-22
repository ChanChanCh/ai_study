const animal = ["고양이","강아지","거북이","앵무새","두더지"]

// // 길이 파악 (요소수)
// console.log(animal.length)

// // 요소 추가
// animal.pop("호랭이")
// console.log(animal)

// //요소제거
// animal.pop()
// console.log(animal)

// // 요소의 존재 여부 및 위치 확인
// if(animal.indexOf("강아지") == -1){
//     console.log("강아지는 없습니다")
// }else{
//     console.log("강아지는 있습니다")
// }

// 원하는데서 원하는 만큼 삭제
// animal.splice(2,3)


// 원하는데서 원하는 만큼 삭제 후 대체자원 추가

animal.splice(3,4, "원숭이", "멧돼지")
console.log(animal)

// 배열의 내용을 토대로 화면에 표시하기
for(let i =0; i<5; i += 1){

    let p = document.createElement("p")
    p.textContent = animal[i]
    document.body.append(p)

}

// 배열의 내용을 토대로 화면에 표시하기 2
animal.forEach(function(anAnimal){

    let p = document.createElement("p")
    p.textContent = anAnimal
    document.body.append(p)

})
