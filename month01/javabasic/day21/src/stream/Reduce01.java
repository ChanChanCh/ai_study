package stream;

import java.util.*;
import java.util.function.*; // �Լ��� �������̽� ������ ����Ʈ�ؾ���

public class Reduce01 {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("oh","good","bad","happy");
		// 1. ��Ʈ���� ��� ���� ���� ���� ��ü�� ����
		// 2. ��Ʈ���� �� �տ� �߰��� �� �ϳ��� ��� ����
		String result = lst.stream().reduce("very nice", (s1,s2) -> {
			if(s1.length() > s2.length()) {return s1;}
			else { return s2;}
		});
		
		System.out.println(result);
	}
}
