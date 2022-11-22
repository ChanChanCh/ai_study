package animal;

public class Bear {
	
	public String name;
	int age; // default
	private String color;
	
	public void myName(String name) {
		System.out.println("내 이름은 : " + name);
	}	
	public void myAge(int age) {
		System.out.println("내 나이는 :" + age);
	}
	private void myColor(String color) {
		System.out.println("내 색깔은 : "+ color);
	}
	

}
