package chap10;

public class TryWithResourceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(FileInputStream fis = new FileInputStream("file.txt")){
			fis.read();
			throw new Exception();
		} catch(Exception e) {
			System.out.println("Exception handling code has been executed.");
		}
		

	}

}
