class MyMath2 {
	int n;			//인스턴스변수 - 메소드단위 관리 (메소드 마다 따로 적용)
	
	static int m; 	//클래스변수 - 클래스단위 관리 (클래스 전체 적용) 
	
	int add(int a, int b) {
		System.out.println(++n);
		return a + b;
	}
	
	int add(int a, double b) {
		System.out.println(++n);
		return (int)(a + b);
		//return a + (int)b;
	}
	
	int add(double a, int b) {
		System.out.println(++n);
		//return (int)a + b;
		return (int)(a + b);
	}
	
	double add(double a, double b) {
		System.out.println(++n);
		return a + b;
	}
	
	int add(int[] a) {
		int i;
		int sum = 0;
		
		System.out.println(++n);
		
		for (i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
}

public class MySample1116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 오버로딩
		/*
		 출력 예) 1
		 		13		(5, 8)
		 		2
		 		12		(5, 7.1)
		 		3
		 		12		(7.1, 5)
		 		4
		 		12.3	(7.1, 5.2)
		 		5
		 		210		(배열) 		
		 */
		int[] a = new int[] {10, 20, 30, 40, 50, 60};
		
		MyMath2 m = new MyMath2();
		MyMath2 m2 = new MyMath2();
		
		System.out.println(m.add(5, 8));
		System.out.println(m.add(5, 7.1));
		System.out.println(m.add(7.1, 5));
		System.out.println(m.add(7.1, 5.2));
		System.out.println(m.add(a));
		
		System.out.println("\n");
		
		System.out.println(m2.add(5, 8));
		System.out.println(m2.add(5, 7.1));
		System.out.println(m2.add(7.1, 5));
		System.out.println(m2.add(7.1, 5.2));
		System.out.println(m2.add(a));
	}
}
