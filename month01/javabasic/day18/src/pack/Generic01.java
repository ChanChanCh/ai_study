package pack;


class Pencil{}

class Eraser{}

/*
 * 제네릭 : 사용 시에 타입을 정해서 쓰는 일반화 방법
 * 일반적으로 타입 매개변수는 대문자 한 글자로 쓴다
 * 
 */
//
//class Drawer{
//	private Object ob;
//
//	void set(Object o) {this.ob = o;}
//	Object get() {return this.ob;}	
//}

class Drawer<T>{
	private T ob;

	void set(T o) {this.ob = o;}
	T get() {return this.ob;}	
}

public class Generic01 {

	public static void main(String[] args) {

		// 이제 Pencil이외의 다른타입을 가져오면 오류를 발생시키게된다.
		Drawer<Pencil> pd =  new Drawer<Pencil>();
		pd.set(new Pencil());
		Pencil p = pd.get();

//		Drawer pd = new Drawer();
//		pd.set(new Eraser());
//		// 여기까지만 썼을때는 에러가 전혀나지 않음 
//		
//		
//		// Object가 맞지않다고 에러발생 
//		Eraser ed = pd.get(); 
		
		
	}

}
