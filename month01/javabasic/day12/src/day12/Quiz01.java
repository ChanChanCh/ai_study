package day12;

public class Quiz01 {

	public static void main(String[] args) {
		// 사과는 바구니에 10개씩담을수있고 123개의 사과는 13개의 바구니에 담을 수 있다
		int fruit = 123;
		int fc = 0;
		int numOfBucket = 0;

		if (fruit > 10){
			numOfBucket += fruit / 10;
		}		
		if(fruit % 10 != 0) {
			numOfBucket += 1;		
		}
		
		System.out.println("필요한 바구니 :"+ numOfBucket);
		fc = fruit % 10 > 0 ? 1 : 0;
		System.out.println("10단위가 아닌 나머지를 담을 바구니 갯수 : "+fc);
		
	}
	
}
