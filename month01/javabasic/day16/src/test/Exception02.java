package test;


class TrickException extends Exception{
	
	TrickException(){
		super("������ ���� �Ϻη� �����߻����Ѻ�");
	}
	
	
}



public class Exception02 {
	
	public static void methodB() throws Exception{
		throw new TrickException();
	}
	
	public static void methodA() throws Exception{
		methodB();
	}
	
	public static void main(String[] args) {
		try {
			methodA();
		}catch(Exception e) {
			System.out.println("���� ����");
		}
	}
}
