package chap18;

import java.io.FileReader;

public class FileReaderExample {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:/Users/Administrator/eclipse-workspace/chap18/src/chap18.FileReaderExample.java");
		int readCharNo;
		char [] cbuf = new char[100];
		while((readCharNo=fr.read(cbuf))!= -1){
			String data = new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
	}

}
