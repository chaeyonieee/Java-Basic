package airplane;

public class SuperSonicAirplane extends Airplane{

	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("We're flying at supersonic speed.");
		}else {
			super.fly();
		}
	}
	
	
	
	
	
}
