package chap18;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/chaeyeon.txt");
		Writer writer = new OutputStreamWriter(fos);
		
		String data = "Wanna rest for sure";
		writer.write(data);
		
		writer.flush();
		writer.close();
		System.out.println("File Saving complete");
	}

}
