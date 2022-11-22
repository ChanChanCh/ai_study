package day17;
import java.util.*;


public class Random01 {

	public static void main(String[] args) {
		// seed 기반의 랜덤 인스턴스 : 정해진 패턴에 따라 난수 생성! (가짜 난수)
		// 그렇다면, seed 기반인데 진정으로 랜덤일 순 없을까?
		//System.currentTimeMillis()는 씨드가 없을 때의 기본 값이기도 하다
		Random rn = new Random(System.currentTimeMillis());
		
		for(int i =0; i < 5; i++) {
			int num = rn.nextInt(45)+1;
			System.out.println(num);
		}	
	}
}
