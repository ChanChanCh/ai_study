
for(let i =1; i < 11; i += 1){
    let p = document.createElement("p")
// 템플릿 리터럴을 이용해 한자리수 앞에는 0을 붙인다.
    let number = i < 10 ? `0${i}` : `${i}`

    p.textContent = number;
    document.body.appendChild(p)
}

