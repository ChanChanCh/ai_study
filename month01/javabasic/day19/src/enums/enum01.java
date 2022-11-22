package enums;



// 상수는 주로 대문자로 표기하며, 단어 사이를 언더바로 구분한다.
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
		
		if(c_name.equals("애플")) {c = Company.APPLE;}
		else if(c_name.equals("삼성")) {c = Company.SAMSUNG;}
		else {c = Company.ETC;}
	}

	@Override
	public String toString() {
		
		return ("제조사는 "+ c + "입니다"); 
	}		
}

public class enum01 {

	public static void main(String[] args) {
			
		Phone myPhone = new Phone("애플");
		
		//제조사는 oo입니다
		System.out.println(myPhone);
	}
}
