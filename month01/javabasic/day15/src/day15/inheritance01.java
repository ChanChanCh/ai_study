package day15;


class Woman{
	String name;
	
	void showName() {
		System.out.print("³» ÀÌ¸§Àº " + name);
	}
	
}

class BusinessWoman extends Woman{
		String company;
}

public class inheritance01 {
	public static void main(String[] args) {
		
		BusinessWoman bw = new BusinessWoman();
		bw.name = "±èÅÂÈñ";
		bw.company = "»ï¼ºÀüÀÚ";
		bw.showName();
	}
}










