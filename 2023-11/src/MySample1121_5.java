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
		//return super.getLocation();		//Point3 클래스 메소드 호출
	}
}

public class MySample1121_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩
		Point3D2 p3 = new Point3D2(1, 2, 3);
		System.out.println(p3.getLocation());
		
		//getLocation() 메소드를 Point3 클래스 메소드를 호출 하는 방법
		Point3 p = new Point3();
		System.out.println(p.getLocation());
		
	}

}
*/

class Clothes {
	void cutHeight() {
		System.out.println("높이를 수선하였습니다.");
	}
	
	void cutWidth() {
		System.out.println("넓이를 수선하였습니다.");
	}
	
	void showPrice() {
		System.out.println("수선비용은 5000원 입니다.");
	}
}

class Reform extends Clothes {
	void cutHeight() {
		System.out.println("높이를 다시 맞춰 재수선하였습니다.");
	}
	
	void cutWidth() {
		System.out.println("넓이를 다시 맞춰 재수선하였습니다.");
	}
}

public class MySample1121_5 {
	
	public static void main(String[] arsg) {
		//오버라이딩
		Clothes ct = new Clothes();
		Reform re = new Reform();
		
		ct.cutHeight();
		ct.cutWidth();
		ct.showPrice();
		
		re.cutHeight();
		re.cutWidth();
		re.showPrice();		//부모 클래스 메소드 가져와서 사용
	}
}
