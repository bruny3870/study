import java.util.Scanner;

public class MySample1107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//�ݺ���
		/*
		 ����) ���� n�� �Է¹޾� n�ٸ�ŭ ������ ���� ����ϴ� ���α׷�
		 ��) for�� ���, printf("%2d ", ������)
		 �Է� ��) 5
		 ��� ��)  1
		 		 2  3
		 		 4  5  6
		 		 7  8  9 10
				11 12 13 14 15
		
		int n, i, j;
		int cnt = 0;
		
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				cnt++;								//Ƚ�� ī��Ʈ
				System.out.printf("%2d ", cnt);
			}
			
			System.out.println();
		}
		 */
		
		/*
		 ����) ���� n�� �Է¹޾� �Ʒ��� ���� �����ڸ� ����ϴ� ���α׷�
		 �Է� ��) 3
		 ��� ��) ABC
		 		DE
		 		F
		 
		int n, i, j;
		char a = 'A';
		
		n = sc.nextInt();
		
		for (i = n; i >= 1; i--) {
			for (j = 1; j <= i; j++) {	//for (j = i; j >= 1; j--)
				System.out.printf("%c ", a);
				a++;
			}
			
			System.out.println();
		}
		*/
		
		/*
		 ����) for���� �̿��Ͽ� ������ ���� ����ϴ� ���α׷�
		 ��� ��) a 1 2 3 4
		 		b c 5 6 7
		 		d e f 8 9
		 		g h i j 10
		 4�� 5�� �������� ���
		 
		int i, j;
		int n = 1;
		char a = 'a';
		
		for (i = 1; i <= 4; i++) {	
			for (j = 1; j <= i; j++) {
			System.out.printf("%c ", a);
				a++;
			}
			
			for (j = 1; j <= 5 - i; j++) {		//for (j = 4; j >= i; j--)
				System.out.printf("%d ", n);
				n++;
			}
			
			System.out.println();
		}
		*/
		
		/*
		 ����) while�� ���ѷ��� ����Ͽ� �Ʒ��� ���� ����Ǵ� ���α׷�
		 ��) continue, break ���
		 �Է� ��) ���� ���� ���� 10000�� �Դϴ�.
		 ��� ��)	�󸶸� ����Ͻðڽ��ϱ�? => 1000
		 		���� 9000�� ���ҽ��ϴ�.
		 		
		 		�󸶸� ����Ͻðڽ��ϱ�? => 5000
		 		���� 4000�� ���ҽ��ϴ�.
		 		
		 		�󸶸� ����Ͻðڽ��ϱ�? => 5000
		 		�ٽ� �Է��ϼ���. (����������)
		 		
		 		�󸶸� ����Ͻðڽ��ϱ�? => 4000
		 		���� 0�� ���ҽ��ϴ�.
		 		��� ���� ����߽��ϴ�. ��
		 
		int n;
		int m = 10000;
		
		System.out.printf("���� ���� ���� %d�� �Դϴ�. \n", m);
		
		while (true) {
			System.out.printf("�󸶸� ����Ͻðڽ��ϱ�? => ");
			n = sc.nextInt();
			
			if (m >= n) {
				m = m - n;
				System.out.printf("���� %d�� ���ҽ��ϴ�. \n", m);
				
				if (m == 0) {
					System.out.printf("��� ���� ����߽��ϴ�. ��");
					break;
				} else {
					continue;
				}
				
			} else {
				System.out.printf("�ٽ��Է��ϼ���. ���������� \n");
				continue;
			}
		}
		//�ٸ����
		while (true) {
			System.out.printf("�󸶸� ����Ͻðڽ��ϱ�? => ");
			n = sc.nextInt();
			
			if (n < 0 || n > m) {
				System.out.printf("�ٽ��Է��ϼ���. ���������� \n");
				continue;
			}
			
			m = m - n;
			System.out.printf("���� %d�� ���ҽ��ϴ�. \n", m);
			
			if (m == 0) {
				System.out.printf("��� ���� ����߽��ϴ�. ��");
				break;
			}
		}
		*/
		
		//�迭
		/*
		 ����) 5���� ������ �Է� ���� �� ���ʴ�� ����ϴ� ���α׷�
		 
		int a, b, c, d, e;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d \n", a, b, c, d, e);
		
		//�� ������ ���� ������ �迭�� ����ϵ�, �ݺ����� ������� ����.
		int[] a = new int[5];
		
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();
		a[5] = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d \n", a[0], a[1], a[2], a[3], a[4]);
		
		
		//�� ������ ���� ������ �迭�� �ݺ��� ���
		int[] a = new int[5];
		int i;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < a.length; i++) {
			System.out.printf("a[%d] : %d \n", i, a[i]);
		}
		*/
		
		/*
		 ����) ���� 5���� �Է� ���� �� �հ踦 ����ϴ� ���α׷�
		 �Է� ��) 10 20 30 40 50
		 ��� ��) 150
		 
		int[] a = new int[5];		//����� ���ÿ� ����� ���ؾߵ� (����)
		int i;
		int sum = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		
		System.out.print(sum);
		*/
		
		/*
		 ����) ���� 10���� ������ �� �ִ� �迭�� �����ϰ� 10���� ���ڸ� �Է¹޾� ���ڸ� �̾ ����ϴ� ���α׷�
		 ��) sc.next().charAt(0) ��� (next() : ���� �Ǵ� ���͸� �������� ©�� ���ڿ��� ��ȯ)
		 �Է� ��) A B C D E F G H I J
		 ��� ��) ABCDEFGHIJ
		 
		char[] a = new char[10];
		int i;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
			System.out.printf("%c", a[i]);
		}
		*/
		
		/*
		 ����) ���� 10���� �Է� ���� �� ����°, �ټ���°, ���������� �Է¹��� ������ ���ʷ� ����ϴ� ���α׷�
		 ��) ������ �Է¹��� ���� �迭�� ���̸� �̿��Ͽ� ���
		 �Է� ��) 5 3 9 6 8 4 2 8 10 1
		 ��� ��) 9 8 1
		 
		int[] a = new int[10];
		int i;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.printf("%d %d %d", a[2], a[4], a[a.length - 1]);
		*/
		
		/*
		 ����) �ִ� 100�������� ������ ���ʷ� �Է¹޴ٰ� 0 �� �ԷµǸ� �Է��� �ߴ��ϰ� ¦����°�� �Էµ� ������ ��� ����ϴ� ���α׷�
		 ��) for���� �Է¿� 1��, ��¿� 1�� ���
		 �Է� ��) 11 25 3 9 0
		 ��� ��) 25 9
		 
		int[] a = new int[100];
		int i;
		int cnt = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {	//a[i]�� ���� 0 �ϋ�
				break;
			}
			
			cnt++;	//0 �� �ƴѰ�� �Է� ī��Ʈ
		}
		
		for (i = 0; i < cnt; i++) {	//�Է� ī��Ʈ ���� �۰� (100�� �� ���� �ʿ� ����)
		
			if (i % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
		*/
		/*
		 ����) ���� ������ ������ i������ �ݺ������� ó���� �Ϳ�
		 
		int[] a = new int[100];
		int i, j;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				break;
			}
		}
		
		for (j = 0; j < i; j++) {
			if (j % 2 == 1) {
				System.out.printf("%d ", a[j]);
			}
		}
		*/
		
		/*
		 ����) ���� 5���� �Է¹޾� �迭�� ������ �� �˻��� ������ �ϳ� �Է¹޾� �迭�� ���� ���� �ִ��� ã�� �ش� ��ġ�� �ε����� ����ϴ� ���α׷�
		 ��) �迭�� ���� ���� ���� ��� "��ġ�ϴ� ���� �������� �ʽ��ϴ�." ��� ���
		 �Է� ��) �Է� 0 : 7
		 		�Է� 1 : 3
		 		�Է� 2 : 5
		 		�Է� 3 : 2
		 		�Է� 4 : 4
		 		�˻��� : 5
		 ��� ��) ��ġ�ϴ� ���� �ε��� : 2
		 
		 �Է� ��) �Է� 0 : 3
		 		�Է� 1 : 8
		 		�Է� 2 : 5
		 		�Է� 3 : 6
		 		�Է� 4 : 1
		 		�˻��� : 7
		 ��� ��) ��ġ�ϴ� ���� �������� �ʽ��ϴ�.
		 */
		int[] a = new int[5];
		int i;
		
		for (i = 0; i < a.length; i++) {			// 0 ~ 4���� 
			System.out.printf("�Է� %d : ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.printf("�˻��� : ");
		int s = sc.nextInt();
		
		boolean flag = true;						//ã�� �� ������ �Ǵ�
		
		for (i = 0; i < a.length; i++) {
			if (s == a[i]) {						// s���� a[i]�� ��
				System.out.printf("��ġ�ϴ� ���� �ε��� : %d", i);
				flag = false;						//��ġ�� ã���� ����
				break;
			}
			
//			//flag ��� ���ϰ� for ���
//			if (i == (a.length - 1) && s != a[i]) {	//������ ���� s���� a[i]���������� �ٸ���
//				System.out.printf("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
//			}
		}
		
		if (flag) {
			System.out.printf("��ġ�ϴ� ���� �������� �ʽ��ϴ�.");
		}
		
	}

}
