package day17;

import java.util.StringTokenizer;


public class Tokenizer {

	public static void main(String[] args) {

		StringTokenizer st1 = new StringTokenizer("PM:14:48",":");
		
		// ���� Ŀ���κ��� �о�帱 ��ū�� �ϳ��̻� �ִ°�?
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
