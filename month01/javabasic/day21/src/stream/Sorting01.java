package stream;
import java.util.stream.*;

public class Sorting01 {

	public static void main(String[] args) {

		IntStream nlist = IntStream.of(3, 9, 4, 2);
		
		IntStream result = nlist.sorted();
		result.forEach(n -> System.out.println(n));

	}

}
