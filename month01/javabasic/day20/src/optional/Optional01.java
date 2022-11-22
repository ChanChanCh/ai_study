package optional;

import java.util.*; // Optional�� ���⿡ �ִ�.



public class Optional01 {
	// Optional�� ����Ŭ������ �� ������ �����ϴ�(��ü�� ��´�!)

	Optional<String> os1 = Optional.of(new String("Friday")); // null �� ����
	Optional<String> os2 = Optional.ofNullable(new String("Sunday")); 
	
		if(os1.isPresent()) 
			os1.get();

		//�����Ӵ� ���� �ϳ� �޾Ƽ� ��ȯ�� ���ϰ� ó���� �Ѵ�
		os1.ifPresent(s -> System.out.println(s) );
		os2.ifPresent(System.out::println );
	
	}
}