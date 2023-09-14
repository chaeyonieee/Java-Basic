package car;

public class CarExaple {

	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		
		myCar.run();
//		myCar.frontLeftTire = new KumhoTire();
		myCar.tires[0] = new KumhoTire();
		myCar.tires[1] = new KumhoTire();
//		myCar.frontRigthTire = new KumhoTire();
		
		myCar.run();
	
		
		
		System.out.println("-----");
		
		
	}

}
