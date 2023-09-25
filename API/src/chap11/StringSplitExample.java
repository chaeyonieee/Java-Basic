package chap11;

public class StringSplitExample {

	public static void main(String[] args) {
		String text = "Hwang&chaeyeon,jenny,hcy-chaeyy";
		String [] names = text.split(",|&|-");
		for(String name : names) {
			System.out.println(name);
		}

	}

}
