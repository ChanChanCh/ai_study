// 규칙 4. style은 객체로, class 대신 class Name으로
import React from 'react'

const ulStyle = {
    color: "red",
    backgroundColor: "yellowgreen"
}



function Banana(){
    return <div>
        {/* 와! 리액트... 라이브러리를 뒤집어 놓으셨다  */}
        <ul style={ulStyle}
        className="fruits">
            <li>바나나</li>
            <li>오렌지</li>
            <li>사과</li>
        </ul>
    </div>
}

export default Banana