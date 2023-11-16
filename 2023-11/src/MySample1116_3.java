class Car {
	//인스턴스 변수
	String color;
	String gearType;
	int door;
	
	//생성자
	/* 
	//첫번째
	Car() {
		
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	*/
	
	/*
	//두번째
	Car() {
		color = "white";
		gearType = "auto";
		door = 4;
	}
	
	Car(String c) {
		color = c;
		gearType = "auto";
		door = 4;
	}
	*/
	
	//지역변수는 그냥 사용, 클래스 내에 있는 인스턴스 변수는 this.를 사용
	Car() {
//		this.color = "white";
//		this.gearType = "auto";
//		this.door = 4;
		this("white", "auto", 4);			//this(); 같은 클래스 내에 다른 생성자 호출 => 코드 중복성 제거
		System.out.println("매개변수 없음");
	}
	
	Car(String color) {
//		this.color = color;
//		this.gearType = "auto";
//		this.door = 4;
		this(color, "auto", 4);
		System.out.println("매개변수 1개 color");
	}
	
	//Car(String gearType) 		//타입 중복
	
	Car(String color, String gearType) {
//		this.color = color;
//		this.gearType = gearType;
//		this.door = 2;
		this(color, gearType, 2);
		System.out.println("매개변수 2개 color, gearType");
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("매개변수 3개");
	}
}

public class MySample1116_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자
		/*
		Data2 d = new Data2();
		Data2 d2 = new Data2(10);
		
		System.out.println("d.value : " + d.value);
		System.out.println("d2.value : " + d2.value);
 		*/
		
		/* 
		//첫번째
		Car c1 = new Car();						//매개변수 없음
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("blue", "auto", 2);	//매개변수 있음
		
		System.out.println("c1의 color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2의 color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		*/

		/*
		//두번째
		//매개변수 1개는 color, 매개변수 없을때는 white
		//gearType = auto, door = 4
		System.out.println("main() 시작 c1 생성");
		Car c1 = new Car();
		System.out.println("main() 시작 c2 생성");
		Car c2 = new Car("blue");
		
		System.out.println("c1의 color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2의 color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		*/
		
		System.out.println("main() 시작 c1 생성");
		Car c1 = new Car();
		System.out.println("main() 시작 c2 생성");
		Car c2 = new Car("blue");
		System.out.println("main() 시작 c3 생성");
		Car c3 = new Car("red", "auto");
		
		System.out.println("c1의 color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2의 color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		System.out.println("c3의 color : " + c3.color + ", gearType : " + c3.gearType + ", door : " + c3.door);
	}
}

class Data2 {
	int value;
	
	Data2() {
		System.out.println("생성자 Data2() 호출");
	}
	
	Data2(int x) {
		System.out.println("생성자 Data2(int x) 호출");
		value = x;
	}
}
