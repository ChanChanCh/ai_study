package ex02;

interface Eatable {
   public String eat();    
}

class Apple implements Eatable {
    public String toString() {
        return "I am an apple.";
    }
    
    @Override
    public String eat() {
        return "It tastes so good!";
    }
}

class Box<T extends Eatable> {
    private T ob;

    public void set(T o) {
        ob = o;
    }
    
    // 한 입 먹고 반환하는 행위의 메소드로 수정
    public T get() {
        System.out.println(ob.eat());
        return ob;
    }    
}

class BoundedInterfaceBox {
    public static void main(String[] args) {
        Box<Apple> box = new Box<>();
        box.set(new Apple());
        
        Apple ap = box.get();
        // get호출시 Apple값이아닌 eat을 출력하도록했음
        System.out.println(ap);
        
        Apple ap2 = new Apple();
        // 원래 Apple의 반환값  = I am an apple.
        System.out.println(ap2);
    }
}