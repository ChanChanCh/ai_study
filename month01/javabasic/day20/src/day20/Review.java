package day20;

//출력 가능한 객체를 만들기 전에 해두는 약속
interface Printable{
	// 
	public abstract void print();
}

// 익명클래스를 알기전 만들었던 방식
// 단점 : 새로운 코드불록을 별도로 만들어야한다.
// 여러번 사용할 목적이아닌데 재사용하게 만들어졌다.
//class Printer implements Printable{
//	public void print() {}
//}
//

public class Review {

	public static void main(String[] args) {
		
		Printable p = () -> {} ;
		
	}
}
