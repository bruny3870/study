
class OverLoad1 {
	void test() {
		System.out.println("Java");
	}
	
	void test(int a) {
		System.out.println("a : " + a);
	}
	
	void test(int a, int b) {
		System.out.println("a : " + a + " b : " + b);
	}
	
	double test(double a) {
		System.out.println("double a : " + a);
		return a * 2;
	}
}

public class MySample1115_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메서드 오버로딩
		/*
		 출력 예) Java
		 		a : 100
		 		a : 89	b: 90
		 		double a : 99.12
		 		total rest 결과 : 198.24 (바로 위 99.12 * 2 한 값)
		 */
		OverLoad1 o = new OverLoad1();
		double t;
		
		o.test();
		o.test(100);
		o.test(89, 90);
		t = o.test(99.12);
		System.out.println("total rest 결과 : " + t);
	}

}
