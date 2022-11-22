package day17;
import java.util.*;




public class Quiz3 {

	public static void main(String[] args) {

		Random rn = new Random(System.currentTimeMillis());
		int correctNumber = rn.nextInt(50) + 1 ;
		int count = 0;
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(correctNumber);
		System.out.println(num == correctNumber);
			
		while(num == correctNumber) {

			
			if(num != correctNumber) {		
				count++;
		
			}else {
		}

			if(count == 10) {
				break;
			}
			
			
		}

	}

}
