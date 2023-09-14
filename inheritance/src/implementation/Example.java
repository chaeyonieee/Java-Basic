package implementation;

public class Example {

	public static void main(String[] args) {
		C imp1 = new C();
		
		ImplementationA ia = imp1;
		ia.methodA();
		System.out.println();
		
		
		ImplementationB ib = imp1;
		ib.methodB();
		System.out.println();
		
		
		C ic = imp1;
		ic.methodA();
		ic.methodB();
		ic.methodC();
		System.out.println();
		
	}
	
}
