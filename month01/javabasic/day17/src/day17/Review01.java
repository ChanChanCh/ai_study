package day17;
/*
 * 자바에 존재하는 모든 클래스는 예외없이 Object 클래스의 자손이다
 * 
 */

class INum{
	int num;
	INum(int num){this.num = num; }
	
	//obj : INum 인스턴스를 참조하는 Object형 참조 변수
	@Override
	public boolean equals(Object obj) {
		
		if (this.num == ((INum)obj).num) {
			return true;
		}else {
			return false;
		}
	}
	
}


public class Review01 {
	public static void main(String[] args) {
		INum n1 = new INum(7);
		INum n2 = new INum(7);

		System.out.println(n1.equals(n2));
	}

}
