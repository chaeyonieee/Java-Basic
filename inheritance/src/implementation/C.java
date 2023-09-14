package implementation;

public interface C extends ImplementationA, ImplementationB{

	@Override
	default void methodA() {
		System.out.println("Run implementationC - methodA()");
		
	}
	

	@Override
	default void methodB() {
		System.out.println("Run implementationC - methodB()");
		
	}

	public void methodC();
}
