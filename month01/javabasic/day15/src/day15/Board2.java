package day15;


import java.util.Arrays;

public class Board2 {


	public static void main(String[] args) {
		
		int[] arr = new int[3];
		Arrays.fill(arr, 3); // 0 �̾ƴ� 3���� �ʱ�ȭ 
		Arrays.fill(arr, 0,2,7);//( 0~2���� 7�� �ʱ�ȭ)
		
		
		double[] darr = {1,2,3,4};
		
		// darr�� ���̸�ŭ for���� �ݺ��ϰ� darr�� ���� d�� ���ʴ�� �־��ش�
		for(double d : darr) {
			System.out.println(d);
		}
		
		
		
		
		int[] ref = makeArray();
		String[] ref2 = makeStrArray();
		System.out.println(ref.length); // 5
		showArray(ref);
		System.out.println();	
		showStr(ref2);
		
	}

	public static void showArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d", arr[i]);
		}
	}

	public static int[] makeArray() {
		int[] ref = new int[5];
		return ref;
	}
	
	public static String[] makeStrArray() {
		String[] ref2 = new String[5];
		return ref2;
	}
	
	public static void showStr(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%d", arr[i]);
		}
	}	
}
