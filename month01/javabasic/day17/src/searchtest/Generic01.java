package searchtest;

class Apple {public String toString() { return "사과";}}
class Orange {public String toString() { return "오렌지";}}

// 일반적으로 타입 매개변수는 대문자 하나로 표현하는 경우가 많다.
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
		// 제네릭 기반의 타입인수<T>를 완성하는것 
		Box<Apple> aBox = new Box<Apple>();
		Box<Orange> oBox = new Box<Orange>();
		
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		Apple a = aBox.get();
		Orange o = oBox.get();
	}
}
