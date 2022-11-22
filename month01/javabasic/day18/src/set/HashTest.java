package set;

import java.util.*;

class People{
	int age;
	
	People(int age){
		this.age = age;
	}

	@Override
	public int hashCode() {

		return this.age;
	}

	@Override
	public boolean equals(Object obj) {

		if(this.age == ((People)obj).age) {
			return true;
		}else {
			return false;
		}
	}		
}

public class HashTest {

	public static void main(String[] args) {

		Set<People> pset = new HashSet<>();
		
		pset.add(new People(12));
		pset.add(new People(12));
		pset.add(new People(113));
		pset.add(new People(113));
		pset.add(new People(17));	
		
		for(People p : pset) {
			System.out.println(p.age);
		}
	}
}
