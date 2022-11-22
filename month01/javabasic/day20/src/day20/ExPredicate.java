package day20;

import java.util.*;
import java.util.function.*; //함수형 인터페이스들이 있다

public class ExPredicate {
	
	public static int getMax(Predicate<Integer> p, List<Integer> list) {
		int max = 0;
		
		for(int n : list) {
			if(p.test(n)) {
				if(max < n) {
					max = n;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {

		List<Integer> iList = Arrays.asList(1,2,3,4,5,6,7,8,9);
		int m;
		int k;
		
		m = getMax(n-> n % 2 == 1, iList);
		System.out.println("홀수중 최대값 :" + m);
		
		k = getMax(n-> n % 2 == 0, iList);
		System.out.println("짝수중 최대값 :" + k);

	}

}
