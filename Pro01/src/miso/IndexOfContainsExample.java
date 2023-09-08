package miso;

public class IndexOfContainsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String subject = "Java programming";
		
		
		
		int location = subject.indexOf("programming");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location = subject.indexOf("Java");
		if(location != -1) {
			System.out.println("It's a book that doesn't have anything to Java.");
			
		}else {
			System.out.println("It's a book that doesn't have anything to Java.¿ä");
			
		}
		
		boolean result = subject.contains("Java");
		if(result) {
			System.out.println("It's a book that doesn't have anything to Java.");
			
		}else {
			System.out.println("It's a book that doesn't have anything to Java.");
			
		}
				

	}

}
