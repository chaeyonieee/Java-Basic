package chap11;

import java.util.Iterator;

public class SystemTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long time1 = System.nanoTime();
		long a = System.currentTimeMillis();
		
		int sum = 0;
		for (int i = 0; i <=1000000; i++) {
			sum +=i;
			
		}
		long time2 = System.nanoTime();
		
		System.out.println("Total until 1~1000000: "+sum);
		System.out.println("calculate "+(time2-time1)+"took nanoseconds");
		System.out.println(a);
		
		
		}
	}


