package stream;

import java.io.*;

public class IOstream04 {

	public static void main(String[] args) throws IOException {

		try(
				DataInputStream os2 =
				new DataInputStream(
					new BufferedInputStream(
						new FileInputStream("a.dat")
					)
				)

			){
			
	         int num1 = os2.readInt(); // int«¸ µ•¿Ã≈Õ ≤®≥ø
	         double num2 = os2.readDouble(); // double«¸ µ•¿Ã≈Õ ≤®≥ø      

			System.out.println(num1);
			System.out.println(num2);
			os2.close();

		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
}


