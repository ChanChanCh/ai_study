package day22;

public class MakeThreadMultiDemo {

	public static void main(String[] args) {

		Runnable task1 =()->{ //20 ¹Ì¸¸ Â¦¼ö
			try {
				for(int i =0; i < 20; i++) {
					if(i %2 == 0) {
						System.out.print(i + " ");
						Thread.sleep(100);
					}
				}
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		};
		
		Runnable task2 =()->{ //20 ¹Ì¸¸ È¦¼ö
			try {
				for(int i =0; i <20; i++) {
					if(i % 2 ==1) {
						System.out.print(i + " ");
						Thread.sleep(100);
					}
				}
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		};
		
		Thread trd1 = new Thread(task1);
		Thread trd2 = new Thread(task2);	
		trd1.start();
		trd2.start();
	}
}
