package stream;

import java.util.*;
import java.time.*;


public class Time01 {

	public static void main(String[] args) {

		Instant start = Instant.now();
		long sec1 = start.getEpochSecond();
		
		System.out.println("시간 간격을 만들기 위한 출력문");
		System.out.println("시간 간격을 만들기 위한 출력문");
		System.out.println("시간 간격을 만들기 위한 출력문");
		

		Instant end = Instant.now();
		long sec2 = end.getEpochSecond();
		
		System.out.println(sec2 - sec1);
		
		//초 단위 말고 밀리초 단위로 차를 구하자
		Duration dration = Duration.between(start, end);
		System.out.println(dration.toMillis());
		
		//시간 말고 날짜 정보!
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate notToday = LocalDate.of(today.getYear(), 
				today.getMonth(), today.getDayOfMonth());
		
		System.out.println(notToday);
		
		//날짜 별 간격
		Period prd = Period.between(today, notToday);
		System.out.println(prd.getMonths() + "월" + prd.getDays()+"일");
	}


}
