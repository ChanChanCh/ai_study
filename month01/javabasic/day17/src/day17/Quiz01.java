package day17;


/*
 * x,y 좌표를 나타내는 Point 인스턴스 간의 좌표값 비교를 위해
 * equals 메소드를 오버라이딩 해보고, main에서 직접 실행 결과까지 확인해보자!
 */



class Point{

	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
//	@Override
//	public boolean equals(Object obj) {
//		
//		Point compare = (Point)obj;
//		
//		
//		if(this.x == compare.x && this.y == compare.y) {
//				return true;
//			}else {
//				return false;
//		}		
//	
//	}	
//	
	  	@Override
		public boolean equals(Object obj) {

			if(this.x == ((Point)obj).x) {
				if(this.y == ((Point)obj).y) {	
					return true;
				}else {
					return false;
			}
				}else {
					return false;
			}	
		}	
}




public class Quiz01 {
	public static void main(String[] args) {

		
		Point pt = new Point(10,10);
		Point pt2 = new Point(10,5);
		Point pt3 = new Point(10,10);

		System.out.println(pt.equals(pt2));
		System.out.println(pt.equals(pt3));
	}

}
