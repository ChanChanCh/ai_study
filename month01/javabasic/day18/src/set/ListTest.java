package set;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {

		List<String> ls = new LinkedList<>();
		
		ls.add("1루수");
		ls.add("2루수");
		ls.add("3루수");
		ls.add("홈");
		ls.add("1번투수");
		ls.add("2번투수");
		ls.add("예비투수1");
		ls.add("예비투수2");

		Iterator<String> itrP = ls.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next()+ "\t");
//		}
		
		itrP = ls.iterator();
		
		String str;
		while(itrP.hasNext()) {
				str = itrP.next();	
			if(str.equals("예비투수1")) {
				itrP.remove();
			}
		}
		
		itrP = ls.iterator();
		
		while(itrP.hasNext()) {
			System.out.println(itrP.next()+ "\t");
		}
		
		

	}

}
