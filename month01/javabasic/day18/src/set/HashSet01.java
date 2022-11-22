package set;
import java.util.*;

class Student{
	int age;
	Student(int age){ this.age = age;}	
	
	// 해시 알고리즘에 의한 결과값(해시코드값)을 반환한다
	@Override
	public int hashCode() {
		// 같은 age여도 주소값이 다르기때문에 그부분을 equals로 넘긴다.
		// HashSet --> 중복 허용 안되게 만들어줌
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		
		if(this.age == ((Student)obj).age) {
			return true;
		}else {
			return false;
		}
	}
}
public class HashSet01 {

	public static void main(String[] args) {
		Set<Student> sSet = new HashSet<>();
		// new를 사용하여 숫자는 같지만 각자 다 다른 주소를 가지고 있음
		sSet.add(new Student(12));
		sSet.add(new Student(12));
		sSet.add(new Student(15));
		sSet.add(new Student(15));
		
		for(Student s : sSet) {
			System.out.println(s.age);
		}

	}

}
