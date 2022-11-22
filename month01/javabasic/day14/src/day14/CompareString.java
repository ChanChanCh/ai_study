package day14;
/*
 * 문자열 만들기 방법은 두가지다 . new 사용 & new 미사용
 *
 * new 사용 : 문자열의 내용과 무관하게 새로운 객체를 생성한다.
 * new 미사용 : 같은 문자열에 한해서는 동일 대상을 참조한다.
 * 
 * 등가 비교 연산의 특징
 * 1. 기본 자료형 간의 비교는 크기 비교이다.
 * 2. 참조 자료형 간의 비교는 메모리가 같은 대상인지에 대한 비교이다.
 * 
 */
public class CompareString {

	public static void main(String[] args) {
		String word1 = new String("메모리 대상확인");
		String word2 = new String("메모리 대상확인");
		String word3 = "메모리 대상확인";
		String word4 = "메모리 대상확인";

		System.out.println(word1 == word2);
		System.out.println(word3 == word4);

	}

}
