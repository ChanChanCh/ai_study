package test;

class Cnt{	
	void shot(int money){
		System.out.printf("�⺻����� %d�� �Դϴ� \n",money);
	}
}

class Bus extends Cnt {

	Bus(int money){
		super.shot(money);
		System.out.printf("��������� %d�� �Դϴ� \n",money);
	}
}

class Texi extends Cnt{	
	Texi(int money){
		super.shot(money);
		System.out.printf("�ý� �⺻����� %d�� �Դϴ� \n",money);	
	}
}



public class Car {

	public static void main(String[] args) {
		int won = 0;
		
		Bus bs = new Bus(500);
		
		
		
		
	}

}
