package chap10;

public class MultiCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+"+data2+ "="+result);
			
		}catch(ArrayIndexOutOfBoundsException |NumberFormatException e ) {
			System.out.println("Insufficient number of execution parameters or cannot be converted to numbers.");	
		}catch(Exception e) {
			System.out.println("Unknown exception occurred.");
		}finally {
			System.out.println("RETRY");
		}	

	}

}
