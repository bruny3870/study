import java.util.Scanner;

public class MySample1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//���� Math.random() => double������ 0.0 �̻� 1.0 �̸� ���� �� ��ȯ
		//������)0123456789
		//		5827164930
		/*
		int[] arr = new int[10];
		int i, n, tmp;
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = i;							// 0 ~ 9 �Է�
			
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		
		//���� ����
		for (i = 0; i < 100; i++) {
			n = (int)(Math.random() * 10);		// 0 ~ 9 ���� �ϳ��� �� ���
			
			System.out.printf("%d ", n);
			
			//�迭 ��ġ ����
			tmp = arr[0];						//�������� �迭�� 0��° ����
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		
		System.out.println();
		
		//���� ���� �� ���
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		*/
		
		/*
		 ����) �ζǹ�ȣ ������
		 �迭�� 1���� 45���� ���� ������ �Ŀ� 0��°�� random �迭�� ���� �ٲٴµ� Ƚ���� 100�� �����ϰ� ���� �ζǹ�ȣ�� �տ������� 6�� ��� (�迭�� 0 ~ 5 ���� ��)
		 ��) (int)(Math.random() * 45)	//0 ~ 44 ���� �� �� �ϳ��� �� ����
		 
		int[] a = new int[45];
		int i, n, tmp;
		
		for (i = 0; i < a.length; i++) {
			a[i] = i + 1;					//�ζ� ��ȣ�� 1 ~ 45���� �̹Ƿ� i + 1
			
			//System.out.printf("%d ", a[i]);
		}
		
		//System.out.println();
		
		for (i = 0; i < 100; i++) {
			n = (int)(Math.random() * 45);
			
			//System.out.printf("%d ", n);
			
			tmp = a[0];
			a[0] = a[n];
			a[n] = tmp;
		}
		
		//System.out.println();
		
		for (i = 0; i < 6; i++) {
			System.out.printf("%d ", a[i]);
		}
		*/
		
		/*
		//String Ŭ����
		String str = "java programing";
		char c = str.charAt(0);
		char[] ch = {'j', 'a', 'v', 'a'};
		
		System.out.println("str.charAt(0) : " + c);
		System.out.println("str.charAt(5) : " + str.charAt(5));				//�ش���ġ ���ڿ� ��ȯ
		
		System.out.println("str.length() : " + str.length());				//���ڿ��� ����
		
		System.out.println("str.substring() : " + str.substring(3));		//�ش���� ���� ������ ���ڿ� ��ȯ
		System.out.println("str.substring() : " + str.substring(1, 8));		//�ش���� ���ڿ� ��ȯ

		System.out.println("str.equals(1) : " + str.equals("java programing"));	//���ڿ� ���� ������ ��
		System.out.println("str.equals(2) : " + str.equals("java"));
		
		int num = 10;
		
		String str1 = String.valueOf(num);
		System.out.println(str1 + ", length : " + str1.length());
		*/
		
		/*
		//String �迭
		String[] names = {"kim", "park", "lee"};
		String name = "kimparklee";
		int i;
		
		for (i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
		
		String tmp = names[2];
		System.out.println("tmp : " + tmp);
		
		names[0] = "yu";
		
		for (i = 0; i < names.length; i++) {
			System.out.println("names[" + i + "] : " + names[i]);
		}
		*/
		
		/*
		//char�迭�� StringŬ���� ��ȯ
		String str = "ABCDE";
		int i;
		char ch;
		
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			System.out.println("str.charAt(" + i + ") : " + ch);
		}
		
		//String�� char[]�� ��ȯ
		char[] chArr = str.toCharArray();
		System.out.println(chArr + ", length: " + chArr.length);
		*/
		
		//2�����迭 (�������迭)
		/* 2���� �迭�� �ʱ�ȭ ������ �� �� ����
		 ������) score[0][0] = 100
		 		score[0][1] = 100
		 		score[0][2] = 100
		 		score[1][0] = 20
		 		score[1][1] = 20
		 		score[1][2] = 20
		 		score[2][0] = 30
		 		score[2][1] = 30
		 		score[2][2] = 30
		 		score[3][0] = 40
		 		score[3][1] = 40
		 		score[3][2] = 40
		 		sum = 570
		 
		int[][] score = new int[][] {{100, 100, 100}, {20, 20, 20}, {30, 30, 30}, {40, 40, 40}};
		int i, j;
		int sum = 0;
		
		for (i = 0; i < score.length; i++) {
			for (j = 0; j < score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d \n", i, j, score[i][j]);
				
				sum += score[i][j];
			}
		}
		
		System.out.println("sum = " + sum);
		*/
		
		/*
		 ����) String�迭�� �̿��� �ܾ� ���߱�
		 �迭�� "chair", "����", "computer", "��ǻ��", "integer", "����" �� ����
		 ��) chair�� ���� ? å��
		 Ʋ�Ƚ��ϴ�. ������ �����Դϴ�.
		 computer�� ���� ? ��ǻ��
		 �����Դϴ�.
		 integer�� ���� ? ����
		 �����Դϴ�.
		 ��) ���ڿ� �񱳴� equals �޼��� ��� (a.equals("����"))
		 equals �޼����� �μ����� 2���� �迭�� ǥ��
		 
		String[][] words = {{"chair", "����"}, {"computer", "��ǻ��"}, {"integer", "����"}};
		int i;
		String str;
		
		for (i = 0; i < words.length; i++) {	//�� ����
			System.out.printf("%s�� ����? ", words[i][0]);
			str = sc.nextLine();
			
			if (str.equals(words[i][1])) {
				System.out.println("�����Դϴ�.");
			} else {
				System.out.printf("Ʋ�Ƚ��ϴ�. ������ %s�Դϴ�. \n", words[i][1]);
			}
		}
		*/
		
		/*
		 ����) 5���� �л��� 3���� ������ ���ؼ� �� �л��� ������ ����� ����ϰ�, ���� ������ ����ϴ� ���α׷�
		 ��) ������ score 2�����迭�� ����, ��� ��ȣ %3d, �� ������ %5d, ��� %5.1f ����
		 ������) ��ȣ		����		����		����		����		���
		 	    =============================================
		 	      1		100		100		100		300		100.0
		 	      2		 20		 20		 20		 60		 20.0
		 	      3		 30		 30		 30		 90		 30.0
		 	      4		 40		 40		 40		120		 40.0
		 	      5		 50		 50		 50		150		 50.0
		 	    =============================================
		 	    ����		240		240		240
		 
		int[][] score = {
				{100, 100, 100}, 
				{20, 20, 20}, 
				{30, 30, 30}, 
				{40, 40, 40}, 
				{50, 50, 50}
				};
		
		int i, j;
		int totalKor = 0, totalEng = 0, totalMath = 0;
		int sum = 0;
		double avg = 0.0;
		
		System.out.println(" ��ȣ  ����  ����  ����  ����  ���");
		System.out.println("============================");
			
		for (i = 0; i < score.length; i++) {
			sum = 0;	//���� ������ ���ֱ� ���� �ʱ�ȭ
			totalKor += score[i][0];				//���� ����
			totalEng += score[i][1];				//���� ����
			totalMath += score[i][2];				//���� ����
			System.out.printf("%3d", i + 1);				//��ȣ ��� 0���� �����ؼ� i + 1

			for (j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];			//���� ���� ����
				System.out.printf("%5d", score[i][j]);		//���� ���
			}
			
			avg = sum / (double)score[i].length;	//���� ���� ���
			System.out.printf("%5d %5.1f \n", sum, avg);	//����, ��� ���
		}
		
		System.out.println("============================");
		System.out.printf(" ����  %3d  %3d  %3d", totalKor, totalEng, totalMath);
		*/
		
		/*
		 ����) ���� �迭 5��5���� ������ �� �� �迭��ġ�� 1�� �����ؼ� 1�� �����ϴ� ���� ������ �� 5��5���� ����ϴ� ���α׷�
		 ��� ��) 1 2 3 4 5
		 		6 7 8 9 10
		 		11 12 13 14 15
		 		16 17 18 19 20
		 		21 22 23 24 25
		 
		int[][] a = new int [5][5];
		int i, j;
		int k = 1;		//������ų ����
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = k;
				k++;	//����
				System.out.printf("%3d", a[i][j]);
			}
			
			System.out.println();
		}
		*/
		
		/*
		 ����) ���� �����ϰ� ���� �迭 5��5���� ������ �� 1���� 1�� �����ؼ� ���� ä�� �� �Ʒ��� ���� ����ϴ� ���α׷�
		 ��) 1�� �����ϴ� ������ �迭�� ����
		 ��� ��)  1  2  3  4  5
		 		10  9  8  7  6
		 		11 12 13 14 15
		 		20 19 18 17 16
		 		21 22 23 24 25
		 */
		int[][] a = new int[5][5];
		int i, j;
		int k = 1;
		
		for (i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (j = 0; j < a[i].length; j++) {			// ¦���� ������
					a[i][j] = k;
					k++;
				}
			} else {
				for (j = a[i].length - 1; j >= 0; j--) {	//Ȧ���� ������
					a[i][j] = k;
					k++;
				}
			}
		}
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
			
			System.out.println();
		}
	}

}
