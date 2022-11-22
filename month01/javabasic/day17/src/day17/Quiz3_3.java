package day17;
import java.util.*;


public class Quiz3_3 {

	public static void main(String[] args) {

		Random rn = new Random(System.currentTimeMillis());
		int correctNumber = rn.nextInt(50) + 1 ;
		Scanner sc = new Scanner(System.in);
		int chance = 0;
		
		while(true) {
			System.out.print("���� ���� ������ �� :");
			int guess = sc.nextInt();
			
			if(correctNumber == guess) {
				System.out.println("����");
				break;
			}else if(correctNumber > guess){
				System.out.println("��");
			}else {
				System.out.println("�ٿ�");
			}
			chance++;	
			if(chance == 10) {
				System.out.println("�ƿ�");
				System.out.println("���� : " + correctNumber);
				break;
			}
		}
	}
}
