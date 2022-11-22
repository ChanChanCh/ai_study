package nested;


/*
 * 클래스(static) 멤버는 (non-static) 인스턴스 멤버에 접근할 수 없다!
 * 왜냐? 클래스 멤버 입장에서는 인스턴스 멤버의 존재 여부를 보장할 수 없다.
 * 
 * 추가로, static 네스티드 클래스는 외부 클래스의 메소드에도 접근할 수 없다.
 */

//( 스태틱 네스티드클래스 ) 
class Outer{
	
	static int num = 10;
	
	static class INum{
		void showNum() {
			System.out.println(num);
		}
	}
}

// 멤버클래스 Bean을 포함한 외부 클래스 Coffee!
class Coffee{
	
	void getCoffee() {
		new Bean().thisIs();
	}
	
	private class Bean{
		void thisIs() {
			System.out.println("다람쥐 똥 Coffee 원두");
		}
	}
}
// 로컬 클래스
class Bag{
//	Pencil p = new Pencil(); 여기서는 Pencil 모름
	void getPencil() {
		class Pencil{
			public String toString() {
				return "연필";
			}		
		}
		
		Pencil p = new Pencil();
		System.out.println(p);			
	}

}

public class Nested01 {

	public static void main(String[] args) {

		Outer.INum obj = new Outer.INum();
		obj.showNum();
		
		Coffee c = new Coffee();
		c.getCoffee();
		
		new Bag().getPencil();

	}
}
