package cell;

public class CellPhone {
	
	String model;
	String color;
	
	
	void powerOn() {System.out.println("Turn on the light");}
	 void poweroff() {System.out.println("Turn off the light.");}
	 void bell() {System.out.println("Ring the bell");}
	 void sendvoice(String message) {System.out.println("myself: "+message);}
	 void receiveVoice(String message) {System.out.println("them: "+message);}
	 void hangUp() {System.out.println("Hnag off the phone");}

}
