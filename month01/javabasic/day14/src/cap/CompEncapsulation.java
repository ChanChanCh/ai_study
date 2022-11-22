package cap;

// �̹� Ŭ������ ���� �Ǿ����� ��� ���԰���� ĸ��ȭ ��Ű�¹� 
class SinivelCap {    // �๰ óġ�� ĸ��
    void take() {
        System.out.println("�๰�� ��~ ���ϴ�.");
    }
}

class SneezeCap {    // ��ä�� óġ�� ĸ��
    void take() {
        System.out.println("��ä�Ⱑ �ܽ��ϴ�.");
    }
}

class SnuffleCap {    // �ڸ��� óġ�� ĸ��
    void take() {
        System.out.println("�ڰ� �� �ո��ϴ�.");
    }
}

//SinusCap�ȿ� ��Ƽ� SinusCap�� �����͵� �� ����� �� �ְԵȴ�.

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
					// cap = SinusCap �� ��������
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