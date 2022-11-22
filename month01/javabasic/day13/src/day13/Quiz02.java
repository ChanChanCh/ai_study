package day13;
/*
 * 인수로 정수를 하나 전달받아서 2의 n승을 계산 및 반환하는 메소드를
 * 정의하자. 재귀 형태로 정의하고, 이를 main메소드에서 호출해 보자
 * 
 */
public class Quiz02 {

	public static void main(String[] args) {
		
			System.out.println(factorial(5));
	}
	public static int factorial(int n) {
			if(n==0) {
				return 1;
			}
			return 2 * factorial(n-1);
	}
	
}

