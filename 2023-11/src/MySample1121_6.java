class Time {		//default 생략
	private int hour, minute, second;		//private - 같은 클래스내에서만 접근 가능
	
	Time(int hour, int minute, int second) {
//		this.hour = hour;
//		this.minute = minute;
//		this.second = second;
//		코드 중복 제거
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public void errPrint(String msg) {
		System.out.println("현재 오류는 " + msg + " 입니다.");
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public void setHour(int hour) {
		//시간은 0 ~ 23시 사이 값만 허용
		if (hour < 0 || hour > 23) {
			errPrint("시간 0 ~ 23 사이 오류");
			return;
		}
		
		this.hour = hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public void setMinute(int minute) {
		//분은 0 ~ 59분 사이 값만 허용
		if (minute < 0 || minute > 59) {
			errPrint("분 0 ~ 59 사이 오류");
			return;
		}
		
		this.minute = minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setSecond(int second) {
		//초는 0 ~ 59초 사이 값만 허용
		if (second < 0 || second > 59) {
			errPrint("초 0 ~ 59 사이 오류");
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
		//접근 제어자 (private, (default), protected, public)
		Time t = new Time(16, 40, 31);
		
		System.out.println(t);
		
		//t.hour = 12;
		t.setHour(t.getHour()+ 1);
		
		System.out.println(t);
	}

}
