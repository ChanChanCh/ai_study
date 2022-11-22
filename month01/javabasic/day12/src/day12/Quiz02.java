package day12;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 0;
		int cnt = 0;
		
		while(cnt < 150) {
			
			for(int i = 1; i <= 150; i++) {
				
				num +=i;
				cnt++;
				System.out.println(num);
			}
				
			System.out.println("n um값 :"+num);
		}
		
	}

	
	
	
}
