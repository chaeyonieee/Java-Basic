package chap10;

public class FileInputStream implements AutoCloseable {

	private String file;
	
	public FileInputStream(String file) {
		this.file = file;
		
	}
	public void read() {
		System.out.println("Read "+file );
		
	}
	@Override
	public void close() throws Exception{
		System.out.println("close "+file);
	}
}
