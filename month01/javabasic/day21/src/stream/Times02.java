package stream;

import java.time.*;
import java.util.*;

public class Times02 {

	public static void main(String[] args) {

		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		LocalTime end = LocalTime.of(18, 0, 0);
		System.out.println(end);
		
		// ���ݽð����� 6�� ���� �����ð�
		Duration term = Duration.between(now, end);
		System.out.println("�����ð�"+term.getSeconds());
		
		
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime QoQofh = today.plusDays(4);
		System.out.println(QoQofh);
		
		//���ó�¥�κ��� �����ε��� ������ ���
		Period prd = Period.between(today.toLocalDate(), QoQofh.toLocalDate());
		System.out.println(prd);	
	}
}
