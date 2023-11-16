class Car1 {
	String color;
	String gearType;
	int door;
	
	Car1() {
//		this.color = "white";
//		this.gearType = "auto";
//		this.door = 6;
		this("white", "auto", 6);		//생성자에서 다른 생성자 호출 시 항상 첫번째 줄 위치
	}
	
	Car1(Car1 c) {
//		this.color = c.color;
//		this.gearType = c.gearType;
//		this.door = c.door;
		this(c.color, c.gearType, c.door);
	}
	
	Car1(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class MySample1116_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자 - 생성자를 이용한 인스턴스 복사 (값복사 x -> 주소값 복사)
		Car1 c1 = new Car1();
		Car1 c2 = new Car1(c1);
		Car1 c3 = new Car1(c1);
		
		System.out.println("c1 color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2 color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		System.out.println("c3 color : " + c3.color + ", gearType : " + c3.gearType + ", door : " + c3.door);
		
		System.out.println();
		
		c1.door = 50;
		c2.color = "pink";
		
		System.out.println("c1 color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2 color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		System.out.println("c3 color : " + c3.color + ", gearType : " + c3.gearType + ", door : " + c3.door);
		
	}

}
