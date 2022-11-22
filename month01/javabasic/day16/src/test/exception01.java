package test;

import java.util.Scanner;

public class exception01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	
		try {
			int a = sc.nextInt();
			System.out.println(4 / a);
		}catch(ArithmeticException e) {
			System.out.println("예외처리 완~");
		}	
	}
}
