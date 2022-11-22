package test;


class TrickException extends Exception{
	
	TrickException(){
		super("문제는 없음 일부러 에러발생시켜봄");
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
			System.out.println("예외 전가");
		}
	}
}
