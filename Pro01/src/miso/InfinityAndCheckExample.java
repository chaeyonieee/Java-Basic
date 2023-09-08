package miso;

public class InfinityAndCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int x = 5;
		double y = 3;
		
		double z = x / y;
		
		System.out.println(Double.isInfinite(z));
		System.out.println(Double.isNaN(z));
		
	 if (Double.isInfinite(z)|| Double.isNaN(z)) {
		 System.out.println("Unable to calculate value");
		 
	 } else {
		 System.out.println(z + 2);
		 
	 }
	}
}
	


