package chap18;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

public class FileExample {

	public static void main(String[] args) throws Exception {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.txt");
		File file2 = new File("C:/Temp/file2.txt");
		
		if(dir.exists()==false) { dir.mkdir();
		if(file1.exists()==false) { file1.createNewFile(); }
		if(file2.exists()==false) { file1.createNewFile(); }
		
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  a HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("date               time        type     size     name");
		System.out.println("--------------------");
		
		for(File file : contents) {
			System.out.print(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t" + file.getName());
			}else {
				System.out.println("\t\t\t"+file.length() + "\t" + file.getName());
			}
			System.out.println();
		}
		
		
		}

	}

}
