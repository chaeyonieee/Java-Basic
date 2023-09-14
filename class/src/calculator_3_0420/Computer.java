package calculator_3_0420;

public class Computer extends Calculator {

	
	@Override
	double areaCircle(double r) {
		System.out.println("Run areaCorcle() of computer object");
			return Math.PI * r*r;
	}
	
}
