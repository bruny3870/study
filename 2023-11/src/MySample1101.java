import java.util.Scanner;

public class MySample1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//��� (���ǹ� - if)
		/*
		����) ������ �Է¹޾� �� ���� 10���� ū ��� üũ�ϴ� ���α׷�
		�Է� ��) �����Է� => 15
		��� ��) 15
			   10���� ū ���� �Է��ϼ̽��ϴ�.
			   if ��
			   
			   9
			   if ��
			   
		System.out.print("�����Է� => ");
		int a = sc.nextInt();
		
		System.out.println(a);
		
		if (a > 10) {
			System.out.println("10���� ū ���� �Է��ϼ̽��ϴ�.");
		} 
		System.out.println("if ��");
		*/
		
		/*
		����) if�� 2���� ���� 
		�Է� ��) ���ڸ� �Է��ϼ��� => 3
		��� ��) �Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.
			   �Է��Ͻ� ���ڴ� 3�Դϴ�.
			   
		�Է� ��) ���ڸ� �Է��ϼ��� => 0
		��� ��) �Է��Ͻ� ���ڴ� 0�Դϴ�.
		
		
		System.out.print("���ڸ� �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		if (a != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
			System.out.println("�Է��Ͻ� ���ڴ� " + a + "�Դϴ�.");
		}
		
		if (a == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		*/

		/*
		����) ������ �Է¹޾� �Է¹��� ������ ����ϰ� �����̸� 'minus'��� ����ϴ� ���α׷�
		�Է� ��) -5
		��� ��) -5
               minus
               
        �Է� ��) 7
		��� ��) 7
		
		int a = sc.nextInt();
		
		System.out.println(a);
		
		if (a < 0) {	
			System.out.println("minus");
		}
		*/
		
		/*
		����) ������ �ϳ� �Է¹޾Ƽ� 0���� ū ���, 0�� ���, ������ ��츦 üũ�ؿ� ����ϴ� ���α׷�
		��) if�� 3�� ���
		�Է� ��) ���ڸ� �Է��ϼ��� => 5
		��� ��) �Է��Ͻ� ���� 5�̸�, 0���� Ů�ϴ�.

		�Է� ��) ���ڸ� �Է��ϼ��� => 0
		��� ��) �Է��Ͻ� ���� 0�̸�, 0�� �����ϴ�.

		�Է� ��) ���ڸ� �Է��ϼ��� => -1
		��� ��) �Է��Ͻ� ���� -1�̸�, ���� �Դϴ�.
		
		System.out.print("���ڸ� �Է��ϼ��� => ");
		int a = sc.nextInt();
		int b = 10;
		
		System.out.print("�Է��Ͻ� ���� " + a + "�̸�, ");
		
		if (a > 0) {
			System.out.println("0���� Ů�ϴ�.");
		}
		
		////////////////////////////////////
		////���� ������ �������� &&, || �׽�Ʈ��////
		System.out.println("b before : " +b);
		
		//if (a > 0 && ++b > a) {
		if (a > 0 || ++b > a) {
			System.out.println("0���� Ů�ϴ�.");
		}
		
		System.out.println("b after : " +b);
		////////////////////////////////////
		
		if (a == 0) {
			System.out.println("0�� �����ϴ�.");
		}
		
		if (a < 0) {
			System.out.println("���� �Դϴ�.");
		}
		*/
		
		/*
		����) ���� 2���� �Է� �޾Ƽ� ū ���� ���� ���� ���ʷ� ����ϴ� ���α׷�
		�Է� ��) 2 9
		��� ��) �Է¹��� �� �� ū ���� 9�̰� ���� ���� 2�Դϴ�.
		��) ū ���� �׻� a������ ����ϰ� ���� ���� �׻� b������ ����Ͽ� ���
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		if (a < b) {
			c = a;
			a = b;
			b = c;	
		} 
		System.out.println("�Է¹��� �� �� ū ���� " + a + "�̰� ���� ���� " + b + "�Դϴ�.");
		*/
		
		/*
		����) ����, ����, ����, ��ǻ�� �� 4���� ���� ���� ������ �Է� ���� �� ����� ���ϰ� �� ����� ������ 60�� �̸��� �� �����̶� �ְų�, ����� 70�̸��̸� ���հ� ó���ϴ� ���α׷�
		�Է� ��) ���� ������ �Է��ϼ��� => 60
		       ���� ������ �Է��ϼ��� => 70
		       ���� ������ �Է��ϼ��� => 50
		       ��ǻ�� ������ �Է��ϼ��� => 80
		��� ��) ���հ� �Դϴ�.
		��) ���� kor, ���� eng, ���� math, ��ǻ�� com, ��� avg
		   ��� �޼����� String msg �� ���. ����� msg �����θ� ó��
		   if�� 1���� ���
		 
		System.out.print("���� ������ �Է��ϼ��� => ");
		int kor = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� => ");
		int eng = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� => ");
		int math = sc.nextInt();
		System.out.print("��ǻ�� ������ �Է��ϼ��� => ");
		int com = sc.nextInt();
		
		int avg = (kor + eng + math + com) / 4;
		
		String msg = "�հ� �Դϴ�.";
		
		if (kor < 60 || eng < 60 || math < 60 || com < 60 || avg < 70) {
			msg = "���հ� �Դϴ�.";
		}
		
		System.out.println(msg);
		*/
		
		//if ~ else ��
		/*
		����) ������ �Է¹޾� 10���� ū ���� �Է¹��� ���� 10���� ���� ���� �Է¹��� ��츦 �����ϱ� ���� ���α׷�
		�Է� ��) 15
		��� ��) 10���� ū ���� �Է��ϼ̽��ϴ�.

		�Է� ��) 9
		��� ��) 10���� ���� ���� �Է��ϼ̽��ϴ�.
		
		int a = sc.nextInt();
		
		if (a > 10) {
			System.out.println("10���� ū ���� �Է��ϼ̽��ϴ�.");
		} else {
			System.out.println("10���� ���� ���� �Է��ϼ̽��ϴ�.");
		}
		*/
		
		/*
		����) ������ �Է¹޾� 80�� �̻��̸� �հ� �ƴϸ� ���հ� ����ϴ� ���α׷�
		�Է� ��) ������ �Է��ϼ��� => 80
		��� ��) �����մϴ�. �հ��Դϴ�.

		�Է� ��) ������ �Է��ϼ��� => 76
		��� ��) �˼��մϴ�. ���հ��Դϴ�.
		
		System.out.print("������ �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		if (a >= 80) {
			System.out.println("�����մϴ�. �հ��Դϴ�.");
		} else {
			System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
		}
		*/
		
		/*
		����) if ~ else�� ����
		�Է� ��) ���ڸ� �Է��ϼ��� => 3
		��� ��) �Է��Ͻ� ���ڴ� 3�Դϴ�.

		�Է� ��) ���ڸ� �Է��ϼ��� => 0
		��� ��) �Է��Ͻ� ���ڴ� 0�Դϴ�.
		
		System.out.print("���ڸ� �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		if (a != 0) {
			System.out.println("�Է��Ͻ� ���ڴ� " + a + "�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}
		*/
		
		/*
		//if ~ else if ~ else��
		//1, 2, 3�� ���� ó���� ���α׷�
		int a = sc.nextInt();
		
		if (a == 1) {
			System.out.println("�Է°��� 1�Դϴ�.");
		} else if (a == 2) {		//if(a > 1 && a < 3)
			System.out.println("�Է°��� 2�Դϴ�.");
		} else if (a == 3) {
			System.out.println("�Է°��� 3�Դϴ�.");
		}
		*/
		
		/*
		����) if ~ else if ~ else�� ���
			������ �Է¹޾� ���� 10���� ū ���� 0�� ��� ������ ��츦 üũ�ϴ� ���α׷�
		�Է� ��) ������ �Է��ϼ��� => 11
		��� ��) 10���� ū ���� �Է��ϼ̽��ϴ�.

		�Է� ��) ������ �Է��ϼ��� => -1
		��� ��) ������ �Է��ϼ̽��ϴ�.

		�Է� ��) ������ �Է��ϼ��� => 10
		��� ��) 1���� 10 ������ ������ �Է��ϼ̽��ϴ�.
		
		System.out.print("������ �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		if (a > 10) {
			System.out.println("10���� ū ���� �Է��ϼ̽��ϴ�.");
		} else if (a == 0) {
			System.out.println("0�� �Է��ϼ̽��ϴ�.");
		} else if (a < 0) {
			System.out.println("������ �Է��ϼ̽��ϴ�.");
		} else if (a >= 1 && a <= 10) {
			System.out.println("1���� 10 ������ ������ �Է��ϼ̽��ϴ�.");
		}
		*/
		
		/*
		����) ������ �Է¹޾� '����̾簡'�� ����ϴ� ���α׷�
		�Է� ��) ������ �Է��ϼ��� => 89
		��� ��) ��
		��) 100 ~ 90 : ��, 89 ~ 80 : ��, 79 ~ 70 : ��, 69 ~ 60 : ��, 60 �̸� : ��
		
		System.out.print("������ �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		if (a >= 90) {
			System.out.println("��");
		} else if (a >= 80) {
			System.out.println("��");
		} else if (a >= 70) {
			System.out.println("��");
		} else if (a >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
		*/
		
		/*
		���� ������ ������ 0 ~ 100�� ���̸� �Է� ���� �� ���ֵ��� ó���ϴ� ���α׷�
		�Է� ��) ������ �Է��ϼ��� => 110
		��� ��) ������ 0 ~ 100 ���� �Է��� �����մϴ�.
		
		System.out.print("������ �Է��ϼ��� => ");
		int a = sc.nextInt();
		
		if (a >= 90) {
			if (a > 100) {
				System.out.println("������ 0 ~ 100 ���� �Է� �����մϴ�.");
			} else {
				System.out.println("��");
			}
		} else if (a >= 80) {
			System.out.println("��");
		} else if (a >= 70) {
			System.out.println("��");
		} else if (a >= 60) {
			System.out.println("��");
		} else {
			if (a < 0) {
				System.out.println("������ 0 ~ 100 ���� �Է� �����մϴ�.");
			} else {
				System.out.println("��");
			}
			
		}
		//�ٸ����
		System.out.print("������ �Է��ϼ��� => ");
		int b = sc.nextInt();
		
		if (b >= 0 && b <= 100) {
			if (b >= 90) {
				System.out.println("��");
			} else if (b >= 80) {
				System.out.println("��");
			} else if (b >= 70) {
				System.out.println("��");
			} else if (b >= 60) {
				System.out.println("��");
			} else {
				System.out.println("��");
			}
		} else {
			System.out.println("������ 0 ~ 100 ���� �Է� �����մϴ�.");
		}
		*/
		
		/*
		����) ������ ���� �Է¹޾� ������ ����ϴ� ���α׷�
		�Է� ��) 11
		��� ��) �����Դϴ�.
		�Է� ��) 13
		��� ��) �߸� �ԷµǾ����ϴ�.
		��) �� : 3, 4, 5�� / ���� : 6, 7, 8�� / ���� : 9, 10, 11�� / �ܿ� : 12, 1, 2��
		   �� �Է��� 1 ~ 12 ���̰� �ƴ� ��� '�߸� �ԷµǾ����ϴ�. 1 ~ 12 ���̸� �Է��ϼ���.
		   �񱳿���� �������� Ȱ���Ͽ� ����
		*/
		
		int a = sc.nextInt();
		
		if (a >= 1 && a <= 12) {
			if (a >= 3 && a <= 5) {
				System.out.println("�� �Դϴ�.");
			} else if (a >= 6 && a <= 8) {
				System.out.println("���� �Դϴ�.");
			} else if (a >= 9 && a <= 11) {
				System.out.println("���� �Դϴ�.");
			} else if (a <= 2 || a == 12) {
				System.out.println("�ܿ� �Դϴ�.");
			}
		} else {
			System.out.println("�߸� �ԷµǾ����ϴ�.");
		}
	}

}
