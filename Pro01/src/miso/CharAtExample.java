package miso;

public class CharAtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ssn = "9506241230123";
		char sex = ssn.charAt(6);
		switch(sex) {
		case '1' :
		case'3' :
			System.out.println("is Male.");
			break;
		case '2':
		case'4':
			System.out.println("is Female.");
			break;
		}
		

	}

}
