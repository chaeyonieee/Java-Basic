package phone;

public abstract class Phone1 {

	
	public String owner;
	
	public Phone1(String owner) {
		this.owner = owner;
		
	}
	
public void turnOn() {
	System.out.println("Turn on the phone");
}
	public void turnoff() {
		System.out.println("Turn off the phone");
	}
}
