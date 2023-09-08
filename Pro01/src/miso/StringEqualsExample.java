package miso;

public class StringEqualsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String strVar1 = "hwang chaeyeon";
		String strVar2 = "hwang chaeyeon";
		String strVar3 = new String("hwang chaeyeon");
		
		System.out.println( strVar1 == strVar2);
		System.out.println(strVar1 == strVar3);
		System.out.println();
		System.out.println(strVar1.equals(strVar2));
		System.out.println(strVar1.equals(strVar3));
		
		
		
		
		
		

	}

}
