class Car3 {
	private String color;
	private String gearType;
	private int door;
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getGearType() {
		return this.gearType;
	}
	
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	
	public int getDoor() {
		return this.door;
	}
	
	public void setDoor(int door) {
		this.door = door;
	}
	
	Car3(String color) {
//		setColor(color);
//		setGearType("auto");
//		setDoor(4);
		this(color, "auto", 4);
	}
	
	Car3(String color, String gearType) {
//		setColor(color);
//		setGearType(gearType);
//		setDoor(4);
		this(color, gearType, 4);
	}
	
	Car3(String color, String gearType, int door) {
		setColor(color);
		setGearType(gearType);
		setDoor(door);
	}
}

class SportsCar extends Car3 {
	int speedLimit;		//제한속도
	
	SportsCar(String color) {						//색
		super(color);
		speedLimit = 200;
	}
	
	SportsCar(String color, int speedLimit) {		//색, 스피드
		super(color);
		this.speedLimit = speedLimit;
	}
	
	SportsCar(String color, String gearType) {		//색, 기어
		super(color, gearType);
		speedLimit = 200;
	}
	
	SportsCar(String color, String gearType, int speedLimit) {		//색, 기어, 스피드
		super(color, gearType);
		this.speedLimit = speedLimit;
	}
	
	SportsCar(String color, String gearType, int speedLimit, int door) {	//색, 기어, 스피드, 문
		super(color, gearType, door);
		this.speedLimit = speedLimit;
	}
	
	//오버라이딩
	public String toString() {
		return "차량의 색은 " + getColor() + "이고, " + getGearType() + "이며, 문의 갯수는 " + getDoor() + "개이고, 제한속도는 " + speedLimit + "입니다.";
	}
}

public class MySample1122_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 실행 결과) 차량의 색은 red이고, auto이며, 문의 갯수는 4개이고, 제한속도는 330 입니다.
		 단) 차량 색은 반드시 입력받고, 제한속도가 없을 경우 200, 기어타입이 없을 경우 auto,
		 	 문 갯수가 없을 경우 4개
		 */
		//순서 color, gearType, speedLimit, door 
		SportsCar cs = new SportsCar("red", 330);
		
		
		System.out.println(cs);		//cs.toString();
	}

}
