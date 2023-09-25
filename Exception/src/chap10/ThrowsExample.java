package chap10;

public class ThrowsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("Class does not exist.");
			
		}

	}
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}
}
