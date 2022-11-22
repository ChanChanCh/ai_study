package nested;

interface Player{
	void training();
}


//익명클래스 설명
public class Nested02 {

	public static void main(String[] args) {

		//interface가 정의되지 않아 new 할수없지만 딱 한번만 정의해서 사용할때 사용
		Player son = new Player() {
			public void training() {
				System.out.println("슛팅 연습!");
			}
		};
		Player park = new Player() {
			public void training() {
				System.out.println("변화구 연마!");
			}
		};  //익명클레스 끝에는 세미콜론 필수!
		
		park.training();
		son.training();

	}

}
