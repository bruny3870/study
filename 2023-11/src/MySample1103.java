import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ݺ���� for
		/*
		����) for���� 2�� ����Ͽ� 1���� 5���� ���� i�� ����ϴ� ���α׷�
		��) ����Ҷ��� ���� i ���
		��� ��) 1
			   2
			   3
			   4
			   5
			   12345
		
		int i;
		for (i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		for (i = 1; i <= 5; i++) {
			System.out.print(i);
		}
		*/
		
		/*
		����) ���� i, j�� �̿��Ͽ� ����ϴ� ���α׷�
		��) �߰��� ������ �� '/t'�� ����Ͽ� => %d \t %d \n, i, j
		��� ��) 1	10
			   2	9
			   3	8
			   4	7
			   5	6
			   6	5
			   7	4
			   8	3
			   9	2
			   10	1
		
		int i, j;
		
		for (i = 1, j = 10; i <= 10 && j >= 1; i++, j--) {
			System.out.printf("%d \t %d \n", i ,j);
		}
		// ���� 1���� ����ؼ� ���
		int i;
		
		for (i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + (11-i));
		}
		*/
		
		/*
		����) �빮�ڸ� 'A'���� 'Z'���� ���ʷ� ����ϴ� ���α׷�
		��) charŸ�� i ������ ���
		   charŸ���� ���� ���� (i++)
		��� ��) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
		char i, j;
		int num;
		
		for (i = 'A'; i <= 'Z'; i++) {
			System.out.print(i);
		}
		
		System.out.println();
		
		for (j = 65; j <= 90; j++) {
			System.out.print(j);
		}
		
		System.out.println();
		
		for (i = 'A'; i <= 'Z'; i++) {	
			num = i;
			System.out.printf("%c \t %d \n", i, num);
		}
		*/
		
		/*
		����) 1���� 20������ Ȧ���� ���ʴ�� ����ϴ� ���α׷�
		��) ������ i�� ���
		��� ��) 1 3 5 7 9 11 13 15 17 19  
		
		int i;
		
		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		
		//���� ������ ��� (������ ���)
		for (i = 1; i <= 20; i += 2) { 	// i = i + 2
			System.out.printf("%d ", i);
		}
		*/
		
		/*
		����) 10���� ������ �Է¹޾� �� ���� �� ¦���� ������ ����� ����ϴ� ���α׷�
		�Է� ��) 15 22 3 129 66 81 35 1 46 888
		��� ��) �Է¹��� ¦���� 4�� �Դϴ�.
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int cnt = 0;
		
		for(i = 1; i <= 10; i++) {
			
			int a = sc.nextInt();	//�Է� ������ ���� �˻�
			
			if (a % 2 == 0) {
				cnt++;
			}	
		}
		System.out.printf("�Է¹��� ¦���� %d�� �Դϴ�.", cnt);
		
		int a, i, cnt = 0;
		
		for (i = 0; i < 10; i++) {
			a = sc.nextInt();		//�ǵ����̸� for���ȿ� �ִ� ������ �ۿ� ���� (�ڿ��������)
			
			if (a % 2 == 0) {
				cnt++;		//cnt = cnt + 1;
			}
		}
		System.out.printf("�Է¹��� ¦���� %d�� �Դϴ�.", cnt);
		*/
		
		/*
		����) 10���� ������ �Է¹޾� 3�� ����� 5�� ����� ������ ���� ����ϴ� ���α׷�
		��) 3�� ����̸鼭 5�� ����� ���� 3�� ������� ����
		�Է� ��) 10 15 36 99 100 19 46 88 87 13
		��� ��) 3�� ��� : 4
			   5�� ��� : 2
		
		Scanner sc = new Scanner(System.in);
		
		int a, i;
		int cnt3 = 0, cnt5 = 0, cnt55 = 0;
		
		for (i = 0; i < 10; i++) {
			a = sc.nextInt();
			
			if (a % 3 == 0) {
				cnt3++;
			} else if (a % 5 == 0) {	//else if�� ������ �ߺ� ����
				cnt5++;					
			}
			
			if (a % 5 == 0) {			//if�� ������ �ߺ� ���
				cnt55++;
			}
		}
		System.out.println("3�� ��� : " + cnt3);
		System.out.println("5�� ��� : " + cnt5);
		System.out.println("5�� ��� : " + cnt55);
		
		//������� switch��
		Scanner sc = new Scanner(System.in);
		
		int a, i;
		int cnt3 = 0, cnt5 = 0;
		
		for (i = 0; i < 10; i++) {
			a = sc.nextInt();
			
			switch(a % 3) {
				case 0:
					cnt3++;
					break;
			}
			
			switch (a % 5) {
				case 0:
					cnt5++;
					switch(a % 3) {
						case 0:
							cnt5--;
							break;
					}
			}
		}
		System.out.println("3�� ��� : " + cnt3);
		System.out.println("5�� ��� : " + cnt5);
		*/
		
		/*
		����) 5���� ������ �Է¹޾Ƽ� ������ ����� ����ϴ� ���α׷�
		��) ������ sum(int), ����� avg(double)���� ���
		   ����� ��� '���� / 5.0'
		�Է� ��) 90 85 100 66 88
		��� ��) ���� : 429
		 	   ��� : 85.8 // %.1f
		
		Scanner sc = new Scanner(System.in);
		
		int i, a;
		int sum = 0;
		double avg;
		
		for (i = 0; i < 5; i++) {
			a = sc.nextInt();
			
			sum = sum + a;		//sum += a;
		}
		avg = sum / 5.0;		//avg = (double)sum / 5;
		
		System.out.printf("���� : %d \n", sum);
		System.out.printf("��� : %.1f \n", avg);
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		*/
		
		//����for��
		/*
		���� ��) 3x3 ���·� �����
		��� ��) ***
			   ***
			   ***
		
		int i, j;
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		����) ���� i, j ���� �̿��Ͽ� �Ʒ��� ���� ����ϴ� ���α׷�
		��� ��) 11111
			   22222
			   33333
			   44444
			   55555
			   
			   12345
			   12345
			   12345
			   12345
			   12345
		
		int i, j;
		
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(i);		//������� ���
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);		//�������� ���
			}
			System.out.println();
		}
		*/
		
		/*
		����) ������ �Է¹޾Ƽ� n�� ��ŭ ������ ���� ����ϴ� ���α׷�
		�Է� ��) 5
		��� ��) *
			   **
			   ***
			   ****
			   *****
		
		Scanner sc = new Scanner(System.in);
		
		int a, i, j;
		
		a = sc.nextInt();
		
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= i; j++) {		//�� ��ȣ�� �� ��ȣ�� ������ ���� ��) ���� 1���̸� ���� 1��, ���� 3���̸� ���� 3��
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//������
		/*
		����) �����ܿ��� 2�ܺ��� 4�ܱ����� �������� ����ϴ� ���α׷�
		��) ����� 2�ڸ��� %2d��, �ܰ� �ܻ��̴� ��(\t) ���
		   ������ i, j�� ���
		��� ��) 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4		//ù��° �࿡�� ������ �ʴ°� �� => i
			   ....										
			   2 * 9 = 18	3 * 9 = 27	4 * 9 = 36		//�ι��� ������ ������ �ʴ°� �� => j
		
		int i, j;
		
		//��� ����
		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 4; j++) {
				System.out.printf("%d * %d = %2d \t", j, i, j * i);		//%2d �ڸ��� 2�ڸ� Ȯ��
			}
			System.out.println();
		}
		
		System.out.println();
		
		//��� ��) 2 * 1 = 2	2 * 2 = 4	2 * 3 = 6	2 * 4 = 8	2 * 5 = 10
		//���� ����
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 5; j++) {		
				System.out.printf("%d * %d = %2d \t", i, j, i * j);
			}
			System.out.println();
		}
		*/
		
		/*
		����) 2���� 9���� ������ a, b�� �Է¹޾� a�ܺ��� b�ܱ����� ������ ��� ���α׷�
		��) �ܰ� �ܻ��̴� ��(\t) ���, ����� ū�ܿ��� ���������� ����ϵ� ������ a, b�� ��� (a�� ū��, b�� ������)
		�Է� ��) 3 5
		��� ��) 5 * 1 = 5	4 * 1 = 4		3 * 1 = 3			//i �� 9�� ��� (�Է� ���� x)
			   ....
			   5 * 9 = 45	4 * 9 = 36		3 * 9 = 27			//j a���� b, ū�ܿ��� ������ => ����
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, tmp, i, j;
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a < b) {
			tmp = a;
			a = b;
			b = tmp;
		}
		
		for (i = 1; i <= 9; i++) {
			for (j = a; j >= b; j--) {
				System.out.printf("%d * %d = %2d \t", j, i, j * i);
			}
			System.out.println();
		}
		*/
		
		/*
		����) ������ �Է¹޾� ������ ���� �������� ����ϴ� ���α׷�
		�Է� ��) 4
		��� ��) [1,1][1,2][1,3][1,4]
			   [2,1][2,2][2,3][2,4]
			   [3,1][3,2][3,3][3,4]
			   [4,1][4,2][4,3][4,4]
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int a, i, j;
		
		a = sc.nextInt();
		
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= a; j++) {
				System.out.printf("[%d,%d]", i, j);
			}
			System.out.println();
		}
	}
}
