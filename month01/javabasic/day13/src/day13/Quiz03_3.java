package day13;

class Triangle {
	double bottom;
	double height;
	
	Triangle(double bt, double hg){
		bottom = bt;
		height = hg;
	}
	// Triangle값을 변경하지않고 사용이 가능해짐
	void setDistance(double bt, double hg) {
		bottom = bt;
		height = hg;
	}
	
	double getArea() {
		return bottom * height /2;
	}
	
}

public class Quiz03_3 {

	public static void main(String[] args) {
		Triangle t = new Triangle(5, 10);
		System.out.println(t.getArea());
		t.setDistance(3, 10);
		System.out.println(t.getArea());
	}
}
