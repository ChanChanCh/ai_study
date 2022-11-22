package enums;

import java.util.LinkedList;
import java.util.List;

/*
 * 가변인자를 활용해서 내가 원하는 숫자 10개의 총합을 구하는
 * 메소드를 만들어 보자. 그런 다음 main 메소드에서 이를 사용까지 해 보자!
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
			System.out.printf("총합은 %d 입니다! \n", total);
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


