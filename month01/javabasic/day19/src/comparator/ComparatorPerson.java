package comparator;

import java.util.TreeSet;
import java.util.Iterator;
import java.util.Comparator;


class Person implements Comparable<Person> {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    // 출력형식 
    public String toString() { return name + " : " + age; }

    @Override
    // compareTo() 함수는 두개의 값을 비교하여 int 값으로 반환해주는 함수이다
    public int compareTo(Person p) {
        return this.age - p.age;
    }
}

// 비교 기준 제시
class PersonComparator implements Comparator<Person> {
    public int compare(Person p1, Person p2) {
        return p2.age - p1.age; 
    }
}



class ComparatorPerson {
    public static void main(String[] args) {
        TreeSet<Person> tree = new TreeSet<>(new PersonComparator());
        tree.add(new Person("YOON", 37));
        tree.add(new Person("HONG", 53));
        tree.add(new Person("PARK", 22));
	
        for(Person p : tree)
            System.out.println(p);
    }
}