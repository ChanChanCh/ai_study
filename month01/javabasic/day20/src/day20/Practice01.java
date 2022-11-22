package day20;
import java.util.*;


//람다로 표현하기전 길이정렬하려면 이렇게 구현했어야 한다
/*
 * 1. 새로운 클래스를 만들어 Comparator implements
 * 2. compare 구현문 만들어주기
 * 3. 길이정렬해야하는 곳에 StrCmp 를 new 하여 대입
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

//		람다로 필요없는문장지우고 간단하게 표현
		Collections.sort(list, 
				(String o1, String o2) -> {
				return o1.length() - o2.length();
			}
		);	
		for(String s : list) { System.out.println(s); }
	}
}
