// 규칙 1. 꼭 닫혀야 하는 태그
// 규칙 2. 반드시 감싸져야 하는 태그 (feat. return)
// 규칙 3. JSX 내부에서 자바스크립트 표현식 나타내기 with {}
import React from 'react'

function getTitle(){
  return "ROCKY"
}

// 리액트 프래그먼트 : 이름 없는 태그로, 오직 감싸기 용도로만 사용한다!
function Title(){

  let movieTitle = "헬리콥터와 비밀의 빵"

  return <>
    <h1>{movieTitle}</h1> 
    
    <h1>{getTitle()}</h1> 
    <h3>(이병헌, 신민아 주연)</h3>
    </>
}

function App(){
  return <div>
      <Title />
      <input type="text"/>
      <br />
      <input type="button" value="눌러" />
    </div>

}

export default App