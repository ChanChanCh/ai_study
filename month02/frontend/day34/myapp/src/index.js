// index.js : 가상 DOM의 집합소이자 프로젝트 내 진입점(entry point)

import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App'; // 얘에서 부터 가상 DOM 만들기가 시작됨



const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);
