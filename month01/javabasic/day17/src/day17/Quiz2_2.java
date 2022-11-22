package day17;

import java.util.*;
/*
 * Random 클래스를 활용해서 원하는 범위 내에서의 난수를 생성하자.
 * 원하는 범위는 int n1;과  int n2를 통해서 정의해 두자!
 * 
 */

public class Quiz2_2 {

	public static void main(String[] args) {
		int n1 = 8;
		int n2 = 19;
		Random rn = new Random(System.currentTimeMillis());
		
		int diff = n2 - n1;
		
		for(int i = 0; i < 50; i++) {
			int result = rn.nextInt(diff + 1)+1;
			System.out.printf("%d부터 %d까지중 난수 : %d\n",n1 ,n2 ,result);
		}
		
	}

}
