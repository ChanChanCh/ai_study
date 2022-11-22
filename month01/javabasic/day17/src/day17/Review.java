package day17;
/*
 * 인터페이스 :
 * ﻿어떤 객체를 만들고 싶은지, 혹은 만들어야 하는지에 대한 약속
 * 
 * 추상 메소드 :
 * 몸통없이 선언부만 있는 메소드로 사용할 수 없는 미완성 상태의 메소드
 * 
 * 인터페이스 내의 추상메소드 :
 * public abstract 메소드이다. 컴파일러에 의한 자동처리
 * 
 * 인터페이스 내의 변수 :
 * public static final 변수이다. 즉 상수이다.
 * 
 */

interface Cat{
	String species = "고양이과";
	//원하는 기능추가
	void eating();
	void sleeping();
	
	// 디폴트 메소드 : 인터페이스에 기능이 있는 메소드를 추가한다.
	default void attacking() {};
}

//인터페이스 기반의 클래스는 인터페이스 내 추상 메소드를 오버라이딩 해야함
class Puma implements Cat{
	// Puma는 Cat이 공유하는 species를 그냥 사용할 수 있다.
	// 스태틱멤버는 논스태틱 멤버에 접근 불가. 그러나 반대 경우는 가능
	//(논스태틱멤버가 스태틱멤버보다 늦게 생성됨으로 접근이 불가능함)
	String name = species + "퓨마";

	@Override
	public void eating() {
	}

	@Override
	public void sleeping() {
	}
	// 물려받지 않은 메소드
	
	public void hiding() {}
}
// 인터페이스 간의 상속 : 인터페이스를 확장해서 다른 인터페이스 만들기
interface Tiger extends Cat{
	void hunting();
}


public class Review {

	public static void main(String[] args) {
	// 인터페이스도 다형성(polymorphism)이 적용되는 대상이다
	// 인터페이스로 new 할 수 없음 (오버라이딩하면 가능)
	//	                     
		Cat c = new Puma();
		c.eating();
		c.sleeping();
		// Cat은 Puma가 가지고있는 메소드를 불러올 수 없다
		// c.hiding();

	}
}
