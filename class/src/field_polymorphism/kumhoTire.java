package field_polymorphism;

public class kumhoTire extends Tire {

	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
		
		
	}
	
	@Override
	public boolean roll() {
		++acumulatedRotation;
		if(acumulatedRotation<maxRotation) {
			System.out.println(location + " KumhoTire life: "+(maxRotation-accumulatedRotation)+"ȸ");
			return true;
		}else {
			System.out.println("*** "+location + "KumhoTire puncture ***");
			return false;
		
	}
}
}
