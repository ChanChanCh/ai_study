package day15;

public class Array01 {

	public static void main(String[] args) {

		int [] ref1 = new int[3];
		
		double[] ref2 ;
		ref2 = new double[5];
		
		System.out.println(ref1.length);
		System.out.println(ref2.length);
		
		String[] words = new String[3];
		words[0] = "�Ƹ޸�ī��";
		words[1] = "ī���";
		words[2] = "�ڸ����̵�";
		
		


		for(int i = 0; i < words.length; i++) {
			System.out.printf("%d��° ��Ҵ� : %s \n", i+1, words[i]);
		}
		
		
		
	}

}
