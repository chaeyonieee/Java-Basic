package chap18;
import java.io.OutputStream;
public class OutputStream {

	public static void main(String[] args) {
		OutputStream os = System.out;
		
		for (byte b = 48; b < 58; b++) {
			os.write(b);
		}
	os.write(10);
	
	for (byte b = 97; b < 123; b++) {
		os.write(b);
	}
	os.write(10);
	
	String hangul = "ABCDEFGHIJKLMNOP";
	byte[] hangulBytes = hangul.getBytes();
	os.write(hangulBytes);
}
