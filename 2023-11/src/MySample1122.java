/*
 접근제어자, 오버라이딩(상속)
 출력 예) 좋은 아침입니다. 오전에는 맑음 입니다.
 		즐거운 점심입니다. 점심에는 흐림 입니다.
 		행복한 오후되세요. 오후에는 비가 내리겠습니다.
 단) greetig 매소드 사용
 Morning(아침), Lunch(점심), Dinner(저녁) 클래스로 정의
 */
class Today {
	private String weather;
	
	public String getWeather() {
		return this.weather;
	}
	
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	void greeting() {
		System.out.println("즐거운 하루 되세요.");
	}
	
	//생성자
//	Today(String weather) {
//		setWeather(weather);
//	}
}

class Morning extends Today {	
	
	//생성자
	Morning(String weather) {
		setWeather(weather);		//weather 대입
//		super(weather);				//Today()클래스 생성자를 이용한 변수 대입
	}
	
	//오버라이딩
	void greeting() {		
		System.out.println("좋은 아침입니다. 오전에는 " + getWeather() + " 입니다.");			//weather 호출
	}
}

class Lunch extends Today {
	
	//생성자
	Lunch(String weather) {
		setWeather(weather);		//weather 대입
	}
	
	//오버라이딩
	void greeting() {		
		System.out.println("즐거운 점심입니다. 점심에는 " + getWeather() + " 입니다.");		//weather 호출
	}
}

class Dinner extends Today {
	
	//생성자
	Dinner(String weather) {
		setWeather(weather);		//weather 대입
	}
	
	//오버라이딩
	void greeting() {		
		System.out.println("행복한 오후되세요. 오후에는 " + getWeather() + "가 내리겠습니다.");		//weather 호출
	}
}

public class MySample1122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning m = new Morning("맑음");
		Lunch l = new Lunch("흐림");
		Dinner d = new Dinner("비");
		
		m.greeting();
		l.greeting();
		d.greeting();
	}

}
