
public class MySample1113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 ����) 4��4���� 2���� �迭�� ����� 1 ~ 10 ������ ������ 10�� �����ϰ� ������ ���ʷ� ��ġ�� �����ϰ� ���� 6���� ���� ��� 0���� ä�� �ֽ��ϴ�.
		 ��) ������ ������ �־ ��� ���� ������� 2���� �迭�� ȭ�鿡 ���.
		 	���� ���� 0 ~ 10 ���̷� (int)(Math.random() * 10 + 1) ���	// 1 ~ 10
		 	6�� 0�� ���� ��ġ�� (int)(Math.random() * 4) ���		//4��4���̹Ƿ�  0 ~ 3
		 	��� �� printf("%2d ", ����) ���
		 ��� ��) 0 6 0 5
		 		0 8 0 1
		 		8 0 0 5
		 		4 1 3 2
		 
//		int [][] a = new int [4][4];						//�迭�ʱ�ȭ
//		int i, j;
//		
//		for (int cnt = 0; cnt < 10;) {						//0�� �ƴ� ���� 10�� �ɶ����� ī��Ʈ
//			i = (int)(Math.random() * 4);					//�� 1 ~ 4�� ����
//			j = (int)(Math.random() * 4);					//�� 1 ~ 4�� ����
//			
//			if (a[i][j] == 0) {								//�迭 0 �ΰ���
//				a[i][j] = (int)(Math.random() * 10 + 1);	//1 ~ 10 ���� ����
//				cnt++;										//cnt ���� 10�� �ݺ�
//			}
//		}
//		
//		for (i = 0; i < a.length; i++) {
//			for (j = 0; j < a[i].length; j++) {
//				System.out.printf("%2d ", a[i][j]);
//			}
//			
//			System.out.println();
//		}
		
		//�ٸ����
		int [][] a = new int[4][4];
		int i, j;
		int cnt = 1;
		
		//������ �����ϰ� �����ؼ� ����
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random() * 10 + 1);
			}
		}
		
		//6���� ���� ��ġ�� 0���� �־��ֱ�
		while (cnt < 7) {
			i = (int)(Math.random() * 4);		//�� 4x4 ���� ��ġ
			j = (int)(Math.random() * 4);		//�� 4x4 ���� ��ġ
			
			if (a[i][j] != 0) {
				a[i][j] = 0;
				cnt++;
			}
		}
		
		//�迭���
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
		
			System.out.println();
		}
		*/
		
		
	}

}
