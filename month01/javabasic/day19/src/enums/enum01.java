package enums;



// ����� �ַ� �빮�ڷ� ǥ���ϸ�, �ܾ� ���̸� ����ٷ� �����Ѵ�.
enum Animal{
	DOG, CAT, HAMSTER, TURTLE;
	
	private Animal() {}
	
	public static void show() {}
	
	
}

class Phone{
	
	enum Company{
		APPLE, SAMSUNG , ETC
	}
	
	Company c;
	
	Phone(String c_name){
		
		if(c_name.equals("����")) {c = Company.APPLE;}
		else if(c_name.equals("�Ｚ")) {c = Company.SAMSUNG;}
		else {c = Company.ETC;}
	}

	@Override
	public String toString() {
		
		return ("������� "+ c + "�Դϴ�"); 
	}		
}

public class enum01 {

	public static void main(String[] args) {
			
		Phone myPhone = new Phone("����");
		
		//������� oo�Դϴ�
		System.out.println(myPhone);
	}
}
