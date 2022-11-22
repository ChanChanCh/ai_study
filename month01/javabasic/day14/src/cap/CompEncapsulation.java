package cap;

// 이미 클래스가 정의 되어있을 경우 포함관계로 캡슐화 시키는법 
class SinivelCap {    // 콧물 처치용 캡슐
    void take() {
        System.out.println("콧물이 싹~ 납니다.");
    }
}

class SneezeCap {    // 재채기 처치용 캡슐
    void take() {
        System.out.println("재채기가 멎습니다.");
    }
}

class SnuffleCap {    // 코막힘 처치용 캡슐
    void take() {
        System.out.println("코가 뻥 뚫립니다.");
    }
}

//SinusCap안에 모아서 SinusCap만 가져와도 다 사용할 수 있게된다.

class SinusCap {
    SinivelCap siCap = new SinivelCap();
    SneezeCap szCap = new SneezeCap();
    SnuffleCap sfCap = new SnuffleCap();

    void take() {
        siCap.take();
        szCap.take();
        sfCap.take();
    }
}

class ColdPatient {
					// cap = SinusCap 의 변수개념
    void takeSinus(SinusCap cap) {
    	// 
        cap.take();
    }
}

class CompEncapsulation {
    public static void main(String[] args) {
        ColdPatient suf = new ColdPatient();
        SinusCap sc = new SinusCap(); 
        suf.takeSinus(sc);
        
        suf.takeSinus(new SinusCap());
    }
}