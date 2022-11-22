package day15;

class Water{
	void drinking() {
		System.out.println("마신다");
	}
}

class HotWater extends Water{
	
	void drinking() {
		System.out.println("호호 불며 조심스럽게 마신다!");
	}
}

public class inheritance04 {
	public static void main(String[] args) {

		HotWater hw = new HotWater();
		hw.drinking();

	
	}
}










