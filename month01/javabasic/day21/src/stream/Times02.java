package stream;

import java.time.*;
import java.util.*;

public class Times02 {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime end = LocalTime.of(18, 0, 0);
		System.out.println(end);
		
		// 지금시간부터 6시 까지 남은시간
		Duration term = Duration.between(now, end);
		System.out.println("남은시간"+term.getSeconds());
		
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime QoQofh = today.plusDays(4);
		System.out.println(QoQofh);
		
		//오늘날짜로부터 빼빼로데이 남은날 계산
		Period prd = Period.between(today.toLocalDate(), QoQofh.toLocalDate());
		System.out.println(prd);	
	}
}
