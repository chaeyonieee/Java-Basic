package field_polymorphism;

public class CarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car();
		
//		for (int i = 0; i <=5 ; i++) {
//			int problemLocation = car.run();
//			switch(problemLocation) {
//			case 1:
//				System.out.println("�տ��� HanKookTire�� ��ü");
//				car.frontLeftTire = new HanKookTire("�տ���",2);
//				break;
//			case 2:
//			
//				System.out.println("�տ����� KumhoTire�� ��ü");
//				car.frontRightTire = new KumhoTire("�տ�����",2);
//				break;
//				
//			case 3:
//				System.out.println("�ڿ��� HanKookTire�� ��ü");
//				car.backLeftTire = new HanKookTire("�ڿ���",3);
//				break;	
//				
//			case 4:
//				System.out.println("�ڿ����� KumhoTire�� ��ü");
//				car.backRightTire = new KumhoTire("�ڿ�����",2);
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


