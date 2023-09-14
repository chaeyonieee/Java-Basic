package carExample_2_0417;

public class Car {

	int gas;
	
	void setGas(int gas) {
		this.gas = gas;
		
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("There is no gas");
			return false;
		}
		System.out.println("There is a gas");
			return true;
	}
	
	void run() {
		while(true) {
			if (gas>0) {
				System.out.println("run.(gas left: "+gas +")");
				gas-=1;
				
			}else {
				System.out.println("stop.(gas left:" +gas +")");
				return;
			}
		}
	}
	
	
}
