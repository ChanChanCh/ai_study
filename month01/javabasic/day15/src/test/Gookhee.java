package test;


class Cat{
	// static 은 상속이 되지않는데 다만 메모리에 올라가있는걸 공유하는것이다.
	// protected : 같은 패키지 내 + 상속 관계 까지 허용 (접근 제어자)
	protected static String character = "귀엽다";
}
//국희 클래스는 Cat의 자식클래스이다 
public class Gookhee extends Cat{
	
	void introduce() {
		System.out.println(character);
	}
	
}