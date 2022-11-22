package day15;

public class Array01 {

	public static void main(String[] args) {

		int [] ref1 = new int[3];
		
		double[] ref2 ;
		ref2 = new double[5];
		
		System.out.println(ref1.length);
		System.out.println(ref2.length);
		
		String[] words = new String[3];
		words[0] = "아메리카노";
		words[1] = "카페라떼";
		words[2] = "자몽에이드";
		
		


		for(int i = 0; i < words.length; i++) {
			System.out.printf("%d번째 요소는 : %s \n", i+1, words[i]);
		}
		
		
		
	}

}
