package set;

import java.util.*;

public class ListTest {

	public static void main(String[] args) {

		List<String> ls = new LinkedList<>();
		
		ls.add("1���");
		ls.add("2���");
		ls.add("3���");
		ls.add("Ȩ");
		ls.add("1������");
		ls.add("2������");
		ls.add("��������1");
		ls.add("��������2");

		Iterator<String> itrP = ls.iterator();
		
//		while(itr.hasNext()) {
//			System.out.println(itr.next()+ "\t");
//		}
		
		itrP = ls.iterator();
		
		String str;
		while(itrP.hasNext()) {
				str = itrP.next();	
			if(str.equals("��������1")) {
				itrP.remove();
			}
		}
		
		itrP = ls.iterator();
		
		while(itrP.hasNext()) {
			System.out.println(itrP.next()+ "\t");
		}
		
		

	}

}
