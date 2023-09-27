package chap15;

import java.util.*;

public class HashtableExample {

	public static void main(String[] args) {
		Map<String, String>map = new Hashtable<String, String>();
		
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("Please enter your ID and password");
			System.out.print("ID: ");
			String id = scanner.nextLine();
			System.out.println();
			
			
			System.out.print("password: ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("You're logged in");
					break;
				}else {
					System.out.println("Passwords do not match.");
				}
			}else {
				System.out.println("The ID you entered does not exist.");
			}
		}

	}

}
