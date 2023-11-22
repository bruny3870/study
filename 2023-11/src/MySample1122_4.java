class Car4 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive().... Car4");
	}
	
	void stop() {
		System.out.println("stop().... Car4");
	}
}

class FireEngine extends Car4 {
	void water() {
		System.out.println("water().... FireEngine");
	}
}

public class MySample1122_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성
		/*
		Car4 c = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		f.water();
		c = f;					//다형성 => Car4 c = new FireEngine(); 과 같음
								//내부적으로 형 변환이 알아서 발생 (up-casting 업-캐스팅)
		
//		c.water();				//불가능 (부모형 참조변수로 자식 객체를 바라 볼 수는 있으나 자식 객체의 메소드는 사용 할 수 없음
		
		f2 = (FireEngine)c;		//강제로 형 변환을 발생 (down-casting 다운-캐스팅)
		f2.water();
		*/
		
		//불가능한 예제
//		Car4 c = new Car4();				
		Car4 c = new FireEngine();			//변경 하면 1. 실행시에도 오류 안남
		Car4 c2 = null;
		
		FireEngine f = null;
		Car4 c3 = new FireEngine();
		
		c.drive();
		f = (FireEngine)c;					// f = c; 불가능 하나 형 변환을 통해 가능 (다운-캐스팅)
											// FireEngine f = new Car4();   자식이 부모를 참조 할 수 없음
		
		
											//컴파일은 가능 하나 실행 시 오류 발생
		
		f.drive();							//실행 시 오류
		f.water();							//실행 시 오류
		
		c2 = f;								//업-캐스팅
//		c2.water();							//불가능 (c2참조변수는 클래스타입이 Car4 이고 water()메소드는 FireEngine클래스의 메소드 이기 때문에 불가능)
		
		c2.drive();
		c2.stop();
	}

}
