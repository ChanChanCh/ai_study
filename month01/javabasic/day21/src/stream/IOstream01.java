package stream;
import java.io.*;

/*
 * 파일 입출력시 존재하지 않는 파일에 출력을 하기 위한 스트림을 형성하면,
 * 파일이 새롭게 만들어진다. 그러나 입력 스트림은 존재하지 않는 파일에 대해 
 * 형성할 수 없다.
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
