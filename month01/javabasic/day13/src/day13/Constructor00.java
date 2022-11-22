package day13;

class Cat{
	String name;
	String pattern;
	Cat(String n, String p){
		name = n;
		pattern = p;
	} // 이것을 정의하지 않아도, 자바에서는 기능이 없는 디폴트 생성자를 추가해준다
	
	void introduce() {
		System.out.println("내 이름은 : "+ name);
		System.out.println("내 무늬는 : "+ pattern);
	}
	
}
public class Constructor00 {
	public static void main(String[] args) {
		Cat c1 =  new Cat("국희", "고등어");
		c1.introduce();
	}
}
