class MyMath2 {
	int n;			//�ν��Ͻ����� - �޼ҵ���� ���� (�޼ҵ� ���� ���� ����)
	
	static int m; 	//Ŭ�������� - Ŭ�������� ���� (Ŭ���� ��ü ����) 
	
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
		//�޼ҵ� �����ε�
		/*
		 ��� ��) 1
		 		13		(5, 8)
		 		2
		 		12		(5, 7.1)
		 		3
		 		12		(7.1, 5)
		 		4
		 		12.3	(7.1, 5.2)
		 		5
		 		210		(�迭) 		
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
