package chap10;

import java.lang.reflect.Member;

public class MemberExample {

	public static void main(String[] args) {
		
		Member obj1 = new Member("blue");
		Member obj2 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 = obj2");
			
		}else {
			System.out.println("obj1 =/ obj2");
		}
		
		
	}

}
