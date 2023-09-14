package carExample_1;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Car myCar = new Car();
		myCar.KeyTurnOn();
		myCar.run();
		int speed = myCar.getSpeed();
		System.out.println("current speed: "+speed + "km/h");
		
		
	}

}
