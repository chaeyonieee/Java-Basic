package chap07;
public interface RemoteControl {

	int  MAX_VOLOUME = 10;
	int MIN_VOLUME = 0;
	
	
	
	void turnOn();
	void turnOff();
	void setvolume(int volume);
	void getvolume();
	
	
	default void setMute(boolean mute) {
		
		if(mute) {
			System.out.println("Be silent.");
		}else {
			System.out.println("Turn off the silence.");
		}
	}
	
	
	static void changeBattery() {
		System.out.println("Replace the battery.");
	}
	
}
