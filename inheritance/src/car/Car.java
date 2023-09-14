package car;

public class Car {
//	Tire frontLeftTire = new HanKookTire();
//	Tire frontRigthTire = new HanKookTire();
//	Tire backLeftTire = new HanKookTire();
//	Tire backRightTire = new HanKookTire();
//	
	Tire[] tires = {
			new HanKookTire(),
			new HanKookTire(),
			new HanKookTire(),
			new HanKookTire()};
			
	
	void run() {
//		frontLeftTire.roll();
//		frontRigthTire.roll();
//		backLeftTire.roll();
//		backRightTire.roll();
		
		for (int i = 0; i < tires.length; i++) {
			tires[i].roll();
		}
//		
	}
	
}
