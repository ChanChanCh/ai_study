package nested;

interface Player{
	void training();
}


//�͸�Ŭ���� ����
public class Nested02 {

	public static void main(String[] args) {

		//interface�� ���ǵ��� �ʾ� new �Ҽ������� �� �ѹ��� �����ؼ� ����Ҷ� ���
		Player son = new Player() {
			public void training() {
				System.out.println("���� ����!");
			}
		};
		Player park = new Player() {
			public void training() {
				System.out.println("��ȭ�� ����!");
			}
		};  //�͸�Ŭ���� ������ �����ݷ� �ʼ�!
		
		park.training();
		son.training();

	}

}
