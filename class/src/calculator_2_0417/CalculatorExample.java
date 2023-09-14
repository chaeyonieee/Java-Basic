package calculator_2_0417;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		
		Calculator K = new Calculator();
		int result4 = K.plus(10, 50);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
		System.out.println(result4);
	}

}
