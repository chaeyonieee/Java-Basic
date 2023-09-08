package miso;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Scanner scanner =new Scanner(System.in);
		boolean run = true;
		int speed = 0;
		while(run) {
			System.out.println("~~~~~~~~~~~");
			System.out.println("1.medium speed | 2.slow speed | 3.stop");
			System.out.println("~~~~~~~~~~~");
			System.out.print("selected: ");
			
			String strNum = scanner.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("Current speed = "+speed);
			}else if(strNum.equals("2")) {
					speed--;
					System.out.println("Current speed = "+speed);
					
				}else if (strNum.equals("3")){
					run = false;
				}
		
		
		
		}
		
	}


}