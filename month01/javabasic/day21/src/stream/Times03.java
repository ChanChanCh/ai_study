package stream;

import java.time.*;

public class Times03 {

	public static void main(String[] args) {

//		ZoneId.getAvailableZoneIds()
//		.stream().filter(z -> z.startsWith("Asia")).sorted()
//		.forEach(z -> System.out.println(z));
		
		ZonedDateTime here = ZonedDateTime.now();
		ZonedDateTime Vladivostok = ZonedDateTime.of(
				here.toLocalDateTime(), ZoneId.of("Asia/Vladivostok"));
		
		// Period �� ��¥ ���, Duration�� �ð� ������� ��

		Duration diff = Duration.between(here, Vladivostok);
		System.out.println(diff);
		
		
	}

}
