package day14;

import animal.Bear;

class Eagle{
	
	Eagle(){
		System.out.println();
	}
	void skill(int pw){
		System.out.println("날개치기"+pw+"번!!");
	}
	void myAge(int n) {
		System.out.println("내 나이는"+n+"살");
	}
	void myName(String st) {
		System.out.println("내 이름은"+st+"!!");
	}
}

class Person2{
	
	int money;
	int ticket;
	int cnt;
	
	Person2(){

	}
	int Count(int tk){
		this.ticket = tk;
		
		cnt = money - ticket;
		System.out.println(cnt);		
		return cnt;			
	}
		
}

	




public class Zoo {

	public static void main(String[] args) {

		Eagle eg = new Eagle();
		Bear br = new Bear();
		
		br.myAge(10);
		br.myName("지리산 완빤치 불곰");
		eg.myAge(7);
		eg.myName("둔산동 짭새");
		eg.skill(10);
		
		int ZooTicket = 500;
		int safariTicket = 1000;
		int money = 0;
		Person2 ps = new Person2();
		Person2 cs = new Person2();
		Person2 ys = new Person2();
		
		ps.money += 10000;
		ps.money = ps.Count(safariTicket);
		ps.money = ps.Count(safariTicket);
		ps.money = ps.Count(safariTicket);
		ps.money = ps.Count(safariTicket);
		//호출할대마다 +
		ps.money = ps.Count(ZooTicket);
		ps.money = ps.Count(safariTicket);
		ps.money = ps.Count(safariTicket);
		
		


		
		


		
	}

}
