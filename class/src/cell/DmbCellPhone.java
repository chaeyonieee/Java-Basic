package cell;

public class DmbCellPhone extends CellPhone {

	int channel;
	
	DmbCellPhone(String model, String color, int channel){
	this.model = model;	
	this.color = color;
	this.channel = channel;
	
	}
	void turnOnDmb() {
		System.out.println("channel "+channel + "Starts receiving the broadcast of the dialed dmb.");
		
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("channel "+channel +"Replace number");
	}
	void turnOffDmb() {
		System.out.println("Stop receiving dmb broadcasts.");
	}
}
