package inter2;

//°­»ç´Ô ¹æ½Ä (Ä¸½¶È­)
public class Audio implements RemoteControl {
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("¿Àµð¿À¸¦ ÄÕ´Ï´Ù.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("¿Àµð¿À¸¦ ²ü´Ï´Ù.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME) {
			this.volume = MAX_VOLUME;
		} else if (volume < MIN_VOLUME) {
			this.volume = MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		
		System.out.println("ÇöÀÚ ¿Àµð¿À º¼·ý : " + this.volume);
	}
	
	public int getVolume() {
		return this.volume;
	}
}
