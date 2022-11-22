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

// 박스 셋팅하고 o를 출력 해줌 
class BoxFactory {
    public static <T extends Number> Box<T> makeBox(T o) {
        Box<T> box = new Box<T>();
        box.set(o);

        System.out.println("Boxed data: " + o.intValue());
        return box;
    }
}

// 박스 셋팅값을 가져오고 ㄴset값 출력 밑 리턴
class Unboxer {
    public static <T extends Number> T openBox(Box<T> box) {
    	//int값으로 출력 
        System.out.println("Unboxed data: " + box.get().intValue());        
        return box.get();
    }
}

class BoundedGenericMethod {
    public static void main(String[] args) {
    	// BoxFactory를 호출하여 셋팅하면서 boxed data 출력 
        Box<Integer> sBox = BoxFactory.makeBox(new Integer(5959));
        // openBox 호출하여 get하면서 Unboxed 출력
        int n = Unboxer.openBox(sBox);
        // n에 설정된 값 출력 
        System.out.println("Returned data: " + n);
    }
}