package field_polymorphism;



public class Car {
	
	
//	Tire frontLeftTire = new Tire("�տ���",2);
//	Tire frontRightTire = new Tire("�տ�����",2);
//	Tire backLeftTire = new Tire("�ڿ���",3);
//	Tire backRightTire = new Tire("�ڿ�����",2);
//	
	
	Tire [] tires = {
			new Tire("front left",6),
			new Tire("front right",2),
			new Tire("back left",3),
			new Tire("back right",4)
	};
	
//	int run() {
//		System.out.println("[�ڵ����� �޸��ϴ�.]");
//		if(frontLeftTire.roll()==false) {stop();return 1;};
//		if(frontRightTire.roll()==false) {stop();return 2;};
//		if(backLeftTire.roll()==false) {stop();return 3;};
//		if(backRightTire.roll()==false) {stop();return 4;};
//		return 0;
//	}
	int run() {
		System.out.println("[The car runs.]");
		for (int i = 0; i < tires.length; i++) {
			if(tires[i].roll()==false) {
				stop();
				return(i+1);
			}
		}
	return 0;
	}
	void stop() {
		System.out.println("[the car stops.]");
		
	}
}
