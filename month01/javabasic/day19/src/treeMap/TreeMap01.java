package treeMap;
import java.util.*;

class NumberComparator implements Comparator<Integer>{


	@Override
	public int compare(Integer o1, Integer o2) {
		//내림차순으로 바꾸려면 어떻게 해야할까?
		// intValue = int형으로 자료형을 뽑아냄
		return 	o2.intValue()-o1.intValue();
	}
	
}

public class TreeMap01 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> map = new TreeMap(new NumberComparator());
		
		map.put(11, "황희찬");
		map.put(7, "손흥민");
		map.put(18, "황의조");
		
		Set<Integer> ks = map.keySet();
		
		for(Integer n : ks) {
			System.out.println(map.get(n));
		}
	}
}
