package day15;

public class Quiz02 {
/*
 * 3�� 4��¥�� 2���� �迭�� �����,
 * Ȧ�������� ���� ä������(1, 3, 5, 7, 9...)
 * 
 * �׷����� ��ü�� �Ⱦ� ���鼭 3�� ����� ����ϵ��� �غ���!
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
