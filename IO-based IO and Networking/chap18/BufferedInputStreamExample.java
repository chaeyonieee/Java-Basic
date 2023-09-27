package chap18;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInputStreamExample {

	public static void main(String[] args) throws Exception {
		
		
		long start = 0;
		long end = 0;
		
		FileInputStream fis1 = new FileInputStream("C:/Users/Administrator/Downloads/cat-g4e56377c0_1920.jpg");
		start = System.currentTimeMillis();
		while(fis1.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("when used: "+(end - start)+"ms");
		fis1.close();
		
		
		FileInputStream fis2 = new FileInputStream("C:/Users/Administrator/Downloads/cat-g4e56377c0_1920.jpg");
		BufferedInputStream bis = new BufferedInputStream(fis2);
		start = System.currentTimeMillis();
		while(bis.read() != -1) {}
		end = System.currentTimeMillis();
		System.out.println("when used: "+(end - start)+"ms");
		bis.close();
		fis2.close();
	}

}
