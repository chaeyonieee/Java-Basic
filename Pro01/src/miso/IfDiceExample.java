package miso;

public class IfDiceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = (int)(Math.random()*6)+1;
		
		if (num ==1) {
			System.out.println("Number 1 came out.");
			
		}else if (num==2) {
			System.out.println("Number 2 came out");
		}else if(num==3) {
			System.out.println("Number 3 came out");
		}else if(num==4) {
			System.out.println("Number 4 came out.");
		}else if (num==5) {
			System.out.println("Number 5 came out");
		}else {
			System.out.println("Number 6 came out");
		}
		

	}

}
