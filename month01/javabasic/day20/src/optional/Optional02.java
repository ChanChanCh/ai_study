package optional;

import java.util.*;




public class Optional02 {

	public static void main(String[] args) {
		// ��� �ִ� ���·� �ɼų� ���� �����
		Optional<String> os1 = Optional.empty();

		Optional<String> os2 = Optional.of(new String("running"));
		
		Optional<String> result = os1.map(s -> s.toUpperCase());
			System.out.println(result.orElse("Empty"));
		
		result = os2.map(s -> s.toUpperCase());
		System.out.println(result.get());
		
	}

}
