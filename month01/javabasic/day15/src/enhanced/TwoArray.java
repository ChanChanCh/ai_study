package enhanced;

public class TwoArray {

	public static void main(String[] args) {

		int[][] ref = new int[2][3];
		int num = 1;
		
		for(int i =0; i < ref.length; i++) {
			for(int j = 0; j < ref[i].length; j++) {
				ref[i][j] = num++;
			}
		}
		for(int i =0; i < ref.length; i++) {
			for(int j = 0; j < ref[i].length; j++) {
				System.out.println(ref[i][j]);
		
	}

		}
	}
}
