package inter2;

public interface RemoteControl {
	//상수
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	//추상메소드
	void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}

/*
 	turnOn은 "TV를 켭니다." 또는 "오디오를 켭니다."
 	turnOff는 "TV를 끕니다." 또는 "오디오를 끕니다".
 	setVolume은 max값과 min값에 대한 값 체크 후 tv는 "현재 TV볼륨 : 5", 오디오는 "현재 오디오볼륨 : 5"
 	출력 예) 11111111
 		   Tv를 켭니다.
 		   현재 Tv 볼륨 : 5
 		   22222222
 		   오디오를 켭니다.
 		   현재 오디오 볼륨 : 5
 		   33333333
 		   오디오를 켭니다.
 		   현재 오디오 볼륨 : 5
 		   44444444
 		   Tv를 켭니다.
 		   현재 Tv 볼륨 : 5
 */