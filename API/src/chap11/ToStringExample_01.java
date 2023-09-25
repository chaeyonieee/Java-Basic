package chap11;

import java.util.Objects;

public class ToStringExample_01 {

	public static void main(String[] args) {
		String str1 = "hwang chaeyeon";
		String str2 = null;
		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2,"don't have a name"));
	}

}
