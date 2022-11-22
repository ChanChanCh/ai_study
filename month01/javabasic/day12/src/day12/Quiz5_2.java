package day12;

public class Quiz5_2 {


		public static void main(String[] args) {

			int sum = 0;
			int count = 1;
				
				for(;;) {
					if(count % 2 == 1) {
						sum += count;
					}
					
					if(sum > 1000) {
						System.out.println("1000을 넘어설 때의 홀수 :" + count);
						break;
					}
					count++;
				}		
			}
		}

