package day17;
/*
 * �ڹٿ� �����ϴ� ��� Ŭ������ ���ܾ��� Object Ŭ������ �ڼ��̴�
 * 
 */

class INum{
	int num;
	INum(int num){this.num = num; }
	
	//obj : INum �ν��Ͻ��� �����ϴ� Object�� ���� ����
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
