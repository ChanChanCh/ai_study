package day17;


/*
 * x,y ��ǥ�� ��Ÿ���� Point �ν��Ͻ� ���� ��ǥ�� �񱳸� ����
 * equals �޼ҵ带 �������̵� �غ���, main���� ���� ���� ������� Ȯ���غ���!
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
