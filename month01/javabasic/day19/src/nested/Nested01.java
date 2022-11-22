package nested;


/*
 * Ŭ����(static) ����� (non-static) �ν��Ͻ� ����� ������ �� ����!
 * �ֳ�? Ŭ���� ��� ���忡���� �ν��Ͻ� ����� ���� ���θ� ������ �� ����.
 * 
 * �߰���, static �׽�Ƽ�� Ŭ������ �ܺ� Ŭ������ �޼ҵ忡�� ������ �� ����.
 */

//( ����ƽ �׽�Ƽ��Ŭ���� ) 
class Outer{
	
	static int num = 10;
	
	static class INum{
		void showNum() {
			System.out.println(num);
		}
	}
}

// ���Ŭ���� Bean�� ������ �ܺ� Ŭ���� Coffee!
class Coffee{
	
	void getCoffee() {
		new Bean().thisIs();
	}
	
	private class Bean{
		void thisIs() {
			System.out.println("�ٶ��� �� Coffee ����");
		}
	}
}
// ���� Ŭ����
class Bag{
//	Pencil p = new Pencil(); ���⼭�� Pencil ��
	void getPencil() {
		class Pencil{
			public String toString() {
				return "����";
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
