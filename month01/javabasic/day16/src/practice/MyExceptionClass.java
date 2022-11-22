package practice;

import java.util.Scanner;

class ReadAgeException extends Exception {
    public ReadAgeException() {
        super("��ȿ���� ���� ���̰� �ԷµǾ����ϴ�.");
    }
}

class InputMismatchException extends Exception{
	public InputMismatchException() {
		super("���ڸ� �Է����� �ʾҽ��ϴ�");
	}
};




class MyExceptionClass {
    public static void main(String[] args) {
        System.out.print("���� �Է�: ");
    
        try {
        	boolean age = readAge();
            System.out.printf("�Էµ� ����: %d \n", age);
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
        System.out.println("���ڿ���"+ output);
		return output;
     
        
        
 
      
        
    }
}