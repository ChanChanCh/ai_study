package test;

/*
 * Ŭ������ ������� ����� ���� ���� :
 * �ϴ� �θ� Ŭ������ �ϼ��Ǿ� �־�� �Ѵ�.
 * 
 * �������̽��� �߻� �޼ҵ带 �����ϴ� �θ� Ŭ���� �����̴�.
 * ���� 
 * 1. ���� ������ ���� �� �ִ�.
 * 2. �׷��� �ν��Ͻ��� ������ �� ����. (new ���� �Ұ�)
 * 
 * 
 * 
 */


//����Ʈ �޼ҵ� : �̹� �����ǰ� �ִ� �������̽���
// ���� ���� ����� �߰��ϰ� �ʹٸ� �߻� �޼ҵ� ��� �̰���!!

interface Player{
	void Training();
	default void taleRest() {
		System.out.println("�޽��� ������");
	};

}

interface GoodPlayer extends Player{
	void mentalTraining();
}


class FootPlayer implements Player {
	@Override
	public void Training() {
		System.out.print("���� 10ȸ ����");
	}
}
class BaseballPlayer implements Player{
	@Override
	public void Training() {
		System.out.print("�۱� 10ȸ ����");
	}
}

public class Interface01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
