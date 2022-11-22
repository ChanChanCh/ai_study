package day20;


// �߻� �޼ҵ尡 ��! �ϳ���! �־�� �Լ��� �������̽� �̴�.
@FunctionalInterface
interface MixCoffee{
	void drinkCoffee(int time);
}

@FunctionalInterface
interface Cat{
	//ȣ���ϸ� "�߿�" �̶�� ���ڿ��� ��� �޼ҵ�
	String getMeow();
}



public class Lambda01 {

	public static void main(String[] args) {
		
//		Cat c = ()->{return "�߿�";};
		Cat c = ()-> "�߿�";
		System.out.println(c.getMeow());

		
		// �������� �ϼ������� �����غ���!
		MixCoffee mc = time -> System.out.println(time + "��� ������!");
		
		//���ٴ� �� ��ü�� �ϳ��� �޼ҵ尡 �ƴϱ⶧���� ���� ȣ�����־���Ѵ�.
		mc.drinkCoffee(3);
	}
}
