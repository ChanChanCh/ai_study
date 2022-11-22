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
//	// 상한 제한이면 사실상 꺼내는 것만 하겠다는 의미
//	static void outBox(Bucket<? extends Fruit> bucket) {
//		Fruit ob = bucket.get();
//		// bucket.set(new Fruit());  <-- 안됨
//	}
//	
//	// 하한 제한이면 사실상 넣는것만 하겠다는 의미
//	static void inBox(Bucket<? super Fruit> bucket) {
//		bucket.set(new Fruit());
//		// Fruit ob = bucket.get();  <-- 제한
//	}	
//}


// 제한 지점에대한 

class BucketHandler{
	// 상한 제한이면 사실상 꺼내는 것만 하겠다는 의미
	static <T> void outBox(Bucket<? extends T> bucket) {
		T ob = bucket.get();
		// bucket.set(new Fruit());  <-- 안됨
	}
	
	// 하한 제한이면 사실상 넣는것만 하겠다는 의미
	static <T> void inBox(Bucket<? super T > bucket) {
//		bucket.set(new Fruit());
		// Fruit ob = bucket.get();  <-- 제한
	}	
}




public class Generic04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
