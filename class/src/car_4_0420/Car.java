package car_4_0420;

public class Car {
	
	public int speed;
	
	public void speedUp() {
		speed+=1;
		
	}
	public final void stop() {
		System.out.println("Stop car");
		speed = 0;
	}
	

}
