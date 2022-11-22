package day14;

import animal.Cat;
import animal.Dog; 
//패키지가 다르기때문에 디폴트 상태인 Dog는 가져올 수 없다
public class Board {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		c.meow();
		//d.bark();		
		c.makeDog();
		
		

	}

}
