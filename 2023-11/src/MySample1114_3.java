import java.util.Scanner;

public class MySample1114_3 {
	
	static void firstMethod() {
		System.out.println("firstMethod start....");	// 2
		secondMethod();
		System.out.println("firstMethod end....");		// 7
	}
	
	static void secondMethod() {
		System.out.println("secondMethod start....");	// 3
		thredMethod();
		System.out.println("secondMethod end....");		// 6
	}
	
	static void thredMethod() {
		System.out.println("thredMethod start....");	// 4
		System.out.println("thredMethod end....");		// 5
	}

	static int add(int a, int b) {
		
		a = a * 2;
		b = b * 2;
		
		System.out.println("add �޼��� a : " + a + ", b : " + b);
		
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		//�޼��� ȣ�� ���� - ����
		System.out.println("main start....");			// 1
		firstMethod();	//���� Ŭ���� �ȿ� �־ Ŭ������ ����
		System.out.println("main end....");				// 8
		*/
		
		/*
		 ����) ���� 2���� �Է¹޾� �޼��� ȣ�� ���� �Ŀ� ���� ����� ����ϴ� ���α׷�
		 �Է� ��) ���� 2���� �Է��ϼ��� => 5 10
		 ��� ��) ȣ�� �� a : 5, b : 10			(main�޼��忡�� ���)
		 		add �޼��� a : 10, b : 20		(add�޼��忡�� ���)
		 		��� : 30						(main�޼��忡�� ���)
		 		ȣ�� �� a : 5, b : 10			(main�޼��忡�� ���)
		 
		System.out.print("���� 2���� �Է��ϼ��� => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("ȣ�� �� a : " + a + ", b : " + b);
		System.out.println("��� : " + add(a, b));
		System.out.println("ȣ�� �� a : " + a + ", b : " + b);
		
		//�ٸ���� (class Math4 ���)
		System.out.print("���� 2���� �Է��ϼ��� => ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("ȣ�� �� c : " + c + ", d : " + d);
		
		Math4 m = new Math4();
		//m.add(c, d);		//������� �̾ƿ��� �ʰ� ���ʷ� ���
		
		System.out.println("��� : " + m.add(c, d));
		System.out.println("ȣ�� �� c : " + c + ", d : " + d);
		
		//���� ������ ����� ���������� �ƴ� �ν��ͽ� ���� ���
		Math4 m = new Math4();	//��ü ����
		
		System.out.print("���� 2���� �Է��ϼ��� => ");
		m.c = sc.nextInt();
		m.d = sc.nextInt();
		
		System.out.println("ȣ�� �� c : " + m.c + ", d : " + m.d);
		System.out.println("��� : " + m.add(m.c, m.d));
		System.out.println("ȣ�� �� c : " + m.c + ", d : " + m.d);
		
		//���� ������ ����� ���������� �ν��Ͻ� ������ �ƴ� Ŭ���� ���� ���
		System.out.print("���� 2���� �Է��ϼ��� => ");
		Math4.c = sc.nextInt();
		Math4.d = sc.nextInt();
		
		Math4 m = new Math4();
		
		System.out.println("ȣ�� �� c : " + Math4.c + ", d : " + Math4.d);
		System.out.println("��� : " + m.add(Math4.c, Math4.d));		//add�޼ҵ忡�� ���������� ����߱� ������ ����� ����
		System.out.println("ȣ�� �� c : " + Math4.c + ", d : " + Math4.d);
		*/
		//���� ������ ����� Ŭ���� �������� �̿��Ͽ� ���
		//��� ��) ���� 2���� �Է��ϼ��� => 5 10
		//		 ȣ�� �� a : 5, b : 10
		//		 add �޼��� a : 10, b : 20
		//		 ��� : 30
		//		 ȣ�� �� a : 10, b : 20
		System.out.print("���� 2���� �Է��ϼ��� => ");
		Math4.c = sc.nextInt();
		Math4.d = sc.nextInt();
		
		Math4 m = new Math4();
		
		System.out.println("ȣ�� �� c : " + Math4.c + ", d : " + Math4.d);
		System.out.println("��� : " + m.add());
		System.out.println("ȣ�� �� c : " + Math4.c + ", d : " + Math4.d);
	}

}

class Math4 {
	//�ν��Ͻ� ����
	//int c, d;
	
	//Ŭ���� ����
	static int c, d;
	
	//int add (int c, int d) {	//�ν��Ͻ� ���� ����...
	int add () {				//Ŭ���� ���� ����... 
		int result;
		
		c = c * 2;		//Math4.c
		d *= 2;
		
		result = c + d;
		
		System.out.println("add �޼��� a : " + c + ", b : " + d);
		
		return result;
	}
}
