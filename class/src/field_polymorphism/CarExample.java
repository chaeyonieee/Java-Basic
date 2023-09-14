package field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
//		for (int i = 0; i <=5 ; i++) {
//			int problemLocation = car.run();
//			switch(problemLocation) {
//			case 1:
//				System.out.println("앞왼쪽 HanKookTire로 교체");
//				car.frontLeftTire = new HanKookTire("앞왼쪽",2);
//				break;
//			case 2:
//			
//				System.out.println("앞오른쪽 KumhoTire로 교체");
//				car.frontRightTire = new KumhoTire("앞오른쪽",2);
//				break;
//				
//			case 3:
//				System.out.println("뒤왼쪽 HanKookTire로 교체");
//				car.backLeftTire = new HanKookTire("뒤왼쪽",3);
//				break;	
//				
//			case 4:
//				System.out.println("뒤오른쪽 KumhoTire로 교체");
//				car.backRightTire = new KumhoTire("뒤오른쪽",2);
//				break;
//			}
//		}System.out.println("-------------------");
//		
		
for (int i = 1; i <=5; i++) {
	int problemLocation = car.run();
	if(problemLocation !=  0) {
		System.out.println(car.tires[problemLocation-1].location + "HankookTire change");
	}
	System.out.println("------------");
		
	}
}
		
		
	}


