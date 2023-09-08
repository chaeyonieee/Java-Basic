package miso;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		System.out.println("Please enter a message");
		System.out.println("Enter q to exit the program");
		
		Scanner scanner = new Scanner(System.in);
		String inputString;
		
		do {
			System.out.println(">");
			inputString = scanner.nextLine();
			System.out.println(inputString);
			
		}while(! inputString.equals("q"));
		
		System.out.println();
		System.out.println("exit the program");
		
		
		
	}

}
