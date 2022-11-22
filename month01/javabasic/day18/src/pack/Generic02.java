package pack;

class DBox<L, R>{
	private L left;
	private R right;
	
	void set(L left, R right) {
		this.left = left;
		this.right = right;	
	}
}

// Number �Ǵ� Number�� ����� ���� Ŭ����������� �ްڴ�!
class NumBox<T extends Number>{
	
	private T num;
	
	void set(T num) { this.num = num;}
	void show() {
		System.out.println(this.num.intValue());
	}
}

public class Generic02 {

	public static void main(String[] args) {
		DBox<String, Integer> box = new DBox<>();
		box.set("���ڿ�", 100);
		
		DBox<String, DBox<String, Integer>> bbox = 
				new DBox<>();
		bbox.set("�� ���ڿ�", box);
	}

}
