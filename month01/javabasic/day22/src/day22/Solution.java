package day22;

public class Solution {

	public static void main(String[] args) {


		String st = "aAb1B2cC34oOp" ;
		String k = st.replaceAll( "[a-zA-Z]" , "");
		System.out.print(k);
		
		System.out.println();
	
		int number = Integer.parseInt(k);
		
		System.out.print(number);
		int answer = 0;
		for(int i = 0; i < k.length(); i++) {
			
			answer += number % 10;
			number /= 10;
		}
		System.out.print("���Ѱ� :"+answer);
		
	}
}