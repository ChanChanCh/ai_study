package animal;

public class Cat {
	
	public void meow() {
		System.out.println("야~옹");
	}
	// 디폴트 상태일때 같은패키지에서는 사용이 가능한 걸 볼 수 있다.
	public void makeDog() {
		Dog dog = new Dog();
		
		dog.bark();
		dog.DogDog();
	}
}


