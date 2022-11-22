package stream;

import java.util.*;
import java.util.function.*; // 함수형 인터페이스 때문에 임포트해야함

public class Reduce01 {

	public static void main(String[] args) {

		List<String> lst = Arrays.asList("oh","good","bad","happy");
		// 1. 스트림이 비어 있을 때의 최종 대체제 역할
		// 2. 스트림의 맨 앞에 추가된 또 하나의 멤버 역할
		String result = lst.stream().reduce("very nice", (s1,s2) -> {
			if(s1.length() > s2.length()) {return s1;}
			else { return s2;}
		});
		
		System.out.println(result);
	}
}
