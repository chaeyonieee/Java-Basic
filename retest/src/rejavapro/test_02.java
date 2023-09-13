package rejavapro;

import java.util.Scanner;

public class test_02 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		System.out.print("Please enter a single-digit value =>");
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		System.out.print("Please enter again a single-digit value =>");
		String b = scan.nextLine();
		int a1 = (int)a.charAt(0)-48;
		int b1 = (int)a.charAt(0)-48;
		int c = a1 + b1;
		int d = a1 - b1;
		int e = a1 * b1;
		int f = a1 / b1;
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}

}
