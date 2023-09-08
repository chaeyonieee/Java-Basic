package miso;

public class StringEqualsExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar1 = "hwang chaeyeon";
		String strVar2 = "hwang chaeyeon";
	
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar2 have the same reference");
		}else {
			System.out.println("strVar1 and strVar2 have different references");
			
		}
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1 and strVar25 have the same string");
			
				}
		String strVar3 = new String("hwang chaeyeon");
		String strVar4 = new String("hwang chaeyeon");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3 and strVar4 have the same reference\\");
			
		}
				
		

	}

}
