import java.util.Scanner;

class Math2 {
	//�ν��Ͻ� �޼���
	int add (int a, int b) {
		System.out.println("add�޼��� ���� : a = " + a + ", b = " + b);
		a = a + 10;
		b = b + 10;
		
		int result = a + b;
		
		System.out.println("add�޼��� �� : a = " + a + ", b = " + b);
		
		return result;		//return a + b ����
	}
}

class Math3 {
	int add(int a, int b) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
		
//		//�׻� ū ������ ���� ���� �� �� �ְ� ó��
//		if (a > b) {
//			return a - b;
//		} else {
//			return b - a;
//		}
		
//		int c = 0;
//		
//		if (a > b) {
//			c = a - b;
//		} else if (b > a) {
//			c = b - a;
//		}
//		
//		return c;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	double div(int a, int b) {
		return (double)a / b;
	}
	
	//�ν��Ͻ� ����
	//int a, b;
	
	//Ŭ���� ����	=> Ŭ���������� �ν��Ͻ������� �޸� ������ ����
	static int a, b;
	
	//�ν��Ͻ� �޼���
	int add() {
		return a + b;
	}
	
	int sub() {
		return a - b;
	}
	
	int mul() {
		return a * b;
	}
	
	double div() {
		return (double)a / b;
	}

}


public class MySample1114_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		//���� Ŭ����
		System.out.print("���� 2���� �Է��ϼ��� => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("main() �޼��� ȣ�� �� : a = " + a + ", b = " + b);
		
		Math2 m = new Math2();
		int c = m.add(a, b);
		
		System.out.println("main() �޼��� ȣ�� �� : a = " + a + ", b = " + b + ", c = " + c);
		*/
		
		/*
		 ����) �� ������ �Է� �޾� ���ϱ�, ����, ���ϱ�, ������ ������ ���
		 �Է� ��) �� ������ �Է��ϼ��� => 5 3
		 ��� ��) add(a, b) = 8
		 		sub(a, b) = 2
		 		mul(a, b) = 15
		 		div(a, b) = 1.6666666666666667 (�Ҽ����� �Ǽ��� ǥ��)
		 ��) Ŭ������ Math3�� ����
		 
		System.out.print("�� ������ �Է��ϼ��� => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Math3 m = new Math3();
		int add = m.add(a, b);
		int sub = m.sub(a, b);
		int mul = m.mul(a, b);
		double div = m.div(a, b);
		
		System.out.println("add(a, b) = " + add);
		System.out.println("sub(a, b) = " + sub);
		System.out.println("mul(a, b) = " + mul);
		System.out.println("div(a, b) = " + div);	//double�� �Ҽ������� 15�ڸ��� println���� ǥ��
		System.out.printf("div(a, b) = %f", div);	//printf�� �Ҽ������� 6�ڸ����� ǥ��
		*/
		
		/*
		 ����) ���� ������ ����� �ν��Ͻ� ������ �̿��� ����
		 
		Math3 m = new Math3();
		
		System.out.print("�� ������ �Է��ϼ��� => ");
		m.a = sc.nextInt();
		m.b = sc.nextInt();
		
		System.out.println("add(a, b) = " + m.add());
		System.out.println("sub(a, b) = " + m.sub());
		System.out.println("mul(a, b) = " + m.mul());
		System.out.println("div(a, b) = " + m.div());
		*/
		
		/*
		 ����) ���� ������ ����� Ŭ���� ������ �̿��� ����
		 Math3Ŭ������ ���� ��ü �ν��Ͻ� m1, m2�� ���ؼ� ������ ��
		 m1�� m2���� ���� ���� ������ �����Ѵٴ� �ǹ̷� ���
		 Ŭ���� �������� �����ҽ��� �����Ͽ� a, b �״�� ���
		 */
		Math3 m1 = new Math3();
		Math3 m2 = new Math3();
		
		System.out.print("�� ������ �Է��ϼ��� => ");
		Math3.a = sc.nextInt();		//Ŭ���� ȣ��
		Math3.b = sc.nextInt();
		
		System.out.println("m1 add(a, b) = " + m1.add());
		System.out.println("m1 sub(a, b) = " + m1.sub());
		System.out.println("m1 mul(a, b) = " + m1.mul());
		System.out.println("m1 div(a, b) = " + m1.div());
		System.out.println();
		System.out.println("m2 add(a, b) = " + m2.add());
		System.out.println("m2 sub(a, b) = " + m2.sub());
		System.out.println("m2 mul(a, b) = " + m2.mul());
		System.out.println("m2 div(a, b) = " + m2.div());
		
		
		
	}

}
