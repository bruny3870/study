import java.util.Scanner;

public class MySample1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 ����) ������ �ݿ��� ������ ������ �����Ͽ� �Ʒ��� ���� ����ϴ� ���α׷�
		 �Է� ��) 4
		 ��� ��) [1,1]
		 			[2,2]
		 				[3,3]
		 					[4,4]
		 ��) ������ printf("%5c", ' '); or print("     ");
		 
		int a, i, j;
		a = sc.nextInt();
		
		for (i = 1; i <= a; i++) {
		
			for (j = 1; j <= a; j++) {
			
				if (i == j) {
					System.out.printf("[%d,%d]", i, j);
				} else {
					System.out.printf("%5c", ' ');
				}
			}
			
			System.out.println();
		}
		*/
		
		/*
		 ����) �������� �Է� �޾� �ش� �� �Ϻθ� ����ϴ� ���α׷�
		 ��) �Էº����� a, b�� ����ϰ� a�� ������, b�� ū������ �ؼ� a���� b���� ���
		     ��°���� (%d * %d = %2d \t)
		     j �� 5���� ���
		 �Է� ��) 5 2
		 ��� ��) 2 * 1 = 2	2 * 2 = 4	2 * 3 = 6	2 * 4 = 8	2 * 5 = 10
		 	    ....
		 	    5 * 1 = 5	5 * 2 = 10	5 * 3 = 15	5 * 4 = 20	5 * 5 = 25
		 
		int a, b, tmp, i, j;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a > b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for (i = a; i <= b; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.printf("%d * %d = %2d \t", i, j, i * j);
			}
			
			System.out.println();
		}
		*/
		
		/*
		//while (�ݺ���)
		int a = 1;
		
		while (a <= 10) {
			System.out.println(a);
			a++;					//���������� 1�� ������ ��� (���ѷ���)
		}
		
		System.out.println();
		
		//���� while���� for������
		for (a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		*/
		
		/*
		 ����) ���ĺ� 'A'���� 'Z'���� ����ϴ� ���α׷�
		 ��� ��) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 ��) ������ alpha = 'A' �ʱ����
		 
		char alpha = 'A';			//alpha = '65'
		
		while (alpha <= 'Z') {		//alpha <= '90'
			System.out.print(alpha);
			alpha++;
		}
		
		System.out.println();
		
		for (alpha = 'A'; alpha <= 'Z'; alpha++) {
			System.out.print(alpha);
		}
		*/
		
		/*
		 ����) 1�̻� 100������ ������ �Է¹޾� while���� �̿��Ͽ� 1���� �Է¹��� ���������� ���� ���Ͽ� ����ϴ� ���α׷�
		 �Է� ��) 10
		 ��� ��) 55
		 
		int a;
		int i = 1;		// 0���� �����̸� �޸� ����
		int sum = 0;
		a = sc.nextInt();
		
		while (i <= a) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		
		//���ѷ���
		int a;
		
		while (true) { //for (;;) ���ѷ���
			a = sc.nextInt();
			
			if (a >= 1 && a <= 100) {
				break;
			} else {
				System.out.println("�Է°� ����... �ٽ� �Է��ϼ���.");
			}
		}
		*/
		
		/*
		 ����) ������ �Է¹޾� 80�� �̻��̸� �հݸ޼�����, �׷��� ������ ���հ� �޼����� ����ϴ� �۾��� �ݺ��ϴٰ� 0 ~ 100 �̿��� ������ �ԷµǸ� �����ϴ� ���α׷�
		 ��) while���� ���ǽĿ� �񱳿� �������� ���, break ������
		 �Է� ��) ������ �Է��ϼ��� => 50
		 ��� ��) �˼��մϴ�. ���հ��Դϴ�.
		 		������ �Է��ϼ��� => 95
		 		�����մϴ�. �հ��Դϴ�.
		 		������ �Է��ϼ��� => 101
		 
		int a = 0;
		
		while (a >= 0 && a <= 100) {
			System.out.print("������ �Է��ϼ��� => ");
			a = sc.nextInt();
			
			if (a >= 0 && a <= 100) {
			
				if (a >= 80) {
					System.out.println("�����մϴ�. �հ��Դϴ�.");
				} else {
					System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
				}
			}
		}
		
		//�ٸ����
		int score;
		
		System.out.print("������ �Է��ϼ��� => ");
		score = sc.nextInt();
		
		while (score >= 0 && score <= 100) {
		
			if (score >= 80) {
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			} else {
				System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
			}
			
			System.out.print("������ �Է��ϼ��� => ");
			score = sc.nextInt();
		}
		*/
		
		/*
		 ����) �� ������ while ���ѷ����� �̿��Ͽ� �ۼ�
		 ��) while(true), break (continue) - > for (;;)
		 
		int score;
		
		while(true) {
			System.out.print("������ �Է��ϼ��� => ");
			score = sc.nextInt();
			
			if (score < 0 || score > 100) {
				break;			//if�� ���ΰ� �ִ� �ݺ��� Ż�� (���α׷� ����)
			}
			
			if (score >= 80) {
				System.out.println("�����մϴ�. �հ��Դϴ�.");
				//continue;		//if�� ���ΰ� �ִ� �ݺ��� �ٽ� ���� (�ٽ��Է� ��� X)
			} else {
				//continue;		//continue ��� �� ������ ����� ������ ����
				System.out.println("�˼��մϴ�. ���հ��Դϴ�.");
			}
			
			System.out.println("�ٽ��Է�...");
		}
		*/
		
		//continue
		/*
		 ����) 1���� 10���� �ݺ��ϸ鼭 Ȧ���� ����ϴ� ���α׷�
		 ��) continue ���
		 ��� ��) 1 3 5 7 9
		 
		int num = 0;
		
		while (num < 10) {
			num++;
			
			if (num % 2 == 0) {
				continue;
			}
			
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		//���� ������ �������� for�� ���
		for (num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				continue;
			}
			
			System.out.print(num + " ");
		}
		*/
		
		/*
		 ����) ������ ��� �Է¹޴ٰ� 0�� �ԷµǸ� 0�� �����ϰ� ������ �Էµ� �ڷ��� ���� �հ�, ����� ����ϴ� ���α׷�
		 ��) while ���ѷ��� ���, ����� �Ҽ� ��°�ڸ����� ���
		 �Է� ��) 15 88 97 0
		 ��� ��) �Էµ� �ڷ��� ���� = 3��
		 		�Էµ� �ڷ��� �հ� = 200
		 		�Է��� �ڷ��� ��� = 66.67
		 
		int num;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
		while (true) {
			num = sc.nextInt();
			
			if (num == 0) {
				break;
			}
			
			cnt++;
			sum = sum + num;
		}
		
		avg = sum / (double)cnt;	// ���� / ���� = ����, ���� / �Ǽ� = �Ǽ�
		
		System.out.printf("�Էµ� �ڷ��� ���� = %d�� \n", cnt);
		System.out.printf("�Էµ� �ڷ��� �հ� = %d \n", sum);
		System.out.printf("�Էµ� �ڷ��� ��� = %.2f \n", avg);
		*/
		
		/*
		 ����) ������ ��� �Է¹޴ٰ� 0�� �ԷµǸ� 0�� �����ϰ� ������ �Էµ� �� �� Ȧ���� �հ�� ����� ����ϴ� ���α׷�
		 ��) continue, break ���
		 �Է� ��) 5 8 17 6 31 0
		 ��� ��) Ȧ���� �հ� : 53
		 		Ȧ���� ��� : 17
		 
		int num;
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		
		while (true) {
			num = sc.nextInt();
			
			if (num == 0) {			// '0'�� �Էµ� ��� while ����
				break;
			} 
			
			if (num % 2 == 0) {		// ¦���� �Էµ� ��� while �ٽ�
				continue;
			}
			
			cnt++;					// Ȧ���� �Էµ� ��� ó��
			sum = sum + num;
		}
		
		avg = sum / cnt;
		
		System.out.println("Ȧ���� �հ� : " + sum);
		System.out.println("Ȧ���� ��� : " + avg);
		*/
		
		//do-while
		/*
		int a = 1;
		
		do {									//�۾����� �ݵ�� 1�� ����
			System.out.println(a + "��° ���");
			a++;
		} while (a <= 10);						// ���ǽ��� '��'�� ���� �ݺ�
		*/
		
		/*
		 ����) �� ������ while ���ѷ��� ���
		 
		int a = 1;
		
		while (true) {
			if (a <= 10) {
				System.out.println(a + "��° ���");
				a++;
			} else {
				break;
			}
		}
		
		//�ٸ����
		while (true) {
			System.out.println(a + "��° ���");
			a++;
			
			if (a > 10) {
				break;
			}
		}
		
		// �� ������ while ���ǽ��� �̿�
		int a = 1;
		
		while (a <= 10) {
			System.out.println(a + "���� ���");
			a++;
		}
		*/
		
		/*
		 ����) ������ ��� �Է� �޴ٰ� 0�� �ԷµǸ� �Է¹��� �� �� Ȧ���� �հ� ����� ����ϴ� ���α׷�
		 ��) do-while ���, break, continue ������
		 �Է� ��) 5 8 17 6 31 0
		 ��� ��) Ȧ���� �հ� : 53
		 		Ȧ���� ��� : 17
		 
		int num;
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		
		do {						//�۾��� �۵�
			num = sc.nextInt();

			if (num % 2 != 0) {		// Ȧ���϶�
				cnt++;
				sum = sum + num;
			}
		} while (num != 0);			//�Է� ���� ���� '0'�� ��� ����
		
		avg = sum / cnt;
		
		System.out.println("Ȧ���� �հ� : " + sum);
		System.out.println("Ȧ���� ��� : " + avg);
		*/
		
		/*
		 ����) �Ʒ��� ���� �޼����� ����ϰ� ���ڸ� �Է¹޾� ������ ��ȣ�� �ش��ϴ� �޼����� ����ϴ� �۾��� �ݺ��ϴٰ� 4�� �ԷµǸ� �޼��� ����� �����ϴ� ���α׷�
		 ��) do-while ���, 1 ~ 4 �̿��� ���� �ԷµǸ� "�߸� �ԷµǾ����ϴ�." ���
		 �Է� ��) 1. �Է��ϱ�
		 	    2. ����ϱ�
		 	    3. �����ϱ�
		 	    4. ������
				�۾��� ��ȣ�� �����ϼ��� => 2
		��� ��) ����ϱ⸦ �����ϼ̽��ϴ�.
		�Է� ��) 1. �Է��ϱ�
		 	    2. ����ϱ�
		 	    3. �����ϱ�
		 	    4. ������
				�۾��� ��ȣ�� �����ϼ��� => 6
		��� ��) �߸� �ԷµǾ����ϴ�. (�ٽ� �ݺ�)
		 */
		int num;
		
		do {
			System.out.println("1. �Է��ϱ�");
			System.out.println("2. ����ϱ�");
			System.out.println("3. �����ϱ�");
			System.out.println("4. ������");
			System.out.print("�۾��� ��ȣ�� �����ϼ��� => ");
			num = sc.nextInt();
			
			if (num >= 1 && num <= 4) {				//�Է¹��� ���� 1���� ũ�ų� ���� 4���� �۰ų� ����
				if (num == 1) {						//�Է¹��� ���� '1'�� ���
					System.out.print("�Է��ϱ⸦ ");
				} else if (num == 2) {				//�Է¹��� ���� '2'�� ���
					System.out.print("����ϱ⸦ ");
				} else if (num == 3) {				//�Է¹��� ���� '3'�� ���
					System.out.print("�����ϱ⸦ ");
				} else {							//�Է¹��� ���� '4'�� ���
					System.out.print("�����⸦ ");
				}
				System.out.print("�����ϼ̽��ϴ�. \n");
				
			} else {								//1~4�� ������ ������ ���
				System.out.println("�߸� �ԷµǾ����ϴ�.");
			}
			System.out.println();
			
		} while (num != 4);							//�Է¹��� ���� '4'�� ��� ����
		
	}
}
