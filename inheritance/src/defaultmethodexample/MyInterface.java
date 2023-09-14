package defaultmethodexample;

public interface MyInterface {
	
	public void method1();
	
	public default void method2() {
		System.out.println("Run myInterfaceB - method2()");
	}
	

}
