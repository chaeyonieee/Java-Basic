package singleton;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if (obj1 == obj2) {
			
			System.out.println("Same Singleton object.");
		}else {
			System.out.println("Different Singleton object..");
			
		}
		
		
	}

}
