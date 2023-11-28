package inter2;

//나의 방식
public class Tv implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			System.out.println("잘못 입력하셨습니다.");
		} else if (volume == MAX_VOLUME) {
			this.volume = volume;
			System.out.println("현재 Tv 볼륨 최대");
		} else if (volume == MIN_VOLUME) {
			this.volume = volume;
			System.out.println("현재 Tv 볼륨 최소");
		} else {
			this.volume = volume;
			System.out.println("현재 Tv 볼륨 : " + this.volume);
		}
	}
}
