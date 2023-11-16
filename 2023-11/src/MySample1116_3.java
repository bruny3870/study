class Car {
	//�ν��Ͻ� ����
	String color;
	String gearType;
	int door;
	
	//������
	/* 
	//ù��°
	Car() {
		
	}
	
	Car(String c, String g, int d) {
		color = c;
		gearType = g;
		door = d;
	}
	*/
	
	/*
	//�ι�°
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
	
	//���������� �׳� ���, Ŭ���� ���� �ִ� �ν��Ͻ� ������ this.�� ���
	Car() {
//		this.color = "white";
//		this.gearType = "auto";
//		this.door = 4;
		this("white", "auto", 4);			//this(); ���� Ŭ���� ���� �ٸ� ������ ȣ�� => �ڵ� �ߺ��� ����
		System.out.println("�Ű����� ����");
	}
	
	Car(String color) {
//		this.color = color;
//		this.gearType = "auto";
//		this.door = 4;
		this(color, "auto", 4);
		System.out.println("�Ű����� 1�� color");
	}
	
	//Car(String gearType) 		//Ÿ�� �ߺ�
	
	Car(String color, String gearType) {
//		this.color = color;
//		this.gearType = gearType;
//		this.door = 2;
		this(color, gearType, 2);
		System.out.println("�Ű����� 2�� color, gearType");
	}
	
	Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
		System.out.println("�Ű����� 3��");
	}
}

public class MySample1116_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		/*
		Data2 d = new Data2();
		Data2 d2 = new Data2(10);
		
		System.out.println("d.value : " + d.value);
		System.out.println("d2.value : " + d2.value);
 		*/
		
		/* 
		//ù��°
		Car c1 = new Car();						//�Ű����� ����
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		Car c2 = new Car("blue", "auto", 2);	//�Ű����� ����
		
		System.out.println("c1�� color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2�� color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		*/

		/*
		//�ι�°
		//�Ű����� 1���� color, �Ű����� �������� white
		//gearType = auto, door = 4
		System.out.println("main() ���� c1 ����");
		Car c1 = new Car();
		System.out.println("main() ���� c2 ����");
		Car c2 = new Car("blue");
		
		System.out.println("c1�� color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2�� color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		*/
		
		System.out.println("main() ���� c1 ����");
		Car c1 = new Car();
		System.out.println("main() ���� c2 ����");
		Car c2 = new Car("blue");
		System.out.println("main() ���� c3 ����");
		Car c3 = new Car("red", "auto");
		
		System.out.println("c1�� color : " + c1.color + ", gearType : " + c1.gearType + ", door : " + c1.door);
		System.out.println("c2�� color : " + c2.color + ", gearType : " + c2.gearType + ", door : " + c2.door);
		System.out.println("c3�� color : " + c3.color + ", gearType : " + c3.gearType + ", door : " + c3.door);
	}
}

class Data2 {
	int value;
	
	Data2() {
		System.out.println("������ Data2() ȣ��");
	}
	
	Data2(int x) {
		System.out.println("������ Data2(int x) ȣ��");
		value = x;
	}
}
