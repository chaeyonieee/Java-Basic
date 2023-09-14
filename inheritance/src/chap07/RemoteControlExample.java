package chap07;

public class RemoteControlExample {

	public static void main(String[] args) {

		RemoteControl rc ;
	
		rc = new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setvolume(11);
		rc.getvolume();
		rc.setMute(false);
		

		

		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setvolume(15);
		rc.getvolume();
		rc.setMute(true);
		rc.getvolume();
		
		System.out.println("------");
		
		SmartTelevision s = new SmartTelevision();
		s.turnOn();
		s.turnOff();
		s.setvolume(11);
		s.getvolume();
		
		RemoteControl.changeBattery();
		
		System.out.println("------");
		s.search("sdfdf");
		System.out.println("------");
		
	
			
		}
	
	}


