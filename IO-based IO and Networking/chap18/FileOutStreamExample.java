package chap18;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class FileOutStreamExample {

	public static void main(String[] args) throws Exception {
		String originalFileName = "C:/java/house.jpg";
		String targetFileName = "C:/Temp/house.jpg";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(targetFileName);
		
		
		int readByteNo;
		byte[]readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes)) !=-1) {
			fos.write(readBytes,0,readByteNo);
			
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("The copy went well.");
	}

}
