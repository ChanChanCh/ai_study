let lotto = []

//  floor : 소수점 이하를 걷어내는 기능
let rn = Math.floor(Math.random() * 45)+1

// console.log(Math.floor(Math.random() * 45)+1)


while(lotto.length < 6){
    let rn = Math.floor(Math.random() * 45)+1

    if(lotto.indexOf(rn) == -1){
        lotto.push(rn)
    }
}

console.log(lotto)
