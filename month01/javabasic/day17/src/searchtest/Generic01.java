package searchtest;

class Apple {public String toString() { return "���";}}
class Orange {public String toString() { return "������";}}

// �Ϲ������� Ÿ�� �Ű������� �빮�� �ϳ��� ǥ���ϴ� ��찡 ����.
class Box<T>{
	private T ob;
	
	void set(T o) {
		this.ob = o;
	}
	
	T get() {
		return this.ob;
	}
}
public class Generic01 {

	public static void main(String[] args) {
		// ���׸� ����� Ÿ���μ�<T>�� �ϼ��ϴ°� 
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a = aBox.get();
		Orange o = oBox.get();
	}
}
