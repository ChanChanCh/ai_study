package day14;


class Number{
	// ��ü�� �����Ǳ� ������, �̸� �޸𸮿� �÷���!
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
