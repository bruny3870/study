import java.util.Scanner;

public class MySample1031 {

	public static void main(String[] args) {
		/*
		int year = 0;
		int age = 15;
		
		System.out.println("year : " + year);
		System.out.println("age : " + age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
		*/
		
		/*
		int x, y, z;					//�ڹٿ����� ��������� ���ÿ� �ʱⰪ�� �����ؾ� ��� ����
		int a = 1, b= 2, c = 3;
		
		x = 10;
		y = 20;
		z = 30;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
		
		/*
		��� ��) x : 10 y : 20
			   x : 20 y : 10
		��) x y �����θ� ��� ����
		��) System.out.println("x : " + x + " y : " + y);
		
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x : " + x + " y : " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x : " + x + " y : " + y);
		*/
		
		/*
		//�� �ڸ� ������ �ϳ� �Է¹޾� ����ϴ� ���α׷�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��ϼ���. => ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("�Է¹��� �� : " + input);
		System.out.printf("num = %d \n", num);
		*/
		
		/*
		����) ���̸� �Է¹޾� ����ϴ� ���α׷�
		�Է� ��) ���̸� �Է��ϼ���. => 25
		��� ��) ����� ���̴� 25�� �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ���. => ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("����� ���̴� " + input + "�� �Դϴ�.");
		System.out.println("����� ���̴� " + num + "�� �Դϴ�.");
		System.out.printf("����� ���̴� %d�� �Դϴ�. \n", num);
		System.out.printf("����� ���̴� %s�� �Դϴ�. \n", input);
		*/
		
		/*
		//��� (final)
		final int MAX_SPEED;			//��� ���� �� �ʱⰪ ������ �����ϵ��� ��. (jdk 1.6����)
		final int MAX_VALUE = 10;
		
		MAX_SPEED = 20;					//��� ���� �� ù��° �� ���� ���� (jdk 1.6 ���� ����)
		
		System.out.println(MAX_SPEED);
		System.out.println(MAX_VALUE);
		*/
		
		/*
		//��������� (+, -, *, /, %)
		int a = 5;
		int b = a + 2;
		
		a = 7;
		b = 5;
		
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		int div = a / b;
		int rest = a % b;
		
		System.out.printf("%d + %d = %d \n", a, b, plus);
		System.out.printf("%d - %d = %d \n", a, b, minus);
		System.out.printf("%d * %d = %d \n", a, b, multi);
		System.out.printf("%d / %d = %d \n", a, b, div);
		System.out.printf("%d %% %d = %d \n", a, b, rest);	// %�� ǥ���ϸ� �������, %%�� ����
		
		System.out.println();
		
		//���������� (++)
		//++a, a++ => a = a + 1 (�ڽ� 1 ����)
		//--a, a-- => a = a - 1 (�ڽ� 1 ����)
		a = 5;
		
		System.out.println("a = " + a);			//5
		a++;									//��ġ��������
		System.out.println("a1 = " + a);		//6
		++a;									//��ġ��������
		System.out.println("a2 = " + a);		//7
		
		System.out.println();
		
		a = 5;
		System.out.println("a = " + a);			//5
		System.out.println("a++ = " + a++);		//5 ���� a�� ��� �� a�� ���� a���� 6
		System.out.println("++a = " + ++a);		//7 ���� a�� ���� �� a�� ��� a���� 7
		
		System.out.println();
		
		//���ҿ����� (--)
		a = 5;
		System.out.println("a = " + a);			//5
		a--;									//��ġ���ҿ���
		System.out.println("a1 = " + a);		//4
		--a;									//��ġ���ҿ���
		System.out.println("a2 = " + a);		//3
		
		System.out.println();
		
		a = 5;
		System.out.println("a = " + a);			//5
		System.out.println("a-- = " + a--);		//5 ���� a�� ��� �� a�� ���� a���� 4
		System.out.println("--a = " + --a);		//3 ���� a�� ���� �� a�� ��� a���� 3
		*/
		
		/*
		��� ��) a++ = 10, ++b = 11
			   ���� �� a = 11, b = 11
			   a-- = 11, --b = 10
			   ���� �� a = 10, b = 10
		��) ���� ���� a = 10, b = 10 ���� ���� �� ����
		
		int a = 10;
		int b = 10;
		
		System.out.println("a++ = " + a++ + ", ++b = " + ++b);
		System.out.println("���� �� a = " + a + ", b = " + b);
		System.out.println("a-- = " + a-- + ", --b = " + --b);
		System.out.println("���� �� a = " + a + ", b = " + b);
		
		System.out.println();
		
		System.out.printf("a++ = %d, ++b = %d \n", a++, ++b);
		System.out.printf("���� �� a = %d, b = %d \n", a, b);
		System.out.printf("a-- = %d, --b = %d \n", a--, --b);
		System.out.printf("���� �� a = %d, b = %d \n", a, b);
		*/

		/*
		����) ���� ���� a �� b �� �Է� �޾Ƽ� a�� ��ġ���������ڸ� ����ϰ� b�� ��ġ���ҿ����ڸ� ����Ͽ� �� ���� ���� c�� ������ �� ���� ����ϴ� ���α׷� �ۼ�
		�Է� ��) ù��° ���� => 5
		       �ι�° ���� => 6
		��� ��) a = 6, b = 5, c = 12
		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
		��) �Է¹��� �� nextInt()�� ó���Ͽ� ������ �޾� ó����.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� => ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� => ");
		int b = sc.nextInt();
	
		int c = ++a + b--;
		
		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
		*/
		
		/*
		//�񱳿����� (����� true / false �� �ϳ�)
		int a = 10;
		int b = 20;
		int c = 20;
		
		System.out.println("a == b : " + (a == b));		//false
		System.out.println("b == c : " + (b == c));		//true
		System.out.println("a != b : " + (a != b));		//true
		System.out.println("b != c : " + (b != c));		//false
		System.out.println("a > b : " + (a > b));		//false
		System.out.println("b >= c : " + (b >= c));		//true
		System.out.println("a <= c : " + (a <= c));		//true
		System.out.println("b < c : " + (b < c));		//false
		*/
		
		/*
		����) 3���� ������ ���� a, b, c ������ �Է��� �޾� a�� b, b�� c�� ���� ���Ͽ� ������ true, ���� ������ false�� ����ϴ� ���α׷�
		�Է� ��) a���� �Է��ϼ���. => 10
			   b���� �Է��ϼ���. => 20
			   c���� �Է��ϼ���. => 20 	   
		��� ��) a == b : false
		       b == c : true
		       a != b : true
		       b != c : false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a���� �Է��ϼ��� => ");
		int a = sc.nextInt();
		System.out.print("b���� �Է��ϼ��� => ");
		int b = sc.nextInt();
		System.out.print("c���� �Է��ϼ��� => ");
		int c = sc.nextInt();
		
		System.out.println("a == b : " + (a == b));
		System.out.println("b == c : " + (b == c));
		System.out.println("a != b : " + (a != b));
		System.out.println("b != c : " + (b != c));
		*/

		/*
		//�������� (&&, ||)
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("(a > b) && (b < c) : " + (a > b && b < c));
		System.out.println("(a > b) || (b < c) : " + (a > b || b < c));
		*/
		
		/*
		����) 3���� ������ ���� a, b, c ������ �����ϰ� ���� 10, 20 ,30 ���� �ʱ�ȭ �� �� �񱳿���� �������ڸ� �̿��Ͽ� ���̸� true, �����̸� false�� ����ϴ� ���α׷�
		��� ��) a > b && a <= b : false
		       a > b || a <= b : true
		       b < c && a < c : true
		       !(a > b && a <= b) : true
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("(a > b) && (a <= b) : " + (a > b && a <= b));
		System.out.println("(a > b) || (a <= b) : " + (a > b || a <= b));
		System.out.println("(b < c) && (a < c) : " + (b < c && a < c));
		System.out.println("!(a > b && a <= b) : " + (!(a > b && a <= b)));
		*/
		
		/*
		//���׿�����
		int x = 10;
		int y = 5;
		int result = (x >= y) ? x : y;
		
		System.out.println("x�� y�� �� ū ���� " + result + " �Դϴ�.");
		*/
		
		/*
		����) �������� a�� ���̸� �Է� �޾� 19���� ū ���� �Է� �޾����� '�����Դϴ�.'�� ����ϰ� 19���� ������ 'û�ҳ��Դϴ�.'��� ����ϴ� ���α׷�
		�Է� ��) ���̸� �Է��ϼ��� => 15
		��� ��) û�ҳ��Դϴ�.
		��) ���� �����ڸ� �̿��Ͽ� ��¿� ����� ������ String memo�� ������.
		��) String memo = "";
			memo = "û�ҳ��Դϴ�.";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		String x = "�����Դϴ�";
		String y = "û�ҳ��Դϴ�";
		
		String memo = (a > 19) ? x : y;
		
		System.out.println(memo);
		*/
		
		/*
		����) �������� 3������ �Է¹޾� ����� ���� �� ��� ������ ����ϴ� ���α׷�
			 ��������� 70�� �̻��̸� ���, �̸��̸� �����
		�Է� ��) ���� ������ �Է��ϼ��� => 80
			   ���� ������ �Է��ϼ��� => 70
			   ���� ������ �Է��ϼ��� => 90
		��� ��) ����� ����� 80���̰� ��� �ϼ̽��ϴ�. (70�� �̻��� ���)
			   ����� ����� 65���̰� ����� �ϼ̽��ϴ�. (70�� �̸��� ���)
		��) ���� kor, ���� eng, ���� math, ��� avg, ��� ���� memo
		   memo������ '���', '�����' �� ���� (���׿����ڸ� �̿�)
		   String Ÿ���� printf ���Ĺ��ڴ� %s
		   ����� (���� + ���� + ����) / 3
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ������ �Է��ϼ��� => ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� => ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� => ");
		int math = sc.nextInt();
		
		int avg = (kor + eng + math) / 3;
		
		String x = "���";
		String y = "�����";
				
		String memo = (avg >= 70) ? x : y;
		
		System.out.println("����� ����� " + avg + "���̰� " + memo + " �ϼ̽��ϴ�.");
	}
}
