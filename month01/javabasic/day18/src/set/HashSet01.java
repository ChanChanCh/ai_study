package set;
import java.util.*;

class Student{
	int age;
	Student(int age){ this.age = age;}	
	
	// �ؽ� �˰��� ���� �����(�ؽ��ڵ尪)�� ��ȯ�Ѵ�
	@Override
	public int hashCode() {
		// ���� age���� �ּҰ��� �ٸ��⶧���� �׺κ��� equals�� �ѱ��.
		// HashSet --> �ߺ� ��� �ȵǰ� �������
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
		// new�� ����Ͽ� ���ڴ� ������ ���� �� �ٸ� �ּҸ� ������ ����
		sSet.add(new Student(12));
		sSet.add(new Student(12));
		sSet.add(new Student(15));
		sSet.add(new Student(15));
		
		for(Student s : sSet) {
			System.out.println(s.age);
		}

	}

}
