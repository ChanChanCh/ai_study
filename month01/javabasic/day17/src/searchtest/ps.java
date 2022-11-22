package searchtest;

class Person{
	private String name;
	private int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
}


public class ps {

	public static void main(String[] args) {
		
		Person[] ps = new Person[3];
		
		
		ps[0] = new Person("chan", 31);
		ps[1] = new Person("jun", 27);
		ps[2] = new Person("youn", 19);
		
		

		

	}

}
