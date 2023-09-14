package animal;

public abstract class Animal {
	public String kind;
	
	public void breathe() {
		System.out.println("I'm breathing.");
	}
	public abstract void sound();
}
