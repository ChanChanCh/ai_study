package day13;
// 같은 패키지 내에서 동일 클래서 정의는 불가.
// 같은 패키지 내에서 main없는 클래스는 공유된다.

public class DupRe {

	public static void main(String[] args) {
		BankAccount ref1 = new BankAccount();
		BankAccount ref2 = ref1;
		
		ref1.deposit(3000);
		ref1.deposit(2000);
		ref1.deposit(400);
		ref1.deposit(300);
		ref1.checkMyBalance();
		ref2.checkMyBalance();

	}

}
