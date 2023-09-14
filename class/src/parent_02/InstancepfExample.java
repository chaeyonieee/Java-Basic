package parent_02;

public class InstancepfExample {
	
	public static void method1(Parent parent) {
		
		if(parent instanceof Child);{
		Child child = (Child) parent;
		System.out.println("Successfully converted to method1-child");
		}// else
		{
		System.out.println("method1 - not converted to Child");
	}
	
}
public static void method2(Parent parent) {
	Child child = (Child) parent;
	System.out.println("Method2 - Successful conversion to Child");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Child();
		method1(parentB);
		method2(parentB);
		
	}

}
