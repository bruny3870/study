package inter2;

//���� ���
public class Tv implements RemoteControl {
	int volume;
	
	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
	}
	
	@Override
	public void setVolume(int volume) {
		if (volume > MAX_VOLUME || volume < MIN_VOLUME) {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} else if (volume == MAX_VOLUME) {
			this.volume = volume;
			System.out.println("���� Tv ���� �ִ�");
		} else if (volume == MIN_VOLUME) {
			this.volume = volume;
			System.out.println("���� Tv ���� �ּ�");
		} else {
			this.volume = volume;
			System.out.println("���� Tv ���� : " + this.volume);
		}
	}
}
