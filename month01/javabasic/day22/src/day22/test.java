package day22;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test {

	public static void main(String[] args) {

		int[] stt = {1,2,3,4,5};
		int v = 0;
		
		
		int[] max = IntStream.of(stt).sorted().toArray();
		v = max[stt.length-2]*max[stt.length-1];
			
		System.out.print(v);
		

		
	}

}
