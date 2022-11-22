package treeMap;
import java.util.*;

class NumberComparator implements Comparator<Integer>{


	@Override
	public int compare(Integer o1, Integer o2) {
		//������������ �ٲٷ��� ��� �ؾ��ұ�?
		// intValue = int������ �ڷ����� �̾Ƴ�
		return 	o2.intValue()-o1.intValue();
	}
	
}

public class TreeMap01 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap(new NumberComparator());
		
		map.put(11, "Ȳ����");
		map.put(7, "�����");
		map.put(18, "Ȳ����");
		
		Set<Integer> ks = map.keySet();
		
		for(Integer n : ks) {
			System.out.println(map.get(n));
		}
	}
}
