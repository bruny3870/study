import java.util.Scanner;

public class MySample1103 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//반복제어문 for
		/*
		문제) for문을 2번 사용하여 1부터 5까지 변수 i를 출력하는 프로그램
		단) 출력할때도 변수 i 사용
		출력 예) 1
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
		문제) 변수 i, j를 이용하여 출력하는 프로그램
		단) 중간에 공백은 탭 '/t'를 사용하여 => %d \t %d \n, i, j
		출력 예) 1	10
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
		// 변수 1개만 사용해서 출력
		int i;
		
		for (i = 1; i <= 10; i++) {
			System.out.println(i + "\t" + (11-i));
		}
		*/
		
		/*
		문제) 대문자를 'A'부터 'Z'까지 차례로 출력하는 프로그램
		단) char타입 i 변수만 사용
		   char타입은 증감 가능 (i++)
		출력 예) ABCDEFGHIJKLMNOPQRSTUVWXYZ
		
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
		문제) 1부터 20까지의 홀수를 차례대로 출력하는 프로그램
		단) 변수는 i만 사용
		출력 예) 1 3 5 7 9 11 13 15 17 19  
		
		int i;
		
		for (i = 1; i <= 20; i++) {
			if (i % 2 != 0) {
				System.out.printf("%d ", i);
			}
		}
		
		//위와 동일한 결과 (증감식 사용)
		for (i = 1; i <= 20; i += 2) { 	// i = i + 2
			System.out.printf("%d ", i);
		}
		*/
		
		/*
		문제) 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램
		입력 예) 15 22 3 129 66 81 35 1 46 888
		출력 예) 입력받은 짝수는 4개 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int cnt = 0;
		
		for(i = 1; i <= 10; i++) {
			
			int a = sc.nextInt();	//입력 받을때 마다 검사
			
			if (a % 2 == 0) {
				cnt++;
			}	
		}
		System.out.printf("입력받은 짝수는 %d개 입니다.", cnt);
		
		int a, i, cnt = 0;
		
		for (i = 0; i < 10; i++) {
			a = sc.nextInt();		//되도록이면 for문안에 있는 변수는 밖에 정의 (자원낭비방지)
			
			if (a % 2 == 0) {
				cnt++;		//cnt = cnt + 1;
			}
		}
		System.out.printf("입력받은 짝수는 %d개 입니다.", cnt);
		*/
		
		/*
		문제) 10개의 정수를 입력받아 3의 배수와 5의 배수의 개수를 각각 출력하는 프로그램
		단) 3의 배수이면서 5의 배수인 경우는 3의 배수에만 포함
		입력 예) 10 15 36 99 100 19 46 88 87 13
		출력 예) 3의 배수 : 4
			   5의 배수 : 2
		
		Scanner sc = new Scanner(System.in);
		
		int a, i;
		int cnt3 = 0, cnt5 = 0, cnt55 = 0;
		
		for (i = 0; i < 10; i++) {
			a = sc.nextInt();
			
			if (a % 3 == 0) {
				cnt3++;
			} else if (a % 5 == 0) {	//else if로 나누면 중복 제거
				cnt5++;					
			}
			
			if (a % 5 == 0) {			//if로 나누면 중복 출력
				cnt55++;
			}
		}
		System.out.println("3의 배수 : " + cnt3);
		System.out.println("5의 배수 : " + cnt5);
		System.out.println("5의 배수 : " + cnt55);
		
		//쓸대없는 switch문
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
		System.out.println("3의 배수 : " + cnt3);
		System.out.println("5의 배수 : " + cnt5);
		*/
		
		/*
		문제) 5명의 성적을 입력받아서 총점과 평균을 출력하는 프로그램
		단) 총점은 sum(int), 평균은 avg(double)변수 사용
		   평균은 계산 '총점 / 5.0'
		입력 예) 90 85 100 66 88
		출력 예) 총점 : 429
		 	   평균 : 85.8 // %.1f
		
		Scanner sc = new Scanner(System.in);
		
		int i, a;
		int sum = 0;
		double avg;
		
		for (i = 0; i < 5; i++) {
			a = sc.nextInt();
			
			sum = sum + a;		//sum += a;
		}
		avg = sum / 5.0;		//avg = (double)sum / 5;
		
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %.1f \n", avg);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		*/
		
		//다중for문
		/*
		문제 예) 3x3 형태로 별찍기
		출력 예) ***
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
		문제) 변수 i, j 값을 이용하여 아래와 가이 출력하는 프로그램
		출력 예) 11111
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
				System.out.print(i);		//행순으로 출력
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= 5; j++) {
				System.out.print(j);		//열순으로 출력
			}
			System.out.println();
		}
		*/
		
		/*
		문제) 정수를 입력받아서 n줄 만큼 다음과 같이 출력하는 프로그램
		입력 예) 5
		출력 예) *
			   **
			   ***
			   ****
			   *****
		
		Scanner sc = new Scanner(System.in);
		
		int a, i, j;
		
		a = sc.nextInt();
		
		for (i = 1; i <= a; i++) {
			for (j = 1; j <= i; j++) {		//열 번호가 행 번호에 영향을 받음 예) 행이 1줄이면 열이 1줄, 행이 3줄이면 열이 3줄
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//구구단
		/*
		문제) 구구단에서 2단부터 4단까지의 구구단을 출력하는 프로그램
		단) 결과는 2자리로 %2d로, 단과 단사이는 탭(\t) 사용
		   변수는 i, j만 사용
		출력 에) 2 * 1 = 2	3 * 1 = 3	4 * 1 = 4		//첫번째 행에서 변하지 않는건 단 => i
			   ....										
			   2 * 9 = 18	3 * 9 = 27	4 * 9 = 36		//두번쨰 열에서 변하지 않는건 열 => j
		
		int i, j;
		
		//행순 정렬
		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 4; j++) {
				System.out.printf("%d * %d = %2d \t", j, i, j * i);		//%2d 자리수 2자리 확보
			}
			System.out.println();
		}
		
		System.out.println();
		
		//출력 예) 2 * 1 = 2	2 * 2 = 4	2 * 3 = 6	2 * 4 = 8	2 * 5 = 10
		//열순 정리
		for (i = 2; i <= 9; i++) {
			for (j = 1; j <= 5; j++) {		
				System.out.printf("%d * %d = %2d \t", i, j, i * j);
			}
			System.out.println();
		}
		*/
		
		/*
		문제) 2부터 9까지 정수를 a, b로 입력받아 a단부터 b단까지의 구구단 출력 프로그램
		단) 단과 단사이는 탭(\t) 사용, 출력은 큰단에서 작은단으로 출력하되 변수는 a, b로 사용 (a가 큰단, b가 작은단)
		입력 예) 3 5
		출력 예) 5 * 1 = 5	4 * 1 = 4		3 * 1 = 3			//i 행 9번 찍어 (입력 영향 x)
			   ....
			   5 * 9 = 45	4 * 9 = 36		3 * 9 = 27			//j a에서 b, 큰단에서 작은단 => 감소
		
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
		문제) 정수를 입력받아 다음과 같이 순서쌍을 출력하는 프로그램
		입력 예) 4
		출력 예) [1,1][1,2][1,3][1,4]
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
