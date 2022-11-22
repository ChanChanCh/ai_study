package day13;
/*
 * 밑변과 높이 정보를 저장할 수 있는 클래스 Triangle 정의하자
 * 밑변과 높이 정보를 전달받을 수 있는 생성자와
 * 밑변과 높이 정보를 변경할 수 있는 메소드와
 * 삼각형의 넓이를 계산해서 반환하는 메소드를 함께 정의하자
 * 클래스 완성 후에는 main 메소드에서 객체 생성 및 사용해보자
 */

class Tri {
	int low =0;
	int high = 0;
	int n = 0;		
	Tri(int l, int h){
		low = l;
		high = h;	
		n = l * h / 2 ;
	}
	void count() {
		System.out.println("삼각형의 넓이는 : "+ n );
	}
}
public class Quiz03 {

	public static void main(String[] args) {
		
		Tri tr = new Tri(40,50);
		tr.count();
	}
}
