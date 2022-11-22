package day13;

// 1~ 100 源뚯� �냼�닔援ы븯湲� 

public class Quiz01 {

	public static void main(String[] args) {


		
		for(int i =1; i<=100; i++ ) {
			if (checkIsPrime(i)) {
				System.out.println(i);
			}
		}
		
		System.out.print(checkIsPrime(5));	
	}
	
// �냼�닔援ы븯�뒗 硫붿꽌�뱶 援ы쁽
	public static boolean checkIsPrime(int number) {
		boolean isPrime = false;
	
		for(int i = 2; i <= number; i++) {
			if(number == i) {
				isPrime = true;
				break;
			}
			if(number % i == 0) {
				isPrime = false;
				break;
		}
	}	
		return isPrime;
	}
}
	
	



