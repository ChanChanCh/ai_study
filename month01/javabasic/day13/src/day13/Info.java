package day13;

class Square{
	private double bottom;
	private double height;
	Square(double b, double h){
		bottom = b;
		height = h;
	}
	//정보은닉된 자료를 단순히 조회하는 메소드를 가리켜 '세터'라고 한다
	double getBottom() {
		return bottom;
	}
	
	//정보은닉된 자료를 수정하는 메소드를 가리켜 '세터'라고 한다
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
