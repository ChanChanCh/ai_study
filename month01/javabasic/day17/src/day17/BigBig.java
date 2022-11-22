package day17;
import java.math.BigInteger;


public class BigBig {

	public static void main(String[] args) {

		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		BigInteger num1 = new BigInteger("9223372036854775807021321");
		BigInteger num2 = new BigInteger("9223372036854775807021321");
		
		BigInteger result1 = num1.add(num2);
		BigInteger result2 = num1.multiply(num2);
	
		System.out.println(result1);
		System.out.println(result2);
//		int result3 = result2.intValueExact();
//		System.out.println(result3);
//		
		
		
	}
}
