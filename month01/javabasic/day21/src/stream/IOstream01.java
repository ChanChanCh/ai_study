package stream;
import java.io.*;

/*
 * ���� ����½� �������� �ʴ� ���Ͽ� ����� �ϱ� ���� ��Ʈ���� �����ϸ�,
 * ������ ���Ӱ� ���������. �׷��� �Է� ��Ʈ���� �������� �ʴ� ���Ͽ� ���� 
 * ������ �� ����.
 * 
 */



public class IOstream01 {

	public static void main(String[] args) throws IOException {

		OutputStream os = new FileOutputStream("data.dat");
		
		os.write(7);
		
		os.close();
		
		InputStream os2 = new FileInputStream("data.dat");
		
		System.out.println(os2.read());
		os.close();
		
		
		
		
		
		
		

		
		
	}

}
