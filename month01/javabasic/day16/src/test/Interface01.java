package test;

/*
 * 클래스를 기반으로 상속할 때의 단점 :
 * 일단 부모 클래스가 완성되어 있어야 한다.
 * 
 * 인터페이스는 추상 메소드를 포함하는 부모 클래스 역할이다.
 * 따라서 
 * 1. 참조 변수는 만들 수 있다.
 * 2. 그러나 인스턴스를 생성할 순 없다. (new 생성 불가)
 * 
 * 
 * 
 */


//디폴트 메소드 : 이미 구현되고 있는 인터페이스에
// 오류 없이 기능을 추가하고 싶다면 추상 메소드 대신 이것을!!

interface Player{
	void Training();
	default void taleRest() {
		System.out.println("휴식을 취하자");
	};

}

interface GoodPlayer extends Player{
	void mentalTraining();
}


class FootPlayer implements Player {
	@Override
	public void Training() {
		System.out.print("슛팅 10회 연습");
	}
}
class BaseballPlayer implements Player{
	@Override
	public void Training() {
		System.out.print("송구 10회 연습");
	}
}

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
