package day17;

import java.util.*;

import search.Person;

// 정렬을 위한 비교 방법을 가지려면 비교가능한 추상 메소드를 정의하자!

class Person implements Comparable{
	
	// 아래 메소드가 0을 반환하면 같다는 의미
	// 양수를 반환하면 내가 더 크다는 의미
	// 음수를 반환하면 내가 더 작다는 의미
	
	@Override
	public int compareTo(Object o) {

		if(this.age == ((Person)o).age) {
			return 0;
		}else if(this.age > ((Person)o).age){
			return 1;
		}else {
			return -1;
		}
		
	}
	int age;
	Person(int age){
		this.age = age;
		
		
	}
}

public class Array03 {

	public static void main(String[] args) {
		Person[] p = new Person[3];
		p[0] = new Person(15);
		p[1] = new Person(8);
		p[2] = new Person(28);
	
		Arrays.sort(p);
		
		for(Person e : p) {
			System.out.println(e.age);
		}
	}
}

	
	











