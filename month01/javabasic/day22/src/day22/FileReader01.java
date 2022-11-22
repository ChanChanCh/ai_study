package day22;

import java.io.*;

public class FileReader01 {

	public static void main(String[] args) {
		
		String src = "sample.txt";

		try(Reader in = new FileReader(src)){
			
			int ch;
			
			while(true) {
				ch = in.read();
				if(ch == -1)
					break;
				System.out.print((char)ch);
			}			
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
