import java.util.Scanner;

public class MySample1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 ����) 100���� ������ ������ �� �ִ� �迭�� �����ϰ� ���ʴ�� �Է¹޴ٰ� 0 �� �ԷµǸ� 0�� �����ϰ� �׶����� �Էµ� ������ ���� ���߿� �Էµ� �������� ���ʴ�� ����ϴ� ���α׷�
		 �Է� ��) 3 5 10 55 0
		 ��� ��) 55 10 5 3
		 
		int[] a = new int[100];
		int i;
		int cnt = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				break;
			}
			
			cnt++;
		}
		
//		//�����
//		for (i = 0; i < cnt; i++) {
//			System.out.print(a[i] + " ");
//		}
//		
//		System.out.println();
//		
//		//�����
//		for (i = cnt - 1; i >= 0; i--) {		//cnt �� -1 ���ϸ� 0���� ���
//			System.out.print(a[i] + " ");
//		}
		
		//���� ������ ���� i���� ����ؼ� �ݺ�
		int j;
		
		for (j = i - 1; j >= 0; j--) {
			System.out.printf("%d ", a[j]);
		}
		*/
		
		/*
		 ����) ������ ���� �Է¹޾� �ش� ���� ������ ����ϴٰ� ���� 0�� �ԷµǸ� �����ϴ� ���α׷� (���ѷ����̿�)
		 ��) ������ 400�⿡ 1��, 4�⿡ 1���̸鼭 100���� ����
		 	year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
		 	������ ��� 2���� ������ 29��
		 �Է� ��) �� => 2000
		 		�� => 2
		 ��� ��) �Է��Ͻ� ���� ������ 29�� �Դϴ�. //days[month]
		 
		 �Է� ��) �� => 2022
		 		�� => 13
		 ��� ��) �߸� �Է��ϼ̽��ϴ�.			//month ���� 1 ~ 12�� �ƴ� ���
		 
		 �Է� ��) �� => 2023
		 		�� => 0					//����
		 
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		//new int[13];
		int m, y;
		
		while (true) {
			System.out.printf("�� => ");
			y = sc.nextInt();
			System.out.printf("�� => ");
			m = sc.nextInt();
			
			if (m == 0) {
				break;
			}
			
			if (m < 1 || m > 12) {
				System.out.printf("�߸� �Է��ϼ̽��ϴ�. \n");
				continue;
			}
			
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
				a[2] = 29;
			} else {
				a[2] = 28;
			}
			
			System.out.printf("�Է��Ͻ� ���� ������ %d�� �Դϴ�. \n", a[m]);
		}
		*/
		
		/*
		 ����) 10���� ������ �Է¹޾� �� �� ���� ū ���� ����ϴ� ���α׷�
		 ��) ����� max ���
		 �Է� ��) 5 10 8 55 6 31 12 24 61 2
		 ��� ��) 61
		 
		int[] a = new int[10];
		int i;
		int max = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < a.length; i++) {
			
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.printf("%d", max);
		*/
		
		/*
		 ����) 10���� ���� �Է¹޾� �� �� ���� ���� ���� ����ϴ� ���α׷�
		 ��) ���� ���� �� ��½� min ���, ����� �ʱⰪ ���� ����
		 �Է� ��) 5 -10 8 55 -6 31 12 24 61 -2
		 ��� ��) -10
		 
		int[] a = new int[10];
		int i;
		int min;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		min = a[0];			//min���� �迭 0������ �־� ���ʷ� ��
		
		for (i = 1; i < a.length; i++) {
		
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.printf("%d", min);
		*/
		
		/*
		 ����) 4�ڸ� ������ 10���� ������ �Է¹޾� ¦�� �� ���� ū ���� Ȧ�� �� ���� ���� ���� ����ϴ� ���α׷�
		 ��) max, min ���, �ʱⰪ ���� �� ����
		 �Է� ��) -5 10 -8 55 6 -31 12 -24 61 2
		 ��� ��) ¦�� �� ���� ū �� : 12 (max)
		 		Ȧ�� �� ���� ���� �� : -31 (min)
		 
		int[] a = new int[10];
		int i;
		int max = -10000;					//���� ���� �� (�񱳰����� �׻� ����)
		int min = 10000;					//���� ū �� (�񱳰����� �׻� ŭ)
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < a.length; i++) {
			
			if (a[i] % 2 == 0) {		//¦��
				
				if (a[i] > max) {		//a[i]�� max ���� Ŭ ��� => max = a[i] => �ݺ�
					max = a[i];
				}
			} else {					//Ȧ��
				
				if (a[i] < min) {
					min = a[i];			//a[i]�� min ���� ���� ��� => min = a[i]; => �ݺ�
				}
			}
		}	
		
		System.out.println("¦�� �� ���� ū �� : " + max);
		System.out.println("Ȧ�� �� ���� ���� �� : " + min);
		*/
		
		/*
		 ����) 10���� ��ǻ�� ������ �Է¹޾� �迭�� �����ϰ� ������ ����� ���ϴ� ���α׷�
		 ��) for 1�� ���, ����� �Ҽ� ù°�ڸ����� ���
		 �Է� ��) 95 100 88 65 80 89 58 93 77 99
		 ��� ��) ���� : 840
		 		��� : 84.0
		 
		int[] a = new int[10];
		int i;
		int sum = 0;
		double avg = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			sum = sum + a[i];
		}
		
		avg = sum / (double)a.length;
		
		System.out.printf("���� : %d \n", sum);
		System.out.printf("��� : %.1f", avg);
		*/
		
		/*
		 ��������
		 �⺻ �迭 �������� ���Ĺ���
		 */
		int[] a = {3, 1, 2, 6, 5, 4};
		int i, j, tmp, k;
		
		for (i = 0; i < a.length - 1; i++) {
			
			for (j = i + 1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			
			System.out.println("\n" + i + "��° ���� �� ���");
			
			for (k = 0; k < a.length; k++) {
				
				System.out.printf("%d ", a[k]);
			}
		}
		
		System.out.println("\n\n���� ���� �� ���");
		
		for (i = 0; i < a.length; i++) {
			
			System.out.printf("%d ", a[i]);
		}
	}

}
