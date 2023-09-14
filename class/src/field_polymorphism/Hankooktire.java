package field_polymorphism;

public class Hankooktire extends Tire {

	
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		
	}
	@Override
	public boolean roll() {
		++acumulatedRotation;
		if(acumulatedRotation<maxRotation) {
			System.out.println(location + " HankookTire life: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location + "HanKookTire puncture ***");
			return false;
		}
	}
}
