package optional;

import java.util.*; // Optional도 여기에 있다.



public class Optional01 {
	// Optional은 래퍼클래스와 그 성격이 유사하다(객체를 담는다!)

	Optional<String> os1 = Optional.of(new String("Friday")); // null 시 예외
	Optional<String> os2 = Optional.ofNullable(new String("Sunday")); 
	
		if(os1.isPresent()) 
			os1.get();

		//컨슈머는 무언가 하나 받아서 반환은 안하고 처리만 한다
		os1.ifPresent(s -> System.out.println(s) );
		os2.ifPresent(System.out::println );
	
	}
}