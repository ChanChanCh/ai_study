package test;

class Cnt{	
	void shot(int money){
		System.out.printf("기본요금은 %d원 입니다 \n",money);
	}
}

class Bus extends Cnt {

	Bus(int money){
		super.shot(money);
		System.out.printf("버스요금은 %d원 입니다 \n",money);
	}
}

class Texi extends Cnt{	
	Texi(int money){
		super.shot(money);
		System.out.printf("택시 기본요금은 %d원 입니다 \n",money);	
	}
}



public class Car {

	public static void main(String[] args) {
		int won = 0;
		
		Bus bs = new Bus(500);
		
		
		
		
	}

}
