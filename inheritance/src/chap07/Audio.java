package chap07;

public class Audio implements RemoteControl {

	private int volume;
	private boolean mute;
	
	public void turnOn(){
		System.out.println("Turn on the radio");
	}
	
	public void turnOff(){
		System.out.println("Turn off the radio ");
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
		System.out.println("current audio volumn : " +this.volume);
	}
		
		
		public void setMute(boolean mute){
			
			if(mute) {
				System.out.println("Audio will be silent.");
			}else {
				System.out.println("Turn the audio off.");
			}
		}
		

}
		





