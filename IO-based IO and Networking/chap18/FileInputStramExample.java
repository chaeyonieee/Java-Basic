package chap18;

import java.io.FileInputStream;

public class FileInputStramExample {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:/Users/Administrator/eclipse-workspace/chap18/src/chap18/FileInputStramExample.java");
			int data;
			while((data = fis.read() ) != -1) {
				System.out.write(data);
			}
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
