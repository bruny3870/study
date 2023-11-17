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
	
	String getXY() {		//���ڿ��� ����
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
	int r;		//������
	
	Circle() {
//		Point p = new Point(0, 0);
//		this(p, 100);		//this()�� �׻� ù��° ���ο��� ȣ��Ǿ�� ��
		this(new Point(0, 0), 100);		//�ּҰ� ��ȯ
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
		//���
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
		//�ٷ� �� ������ �и��Ͽ� ����
		//Point p2 = new Point(150, 150);
		//Circle c2 = new Circle(p2, 50);
		
		t.draw();		//�ﰢ�� �׸���
		c.draw();		//���� �׸���
		
	}

}
