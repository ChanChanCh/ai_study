package day13;

class Square{
	private double bottom;
	private double height;
	Square(double b, double h){
		bottom = b;
		height = h;
	}
	//�������е� �ڷḦ �ܼ��� ��ȸ�ϴ� �޼ҵ带 ������ '����'��� �Ѵ�
	double getBottom() {
		return bottom;
	}
	
	//�������е� �ڷḦ �����ϴ� �޼ҵ带 ������ '����'��� �Ѵ�
	void setBottom(double b) {
		bottom = b;
	}
	
	void setDistance(double b, double h) {
		if(b < 0 || h < 0) {
			bottom = 0;
			height = 0;
			return;
		}
	}	
}

public class Info {

	public static void main(String[] args) {
		
		Square s = new Square(5,5);
		s.setDistance(-5, -5);

	}

}
