package day17;

import java.util.*;
/*
 * Random Ŭ������ Ȱ���ؼ� ���ϴ� ���� �������� ������ ��������.
 * ���ϴ� ������ int n1;��  int n2�� ���ؼ� ������ ����!
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
			System.out.printf("%d���� %d������ ���� : %d\n",n1 ,n2 ,result);
		}
		
	}

}
