
class MyMath {
	int a;
	int b;
	
	int add(int a, int b) {
		return a + b;
	}
	
	int add() {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
	}
	
	int sub() {
		return a - b;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	int mul() {
		return a * b;
	}
	
	int div(int a, int b) {
		return a / b;
	}
	
	int div() {
		return a / b;
	}

}

public class MySample1115_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메서드 오버로딩
		MyMath m = new MyMath();
		
		m.a = 200;
		m.b = 100;
		
		System.out.println(m.add(200, 100));
		System.out.println(m.sub(200, 100));
		System.out.println(m.mul(200, 100));
		System.out.println(m.div(200, 100));
		
		System.out.println(m.add());
		System.out.println(m.sub());
		System.out.println(m.mul());
		System.out.println(m.div());
	}
	
}
