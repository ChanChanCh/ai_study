package day15;


class Woman{
	String name;
	
	void showName() {
		System.out.print("�� �̸��� " + name);
	}
	
}

class BusinessWoman extends Woman{
		String company;
}

public class inheritance01 {
	public static void main(String[] args) {
		
		BusinessWoman bw = new BusinessWoman();
		bw.name = "������";
		bw.company = "�Ｚ����";
		bw.showName();
	}
}










