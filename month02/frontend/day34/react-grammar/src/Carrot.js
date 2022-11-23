// 순수하게 Carrot.js 내부에서만 작성한 코드로 화면상에
// 100px x 100px의 네모가 표시되게 만들어 보자


import React from 'react'

const style1 = {
    height: "100px",
    width: "100px",
    backgroundColor : "red"
}

function Carrot(){

    return <>
        <div style={style1} className='box'></div>
    </>

}

export default Carrot;