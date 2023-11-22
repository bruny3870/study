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
	int speedLimit;		//���Ѽӵ�
	
	SportsCar(String color) {						//��
		super(color);
		speedLimit = 200;
	}
	
	SportsCar(String color, int speedLimit) {		//��, ���ǵ�
		super(color);
		this.speedLimit = speedLimit;
	}
	
	SportsCar(String color, String gearType) {		//��, ���
		super(color, gearType);
		speedLimit = 200;
	}
	
	SportsCar(String color, String gearType, int speedLimit) {		//��, ���, ���ǵ�
		super(color, gearType);
		this.speedLimit = speedLimit;
	}
	
	SportsCar(String color, String gearType, int speedLimit, int door) {	//��, ���, ���ǵ�, ��
		super(color, gearType, door);
		this.speedLimit = speedLimit;
	}
	
	//�������̵�
	public String toString() {
		return "������ ���� " + getColor() + "�̰�, " + getGearType() + "�̸�, ���� ������ " + getDoor() + "���̰�, ���Ѽӵ��� " + speedLimit + "�Դϴ�.";
	}
}

public class MySample1122_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ���� ���) ������ ���� red�̰�, auto�̸�, ���� ������ 4���̰�, ���Ѽӵ��� 330 �Դϴ�.
		 ��) ���� ���� �ݵ�� �Է¹ް�, ���Ѽӵ��� ���� ��� 200, ���Ÿ���� ���� ��� auto,
		 	 �� ������ ���� ��� 4��
		 */
		//���� color, gearType, speedLimit, door 
		SportsCar cs = new SportsCar("red", 330);
		
		
		System.out.println(cs);		//cs.toString();
	}

}
