package miso;

public class BitReverseOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v1 = 10;
		int v2 = ~v1;
		int v3 = ~v1 + 1;
		
		System.out.println(toBinaryString(v1)+ "(a decimal number : " + v1 + ")");
		System.out.println(toBinaryString(v2)+ "(a decimal number : " + v2 + ")");
		System.out.println(toBinaryString(v3)+ "(a decimal number : " + v3 + ")");
		System.out.println();
		
		int v4 = -10;
		int v5 = ~v4;
		int v6 = ~v4 + 1;
		System.out.println(toBinaryString(v4)+ "(a decimal number : " + v4 + ")");
		System.out.println(toBinaryString(v5)+ "(a decimal number : " + v5 + ")");
		System.out.println(toBinaryString(v6)+ "(a decimal number : " + v6 + ")");
		
	}	
		public static String toBinaryString(int value) {
			String str = Integer.toBinaryString(value);
			while(str.length() < 32) {
				str = "0" + str;
				
			}
		return str;
		
		
	}

}
