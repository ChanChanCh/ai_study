package day16;

//참조자료형 Cat
class Cat{
	String name;
	// 디폴트 생성자 형태
	Cat(){}	
	
	
	// 생성자에대한 오버로딩 (입맛에 맞춰 반환이나 인수값 조정)
	Cat(String name){
		this.name = name;
	}
	void Punch() {
		System.out.println("코양이 냥냥 빤치!!");
	}
}

//상속 : 기존 클래스가 가지고 있는 것을 물려받아 새로운 클래스를 정의한다.
// is - a 관계 : 상속받은 자식 클래스가 부모 클래스에 포함되어야한다.
// ex) Cat을 상속받아 Tiger를 만든다 --> 호랑이는 고양이과이기때문에 상관관계가 맞아떨어진다

class Tiger extends Cat{
	
	Tiger(){
		super();// 부모 클래스의 생성자를 호출한다!
	}
	void Punch() {
		System.out.println("호랑이 빤치!!");
	}
}

public class Review {

	
	public static void main(String[] args) {
			// new 생성자 호출
	Cat c = new Cat("낭만코양이");
	Tiger t = new Tiger();
	
	// 부모 타입의 참조 변수가 자식 인스턴스 참조 가능
	// 단, 자식에만 추가도니 자원들은 사용 불가! (Tiger의 punch는 사용할수 없음)
	// 메소드 오버라이딩 : 부모클래스로부터 물려받은것들을 재정의 (이름이 같은 메서드)
	// 오버라이딩한 punch는 참조변수에 따라 결과가 달라진 정보를 출력하게된딘다
	
	// 다형성 아래에서도 메소드 오버라이딩을 하면,
	// 참조된 인스턴스 타입의 메소드를 호출 할 수 있다.
	Cat a = new Tiger();
	a.Punch();
	t.Punch();
	c.Punch();
	
	// instanceof : 참조 중인지, 또는 참조 가능한지
	System.out.println(a instanceof Tiger);
	
	
	
	}
}
