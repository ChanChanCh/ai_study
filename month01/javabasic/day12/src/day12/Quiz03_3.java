package day12;

public class Quiz03_3 {

	public static void main(String[] args) {
	
		for(int dan =2; dan <9; dan += 2) {
			for(int mul = 1; mul <= dan; mul++) {
				int result = dan * mul;
				System.out.println(dan+"X"+mul+"="+result);
			}
		}
		
	}
}
