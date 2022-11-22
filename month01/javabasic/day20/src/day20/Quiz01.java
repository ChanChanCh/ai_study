package day20;

/*
 * 
 */


@FunctionalInterface
interface Calculate<T>{
	T cal(T a, T b);
}


public class Quiz01 {

	public static <T> void calAndShow(Calculate<T> op, T n1, T n2) {
		T r = op.cal(n1, n2);
		System.out.println(r);
	}
	
	public static void main(String[] args) {
		// �Ʒ� �޼ҵ带 ���� ������� ȣ���ؼ� 5 + 8 �� ��� �� ����غ���!
		// calAndShow(???)
		
		//calAndShow<Integer> ca = new calAndShow<>(()->{},1,2);
		
		Calculate<Integer> c = (num1, num2 ) -> num1 + num2;
		
//		Quiz01.<Integer>calAndShow((n1, n2) -> n1 +n2, 5, 8);
		
		calAndShow(c,5,8);
	}
}
