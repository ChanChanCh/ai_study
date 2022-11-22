package stream;

import java.io.*;

public class IOstream03 {

	public static void main(String[] args) {

		// 기존 입출력 스트림에 필터들을 추가한다!
		try(
				DataOutputStream os =
				new DataOutputStream(
					new BufferedOutputStream(
						new FileOutputStream("a.dat")
					)
				)

			){
			os.writeInt(350);
			os.writeDouble(10.021);
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
