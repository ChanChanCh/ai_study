package day17;

import java.util.*;

import search.Person;

// ������ ���� �� ����� �������� �񱳰����� �߻� �޼ҵ带 ��������!

class Person implements Comparable{
	
	// �Ʒ� �޼ҵ尡 0�� ��ȯ�ϸ� ���ٴ� �ǹ�
	// ����� ��ȯ�ϸ� ���� �� ũ�ٴ� �ǹ�
	// ������ ��ȯ�ϸ� ���� �� �۴ٴ� �ǹ�
	
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

	
	











