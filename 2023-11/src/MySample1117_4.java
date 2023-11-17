class Point {
	int x;
	int y;
	
	Point() {
		this(0, 0);
	}
	
	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	String getXY() {		//문자열로 변경
		return "(" + x + ", " + y + ")";
	}
}

class Shape {
	String color = "black";
	
	void draw() {
		System.out.printf("[color = %s] \n", color);
	}
}

class Circle extends Shape {
	Point center;
	int r;		//반지름
	
	Circle() {
//		Point p = new Point(0, 0);
//		this(p, 100);		//this()는 항상 첫번째 라인에서 호출되어야 함
		this(new Point(0, 0), 100);		//주소값 반환
	}
	
	Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("[center = (%d, %d), r = %d, color = %s] \n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape {
	Point[] p = new Point[3];
	
	Triangle(Point[] p) {
		System.out.println("before : " + this.p.length);
		this.p = p;
		System.out.println("after : " + this.p.length);
	}
	
	void draw() {
		System.out.printf("[p1 = %s, p2 = %s, p3 = %s, color = %s] \n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
	}
}

public class MySample1117_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//상속
//		Point a = new Point(100, 100);
//		Point b = new Point(140, 50);
//		Point c = new Point(200, 100);
//		Point[] p = {a, b, c};
		
		Point[] p = {
				new Point(100, 100),
				new Point(140, 50),
				new Point(200, 100)
		};
		
		Triangle t = new Triangle(p);
		
		Circle c = new Circle(new Point(150, 150), 50);
		//바로 위 선언을 분리하여 적용
		//Point p2 = new Point(150, 150);
		//Circle c2 = new Circle(p2, 50);
		
		t.draw();		//삼각형 그리기
		c.draw();		//원형 그르기
		
	}

}
