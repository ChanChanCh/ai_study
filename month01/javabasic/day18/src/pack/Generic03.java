package pack;

/*
 * 인스턴스 메소드는 인스턴스 존재 이후의 메소드!
 * 따라서 멤버 변수를 제네릭 기반으로 정하고 메소드 자체는
 * 그냥 만들어서 쓰는 경우가 많다 (편해서)
 * 
 * 클래스 메소드는 독립적으로 기능을 제공할 수 있어야 하기 때문에
 * 클래스 메소드를 제네릭 기반으로 만드는 경우가 더 많다(많아 보인다)
 */

class NormalClass{
	
	public static <T extends Number> T sample(T o) {
		return o;
	}
}




public class Generic03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
