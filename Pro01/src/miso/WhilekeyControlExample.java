package miso;

public class WhilekeyControlExample {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode!=13 && keyCode!=10) {
				System.out.println("~~~~~~~~~~~");
				System.out.println("1.medium speed | 2.slow speed | 3.stop");
				System.out.println("~~~~~~~~~~~");
				System.out.print("selected: ");
				
			}
			keyCode = System.in.read();
			
			if (keyCode == 49) {
				speed++;
				System.out.println("Current speed = " + speed);
				
			} else if (keyCode ==50) {
				speed--;
				System.out.println("Current speed = " + speed);
			}
		
		}
		
		
		
		
	}

}
