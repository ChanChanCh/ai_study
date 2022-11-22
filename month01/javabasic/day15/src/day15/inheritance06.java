package day15;

class Cake{
	int size;
	Cake(int s){
		this.size = s;
	}
}

class MilkCake extends Cake{
	
	int size;
	MilkCake(int s1, int s2){
		super(s1);
		this.size = s2;
	}
}

public class inheritance06 {
	public static void main(String[] args) {
		MilkCake c1 = new MilkCake(5,7);
		Cake c2 = new MilkCake(5,7);
		
		System.out.println(c1.size);
		System.out.println(c2.size);
	
	}
}










