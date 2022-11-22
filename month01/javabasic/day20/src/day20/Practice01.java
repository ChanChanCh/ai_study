package day20;
import java.util.*;


//���ٷ� ǥ���ϱ��� ���������Ϸ��� �̷��� �����߾�� �Ѵ�
/*
 * 1. ���ο� Ŭ������ ����� Comparator implements
 * 2. compare ������ ������ֱ�
 * 3. ���������ؾ��ϴ� ���� StrCmp �� new �Ͽ� ����
 */
class StrCmp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}	
}

public class Practice01 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");

//		���ٷ� �ʿ���¹�������� �����ϰ� ǥ��
		Collections.sort(list, 
				(String o1, String o2) -> {
				return o1.length() - o2.length();
			}
		);	
		for(String s : list) { System.out.println(s); }
	}
}
