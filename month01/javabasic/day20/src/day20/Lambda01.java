package day20;


// 추상 메소드가 딱! 하나만! 있어야 함수형 인터페이스 이다.
@FunctionalInterface
interface MixCoffee{
	void drinkCoffee(int time);
}

@FunctionalInterface
interface Cat{
	//호출하면 "야옹" 이라는 문자열을 얻는 메소드
	String getMeow();
}



public class Lambda01 {

	public static void main(String[] args) {
		
//		Cat c = ()->{return "야옹";};
		Cat c = ()-> "야옹";
		System.out.println(c.getMeow());

		
		// 생략없는 완성형으로 구현해보자!
		MixCoffee mc = time -> System.out.println(time + "모금 마시자!");
		
		//람다는 그 자체로 하나의 메소드가 아니기때문에 따로 호출해주어야한다.
		mc.drinkCoffee(3);
	}
}
