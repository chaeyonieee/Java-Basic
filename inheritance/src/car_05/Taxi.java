package car_05;

public class Taxi implements Vehicle{

	@Override
	public void run() {
		System.out.println("The taxi runs.");	
	}
	
	public void CheckFare() {
		System.out.println("Check the fare.");

}

}