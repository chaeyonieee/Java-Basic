package chap11;

import java.util.Objects;

public class NullExample {

	public static void main(String[] args) {
		String str1 = "Hwang Chaeyeon";
		String str2 = null;
		
		System.out.println(Objects.requireNonNull(str1));
		
		try {
			String name = Objects.requireNonNull(str2);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2,"don't have a name.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		try {
			String name = Objects.requireNonNull(str2,()->"I don't have a name");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
