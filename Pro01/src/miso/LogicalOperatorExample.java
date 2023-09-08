package miso;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int charCode = 'A';
		
		if((charCode>=65) & (charCode<=90)) {
			System.out.println("It's a capital letter");
			
		if ( (charCode>=97)&& (charCode<=122)) {
			System.out.println("0~9 numbers");
			
		}
		
		int value = 6;
		if ((value%2 ==0) || (value%3==0)) {
			System.out.println("It's a multiple of 2 or 3");
		}
		
		if ((value%2 ==0) || (value%3 ==0)) {
			System.out.println("It's a multiple of two or three");
		}
		
		}

	}

}
