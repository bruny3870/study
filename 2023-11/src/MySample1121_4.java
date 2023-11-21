class Parent {
	int x = 10;
}

class Child extends Parent {
	int x = 20;
	
	void methodA() {
		int x = 30;
		
		System.out.println("x : " + x);					//지역변수
		System.out.println("this.x : " + this.x);		//인스턴스 변수
		System.out.println("super.x : " + super.x);		//부모 클래스 인스턴스 변수
	}
}

public class MySample1121_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//오버라이딩
		Child c = new Child();
		c.methodA();
	}

}
