package day17;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		int[] org = {5,4,3,2,1};
		int[] cpy = new int[5];
		int[] cpy2 = new int[5];
		int[] cpy3 = new int[5];
		
		cpy = Arrays.copyOf(org, 2);
		cpy = Arrays.copyOfRange(org, 0,3);
		
		// org 의 0번 부터 cpy3의 0에다가 5개를 주겠다
		System.arraycopy(org, 0, cpy3, 0, 5);
		
		for(int value : cpy) {
			System.out.println(value);
		}
		for(int value2 : cpy2) {
			System.out.println(value2);
		}
		for(int value3 : cpy3) {
			System.out.println(value3);
		}
		
		
		

	}
}
