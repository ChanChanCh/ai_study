package day15;

class Cup{
	String brand;
	Cup(String brand){this.brand = brand;}
	
	// toString()�� ������ ������ ����Ʈ�Ҷ� �ڵ����� ���ڿ��� ġȯ�ȴ�
	public String toString() {
		return this.brand + "��";
	}	
}


public class ConsoleOut {

	public static void main(String[] args) {
		
		Cup c = new Cup("��Ÿ����");
		System.out.print(c);
		
		System.out.printf("��ſ� %d���� %s����", 3,"��");
		double f1 = 0.00014;
		double f2 = 0.0000014;
		// �Ǽ�
		System.out.printf("%f %f \n", f1, f2);
		// ����
		System.out.printf("%e %e \n", f1, f2);
		// �ڹ��� �Ǵ��Ͽ� �Ǽ��� ������ ǥ��
		System.out.printf("%g %g \n", f1, f2);

	}
}
