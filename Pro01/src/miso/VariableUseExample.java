package miso;

public class VariableUseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int v1 = 15;
		if(v1>10){
			int v2;
			v2 = v1-10;
		int v3 = v1 + v2 +5;
		
		System.out.println("Value of V1 ="+ v1);
		System.out.println("Value of V2 ="+ v2);
		System.out.println("Value of V3 ="+ v3);
		
		}
	}

}
