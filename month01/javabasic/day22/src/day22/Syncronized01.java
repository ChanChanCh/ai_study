package day22;

class Counter{
	int count = 0;
	
	public synchronized void incre() { count++;}
	public synchronized void decre() { count--;}
	public int getCnt() { return count;}
	
}
public class Syncronized01 {
	
		static Counter myCnt = new Counter();
		
	public static void main(String[] args) throws InterruptedException {

		Runnable task = () -> {
			for(int i = 0; i < 8000; i++) { myCnt.incre();}
		};
		Runnable task2 = () -> {
			for(int i = 0; i < 8000; i++) { myCnt.decre();}
		};
		
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task2);
		t1.start(); t2.start();
		t1.join(); t2.join();
		System.out.println(myCnt.count);
	}
}
