package day15;

import java.util.Scanner;
/*
 * 
 * ������ ���ڿ��� ���� �Է��� ���ڿ��� ������ ���غ���.
 * �� ��� ������ '����'���, �ٸ��� '�޶�' ��� �������. 
 */

class Ms{
	String m;
	String s;
	
	Ms(String m,String s){
		this.m = m;
		this.s = s;
		if(s.equals(m)) {
			System.out.print("����");
		}else {
			System.out.print("�޶�");
		}
		
		
	}
}


public class Quiz01 {

	public static void main(String[] args) {
		String word = "��Ÿ����"; 
		
		Scanner sc = new Scanner((System.in));
		sc.nextLine();
		
	//	Ms ms = new Ms(sc,word);
	/*	
		if(word.equals(sc)) {
			System.out.print("����");
		}else {
			System.out.print("�޶�");
		}

		
		*/

		
		

	}

}
