import java.util.Scanner;

class Add {
	int a;
	int b;
	int c;
	
	static void add(Add d) {
		d.c = d.a + d.b;
	}
	
	static void sub(Add d) {
		d.c = d.a - d.b;
	}
	
	static void mul(Add d) {
		d.c = d.a * d.b;
	}
	
	void div(Add d) {
		d.c = d.a / d.b;
	}
}

public class MySample1115_2 {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ �Ű�����
		/*
		 ����) �� ������ AddŬ���� a, b������ �Է¹��� �� ���ϱ�, ����, ���ϱ�, ������ �޼��带 �̿��Ͽ� ����� main���� ����ϴ� ���α׷�
		 ��) ���ϱ� add, ���� sub, ���ϱ� mul, ������ div ����
		 	 ������ �޼��� ����, ��� �޼���� ��ȯŸ�� ����
		 	 ����� c���� ���
		 �Է� ��) �� ������ �Է��ϼ��� => 5 3
		 ��� ��) ���ϱ� : 8
		   		����  : 2
		   		���ϱ� : 15
		   		������ : 1
		 
		Scanner sc = new Scanner(System.in);
		Add d = new Add();
		
		System.out.print("�� ������ �Է��ϼ��� => ");
		d.a = sc.nextInt();
		d.b = sc.nextInt();
		
		add(d);
		System.out.println("���ϱ� : " + d.c);
		
		sub(d);
		System.out.println("����  : " + d.c);
		
		mul(d);
		System.out.println("���ϱ� : " + d.c);
		
		div(d);
		System.out.println("������ : " + d.c);
		
	}
	
	static void add(Add d) {
		d.c = d.a + d.b;
	}
	
	static void sub(Add d) {
		d.c = d.a - d.b;
	}
	
	static void mul(Add d) {
		d.c = d.a * d.b;
	}
	
	static void div(Add d) {
		d.c = d.a / d.b;
	}
	
	
	//������ �Ű������� �̿��� �޼��带 Add Ŭ������ ������ ���
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Add d = new Add();
		
		System.out.print("�� ������ �Է��ϼ��� => ");
		d.a = sc.nextInt();
		d.b = sc.nextInt();
		
		//add(d);	//�̷��� �ϸ� �ȵ�
		Add.add(d);	//�ٸ� Ŭ������ Ŭ������ �� �־����
		System.out.println("���ϱ� : " + d.c);
		
		Add.sub(d);
		System.out.println("����  : " + d.c);
		
		Add.mul(d);
		System.out.println("���ϱ� : " + d.c);
		
		d.div(d);	//�ν��Ͻ��� ��ü �̿��ؼ� ��� ����
		System.out.println("������ : " + d.c);
	}
	*/
	
}
