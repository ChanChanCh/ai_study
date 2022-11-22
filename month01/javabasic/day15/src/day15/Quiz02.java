package day15;

public class Quiz02 {
/*
 * 3행 4열짜리 2차원 배열을 만들고,
 * 홀수만으로 가득 채워보자(1, 3, 5, 7, 9...)
 * 
 * 그런다음 전체를 훑어 보면서 3의 배수만 출력하도록 해보자!
 * 
 * 
 * 
 */
	public static void main(String[] args) {

		int[][] ref = new int[3][4];
		int num = 1;
		
		for(int i =0; i < ref.length; i++) {
			for(int j = 0; j < ref[i].length; j++) {
				ref[i][j] = num+=2;
			}

	}
		for(int i =0; i < ref.length; i++) {
			for(int j = 0; j < ref[i].length; j++) {
				
				if(ref[i][j] % 3 == 0) {
				System.out.println(ref[i][j]);
				}
	}
}
}
}
