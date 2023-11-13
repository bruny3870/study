import java.util.Scanner;

public class MySample1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//랜덤 Math.random() => double형으로 0.0 이상 1.0 미만 사이 값 반환
		//실행결과)0123456789
		//		5827164930
		/*
		int[] arr = new int[10];
		int i, n, tmp;
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = i;							// 0 ~ 9 입력
			
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		
		//랜덤 돌림
		for (i = 0; i < 100; i++) {
			n = (int)(Math.random() * 10);		// 0 ~ 9 사이 하나의 값 출력
			
			System.out.printf("%d ", n);
			
			//배열 위치 변경
			tmp = arr[0];						//기준점은 배열의 0번째 고정
			arr[0] = arr[n];
			arr[n] = tmp;
		}
		
		System.out.println();
		
		//랜덤 돌린 값 출력
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		*/
		
		/*
		 문제) 로또번호 생성기
		 배열에 1부터 45까지 값을 저장한 후에 0번째와 random 배열의 값을 바꾸는데 횟수를 100번 실행하고 최종 로또번호는 앞에서부터 6개 출력 (배열에 0 ~ 5 번쨰 값)
		 단) (int)(Math.random() * 45)	//0 ~ 44 사이 값 중 하나의 값 생성
		 
		int[] a = new int[45];
		int i, n, tmp;
		
		for (i = 0; i < a.length; i++) {
			a[i] = i + 1;					//로또 번호는 1 ~ 45까지 이므로 i + 1
			
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
		//String 클래스
		String str = "java programing";
		char c = str.charAt(0);
		char[] ch = {'j', 'a', 'v', 'a'};
		
		System.out.println("str.charAt(0) : " + c);
		System.out.println("str.charAt(5) : " + str.charAt(5));				//해당위치 문자열 반환
		
		System.out.println("str.length() : " + str.length());				//문자열의 길이
		
		System.out.println("str.substring() : " + str.substring(3));		//해당범위 부터 끝까지 문자열 반환
		System.out.println("str.substring() : " + str.substring(1, 8));		//해당범위 문자열 반환

		System.out.println("str.equals(1) : " + str.equals("java programing"));	//문자열 내용 같은지 비교
		System.out.println("str.equals(2) : " + str.equals("java"));
		
		int num = 10;
		
		String str1 = String.valueOf(num);
		System.out.println(str1 + ", length : " + str1.length());
		*/
		
		/*
		//String 배열
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
		//char배열과 String클래스 변환
		String str = "ABCDE";
		int i;
		char ch;
		
		for (i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			System.out.println("str.charAt(" + i + ") : " + ch);
		}
		
		//String을 char[]로 변환
		char[] chArr = str.toCharArray();
		System.out.println(chArr + ", length: " + chArr.length);
		*/
		
		//2차원배열 (다차원배열)
		/* 2차원 배열에 초기화 설정은 한 후 실행
		 실행결과) score[0][0] = 100
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
		 문제) String배열을 이용한 단어 맞추기
		 배열에 "chair", "의자", "computer", "컴퓨터", "integer", "정수" 로 선언
		 예) chair의 뜻은 ? 책상
		 틀렸습니다. 정답은 의자입니다.
		 computer의 뜻은 ? 컴퓨터
		 정답입니다.
		 integer의 뜻은 ? 정수
		 정답입니다.
		 단) 문자열 비교는 equals 메서드 사용 (a.equals("의자"))
		 equals 메서드의 인수값을 2차원 배열로 표현
		 
		String[][] words = {{"chair", "의자"}, {"computer", "컴퓨터"}, {"integer", "정수"}};
		int i;
		String str;
		
		for (i = 0; i < words.length; i++) {	//행 개수
			System.out.printf("%s의 뜻은? ", words[i][0]);
			str = sc.nextLine();
			
			if (str.equals(words[i][1])) {
				System.out.println("정답입니다.");
			} else {
				System.out.printf("틀렸습니다. 정답은 %s입니다. \n", words[i][1]);
			}
		}
		*/
		
		/*
		 문제) 5명의 학생의 3과목 점수를 더해서 각 학생의 총점과 평균을 계산하고, 과목별 총점을 계산하는 프로그램
		 단) 과목은 score 2차원배열에 저장, 출력 번호 %3d, 각 점수는 %5d, 평균 %5.1f 적용
		 실행결과) 번호		국어		영어		수학		총점		평균
		 	    =============================================
		 	      1		100		100		100		300		100.0
		 	      2		 20		 20		 20		 60		 20.0
		 	      3		 30		 30		 30		 90		 30.0
		 	      4		 40		 40		 40		120		 40.0
		 	      5		 50		 50		 50		150		 50.0
		 	    =============================================
		 	    총점		240		240		240
		 
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
		
		System.out.println(" 번호  국어  영어  수학  총점  평균");
		System.out.println("============================");
			
		for (i = 0; i < score.length; i++) {
			sum = 0;	//총점 누적을 없애기 위해 초기화
			totalKor += score[i][0];				//국어 총점
			totalEng += score[i][1];				//영어 총점
			totalMath += score[i][2];				//수학 총점
			System.out.printf("%3d", i + 1);				//번호 출력 0부터 시작해서 i + 1

			for (j = 0; j < score[i].length; j++) {
				sum = sum + score[i][j];			//개인 점수 총점
				System.out.printf("%5d", score[i][j]);		//점수 출력
			}
			
			avg = sum / (double)score[i].length;	//개인 점수 평균
			System.out.printf("%5d %5.1f \n", sum, avg);	//총점, 평균 출력
		}
		
		System.out.println("============================");
		System.out.printf(" 총점  %3d  %3d  %3d", totalKor, totalEng, totalMath);
		*/
		
		/*
		 문제) 정수 배열 5행5열로 선언한 후 각 배열위치에 1로 시작해서 1씩 증가하는 값을 지정한 후 5행5열을 출력하는 프로그램
		 출력 예) 1 2 3 4 5
		 		6 7 8 9 10
		 		11 12 13 14 15
		 		16 17 18 19 20
		 		21 22 23 24 25
		 
		int[][] a = new int [5][5];
		int i, j;
		int k = 1;		//증가시킬 변수
		
		for (i = 0; i < a.length; i++) {
			for (j = 0; j < a[i].length; j++) {
				a[i][j] = k;
				k++;	//증가
				System.out.printf("%3d", a[i][j]);
			}
			
			System.out.println();
		}
		*/
		
		/*
		 문제) 위와 동일하게 정수 배열 5행5열로 선언한 후 1부터 1씩 증가해서 값을 채운 후 아래와 같이 출력하는 프로그램
		 단) 1씩 증가하는 순서로 배열에 저장
		 출력 예)  1  2  3  4  5
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
				for (j = 0; j < a[i].length; j++) {			// 짝수열 정방향
					a[i][j] = k;
					k++;
				}
			} else {
				for (j = a[i].length - 1; j >= 0; j--) {	//홀수열 역방향
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
