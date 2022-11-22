package day16;

//�����ڷ��� Cat
class Cat{
	String name;
	// ����Ʈ ������ ����
	Cat(){}	
	
	
	// �����ڿ����� �����ε� (�Ը��� ���� ��ȯ�̳� �μ��� ����)
	Cat(String name){
		this.name = name;
	}
	void Punch() {
		System.out.println("�ھ��� �ɳ� ��ġ!!");
	}
}

//��� : ���� Ŭ������ ������ �ִ� ���� �����޾� ���ο� Ŭ������ �����Ѵ�.
// is - a ���� : ��ӹ��� �ڽ� Ŭ������ �θ� Ŭ������ ���ԵǾ���Ѵ�.
// ex) Cat�� ��ӹ޾� Tiger�� ����� --> ȣ���̴� ����̰��̱⶧���� ������谡 �¾ƶ�������

class Tiger extends Cat{
	
	Tiger(){
		super();// �θ� Ŭ������ �����ڸ� ȣ���Ѵ�!
	}
	void Punch() {
		System.out.println("ȣ���� ��ġ!!");
	}
}

public class Review {

	
	public static void main(String[] args) {
			// new ������ ȣ��
	Cat c = new Cat("�����ھ���");
	Tiger t = new Tiger();
	
	// �θ� Ÿ���� ���� ������ �ڽ� �ν��Ͻ� ���� ����
	// ��, �ڽĿ��� �߰����� �ڿ����� ��� �Ұ�! (Tiger�� punch�� ����Ҽ� ����)
	// �޼ҵ� �������̵� : �θ�Ŭ�����κ��� ���������͵��� ������ (�̸��� ���� �޼���)
	// �������̵��� punch�� ���������� ���� ����� �޶��� ������ ����ϰԵȵ��
	
	// ������ �Ʒ������� �޼ҵ� �������̵��� �ϸ�,
	// ������ �ν��Ͻ� Ÿ���� �޼ҵ带 ȣ�� �� �� �ִ�.
	Cat a = new Tiger();
	a.Punch();
	t.Punch();
	c.Punch();
	
	// instanceof : ���� ������, �Ǵ� ���� ��������
	System.out.println(a instanceof Tiger);
	
	
	
	}
}
