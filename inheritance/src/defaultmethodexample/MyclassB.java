package defaultmethodexample;

public class MyclassB implements  MyInterface{

	@Override
	public void method2() {
		System.out.println("Run myclassB - method2()");
		
	}

	@Override
	public void method1() {
		System.out.println("Run myclassB - method1()");
	}

}
