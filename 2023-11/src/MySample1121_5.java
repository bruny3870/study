/*
class Point3 {
	int x, y;
	
	Point3() {
		this(0, 0);
	}
	
	Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D2 extends Point3 {
	int z;
	
	Point3D2() {
		this(0, 0, 0);
	}
	
	Point3D2(int x, int y, int z) {
		super(x, y);
//		super.x = x;
//		super.y = y;
		this.z = z;
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y + ", z : " + z;
		//return super.getLocation();		//Point3 Ŭ���� �޼ҵ� ȣ��
	}
}

public class MySample1121_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̵�
		Point3D2 p3 = new Point3D2(1, 2, 3);
		System.out.println(p3.getLocation());
		
		//getLocation() �޼ҵ带 Point3 Ŭ���� �޼ҵ带 ȣ�� �ϴ� ���
		Point3 p = new Point3();
		System.out.println(p.getLocation());
		
	}

}
*/

class Clothes {
	void cutHeight() {
		System.out.println("���̸� �����Ͽ����ϴ�.");
	}
	
	void cutWidth() {
		System.out.println("���̸� �����Ͽ����ϴ�.");
	}
	
	void showPrice() {
		System.out.println("��������� 5000�� �Դϴ�.");
	}
}

class Reform extends Clothes {
	void cutHeight() {
		System.out.println("���̸� �ٽ� ���� ������Ͽ����ϴ�.");
	}
	
	void cutWidth() {
		System.out.println("���̸� �ٽ� ���� ������Ͽ����ϴ�.");
	}
}

public class MySample1121_5 {
	
	public static void main(String[] arsg) {
		//�������̵�
		Clothes ct = new Clothes();
		Reform re = new Reform();
		
		ct.cutHeight();
		ct.cutWidth();
		ct.showPrice();
		
		re.cutHeight();
		re.cutWidth();
		re.showPrice();		//�θ� Ŭ���� �޼ҵ� �����ͼ� ���
	}
}
