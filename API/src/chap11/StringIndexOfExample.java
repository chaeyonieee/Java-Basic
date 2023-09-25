package chap11;

public class StringIndexOfExample {

	public static void main(String[] args) throws Exception{
		String subject = "java programming";
		
		int location = subject.indexOf("programming");
		System.out.println(location);
		int a = subject.indexOf("ming");
		
		System.out.println(a);
		
		if(subject.indexOf("java")!=-1) {
			System.out.println("It's about Java");
			
		}else {
			System.out.println("It's not related to Java");
		}
		
	
	}

}
