package day13;

//클래스란 참조 자료의 설계도이다.
/*
 * 자바의 생성자 만들기 규칙
 * 1. 메소드 이름이 클래스 이름과 동일하다.
 * 2. 반환형이 존재하지 않는다. (참조 자료를 반환할 것이 정해져 있음)
 * 
 */

class Bird{
	
	String name;
	//반환형을 안써주면 생성자가 만들어진다.
	Bird(String n){
		name = n;
	} 	
	void flying() {
		System.out.println(name+"야 날아가자~~");
	}
	
}
public class Board2 {
	
	public static void main(String[] args) {
		//객체에 대한 참조값 : 메모리 주소
		Bird googoo = new Bird("짭새");
		Bird b = new Bird("돼지");
		
		callBird(googoo);
		callBird(b);
	}
	
	public static void callBird(Bird b) {
		b.flying();
	}
}
