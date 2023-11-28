package inter2;

public interface RemoteControl {
	//���
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}

/*
 	turnOn�� "TV�� �մϴ�." �Ǵ� "������� �մϴ�."
 	turnOff�� "TV�� ���ϴ�." �Ǵ� "������� ���ϴ�".
 	setVolume�� max���� min���� ���� �� üũ �� tv�� "���� TV���� : 5", ������� "���� ��������� : 5"
 	��� ��) 11111111
 		   Tv�� �մϴ�.
 		   ���� Tv ���� : 5
 		   22222222
 		   ������� �մϴ�.
 		   ���� ����� ���� : 5
 		   33333333
 		   ������� �մϴ�.
 		   ���� ����� ���� : 5
 		   44444444
 		   Tv�� �մϴ�.
 		   ���� Tv ���� : 5
 */