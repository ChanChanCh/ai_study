package stream;

import java.util.*;
import java.time.*;


public class Time01 {

	public static void main(String[] args) {

		Instant start = Instant.now();
		long sec1 = start.getEpochSecond();
		
		System.out.println("�ð� ������ ����� ���� ��¹�");
		System.out.println("�ð� ������ ����� ���� ��¹�");
		System.out.println("�ð� ������ ����� ���� ��¹�");
		

		Instant end = Instant.now();
		long sec2 = end.getEpochSecond();
		
		System.out.println(sec2 - sec1);
		
		//�� ���� ���� �и��� ������ ���� ������
		Duration dration = Duration.between(start, end);
		System.out.println(dration.toMillis());
		
		//�ð� ���� ��¥ ����!
		LocalDate today = LocalDate.now();
		System.out.println(today);
		
		LocalDate notToday = LocalDate.of(today.getYear(), 
				today.getMonth(), today.getDayOfMonth());
		
		System.out.println(notToday);
		
		//��¥ �� ����
		Period prd = Period.between(today, notToday);
		System.out.println(prd.getMonths() + "��" + prd.getDays()+"��");
	}


}
