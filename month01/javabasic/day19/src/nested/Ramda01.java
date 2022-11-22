package nested;



interface Bike{
	public void drive(int dist);
}

public class Ramda01 {

	public static void main(String[] args) {
		
		Bike b = (dist) -> {System.out.println(dist + "m gogo");
				
	};
	b.drive(100);
}
}