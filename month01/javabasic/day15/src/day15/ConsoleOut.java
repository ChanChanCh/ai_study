package day15;

class Cup{
	String brand;
	Cup(String brand){this.brand = brand;}
	
	// toString()을 정의해 놓으면 프린트할때 자동으로 문자열로 치환된다
	public String toString() {
		return this.brand + "컵";
	}	
}


public class ConsoleOut {

	public static void main(String[] args) {
		
		Cup c = new Cup("스타벅스");
		System.out.print(c);
		
		System.out.printf("즐거운 %d주차 %s요일", 3,"금");
		double f1 = 0.00014;
		double f2 = 0.0000014;
		// 실수
		System.out.printf("%f %f \n", f1, f2);
		// 지수
		System.out.printf("%e %e \n", f1, f2);
		// 자바의 판단하에 실수나 지수로 표현
		System.out.printf("%g %g \n", f1, f2);

	}
}
