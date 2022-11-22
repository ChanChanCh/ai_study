package day17;

import java.util.*;

class DNum{
	double num;
	DNum(double num){ this.num = num; }
	
	
	@Override
	public boolean equals(Object obj) {

		if(this.num == ((DNum)obj).num) {
			return true;
		}else {
			return false;		
		}
	}
}


public class Array02 {

	public static void main(String[] args) {

		int[] a = {1,2,3};
		int[] b = {1,2,3};
		
		System.out.println(Arrays.equals(a,b));
		
		DNum[] da = new DNum[3];
		DNum[] db = new DNum[3];

		da[1] = new DNum(1.1);
		da[2] = new DNum(2.1);
		da[3] = new DNum(3.1);
		db[1] = new DNum(1.1);
		db[2] = new DNum(2.1);
		db[3] = new DNum(3.1);
		System.out.println(Arrays.equals(da, db));

	}
}
