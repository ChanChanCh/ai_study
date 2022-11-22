package day20;
import java.util.*;
import java.util.function.*;


class JustSort{
	public void sort(List<?> lst) {
		Collections.reverse(lst);
	}
}


public class FuncInter02 {

	public static void main(String[] args) {

		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		ls = new ArrayList<>();
		JustSort js = new JustSort(); //실질적으로 상수나 다름없다.
		
//		Consumer<List<Integer>> c = new Consumer<>() {
//			public void accept(List<Integer> 1) {}
//		};
		
		// js = null; // 이런 코드가 존재하면 실질적으로 상수일 수 없다
		Consumer<List<Integer>> c = js::sort;
		
	

		
	}

}
