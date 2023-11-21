class Time {		//default ����
	private int hour, minute, second;		//private - ���� Ŭ������������ ���� ����
	
	Time(int hour, int minute, int second) {
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
//		�ڵ� �ߺ� ����
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void errPrint(String msg) {
		System.out.println("���� ������ " + msg + " �Դϴ�.");
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		//�ð��� 0 ~ 23�� ���� ���� ���
		if (hour < 0 || hour > 23) {
			errPrint("�ð� 0 ~ 23 ���� ����");
			return;
		}
		
		this.hour = hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public void setMinute(int minute) {
		//���� 0 ~ 59�� ���� ���� ���
		if (minute < 0 || minute > 59) {
			errPrint("�� 0 ~ 59 ���� ����");
			return;
		}
		
		this.minute = minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setSecond(int second) {
		//�ʴ� 0 ~ 59�� ���� ���� ���
		if (second < 0 || second > 59) {
			errPrint("�� 0 ~ 59 ���� ����");
			return;
		}
		
		this.second = second;
	}
	
	public String toString() {
		return getHour() + " : " + getMinute() + " : " + getSecond();
	}
}


public class MySample1121_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������ (private, (default), protected, public)
		Time t = new Time(16, 40, 31);
		
		System.out.println(t);
		
		//t.hour = 12;
		t.setHour(t.getHour()+ 1);
		
		System.out.println(t);
	}

}
