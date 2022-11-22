// 내장 생성자 상속받아 클래스 생성하기

class ExtendArray extends Array{
    constructor(){
        super();
        super.push(10); super.push(30);
        super.push(20); super.push(40);
    }
    getTotal(){
        let total = 0;
        for(let i = 0; i < this.length; i++){
            total += this[i]
        }
        return total
    }
}
console.log(Array)
