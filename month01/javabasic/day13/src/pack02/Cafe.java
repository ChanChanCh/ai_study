package pack02;

public class Cafe {

	String brand;
	// public : 다른 패키지에서도 쓸 수 있다!
	public Cafe(String b){
		brand = b;
	}	
	public void weAre() {
			System.out.println(brand + " 커피는 맛있어요!");{		
		}
	}
}
