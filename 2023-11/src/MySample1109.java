import java.util.Scanner;

public class MySample1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 ����) 5���� ������ {95, 75, 85, 100, 50} ���� �ʱ�ȭ �ϰ� ������������ �����Ͽ� ����ϴ� ���α׷�
		 ��� ��) 50 75 85 95 100
		 
		int[] a = {95, 75, 85, 100, 50};
		int i, j, tmp, k;
		
		for (i = 0; i < a.length - 1; i++) {		// a.length - 1 �ϴ� ������ ������ ���� ������ �ʿ䰡 ���� ����
			for (j = i + 1; j < a.length; j++) {	// i + 1 �ϴ� ������ �ڱ�� ���� �ʿ䰡 ���� ����
				if (a[i] > a[j]) {					// �������� '>' �������� '<'
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
		*/
		
		/*
		 ����) 10���� ������ �Է¹޾� �迭�� ���� �� �� ������������ �����ϴ� ���α׷�
		 �Է� ��) 95 100 88 65 76 89 58 93 77 99
		 ��� ��) 100 99 95 93 89 88 77 76 65 58
		 
		//int[] a = {95, 100, 88, 65, 76, 89, 58, 93, 77, 99};
		int[] a = new int[10];
		int i, j, tmp;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
//		for (i = 0; i < a.length - 1; i++) {
//			for (j = i + 1; j < a.length; j++) {
//				
//				if (a[i] < a[j]) {
//					tmp = a[i];
//					a[i] = a[j];
//					a[j] = tmp;
//				}
//			}	
//	
		
		//�ٷ� �� for���� ���� ���þ˰������� ����
		int val;					//���ذ� ����
		int idx = 0;				//��ȯ�� j �ε��� ��
		
		for (i = 0; i < a.length - 1; i++) {
			val = a[i];				//val = 95
			
			for(j = i + 1; j < a.length; j++) {
				if (val < a[j]) {	//95 < 100
					val = a[j];		//val = 100
					idx = j;		//idx = 1
				}
			}
			
			//���������� �ڸ� ��ȯ
			if (idx > i) {
				tmp = a[i];
				a[i] = a[idx];
				a[idx] = tmp;
			}
			
			System.out.println("i : " + i + ", idx : " + idx);
			
			for (int k = 0; k < a.length; k++) {
				System.out.printf("%d ", a[k]);
			}
			
			System.out.println();
			idx = i;
		}
		
		for (i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		*/
		
		/*
		 ����) �ִ� 100�� ������ �Է¹޴ٰ� 0 �� �ԷµǸ� �����ϰ� �׶����� �Էµ� �� �� 5�� ����� ������ �հ�, ����� ����ϴ� ���α׷�
		 �Է� ��) 35 10 23 100 64 51 5 0
		 ��� ��) 5�� ��� : 4��
		 		�հ� : 150
		 		��� : 37.5
		 
		int[] a = new int[100];
		int i;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
//		for (i = 0; i < a.length; i++) {
//			
//			a[i] = sc.nextInt();
//			
//			if (a[i] == 0) {
//				break;
//			}
//			
//			if (a[i] % 5 == 0) {
//				cnt++;
//				sum += a[i];
//			}
//		}
//		
//		avg = sum / (double)cnt;
		
		//for�� 2���� ó��
		int num = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				break;
			}
			
			num++;
		}
		
		for (i = 0; i < num; i++) {
			if (a[i] % 5 == 0) {
				sum += a[i];
				cnt++;
			}
		}
		
		avg = sum / (double)cnt;
		
		System.out.printf("5�� ��� : %d�� \n", cnt);
		System.out.printf("�հ� : %d \n", sum);
		System.out.printf("��� : %.1f \n", avg);
		*/
		
		/*
		 ����) 100�� ������ ������ �Է� �޴ٰ� 0 �� �ԷµǸ� 0�� �����ϰ� �׶����� �Է¹��� ������ ����� �� �Է¹��� ������ ���ʷ� ����ϵ� 
		 �� ���� Ȧ���̸� 2���� ���� ¦���̸� 2�� ���� ���� ����ϴ� ���α׷�
		 ��) �� ����� �迭�� �̿����� ���� (�迭�� �Է°��� ���� ����)
		 �Է� ��) 8 10 5 15 100 0
		 ��� ��) 5
		 		4 5 10 30 50
		 
		int[] a = new int [100];
		int i;
		int cnt = 0;
		
//		for (i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//			
//			if (a[i] == 0) {
//				break;
//			}
//			
//			cnt++;
//		}
//		
//		System.out.printf("%d \n", cnt);
//		
//		int val;
//		
//		for (i = 0; i < cnt; i++) {	
//			if (a[i] % 2 == 0) {
//				val = a[i] / 2;				//System.out.printf("%d ", a[i] / 2);
//			} else {
//				val = a[i] * 2;				//System.out.printf("%d ", a[i] * 2);
//			}
//			
//			System.out.printf("%d \n", val);
//		}
		
		//for�� 1���� ó�� (��°�� ���� ����)
		int tmp; 
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				System.out.println();
				System.out.printf("%d", cnt);
				break;
			}
			
			cnt++;
			
			if(a[i] % 2 == 0) {
				tmp = a[i] / 2;
			} else {
				tmp = a[i] * 2;
			}
			
			System.out.printf("%d ", tmp);
		}
		*/
		
		/*
		 ����) ���� 10���� �Է¹޾� �ִ� ���� ����ϴ� ���α׷�
		 ��) ������ �迭���� score�� ��� max, for���� i�� ����
		 	������ 0 ~ 100 ���� ���� �Է¹�����, ������ �Է½� "���� ������ �ʰ� �Ǿ����ϴ�." "0 ~ 100 ������ ���ڸ� �ٽ� �Է��ϼ���." ���
		 �Է� ��) 110
		 ��� ��) ���� ������ �ʰ� �Ǿ����ϴ�.
		 		0 ~ 100 ������ ���ڸ� �ٽ� �Է��ϼ���.
		 
		 �Է� ��) 95 67 88 65 76 89 58 93 77 99 (�Է½ø��� �ϳ��� �� �Է� �� �ٷ� ����)
		 ��� ��) ���� ū ���� 99 �Դϴ�.
		 
		int[] score = new int[10];
		int i, max;
		
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			
//			if (score[i] < 0 || score[i] > 100) {
//				System.out.println("���� ������ �ʰ� �Ǿ����ϴ�.");
//				System.out.println("0 ~ 100 ������ ���ڸ� �ٽ� �Է��ϼ���.");
//				i--;								//i�� �����ϱ� ���� i�� ����
//			}
			
			//�ٸ� ���
			while (score[i] < 0 || score[i] > 100) {
				System.out.println("���� ������ �ʰ� �Ǿ����ϴ�.");
				System.out.println("0 ~ 100 ������ ���ڸ� �ٽ� �Է��ϼ���.");
				score[i] = sc.nextInt();			//�ٽ��Է� i�� �״�� (������ ���� i������ ���ѷ���)
			}
		}
			
		max = score[0];
			
		for (i = 1; i< score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.printf("���� ū ���� %d �Դϴ�.", max);
		
		
		//for�� 1���� ó��
		int [] score = new int[10];
		int i;
		int max = 0;
		
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			
			if (score[i] < 0 || score[i] > 100) {
				System.out.println("���� ������ �ʰ� �Ǿ����ϴ�.");
				System.out.println("0 ~ 100 ������ ���ڸ� �ٽ� �Է��ϼ���.");
				i--;
				continue;				//���� �ʰ��� ��� max�� �� �� ���� ����
			}
			
			if (score[i] > max) {
				max = score[i];
			}
		}
		
		System.out.printf("���� ū ���� %d �Դϴ�.", max);
		*/
		
		/*
		 ����) 20 ������ ���� n�� �Է¹ް� n���� ������ �Է¹޾� ���� ���� ���� ���ʷ� ����ϴ� ���α׷�
		 �Է� ��) 5
		 		35 10 35 100 64
		 ��� ��) 100 64 35 35 10
		 
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, j, tmp;
		
		for (i = 0; i < n; i++) {		//�������� n �迭�� ���� (a.length -> a �迭�� ����)
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		for(i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
		*/
		
		//�迭����
		/*
		 ����) ���� ũ�Ⱑ 5���� �迭�� �����ϰ� �� 10, 20, 30, 40, 50�� ������ ��
		 2�� ũ���� �迭�� �����Ͽ� ���� ������ �迭�� ������ �� ����ϴ� ���α׷�
		 ��� ��) [���� ��]
		 		arr.length : 5
		 		arr[0] : 10
		 		arr[1] : 20
		 		arr[2] : 30
		 		arr[3] : 40
		 		arr[4] : 50
		 		
		 		[���� ��]
		 		arr.length : 10
		 		arr[0] : 10
		 		arr[1] : 20
		 		arr[2] : 30
		 		arr[3] : 40
		 		arr[4] : 50
		 		arr[5] : 0
		 		arr[6] : 0
		 		arr[7] : 0
		 		arr[8] : 0
		 		arr[9] : 0
		 
		int[] arr = new int[5];						//arr 5��
		int i;
		int num = 10;
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = num * (i + 1);
		}
		
		System.out.println("[���� ��]");
		System.out.printf("arr.length : %d \n", arr.length);
		
		for (i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];		//tmp 10��
		
		System.out.println("�迭 ���� �� �ּ�...");
		System.out.println("arr : " + arr);			//�迭�� �ּҰ�
		System.out.println("tmp : " + tmp);			//�迭�� �ּҰ�
													//���� �ٸ� ��
		//�迭 �� ����
		for (i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;									//arr�� �ּҰ��� tmp�� ���� ���� (�迭 ����)
		
		System.out.println("�迭 ���� �� �ּ�...");
		System.out.println("arr : " + arr);			//�迭�� �ּҰ�
		System.out.println("tmp : " + tmp);			//�迭�� �ּҰ�
													//���� ���� ��
		System.out.println("[���� ��]");
		System.out.println("arr.length : " + arr.length);
		
		for (i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}
		
		System.out.println("tmp[0] : " + tmp[0] + " arr[0] : " + arr[0]);
		System.out.println("tmp[1] : " + tmp[1] + " arr[1] : " + arr[1]);
		
		tmp[1] = 99;
		
		System.out.println("�� ���� ��...");
		System.out.println("tmp[1] : " + tmp[1] + " arr[1] : " + arr[1]);
		*/
		
		/*
		 ����) ���� 5���� �Է¹��� �迭�� ������ �� ���� 5���� �Է¹޾� �迭�� ������ �� �迭���縦 ���� ũ�Ⱑ 2���� �迭�� �����ϰ� 
		 ���� �迭 ũ�� �ں��� �ٽ� �Է� 5���� �޾� ����ϴ� ���α׷�
		 ��) �߰� �Է±��� ��� �� �Ŀ� �迭 ���� ����
		 �Է� ��) 10 20 30 40 50 (arr�� �Է�)
		 ��� ��) arr.length : 5 (arr�� ���)
		 		10 20 30 40 50
		 �Է� ��) 1 2 3 4 5 (tmp�� �Է�)
		 �迭���� �� ���
		 ��� ��) 10 20 30 40 50 1 2 3 4 5 (arr�� ���)
		 */
		int[] arr = new int[5];
		int i;
		
		//0 ~ 4���� �迭�� �Է�
		for (i = 0; i < arr.length; i++) {		//arr.length ���� 5
			arr[i] = sc.nextInt();
		}
		
		//arr�迭 ���� ���
		System.out.printf("arr.length : %d \n", arr.length);
		
		//arr�迭 �� ���
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		
		//tmp�迭
		int[] tmp = new int[arr.length * 2];	//arr�迭 ũ�� 2��
		
		//�迭 ����
		for (i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		//arr�迭�� 0 ~ 4���� �迭 �� �����Ƿ� i = 5 ���� ����
		for (i = arr.length; i < tmp.length; i++) {		//tmp.length ���� 10
			tmp[i] = sc.nextInt();
		}
		
		arr = tmp;
		
		System.out.println("�迭 ���� �� ���");
		
		System.out.printf("arr.length : %d \n", arr.length);
		
		//���� �� arr�迭 �� ���
		for (i = 0; i < tmp.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
