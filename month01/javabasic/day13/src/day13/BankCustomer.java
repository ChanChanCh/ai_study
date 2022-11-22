package day13;

/*
 * 클래스 : 데이터와 기능의 집합
 * 클래스를 만드는 목적 : 
 * 프로그램의 실행부에서 가져다 쓸 데이터 또는 기능을 정의한다
 * 
 */

class Account{
	int balance = 0; // 인스턴스 변수
	
	//인스턴스 메소드 (규칙 : static을 쓰면 안된다)
	void deposit(int money) {
		balance = money;
	}
	void check() {
		System.out.println("잔액은 :" + balance);
	}
}


//실행부를 담당하는 클래스 BankCustomer
public class BankCustomer {

	public static void main(String[] args) {
			
		// 위에서 만든 Account라는 붕어빵 틀에 반죽을 넣고 붕어빵을 만들자!!
		// 이를 그리켜 '인스턴스 생성'이라 한다.		
		Account a = new Account();
		// Account 에서 만든 메서드를 가져다 쓸 수 있다.
		a.deposit(1000);
		a.check();
	}

}
