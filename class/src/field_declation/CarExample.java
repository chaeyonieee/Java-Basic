package field_declation;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		System.out.println("production company: "+ myCar.company);
		System.out.println("model: "+myCar.model);
		System.out.println("color: "+myCar.color);
		System.out.println("max speed: "+myCar.maxSpeed);
		System.out.println("current speed: "+myCar.speed);
		
		myCar.speed = 60;
		System.out.println("modify speed :"+myCar.speed);
		
		
	}

}
