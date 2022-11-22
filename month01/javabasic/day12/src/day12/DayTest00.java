package day12;

public class DayTest00 {

	public static void main(String[] args) {
		

		// 삼항 연산자(연산식) : 주어진 조건에 따른 값 반환
		// 조건 ? 항1 : 항2 ;
		
		int age = 18;
		
		String result = age <= 20 ? "미성년자" : "성인" ;
		
		System.out.println(" 자료형 변수 = 조건 ? 항1 : 항2 ;");
		System.out.println(result);
	}

}
