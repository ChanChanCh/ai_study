package ex00;


class Box<T> {
    private T ob;
    
    public void set(T o) {
        ob = o;
    }
    public T get() {
        return ob;
    }
}

// �ڽ� �����ϰ� o�� ��� ���� 
class BoxFactory {
    public static <T extends Number> Box<T> makeBox(T o) {
        Box<T> box = new Box<T>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

// �ڽ� ���ð��� �������� ��set�� ��� �� ����
class Unboxer {
    public static <T extends Number> T openBox(Box<T> box) {
    	//int������ ��� 
        System.out.println("Unboxed data: " + box.get().intValue());        
        return box.get();
    }
}

class BoundedGenericMethod {
    public static void main(String[] args) {
    	// BoxFactory�� ȣ���Ͽ� �����ϸ鼭 boxed data ��� 
        Box<Integer> sBox = BoxFactory.makeBox(new Integer(5959));
        // openBox ȣ���Ͽ� get�ϸ鼭 Unboxed ���
        int n = Unboxer.openBox(sBox);
        // n�� ������ �� ��� 
        System.out.println("Returned data: " + n);
    }
}