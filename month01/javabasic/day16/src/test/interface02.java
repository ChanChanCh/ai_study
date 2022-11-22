package test;

// 추상 클래스 : 추상 메소드를 하나 이상 포함하는 클래스
// 추상 메소드 : 몸통이 없고, 앞에는 abstract가 붙는 메소드
// 추상 클래스도 참조 변수는 만들지만, 인스턴스 생성은 불가!
// 추상 클래스에는 일반 메소드도 자유롭게 추가 정의 가능
// 인터페이스 변수는 정적인 상수이나, 추상 클래스 변수는 그냥 변수


abstract class Tree{
	String name;
	abstract void makeFruit();
	void growingUp() {
		System.out.println("나무가 쑥쑥 자랍니다");
	}
}

public class interface02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
