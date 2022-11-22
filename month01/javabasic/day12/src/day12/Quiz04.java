package day12;

public class Quiz04 {

	public static void main(String[] args) {

		int n = 0;
		int num = 0;
		int cnt = 0;
		
		while(cnt < 1000) {
			
			if(cnt % 2 !=0) {
				num += cnt;
				n =num;
			}	
		}
		System.out.print("num = "+ num+ "n = " + n);				
	}
}
