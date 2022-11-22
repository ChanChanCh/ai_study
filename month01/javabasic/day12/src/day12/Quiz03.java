package day12;

public class Quiz03 {	
		public static void main(String[] args) {
			
			for(int i =2; i < 10; i++) {
				for(int j =1; j<=i; j++) {			
					if(i % 2 == 0) {
					System.out.println(i+" x " + j + " = " + (i*j));
					}
				}
			}
		}
	}

