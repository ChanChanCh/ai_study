package ththth;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution {

	public static void main(String[] args) {

		int answer = 0;
		
		String st = "aAb1B2cC34oOp" ;
		String k = st.replaceAll( "[a-zA-Z]" , "");
		System.out.print(k);
		
		System.out.println();
	
//		int number = Integer.parseInt(k);
		
		int arrNum = Stream.of(String.valueOf(k).split("")).mapToInt(Integer::parseInt).sum();
		
		
//		for(int a : arrNum) {
//			answer += a;
//		}
//		
//		System.out.print(Arrays.toString(arrNum));
		System.out.print(arrNum);
		
	}
}