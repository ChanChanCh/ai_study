package day15;

import java.util.Scanner;
/*
 * 
 * 정해진 문자열과 내가 입력한 문자열이 같은지 비교해보자.
 * 비교 결과 같으면 '같다'라고, 다르면 '달라' 라고 출력하자. 
 */

class Ms{
	String m;
	String s;
	
	Ms(String m,String s){
		this.m = m;
		this.s = s;
		if(s.equals(m)) {
			System.out.print("같다");
		}else {
			System.out.print("달라");
		}
		
		
	}
}


public class Quiz01 {

	public static void main(String[] args) {
		String word = "스타벅스"; 
		
		Scanner sc = new Scanner((System.in));
		sc.nextLine();
		
	//	Ms ms = new Ms(sc,word);
	/*	
		if(word.equals(sc)) {
			System.out.print("같다");
		}else {
			System.out.print("달라");
		}

		
		*/

		
		

	}

}
