package pack;


class Pencil{}

class Eraser{}

/*
 * ���׸� : ��� �ÿ� Ÿ���� ���ؼ� ���� �Ϲ�ȭ ���
 * �Ϲ������� Ÿ�� �Ű������� �빮�� �� ���ڷ� ����
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

		// ���� Pencil�̿��� �ٸ�Ÿ���� �������� ������ �߻���Ű�Եȴ�.
		Drawer<Pencil> pd =  new Drawer<Pencil>();
		pd.set(new Pencil());
		Pencil p = pd.get();

//		Drawer pd = new Drawer();
//		pd.set(new Eraser());
//		// ��������� �������� ������ �������� ���� 
//		
//		
//		// Object�� �����ʴٰ� �����߻� 
//		Eraser ed = pd.get(); 
		
		
	}

}
