package day17;

import java.util.*;
/*
 * Random Ŭ������ Ȱ���ؼ� ���ϴ� ���� �������� ������ ��������.
 * ���ϴ� ������ int n1;��  int n2�� ���ؼ� ������ ����!
 * 
 */

public class Quiz02 {

	public static void main(String[] args) {
		int n1 = 8;
		int n2 = 19;
		
		Random rd = new Random();
		
		for(int i = 0; i<5; i++ ) {
			int num = rd.nextInt(n1,n2+1);
			System.out.printf("%d���� %d������ ���� : %d\n",n1 ,n2 ,num);
		}
	}

}
