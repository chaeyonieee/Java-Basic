package cell;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone("Java Phone", "black",10);
		
		System.out.println("model: "+dmbCellPhone.model);
		System.out.println("color: "+dmbCellPhone.color);
		
		System.out.println("channel: "+dmbCellPhone.channel);
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendvoice("Hello");
		dmbCellPhone.receiveVoice("Hello my name is chaeyeon");
		dmbCellPhone.sendvoice("Nice to meet you");
		dmbCellPhone.hangUp();
		
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		
		

	}

}
