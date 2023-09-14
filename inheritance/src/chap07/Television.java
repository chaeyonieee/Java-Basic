package chap07;

public class Television implements RemoteControl {

	
	private int volume;
	private boolean mute;
	
	public void turnOn(){
		System.out.println(" Turn on the TV.");
	}
		
	public void turnOff(){
			System.out.println("turn off the TV");
		}
		
	public void setvolume(int volume){
		
		if(volume> RemoteControl.MAX_VOLOUME) {
			this.volume = RemoteControl.MAX_VOLOUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
	}

	public void getvolume(){
		System.out.println("current TV volumn : " +this.volume);
		
	}
	public void setMute(boolean mute){
	
		if(mute) {
			System.out.println("Television silence.");
		}else {
			System.out.println("Turn off the television silence.");
		}
	}
		public void setmute(){
			System.out.println("Current TV volume: " +this.mute);
			

	
	
}
}
	

