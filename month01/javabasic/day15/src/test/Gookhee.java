package test;


class Cat{
	// static �� ����� �����ʴµ� �ٸ� �޸𸮿� �ö��ִ°� �����ϴ°��̴�.
	// protected : ���� ��Ű�� �� + ��� ���� ���� ��� (���� ������)
	protected static String character = "�Ϳ���";
}
//���� Ŭ������ Cat�� �ڽ�Ŭ�����̴� 
public class Gookhee extends Cat{
	
	void introduce() {
		System.out.println(character);
	}
	
}