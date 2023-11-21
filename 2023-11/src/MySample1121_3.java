class Point2 {
	int x;
	int y;
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point2 {
	int z;
	
	String getLoString() {
		return "x : " + x + ", y : " + y + ", z : " + z;
		//부모의 getLocation() 메서드 호출 방법
		//return super.getLocation() + ", z : " + z; 
	}
}

public class MySample1121_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩
		Point3D p3 = new Point3D();
		
		p3.x = 10;
		p3.y = 20;
		p3.z = 30;
		
		System.out.println(p3.getLocation());		//Point2의 메소드
		System.out.println(p3.getLoString());		//Point3D의 메소드
	}

}
