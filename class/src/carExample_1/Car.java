package carExample_1;

public class Car {

	
	
	int speed;
	
	int getSpeed() {
		return speed;
	}
	
	void KeyTurnOn() {
		System.out.println("turn on the Key");
		
	}
	
	void run() {
		for (int i = 10; i <= 50; i+=10) {
			speed =i;
			System.out.println("run.(speed."+speed +"km/h)");
			
		}
	}
	
}
