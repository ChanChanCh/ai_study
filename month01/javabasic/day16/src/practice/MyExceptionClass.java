package practice;

import java.util.Scanner;

class ReadAgeException extends Exception {
    public ReadAgeException() {
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}

class InputMismatchException extends Exception{
	public InputMismatchException() {
		super("숫자를 입력하지 않았습니다");
	}
};




class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("나이 입력: ");
    
        try {
        	boolean age = readAge();
            System.out.printf("입력된 나이: %d \n", age);
        }
        catch(InputMismatchException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static boolean readAge() throws InputMismatchException {

    	Scanner sc = new Scanner(System.in);
 	    char tmp;
        boolean output = true;
        String input = sc.next();
        
        for(int i =0; i<input.length(); i++) {
        	tmp = input.charAt(i);
        	
        	if(Character.isDigit(tmp) == false) {
        		output = false;
        	}
        }
        System.out.println("숫자여부"+ output);
		return output;
     
        
        
 
      
        
    }
}