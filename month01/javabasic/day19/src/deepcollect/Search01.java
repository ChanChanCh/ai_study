package deepcollect;

import java.util.*;

// ���ڿ� ���� ������ �����ϵ���?
class StrCmp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {

		return o1.length() - o2.length();
	}	
}

public class Search01 {

	public static void main(String[] args) {
//String ���� �⺻������ �񱳹���� ���ǵǾ��ִ� (������)
		List<String> sList = new ArrayList<>();
		sList.add("Bananaa");
		sList.add("Carrot");
		sList.add("Apple");
		
	
		Collections.sort(sList, new StrCmp()); 
		
		// ������ �Ǿ� �־�߸� ����������Ž�� ����!
		
		int idx = Collections.binarySearch(sList, "Bananaa", new StrCmp());
		
		System.out.println(idx);

	}

}
