package pack01;
// Ư�� ��Ű������ Ư�� Ŭ������ �����´ٴ� ����
// �Ʒ������� ���� ��Ű�� ������ �����ϰ� Ŭ������ ����� �� �ְ� �ȴ�.
// ��, �̸��� ���� Ŭ������ �ִ� ��쿡�� ����ϴ� �� ������ �ִ�.
//
//
import pack02.Phone;
import pack02.Cafe;
//import pack03.Cafe; �̸��� ���� Ŭ������ ������ �Ұ����ϴ� 

public class Main {

	public static void main(String[] args) {
		// visible = ���ü� --> ���ٱ����� ���� 
		// �ذ��� --> �ش���Ű������ public���� �ٲ��ָ�� (���������� ����!)
		pack02.Cafe c1 = new pack02.Cafe("��Ÿ ��~~��");
		pack03.Cafe c2 = new pack03.Cafe("Ŀ�ǰ� ��~ ��");
		
		//pack02.Phone p = new pack02.Phone();
		// import�� ���� �� �ּ�ó�� ��Ű������ �������� �ʾƵ� �����ϰ� ������ ��������
		Phone p = new Phone();
		c1.weAre();
		c2.greeting();
	}
}
