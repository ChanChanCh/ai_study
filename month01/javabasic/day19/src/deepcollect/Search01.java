package deepcollect;

import java.util.*;

// 문자열 길이 순으로 정렬하도록?
class StrCmp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return o1.length() - o2.length();
	}	
}

public class Search01 {

	public static void main(String[] args) {
//String 에는 기본적으로 비교방법이 정의되어있다 (사전순)
		List<String> sList = new ArrayList<>();
		sList.add("Bananaa");
		sList.add("Carrot");
		sList.add("Apple");
		
	
		Collections.sort(sList, new StrCmp()); 
		
		// 정렬이 되어 있어야만 정상적이진탐색 가능!
		
		int idx = Collections.binarySearch(sList, "Bananaa", new StrCmp());
		
		System.out.println(idx);

	}

}
