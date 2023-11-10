import java.util.Scanner;

public class MySample1106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 문제) 지난주 금요일 마지막 문제를 참고하여 아래와 같이 출력하는 프로그램
		 입력 예) 4
		 출력 예) [1,1]
		 			[2,2]
		 				[3,3]
		 					[4,4]
		 단) 공백은 printf("%5c", ' '); or print("     ");
		 
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
		 문제) 구구단을 입력 받아 해당 단 일부를 출력하는 프로그램
		 단) 입력변수는 a, b를 사용하고 a는 작은단, b는 큰단으로 해서 a부터 b까지 출력
		     출력결과시 (%d * %d = %2d \t)
		     j 는 5까지 출력
		 입력 예) 5 2
		 출력 예) 2 * 1 = 2	2 * 2 = 4	2 * 3 = 6	2 * 4 = 8	2 * 5 = 10
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
		//while (반복문)
		int a = 1;
		
		while (a <= 10) {
			System.out.println(a);
			a++;					//증감없으면 1로 영원히 출력 (무한루프)
		}
		
		System.out.println();
		
		//위에 while문을 for문으로
		for (a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		*/
		
		/*
		 문제) 알파벳 'A'부터 'Z'까지 출력하는 프로그램
		 출력 예) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		 단) 변수는 alpha = 'A' 초기대입
		 
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
		 문제) 1이상 100이하의 정수를 입력받아 while문을 이용하여 1부터 입력받은 정수까지의 합을 구하여 출력하는 프로그램
		 입력 예) 10
		 출력 예) 55
		 
		int a;
		int i = 1;		// 0부터 시작이면 메모리 낭비
		int sum = 0;
		a = sc.nextInt();
		
		while (i <= a) {
			sum = sum + i;
			i++;
		}
		
		System.out.println(sum);
		
		//무한루프
		int a;
		
		while (true) { //for (;;) 루한루프
			a = sc.nextInt();
			
			if (a >= 1 && a <= 100) {
				break;
			} else {
				System.out.println("입력값 오류... 다시 입력하세요.");
			}
		}
		*/
		
		/*
		 문제) 점수를 입력받아 80점 이상이면 합격메세지를, 그렇지 않으면 불합격 메세지를 출력하는 작업을 반복하다가 0 ~ 100 이외의 점수가 입력되면 종료하는 프로그램
		 단) while문에 조건식에 비교와 논리연산자 사용, break 사용안함
		 입력 예) 점수를 입력하세요 => 50
		 출력 예) 죄송합니다. 불합격입니다.
		 		점수를 입력하세요 => 95
		 		축하합니다. 합격입니다.
		 		점수를 입력하세요 => 101
		 
		int a = 0;
		
		while (a >= 0 && a <= 100) {
			System.out.print("점수를 입력하세요 => ");
			a = sc.nextInt();
			
			if (a >= 0 && a <= 100) {
			
				if (a >= 80) {
					System.out.println("축하합니다. 합격입니다.");
				} else {
					System.out.println("죄송합니다. 불합격입니다.");
				}
			}
		}
		
		//다른방법
		int score;
		
		System.out.print("점수를 입력하세요 => ");
		score = sc.nextInt();
		
		while (score >= 0 && score <= 100) {
		
			if (score >= 80) {
				System.out.println("축하합니다. 합격입니다.");
			} else {
				System.out.println("죄송합니다. 불합격입니다.");
			}
			
			System.out.print("점수를 입력하세요 => ");
			score = sc.nextInt();
		}
		*/
		
		/*
		 문제) 위 문제를 while 무한루프를 이용하여 작성
		 단) while(true), break (continue) - > for (;;)
		 
		int score;
		
		while(true) {
			System.out.print("점수를 입력하세요 => ");
			score = sc.nextInt();
			
			if (score < 0 || score > 100) {
				break;			//if를 감싸고 있는 반복문 탈출 (프로그램 종료)
			}
			
			if (score >= 80) {
				System.out.println("축하합니다. 합격입니다.");
				//continue;		//if를 감싸고 있는 반복문 다시 시작 (다시입력 출력 X)
			} else {
				//continue;		//continue 사용 시 밑으로 명령줄 있으면 오류
				System.out.println("죄송합니다. 불합격입니다.");
			}
			
			System.out.println("다시입력...");
		}
		*/
		
		//continue
		/*
		 문제) 1부터 10까지 반복하면서 홀수만 출력하는 프로그램
		 단) continue 사용
		 출력 예) 1 3 5 7 9
		 
		int num = 0;
		
		while (num < 10) {
			num++;
			
			if (num % 2 == 0) {
				continue;
			}
			
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		//위와 동일한 조건으로 for문 사용
		for (num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				continue;
			}
			
			System.out.print(num + " ");
		}
		*/
		
		/*
		 문제) 정수를 계속 입력받다가 0이 입력되면 0을 제외하고 이전에 입력된 자료의 수와 합계, 평균을 출력하는 프로그램
		 단) while 무한루프 사용, 평균은 소수 둘째자리까지 출력
		 입력 예) 15 88 97 0
		 출력 예) 입력된 자료의 개수 = 3개
		 		입력된 자료의 합계 = 200
		 		입려된 자료의 평균 = 66.67
		 
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
		
		avg = sum / (double)cnt;	// 정수 / 정수 = 정수, 정수 / 실수 = 실수
		
		System.out.printf("입력된 자료의 개수 = %d개 \n", cnt);
		System.out.printf("입력된 자료의 합계 = %d \n", sum);
		System.out.printf("입력된 자료의 평균 = %.2f \n", avg);
		*/
		
		/*
		 문제) 정수를 계속 입력받다가 0이 입력되면 0을 제외하고 이전에 입력된 수 중 홀수의 합계와 평균을 출력하는 프로그램
		 단) continue, break 사용
		 입력 예) 5 8 17 6 31 0
		 출력 예) 홀수의 합계 : 53
		 		홀수의 평균 : 17
		 
		int num;
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		
		while (true) {
			num = sc.nextInt();
			
			if (num == 0) {			// '0'이 입력될 경우 while 종료
				break;
			} 
			
			if (num % 2 == 0) {		// 짝수가 입력될 경우 while 다시
				continue;
			}
			
			cnt++;					// 홀수가 입력될 경우 처리
			sum = sum + num;
		}
		
		avg = sum / cnt;
		
		System.out.println("홀수의 합계 : " + sum);
		System.out.println("홀수의 평균 : " + avg);
		*/
		
		//do-while
		/*
		int a = 1;
		
		do {									//작업문은 반드시 1번 실행
			System.out.println(a + "번째 출력");
			a++;
		} while (a <= 10);						// 조건식이 '참'일 동안 반복
		*/
		
		/*
		 문제) 위 문제를 while 무한루프 사용
		 
		int a = 1;
		
		while (true) {
			if (a <= 10) {
				System.out.println(a + "번째 출력");
				a++;
			} else {
				break;
			}
		}
		
		//다른방법
		while (true) {
			System.out.println(a + "번째 출력");
			a++;
			
			if (a > 10) {
				break;
			}
		}
		
		// 위 문제를 while 조건식을 이용
		int a = 1;
		
		while (a <= 10) {
			System.out.println(a + "번쨰 출력");
			a++;
		}
		*/
		
		/*
		 문제) 정수를 계속 입력 받다가 0이 입력되면 입력받은 수 중 홀수의 합과 평균을 출력하는 프로그램
		 단) do-while 사용, break, continue 사용안함
		 입력 예) 5 8 17 6 31 0
		 출력 예) 홀수의 합계 : 53
		 		홀수의 평균 : 17
		 
		int num;
		int cnt = 0;
		int sum = 0;
		int avg = 0;
		
		do {						//작업문 작동
			num = sc.nextInt();

			if (num % 2 != 0) {		// 홀수일때
				cnt++;
				sum = sum + num;
			}
		} while (num != 0);			//입력 받은 값이 '0'일 경우 종료
		
		avg = sum / cnt;
		
		System.out.println("홀수의 합계 : " + sum);
		System.out.println("홀수의 평균 : " + avg);
		*/
		
		/*
		 문제) 아래와 같이 메세지를 출력하고 숫자를 입력받아 선택한 번호에 해당하는 메세지를 출력하는 작업을 반복하다가 4가 입력되면 메세지 출력후 종료하는 프로그램
		 단) do-while 사용, 1 ~ 4 이외의 수가 입력되면 "잘못 입력되었습니다." 출력
		 입력 예) 1. 입력하기
		 	    2. 출력하기
		 	    3. 삭제하기
		 	    4. 끝내기
				작업할 번호를 선택하세요 => 2
		출력 예) 출력하기를 선택하셨습니다.
		입력 예) 1. 입력하기
		 	    2. 출력하기
		 	    3. 삭제하기
		 	    4. 끝내기
				작업할 번호를 선택하세요 => 6
		출력 예) 잘못 입력되었습니다. (다시 반복)
		 */
		int num;
		
		do {
			System.out.println("1. 입력하기");
			System.out.println("2. 출력하기");
			System.out.println("3. 삭제하기");
			System.out.println("4. 끝내기");
			System.out.print("작업할 번호를 선택하세요 => ");
			num = sc.nextInt();
			
			if (num >= 1 && num <= 4) {				//입력받을 값은 1보다 크거나 같고 4보다 작거나 같다
				if (num == 1) {						//입력받은 값이 '1'일 경우
					System.out.print("입력하기를 ");
				} else if (num == 2) {				//입력받은 값이 '2'일 경우
					System.out.print("출력하기를 ");
				} else if (num == 3) {				//입력받은 값이 '3'일 경우
					System.out.print("삭제하기를 ");
				} else {							//입력받은 값이 '4'일 경우
					System.out.print("끝내기를 ");
				}
				System.out.print("선택하셨습니다. \n");
				
			} else {								//1~4를 제외한 숫자일 경우
				System.out.println("잘못 입력되었습니다.");
			}
			System.out.println();
			
		} while (num != 4);							//입력받은 값이 '4'일 경우 종료
		
	}
}
