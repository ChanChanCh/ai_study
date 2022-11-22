const mk_num = document.querySelector('.numbers')
const mk_draw = document.querySelector('#draw')
const mk_reset = document.querySelector('#reset')
const lottoNum = []
const color = ['red', 'orange', 'yellowgreen', 'green', 'blue']


function colorNum(number){
    const mk_div = document.createElement('div')
    mk_div.classList.add('lottoball')
    let colorIndex = Math.floor(number / 10)
    mk_div.style.backgroundColor = color[colorIndex]
    mk_div.textContent = number
    mk_num.appendChild(mk_div)
}

mk_draw.addEventListener('click', function(){

    
    if(lottoNum.length == 6) return; 

    while(lottoNum.length < 6){

      let ran = Math.floor(Math.random() * 45) + 1
      
      if(lottoNum.indexOf(ran) === -1){
        lottoNum.push(ran)
        // colorNum(ran)
      }
      
    }
    lottoNum.sort(function(n1, n2){ return n1 - n2; })

    lottoNum.forEach(function(eachNumber){
      colorNum(eachNumber)
    })

  })

  mk_reset.addEventListener('click', function(){
    lottoNum.splice(0, 6)
  
    mk_num.innerHTML = ""
  })



//   $('.draw').click(function () {

//     $('.body').toggleClass('active')
//     $('.title').toggleClass('active')

// })

// $('.reset').click(function () {

//     $('.body').removeClass('active')

// })




