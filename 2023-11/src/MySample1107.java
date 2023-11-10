import java.util.Scanner;

public class MySample1107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//반복문
		/*
		 문제) 정수 n을 입력받아 n줄만큼 다음과 같이 출력하는 프로그램
		 단) for문 사용, printf("%2d ", 변수명)
		 입력 예) 5
		 출력 예)  1
		 		 2  3
		 		 4  5  6
		 		 7  8  9 10
				11 12 13 14 15
		
		int n, i, j;
		int cnt = 0;
		
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			for (j = 1; j <= i; j++) {
				cnt++;								//횟수 카운트
				System.out.printf("%2d ", cnt);
			}
			
			System.out.println();
		}
		 */
		
		/*
		 문제) 정수 n을 입력받아 아래와 같이 영문자를 출력하는 프로그램
		 입력 예) 3
		 출력 예) ABC
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
		 문제) for문을 이용하여 다음과 같이 출력하는 프로그램
		 출력 예) a 1 2 3 4
		 		b c 5 6 7
		 		d e f 8 9
		 		g h i j 10
		 4행 5열 고정으로 출력
		 
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
		 문제) while문 무한루프 사용하여 아래와 같이 실행되는 프로그램
		 단) continue, break 사용
		 입력 예) 현재 가진 돈은 10000원 입니다.
		 출력 예)	얼마를 사용하시겠습니까? => 1000
		 		이제 9000원 남았습니다.
		 		
		 		얼마를 사용하시겠습니까? => 5000
		 		이제 4000원 남았습니다.
		 		
		 		얼마를 사용하시겠습니까? => 5000
		 		다시 입력하세요. (사용범위오류)
		 		
		 		얼마를 사용하시겠습니까? => 4000
		 		이제 0원 남았습니다.
		 		모든 돈을 사용했습니다. 끝
		 
		int n;
		int m = 10000;
		
		System.out.printf("현재 가진 돈은 %d원 입니다. \n", m);
		
		while (true) {
			System.out.printf("얼마를 사용하시겠습니까? => ");
			n = sc.nextInt();
			
			if (m >= n) {
				m = m - n;
				System.out.printf("이제 %d원 남았습니다. \n", m);
				
				if (m == 0) {
					System.out.printf("모든 돈을 사용했습니다. 끝");
					break;
				} else {
					continue;
				}
				
			} else {
				System.out.printf("다시입력하세요. 사용범위오류 \n");
				continue;
			}
		}
		//다른방법
		while (true) {
			System.out.printf("얼마를 사용하시겠습니까? => ");
			n = sc.nextInt();
			
			if (n < 0 || n > m) {
				System.out.printf("다시입력하세요. 사용범위오류 \n");
				continue;
			}
			
			m = m - n;
			System.out.printf("이제 %d원 남았습니다. \n", m);
			
			if (m == 0) {
				System.out.printf("모든 돈을 사용했습니다. 끝");
				break;
			}
		}
		*/
		
		//배열
		/*
		 문제) 5개의 정수를 입력 받은 후 차례대로 출력하는 프로그램
		 
		int a, b, c, d, e;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		e = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d \n", a, b, c, d, e);
		
		//위 문제와 같은 것으로 배열을 사용하되, 반복문은 사용하지 않음.
		int[] a = new int[5];
		
		a[0] = sc.nextInt();
		a[1] = sc.nextInt();
		a[2] = sc.nextInt();
		a[3] = sc.nextInt();
		a[4] = sc.nextInt();
		a[5] = sc.nextInt();
		
		System.out.printf("%d %d %d %d %d \n", a[0], a[1], a[2], a[3], a[4]);
		
		
		//위 문제와 같은 것으로 배열을 반복문 사용
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
		 문제) 정수 5개를 입력 받은 후 합계를 출력하는 프로그램
		 입력 예) 10 20 30 40 50
		 출력 예) 150
		 
		int[] a = new int[5];		//선언과 동시에 사이즈를 정해야됨 (단점)
		int i;
		int sum = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		
		System.out.print(sum);
		*/
		
		/*
		 문제) 문자 10개를 저장할 수 있는 배열을 선언하고 10개의 문자를 입력받아 문자를 이어서 출력하는 프로그램
		 단) sc.next().charAt(0) 사용 (next() : 공백 또는 엔터를 기준으로 짤라서 문자열로 반환)
		 입력 예) A B C D E F G H I J
		 출력 예) ABCDEFGHIJ
		 
		char[] a = new char[10];
		int i;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.next().charAt(0);
			System.out.printf("%c", a[i]);
		}
		*/
		
		/*
		 문제) 정수 10개를 입력 받은 후 세번째, 다섯번째, 마지막으로 입력받은 정수를 차례로 출력하는 프로그램
		 단) 마지막 입력받은 값은 배열의 길이를 이용하여 출력
		 입력 예) 5 3 9 6 8 4 2 8 10 1
		 출력 예) 9 8 1
		 
		int[] a = new int[10];
		int i;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		System.out.printf("%d %d %d", a[2], a[4], a[a.length - 1]);
		*/
		
		/*
		 문제) 최대 100개까지의 정수를 차례로 입력받다가 0 이 입력되면 입력을 중단하고 짝수번째에 입력된 정수를 모두 출력하는 프로그램
		 단) for문은 입력용 1개, 출력용 1개 사용
		 입력 예) 11 25 3 9 0
		 출력 예) 25 9
		 
		int[] a = new int[100];
		int i;
		int cnt = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {	//a[i]의 값이 0 일떄
				break;
			}
			
			cnt++;	//0 이 아닌경우 입력 카운트
		}
		
		for (i = 0; i < cnt; i++) {	//입력 카운트 보다 작게 (100번 다 돌릴 필요 없음)
		
			if (i % 2 != 0) {
				System.out.print(a[i] + " ");
			}
		}
		*/
		/*
		 문제) 위와 동일한 문제로 i변수를 반복개수로 처리할 셩우
		 
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
		 문제) 정수 5개를 입력받아 배열에 저장한 후 검색할 정수를 하나 입력받아 배열에 같은 값이 있는지 찾아 해당 위치의 인덱스를 출력하는 프로그램
		 단) 배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다." 라고 출력
		 입력 예) 입력 0 : 7
		 		입력 1 : 3
		 		입력 2 : 5
		 		입력 3 : 2
		 		입력 4 : 4
		 		검색값 : 5
		 출력 예) 일치하는 값의 인덱스 : 2
		 
		 입력 예) 입력 0 : 3
		 		입력 1 : 8
		 		입력 2 : 5
		 		입력 3 : 6
		 		입력 4 : 1
		 		검색값 : 7
		 출력 예) 일치하는 값이 존재하지 않습니다.
		 */
		int[] a = new int[5];
		int i;
		
		for (i = 0; i < a.length; i++) {			// 0 ~ 4까지 
			System.out.printf("입력 %d : ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.printf("검색값 : ");
		int s = sc.nextInt();
		
		boolean flag = true;						//찾을 값 유무를 판단
		
		for (i = 0; i < a.length; i++) {
			if (s == a[i]) {						// s값과 a[i]값 비교
				System.out.printf("일치하는 값의 인덱스 : %d", i);
				flag = false;						//일치값 찾으면 변경
				break;
			}
			
//			//flag 사용 안하고 for 사용
//			if (i == (a.length - 1) && s != a[i]) {	//끝까지 돌고 s값과 a[i]마지막값이 다르다
//				System.out.printf("일치하는 값이 존재하지 않습니다.");
//			}
		}
		
		if (flag) {
			System.out.printf("일치하는 값이 존재하지 않습니다.");
		}
		
	}

}
