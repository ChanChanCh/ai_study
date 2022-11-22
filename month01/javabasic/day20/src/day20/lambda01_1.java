package day20;

@FunctionalInterface
interface Calculator<T>{
	T cal(T n1, T n2);
}



public class lambda01_1 {

	public static void main(String[] args) {


		Calculator<Integer> c = (n1, n2) -> n1 + n2;
		Calculator<Double> c2 = (n1, n2) -> n1 + n2;

		
		System.out.println(c.cal(1,5));
		System.out.println(c2.cal(1.2,1.5));

	}

}
