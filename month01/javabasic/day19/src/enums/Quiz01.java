package enums;

import java.util.LinkedList;
import java.util.List;

/*
 * �������ڸ� Ȱ���ؼ� ���� ���ϴ� ���� 10���� ������ ���ϴ�
 * �޼ҵ带 ����� ����. �׷� ���� main �޼ҵ忡�� �̸� ������ �� ����!
 * 
 */

public class Quiz01 {

	public static void main(String[] args) {
		
		showTotal(1,2,3,4,5,6,7,8,9,10);
		numCnt(1,2,3,4,5,6,7,8,9,10);
	}
		
		static void showTotal(int... numbers) {
			int total =0;
			for(int number : numbers) {
				total += number;
			}
			System.out.printf("������ %d �Դϴ�! \n", total);
		}
	
		

		
		static void numCnt(int... num) {
			int total2 = 0;
			int numb = 0;
			List<Integer> list = new LinkedList<>();
			List<Integer> list2 = new LinkedList<>();
			for(int sosu : num) {
					
				if(sosu % 3 == 0) {
					list.add(sosu);
					
				}
				
			}
			System.out.print(list);
		}
		
		
	}


