package pack01;
// 특정 패키지에서 특정 클래스를 가져온다는 선언
// 아래선언을 통해 패키지 구분을 생략하고 클래스를 사용할 수 있게 된다.
// 단, 이름이 같은 클래스가 있는 경우에는 사용하는 데 제약이 있다.
//
//
import pack02.Phone;
import pack02.Cafe;
//import pack03.Cafe; 이름이 같은 클래스는 선언이 불가능하다 

public class Main {

	public static void main(String[] args) {
		// visible = 가시성 --> 접근권한이 없다 
		// 해결방법 --> 해당패키지가서 public으로 바꿔주면됨 (접근제한자 설정!)
		pack02.Cafe c1 = new pack02.Cafe("스타 붝~~스");
		pack03.Cafe c2 = new pack03.Cafe("커피가 빈~ 곳");
		
		//pack02.Phone p = new pack02.Phone();
		// import를 통해 위 주석처럼 패키지명을 선언하지 않아도 간단하게 선언이 가능해짐
		Phone p = new Phone();
		c1.weAre();
		c2.greeting();
	}
}
