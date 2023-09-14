package carExample_2_0417;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Car myCar = new Car();
		
		myCar.setGas(5);
		
		boolean gasState = myCar.isLeftGas();
		if(gasState) {
			System.out.println("start.");
			myCar.run();
		}
		
		if(myCar.isLeftGas()) {
			System.out.println("Do not need to insert the gas");
			
		}else {
			System.out.println("Insert the gas.");
		}
		
		
	}

}
