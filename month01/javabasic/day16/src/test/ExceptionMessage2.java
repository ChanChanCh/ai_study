package test;

class ExceptionMessage2 { 
    public static void md1(int n) {
        md2(n, 0);   // 2. �� �������� 8�� �ٷ� ���� ���ܰ� �Ѿ�´�
    }
    public static void md2(int n1, int n2) {
        int r = n1 / n2;  // 1. ���� �߻� ����
    }
    public static void main(String[] args) {
        try {
            md1(3);  // 3. �� �������� 5�� �ٷκ��� ���ܰ� �Ѿ�´�
        }
        catch(Throwable e) {
            e.printStackTrace();
        }
        
        System.out.println("���� ���� ����~~!");
    }
}