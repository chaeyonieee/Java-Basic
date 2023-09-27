package chap18;

import java.io.File;
import java.io.FileWriter;

public class FileWriterExample {

	public static void main(String[] args) throws Exception{
		File file = new File("C:/Temp/file.txt");
		FileWriter fw = new FileWriter(file, true);
		fw.write("FileWriter is written in Korean " );
		fw.write("it can immediately output a string.  " + "\r\n");
		fw.flush();
		fw.close();
		System.out.println("Saved to file.");
	}

}
