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
		JustSort js = new JustSort(); //���������� ����� �ٸ�����.
		
//		Consumer<List<Integer>> c = new Consumer<>() {
//			public void accept(List<Integer> 1) {}
//		};
		
		// js = null; // �̷� �ڵ尡 �����ϸ� ���������� ����� �� ����
		Consumer<List<Integer>> c = js::sort;
		
	

		
	}

}
