package day22;

import java.util.concurrent.*;

public class ThreadPool01 {

	public static void main(String[] args) {
		
		Runnable task1 = () -> {
			String tname = Thread.currentThread().getName();
			System.out.println("�۾�1��" + 100);
		};
		
		Runnable task2 = () -> {
			String tname = Thread.currentThread().getName();
			System.out.println("�۾�2��" + 200);
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task1); exr.submit(task2);
		exr.shutdown();

	}

}
