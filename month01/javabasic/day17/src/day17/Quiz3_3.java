package day17;
import java.util.*;


public class Quiz3_3 {

	public static void main(String[] args) {

		Random rn = new Random(System.currentTimeMillis());
		int correctNumber = rn.nextInt(50) + 1 ;
		Scanner sc = new Scanner(System.in);
		int chance = 0;
		
		while(true) {
			System.out.print("·£´ý ¼ýÀÚ ÃßÃøÇØ ºÁ :");
			int guess = sc.nextInt();
			
			if(correctNumber == guess) {
				System.out.println("ºù°í");
				break;
			}else if(correctNumber > guess){
				System.out.println("¾÷");
			}else {
				System.out.println("´Ù¿î");
			}
			chance++;	
			if(chance == 10) {
				System.out.println("¾Æ¿ô");
				System.out.println("´äÀº : " + correctNumber);
				break;
			}
		}
	}
}
