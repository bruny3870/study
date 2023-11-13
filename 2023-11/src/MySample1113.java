
public class MySample1113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 문제) 4행4열인 2차원 배열을 만들고 1 ~ 10 까지의 정수를 10개 랜덤하게 생성해 차례로 위치에 삽입하고 남은 6개의 수는 모두 0으로 채워 넣습니다.
		 단) 동일한 정수가 있어도 상관 없고 만들어진 2차원 배열을 화면에 출력.
		 	랜덤 값은 0 ~ 10 사이로 (int)(Math.random() * 10 + 1) 사용	// 1 ~ 10
		 	6개 0을 넣을 위치는 (int)(Math.random() * 4) 사용		//4행4열이므로  0 ~ 3
		 	출력 시 printf("%2d ", 변수) 사용
		 출력 예) 0 6 0 5
		 		0 8 0 1
		 		8 0 0 5
		 		4 1 3 2
		 
//		int [][] a = new int [4][4];						//배열초기화
//		int i, j;
//		
//		for (int cnt = 0; cnt < 10;) {						//0이 아닌 수가 10개 될때까지 카운트
//			i = (int)(Math.random() * 4);					//행 1 ~ 4행 랜덤
//			j = (int)(Math.random() * 4);					//열 1 ~ 4행 랜덤
//			
//			if (a[i][j] == 0) {								//배열 0 인곳에
//				a[i][j] = (int)(Math.random() * 10 + 1);	//1 ~ 10 랜덤 숫자
//				cnt++;										//cnt 증가 10번 반복
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
		
		//다른방법
		int [][] a = new int[4][4];
		int i, j;
		int cnt = 1;
		
		//정수를 랜덤하게 생성해서 저장
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random() * 10 + 1);
			}
		}
		
		//6개의 랜덤 위치에 0으로 넣어주기
		while (cnt < 7) {
			i = (int)(Math.random() * 4);		//행 4x4 랜덤 위치
			j = (int)(Math.random() * 4);		//열 4x4 랜덤 위치
			
			if (a[i][j] != 0) {
				a[i][j] = 0;
				cnt++;
			}
		}
		
		//배열출력
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				System.out.printf("%2d ", a[i][j]);
			}
		
			System.out.println();
		}
		*/
		
		
	}

}
