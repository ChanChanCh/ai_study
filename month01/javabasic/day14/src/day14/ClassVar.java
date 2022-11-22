package day14;


class Number{
	// 객체가 생성되기 전부터, 미리 메모리에 올려놔!
	static int num = 0;

}


public class ClassVar {

	public static void main(String[] args) {
		Number a = new Number();
		a.num = 10;
		Number b = new Number();
		System.out.println(b.num);
		

		System.out.println(Number.num);

	}

}
