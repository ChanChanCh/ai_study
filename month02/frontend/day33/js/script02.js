//프로미스 : 비동기 동작을 따로 지정할 테니, 독립적으로 처리하라
// 프로미스의 콜백 함수에는 비동기 작업을 포함하는 게 일반적.



const rnPromise = new Promise((resolve, reject) => {

    setTimeout( () => {
        
        let rn = Math.floor(Math.random() * 10) + 1
        if(rn % 2 == 1){
            // 성공에 대한 데이터
            resolve(rn)
        }else{
            //실패에 대한 데이터
            reject(rn)
        }
    }, 3000 )

})

// 약속을 했으니, 지켜 보자

rnPromise.then( (resolvedData) => {
    console.log("성공한 약속")
    console.log(resolvedData)
} ).catch( (rejectedData) => {
    console.log("실패한 약속")
    console.log(rejectedData)
} )

// 이해를 돕기 위한 예제


