package day17;
import java.util.*;


public class Random01 {

	public static void main(String[] args) {
		// seed ����� ���� �ν��Ͻ� : ������ ���Ͽ� ���� ���� ����! (��¥ ����)
		// �׷��ٸ�, seed ����ε� �������� ������ �� ������?
		//System.currentTimeMillis()�� ���尡 ���� ���� �⺻ ���̱⵵ �ϴ�
		Random rn = new Random(System.currentTimeMillis());
		
		for(int i =0; i < 5; i++) {
			int num = rn.nextInt(45)+1;
			System.out.println(num);
		}	
	}
}
