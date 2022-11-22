package day15;

// 상속(부모객체 물려받음) < ---> 오버라이딩(부모객체 물려받아서 재정의)
// 어차피 고쳐야되면 오버라이딩?이 활용도가 높은가?
// 상속은 클래스를 공통적으로 관리하기만을 위한?

// 상속과 오버라이딩는 어떤경우 사용하는 구분점이 있는가?
// ---> 상황마다 다르다 새의 fly기능과  독수리의 flying 기능 있다
// --- > 같은 나는 기능이지만 새의 flying기능과 독수리의 flying 기능은 엄연히 다르다
// 이럴때는 오버라이딩하여 독수리의 flying기능을 재정의 하는것이다
// @오버라이딩을 사용할때의 예! 





class SuperCLS {
    public SuperCLS() {
        System.out.println("Con: SuperCLS()");
    }

    public SuperCLS(int i) {
        System.out.println("Con: SuperCLS(int i)");
    }

    public SuperCLS(int i, int j) {
        System.out.println("Con: SuperCLS(int i, int j)");
    }
}

class SubCLS extends SuperCLS {
    public SubCLS() {
        System.out.println("Con: SubCLS()");
    }

    public SubCLS(int i) {
        super(i);
        System.out.println("Con: SubCLS(int i)");
    }

    public SubCLS(int i, int j) {
        super(i, j);
        System.out.println("Con: SubCLS(int i, int j)");
    }
}

class SuperSubCon2 {
    public static void main(String[] args) {
        System.out.println("1. ");
        new SubCLS();

        System.out.println("2. ");
        new SubCLS(1);

        System.out.println("3. ");
        new SubCLS(1, 2);
    }
}