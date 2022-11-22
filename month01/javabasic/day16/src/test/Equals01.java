package test;

class INum{
	int num;
	String str;
	INum(int num){ this.num = num;}
	INum(String str){ this.str = str;}
	@Override
	public boolean equals(Object obj) {
		//((INum)obj).num : 주어진 객체에 대한 명시적 참조형 변환 후 멤버에 접근
		if(this.num == ((INum)obj).num) {
			return true;
		}else {
			return false;
		}
	}	
}



public class Equals01 {
	public static void main(String[] args) {
		INum a = new INum(10);
		INum b = new INum(10);
		System.out.println(a.equals(b));
	}
}
