
import java.util.Scanner;

public class Test02 {
	
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.out.print("Please enter your resident number =>");
		Scanner scanner =  new Scanner(System.in);
		String inputString=scanner.next();
		
		char sex = inputString.charAt(8);
		switch (sex) {
		case '1' :
		case '3' :
			System.out.println("Male.");
			break;
			
		case '2' :
		case '4' :
			System.out.println("Female.");
			break;
		}
		
		
		

	}

}
