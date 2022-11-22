package day17;

import java.util.StringTokenizer;


public class Tokenizer {

	public static void main(String[] args) {

		StringTokenizer st1 = new StringTokenizer("PM:14:48",":");
		
		// 현재 커서로부터 읽어드릴 토큰이 하나이상 있는가?
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());
			System.out.println(st1.nextToken());
			System.out.println(st1.nextToken());
		}												
		StringTokenizer st2 = new StringTokenizer("a + b = c", "+= ");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());

		}		
	}
}
