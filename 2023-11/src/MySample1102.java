import java.util.Scanner;

public class MySample1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		����) �ֻ����� �ι� ������ ���� ���� �Է¹޾� �� ���� ��� 4�̻��̸� "�̰���ϴ�."
			 �Ѱ��� 4�̻��̸� "�����ϴ�." ��� 4�̸��̸� "�����ϴ�." ��� ����ϴ� ���α׷�
		�Է� ��) �ֻ��� ���� ����� �Է��ϼ��� => 3 4
		��� ��) �����ϴ�.

		�Է� ��) �ֻ��� ���� ����� �Է��ϼ��� => 5 8
		��� ��) �Է°��� 1 ~ 6 ���� ������ �ϼ���.

		��) �ֻ��� �Է°��� 1 ~ 6 ���� ��, if������ �ۼ�
		
		System.out.print("�ֻ��� ���� ����� �Է��ϼ��� => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a >= 1 && a <= 6 && b >= 1 && b <= 6) {
			if (a >= 4 && b >= 4) {
				System.out.println("�̰���ϴ�.");
			} else if (a >= 4 || b >= 4) {
				System.out.println("�����ϴ�.");
			} else if (a < 4 && b < 4) {
				System.out.println("�����ϴ�.");
			}
		} else {
			System.out.println("�ֻ��� �Է°��� 1 ~ 6 ���� ������ �ϼ���.");
		}
		
		//����� ���
		System.out.print("�ֻ��� ���� ����� �Է��ϼ��� => ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (c < 1 || c > 6 || d < 1 || d > 6) {
			System.out.println("�Է°��� 1 ~ 6 ���� ������ �ϼ���.");
		} else if (a >= 4 && b >= 4) {		//if ((a >= 4 && a <= 6) && (b >= 4 && b <= 6))
			System.out.println("�̰���ϴ�.");
		} else if (a >= 4 || b >= 4) {
			System.out.println("�����ϴ�.");
		} else {
			System.out.println("�����ϴ�.");
		}
		*/
		
		/*
		����) ���� 3���� �Է¹޾� �� �� ���� ū ���� ����ϴ� ���α׷�
		�Է� ��) �� ���� ������ �Է��ϼ��� => 1 5 4
		��� ��) �Է¹��� �� �� ���� ū ���� 5 �Դϴ�.
		��) ����� max ���� ���
		
		System.out.print("�� ���� ������ �Է��ϼ��� => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		
		if (a >= b && a >= c) {
			max = a;
		} else if (b >= a && b >= c) {
			max = b;
		} else {
			max = c;
		}
		System.out.println("�Է¹��� �� �� ���� ū ���� " + max + " �Դϴ�.");
		
		//��øif
		if (a >= b) {		//b�� ���� ���� ��
			if (a >= c) {	
				max = a;
			} else {
				max = c;
			}
		} else {			//a�� ���� ���� ��
			if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		} 
		System.out.println("�Է¹��� �� �� ���� ū ���� " + max + " �Դϴ�.");
		*/
		
		/*
		����) ������ �Է¹޾� 90 ~ 100�� ���̴� 'A'�̸鼭 98 ~ 100���� 'A+'�� ��Ÿ���� 90 ~ 93���� 'A-'�� ��Ÿ���� 94 ~ 97���� 'A'�� ��Ÿ���� ���α׷�
		��) 80 ~ 83���� 'B-', 84 ~ 87���� 'B', 88 ~ 89 'B+'�� ǥ���ϰ� A, B�� ������ �������� 'C'�� ǥ��
           �����Է��� 0 ~ 100 ���̸� �Է� ����
		�Է� ��) ������ �Է��ϼ��� => 100
		��� ��) ����� ������ 100�� �Դϴ�.
			   ����� ������ A+ �Դϴ�.
			   
		�Է� ��) ������ �Է��ϼ��� => 81
		��� ��) ����� ������ 81�� �Դϴ�.
			   ����� ������ B- �Դϴ�.
			   
		�Է� ��) ������ �Է��ϼ��� => 85
		��� ��) ����� ������ 85�� �Դϴ�.
			   ����� ������ B �Դϴ�.
			   
		�Է� ��) ������ �Է��ϼ��� => 69
		��� ��) ����� ������ 69�� �Դϴ�.
			   ����� ������ C �Դϴ�.

		int score;	//����
		char grade = ' ', opt = ' ';	//����, ��ȣ
		
		System.out.print("������ �Է��ϼ��� => ");
		score = sc.nextInt();
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
			if (score >= 98 && score <= 100) {
				opt = '+';
			} else if (score >= 90 && score <= 93) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else if (score >= 80 && score <= 89) {
			grade = 'B';
			if (score >= 88 && score <= 89) {
				opt = '+';
			} else if (score >= 80 && score <= 83) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else {
			grade = 'C';
			opt = ' ';
		}
		System.out.println("����� ������ " + score + "�� �Դϴ�.");
		System.out.println("����� ������ " + grade + opt + " �Դϴ�.");
		
		//����� �������
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score <= 93) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score <= 83) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else {
			grade = 'C';
			opt = ' ';
		}
		System.out.printf("����� ������ %d�� �Դϴ�. \n", score);
		if (opt == ' ') {		//char �� ����!!!
			System.out.printf("����� ������ %c �Դϴ�. \n", grade);
		} else {
			System.out.printf("����� ������ %c%c �Դϴ�. \n", grade, opt);
		}
		System.out.printf("grade ����: %d, ��: %c \n", Integer.valueOf(grade), grade); //�������� ���������� �ٲ��ִ�
		*/
		
		/*
		//switch ~ case ��
		int a = 4;
		
		switch (a) {
			case 1:
				System.out.println("1 �Դϴ�.");
				break;
			default:
				System.out.println("default �Դϴ�.");
			case 2:
				System.out.println("2 �Դϴ�.");
				break;
			case 3:
				System.out.println("3 �Դϴ�.");
				break;
		}
		*/
		
		/*
		����) ���� ���� �Է¹޾� ������ ����ϴ� ���α׷�
		�Է� ��) ���� ���� �Է��ϼ��� => 11
		��� ��) ���� ������ ���� �дϴ�.
		��) �� : 3, 4, 5�� / ���� : 6, 7, 8�� / ���� : 9, 10, 11�� / �ܿ� : 12, 1, 2��
		�Է°��� 1 ~ 12 ������ ���� �Է� ���� �� ����, �ƴ� ��� '���� �߸� �Է��ϼ̽��ϴ�.'
		
		System.out.print("���� ���� �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		switch (a) {
			case 3:
			case 4:
			case 5:
				System.out.println("���� ������ �� �Դϴ�.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("���� ������ ���� �Դϴ�.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("���� ������ ���� �Դϴ�.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("���� ������ �ܿ� �Դϴ�.");
				break;
			default:
				System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
		}
		//switch ������ if������ ����
		if (a == 3 || a == 4 || a == 5) {
			System.out.println("���� ������ �� �Դϴ�.");
		} else if (a == 6 || a == 7 || a == 8) {
			System.out.println("���� ������ ���� �Դϴ�.");
		} else if (a == 9 || a == 10 || a == 11) {
			System.out.println("���� ������ ���� �Դϴ�.");
		} else if (a == 12 || a == 1 || a == 2) {
			System.out.println("���� ������ �ܿ� �Դϴ�.");
		} else {
			System.out.println("���� �߸� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		/*
		����) �Ʒ� �޴����� ������ �޴��� �˷��ִ� ���α׷�
		��) �ش� ���� �̿� ���� �Է� ���� ��� "�߸� �����ϼ̽��ϴ�." �޼��� ���
		�Է� ��) 1. �߰�
			   2. ����
			   3. ����
			   �޴��� �����ϼ��� => 2
		��� ��) ������ �����ϼ̽��ϴ�.
		��) switch case�������� '�߰���', '������', '������', '�߸�'�� �ش��ϴ� ���ڿ��� ����ϰ� ���� �ѹ��� "�����ϼ̽��ϴ�" ���
		
		System.out.println("1. �߰�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.print("�޴��� �����ϼ��� = > ");
		int a = sc.nextInt();
		
		switch (a) {
			case 1: 
				System.out.print("�߰��� ");
				break;
			case 2:
				System.out.print("������ ");
				break;
			case 3:
				System.out.print("������ ");
				break;
			default:
				System.out.print("�߸� ");
		}
		System.out.println("�����ϼ̽��ϴ�.");
		*/
		
		/*
		����) ������ �Է¹޾� ������ ����ϴ� ���α׷�
			 ������ 90 ~ 100 : 'A', 80 ~ 89 : 'B', 70 ~ 79 : 'C', �������� 'F'�� ����
			 (charŸ�� memo���� ���)
		�Է� ��) ����� ������ �Է��ϼ��� (1 ~ 100) => 82
		��� ��) ����� ������ B �Դϴ�.
		
		System.out.print("����� ������ �Է��ϼ��� (1 ~ 100) = > ");
		int a = sc.nextInt();
		char memo = ' ';
		
		switch (a / 10) {		//������ 10���� ������ ��) 82 / 10 = 8.2 �Ҽ��� ������ 8 => case 8 �� �ش��
			case 10:
			case 9:
				memo = 'A';
				break;
			case 8:
				memo = 'B';
				break;
			case 7:
				memo = 'C';
				break;
			default:
				memo = 'F';
		}
		System.out.println("����� ������ " + memo + " �Դϴ�.");
		*/
		
		/*
		//�ݺ���� for��
		int i, sum = 0;	//���������� �ݵ�� �ʱ�ȭ
		for (i = 1; i <= 5; i++) {
			sum += i;	// sum = sum + i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("for�� ��");
		System.out.println("i = " + i + ", sum = " + sum);
		*/
		
		/*
		����) 1���� 10������ ���� ���ϰ� ����ϴ� ���α׷�
		��� ��) 55
		��) for�� ���
		
		int i, sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		/*
		����) 1�̻� 10������ ������ �Է¹޾� ������ŭ �ݺ��ϸ� 'JAVA���α׷���' �̶�� ����ϴ� ���α׷�
		�Է� ��) 3
		��� ��) JAVA���α׷���
			   JAVA���α׷���
			   JAVA���α׷���
		
		int a = sc.nextInt();
		int i;
		
		for (i = 1; i <= a; i++) {
			System.out.println("JAVA���α׷���");
		}
		*/
		
		/*
		����) ���ڸ� �Է¹޾Ƽ� �Է¹��� ���ڸ� 20�� �ݺ��Ͽ� ����ϴ� ���α׷�
		��) �Է¹����� char a = sc.nextLine().charAt(0);
		�Է� ��) A
		��� ��) AAAAAAAAAAAAAAAAAAAA
		*/
		
		char a = sc.nextLine().charAt(0);	//ù ���� ���ڿ��� �޾ƿ� �� ����
		int i;
		
		for (i = 1; i <= 20; i++) {
			System.out.print(a);
		}
	}
}
