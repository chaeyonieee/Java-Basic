package miso;

public class SplitExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String board = "1, Learning Java, learning the reference type String, Hwang Chaeyeon";
		
		
		String []tokens = board.split(",");
		
		System.out.println("number: "+tokens[0]);
		System.out.println("number: "+tokens[1]);
		System.out.println("number: "+tokens[2]);
		System.out.println("number: "+tokens[3]);
		
		
		
		
	}

}
