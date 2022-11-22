package wildcard;


class Alive{}

class Fruit extends Alive{}
class Peach extends Fruit{}
class Grape extends Fruit{}

class Bucket<T>{
	private T ob;
	
	void set(T o) {this.ob = o;}
	T get() {return this.ob; }
}
//
//class BucketHandler{
//	// ���� �����̸� ��ǻ� ������ �͸� �ϰڴٴ� �ǹ�
//	static void outBox(Bucket<? extends Fruit> bucket) {
//		Fruit ob = bucket.get();
//		// bucket.set(new Fruit());  <-- �ȵ�
//	}
//	
//	// ���� �����̸� ��ǻ� �ִ°͸� �ϰڴٴ� �ǹ�
//	static void inBox(Bucket<? super Fruit> bucket) {
//		bucket.set(new Fruit());
//		// Fruit ob = bucket.get();  <-- ����
//	}	
//}


// ���� ���������� 

class BucketHandler{
	// ���� �����̸� ��ǻ� ������ �͸� �ϰڴٴ� �ǹ�
	static <T> void outBox(Bucket<? extends T> bucket) {
		T ob = bucket.get();
		// bucket.set(new Fruit());  <-- �ȵ�
	}
	
	// ���� �����̸� ��ǻ� �ִ°͸� �ϰڴٴ� �ǹ�
	static <T> void inBox(Bucket<? super T > bucket) {
//		bucket.set(new Fruit());
		// Fruit ob = bucket.get();  <-- ����
	}	
}




public class Generic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
