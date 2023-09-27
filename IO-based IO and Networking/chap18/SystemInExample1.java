package chap18;


import java.io.InputStream;

public class SystemInExample1 {

	public static void main(String[] args) throws Exception {
		System.out.println("==¸Þ´º==");
		System.out.println("1. Deposit inquiry");
		System.out.println("2. withdrawal of deposits");
		System.out.println("3. Deposit deposit");
		System.out.println("4. Ending");
		System.out.println("choose the menu: ");
		
		InputStream is = System.in;
		char inputChar = (char) is.read();
		switch(inputChar) {
		case'1':
			System.out.println("You have selected Deposit Inquiry.");
			break;
		case'2':
			System.out.println("You have chosen to withdraw your deposit.");
			break;
		case'3':
			System.out.println("You have selected Deposit.");
			break;
		case'4':
			System.out.println("You have selected to exit.");
			break;
			}
	}

}
