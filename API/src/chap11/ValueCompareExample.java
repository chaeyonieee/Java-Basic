package chap11;

public class ValueCompareExample {

	public static void main(String[] args) {
		System.out.println("[-128-127 Exceeded value]");
		Integer obj1 = 128;
		Integer obj2 = 128;
		System.out.println("==result: "+(obj1==obj2));
		System.out.println("After unboxing == result: "+(obj1.intValue()==obj2.intValue()));
		System.out.println("equals() result: "+obj1.equals(obj2));
		
		System.out.println("[-128-127 range]]");
		Integer obj3 =10;
		Integer obj4 = 10;
		System.out.println("==result: "+(obj3==obj4));
		System.out.println("After unboxing == result: "+(obj3.intValue()==obj4.intValue()));
		System.out.println("equals() result: "+obj3.equals(obj4));
	}
}

