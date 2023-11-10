import java.util.Scanner;

public class MySample1102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		문자) 주사위를 두번 던져서 나온 수를 입력받아 두 수가 모두 4이상이면 "이겼습니다."
			 한개만 4이상이면 "비겼습니다." 모두 4미만이면 "졌습니다." 라고 출력하는 프로그램
		입력 예) 주사위 던진 결과를 입력하세요 => 3 4
		출력 예) 비겼습니다.

		입력 예) 주사위 던진 결과를 입력하세요 => 5 8
		출력 예) 입력값은 1 ~ 6 사이 값으로 하세요.

		단) 주사위 입력값은 1 ~ 6 사이 값, if문으로 작성
		
		System.out.print("주사위 던진 결과를 입력하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if (a >= 1 && a <= 6 && b >= 1 && b <= 6) {
			if (a >= 4 && b >= 4) {
				System.out.println("이겼습니다.");
			} else if (a >= 4 || b >= 4) {
				System.out.println("비겼습니다.");
			} else if (a < 4 && b < 4) {
				System.out.println("졌습니다.");
			}
		} else {
			System.out.println("주사위 입력값은 1 ~ 6 사이 값으로 하세요.");
		}
		
		//강사님 방법
		System.out.print("주사위 던진 결과를 입력하세요 => ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		if (c < 1 || c > 6 || d < 1 || d > 6) {
			System.out.println("입력값은 1 ~ 6 사이 값으로 하세요.");
		} else if (a >= 4 && b >= 4) {		//if ((a >= 4 && a <= 6) && (b >= 4 && b <= 6))
			System.out.println("이겼습니다.");
		} else if (a >= 4 || b >= 4) {
			System.out.println("비겼습니다.");
		} else {
			System.out.println("졌습니다.");
		}
		*/
		
		/*
		문제) 정수 3개를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		입력 예) 세 개의 정수를 입력하세요 => 1 5 4
		출력 예) 입력받은 수 중 가장 큰 수는 5 입니다.
		단) 출력은 max 변수 사용
		
		System.out.print("세 개의 정수를 입력하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max;
		
		if (a >= b && a >= c) {
			max = a;
		} else if (b >= a && b >= c) {
			max = b;
		} else {
			max = c;
		}
		System.out.println("입력받은 수 중 가장 큰 수는 " + max + " 입니다.");
		
		//중첩if
		if (a >= b) {		//b가 가장 작은 수
			if (a >= c) {	
				max = a;
			} else {
				max = c;
			}
		} else {			//a가 가장 작은 수
			if (b >= c) {
				max = b;
			} else {
				max = c;
			}
		} 
		System.out.println("입력받은 수 중 가장 큰 수는 " + max + " 입니다.");
		*/
		
		/*
		문제) 점수를 입력받아 90 ~ 100점 사이는 'A'이면서 98 ~ 100점은 'A+'로 나타내고 90 ~ 93점은 'A-'로 나타내고 94 ~ 97점은 'A'로 나타내는 프로그램
		단) 80 ~ 83점은 'B-', 84 ~ 87점은 'B', 88 ~ 89 'B+'로 표시하고 A, B를 제외한 나머지는 'C'로 표시
           점수입력은 0 ~ 100 사이만 입력 가능
		입력 예) 점수를 입력하세요 => 100
		출력 예) 당신의 점수는 100점 입니다.
			   당신의 학점은 A+ 입니다.
			   
		입력 예) 점수를 입력하세요 => 81
		출력 예) 당신의 점수는 81점 입니다.
			   당신의 학점은 B- 입니다.
			   
		입력 예) 점수를 입력하세요 => 85
		출력 예) 당신의 점수는 85점 입니다.
			   당신의 학점은 B 입니다.
			   
		입력 예) 점수를 입력하세요 => 69
		출력 예) 당신의 점수는 69점 입니다.
			   당신의 학점은 C 입니다.

		int score;	//점수
		char grade = ' ', opt = ' ';	//학점, 부호
		
		System.out.print("점수를 입력하세요 => ");
		score = sc.nextInt();
		
		if (score >= 90 && score <= 100) {
			grade = 'A';
			if (score >= 98 && score <= 100) {
				opt = '+';
			} else if (score >= 90 && score <= 93) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else if (score >= 80 && score <= 89) {
			grade = 'B';
			if (score >= 88 && score <= 89) {
				opt = '+';
			} else if (score >= 80 && score <= 83) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else {
			grade = 'C';
			opt = ' ';
		}
		System.out.println("당신의 점수는 " + score + "점 입니다.");
		System.out.println("당신의 학점은 " + grade + opt + " 입니다.");
		
		//강사님 구현방법
		if (score >= 90) {
			grade = 'A';
			if (score >= 98) {
				opt = '+';
			} else if (score <= 93) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else if (score >= 80) {
			grade = 'B';
			if (score >= 88) {
				opt = '+';
			} else if (score <= 83) {
				opt = '-';
			} else {
				opt = ' ';
			}
		} else {
			grade = 'C';
			opt = ' ';
		}
		System.out.printf("당신의 점수는 %d점 입니다. \n", score);
		if (opt == ' ') {		//char 만 가능!!!
			System.out.printf("당신의 학점은 %c 입니다. \n", grade);
		} else {
			System.out.printf("당신의 학점은 %c%c 입니다. \n", grade, opt);
		}
		System.out.printf("grade 숫자: %d, 값: %c \n", Integer.valueOf(grade), grade); //문자형을 정수형으로 바꿔주는
		*/
		
		/*
		//switch ~ case 문
		int a = 4;
		
		switch (a) {
			case 1:
				System.out.println("1 입니다.");
				break;
			default:
				System.out.println("default 입니다.");
			case 2:
				System.out.println("2 입니다.");
				break;
			case 3:
				System.out.println("3 입니다.");
				break;
		}
		*/
		
		/*
		문제) 현재 월을 입력받아 계절을 출력하는 프로그램
		입력 예) 현재 월을 입력하세요 => 11
		출력 예) 현재 계절은 가을 압니다.
		단) 봄 : 3, 4, 5월 / 여름 : 6, 7, 8월 / 가을 : 9, 10, 11월 / 겨울 : 12, 1, 2월
		입력값은 1 ~ 12 사이의 값만 입력 받을 수 있음, 아닐 경우 '월을 잘못 입력하셨습니다.'
		
		System.out.print("현재 월을 입력하세요 => ");
		int a = sc.nextInt();
		
		switch (a) {
			case 3:
			case 4:
			case 5:
				System.out.println("현재 계절은 봄 입니다.");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("현재 계절은 여름 입니다.");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("현재 계절은 가을 입니다.");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("현재 계절은 겨울 입니다.");
				break;
			default:
				System.out.println("월을 잘못 입력하셨습니다.");
		}
		//switch 문제를 if문으로 변경
		if (a == 3 || a == 4 || a == 5) {
			System.out.println("현재 계절은 봄 입니다.");
		} else if (a == 6 || a == 7 || a == 8) {
			System.out.println("현재 계절은 여름 입니다.");
		} else if (a == 9 || a == 10 || a == 11) {
			System.out.println("현재 계절은 가을 입니다.");
		} else if (a == 12 || a == 1 || a == 2) {
			System.out.println("현재 계절은 겨울 입니다.");
		} else {
			System.out.println("월을 잘못 입력하셨습니다.");
		}
		*/
		
		/*
		문제) 아래 메뉴에서 선택한 메뉴를 알려주는 프로그램
		단) 해당 숫자 이외 값을 입력 받을 경우 "잘못 선택하셨습니다." 메세지 출력
		입력 예) 1. 추가
			   2. 수정
			   3. 삭제
			   메뉴를 선택하세요 => 2
		출력 예) 수정을 선택하셨습니다.
		단) switch case문에서는 '추가를', '수정을', '삭제를', '잘못'에 해당하는 문자열만 출력하고 최종 한번만 "선택하셨습니다" 출력
		
		System.out.println("1. 추가");
		System.out.println("2. 수정");
		System.out.println("3. 삭제");
		System.out.print("메뉴를 선택하세요 = > ");
		int a = sc.nextInt();
		
		switch (a) {
			case 1: 
				System.out.print("추가를 ");
				break;
			case 2:
				System.out.print("수정을 ");
				break;
			case 3:
				System.out.print("삭제를 ");
				break;
			default:
				System.out.print("잘못 ");
		}
		System.out.println("선택하셨습니다.");
		*/
		
		/*
		문제) 점수를 입력받아 학점을 출력하는 프로그램
			 점수는 90 ~ 100 : 'A', 80 ~ 89 : 'B', 70 ~ 79 : 'C', 나머지는 'F'로 정의
			 (char타입 memo변수 사용)
		입력 예) 당신의 점수를 입력하세요 (1 ~ 100) => 82
		출력 예) 당신의 학점은 B 입니다.
		
		System.out.print("당신의 점수를 입력하세요 (1 ~ 100) = > ");
		int a = sc.nextInt();
		char memo = ' ';
		
		switch (a / 10) {		//점수에 10으로 나눈값 예) 82 / 10 = 8.2 소숫점 버리고 8 => case 8 에 해당됨
			case 10:
			case 9:
				memo = 'A';
				break;
			case 8:
				memo = 'B';
				break;
			case 7:
				memo = 'C';
				break;
			default:
				memo = 'F';
		}
		System.out.println("당신의 학점은 " + memo + " 입니다.");
		*/
		
		/*
		//반복제어문 for문
		int i, sum = 0;	//누적변수는 반드시 초기화
		for (i = 1; i <= 5; i++) {
			sum += i;	// sum = sum + i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		System.out.println("for문 끝");
		System.out.println("i = " + i + ", sum = " + sum);
		*/
		
		/*
		문제) 1부터 10까지의 합을 구하고 출력하는 프로그램
		출력 예) 55
		단) for문 사용
		
		int i, sum = 0;
		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
		*/
		
		/*
		문제) 1이상 10이하의 정수를 입력받아 정수만큼 반복하며 'JAVA프로그래밍' 이라고 출력하는 프로그램
		입력 예) 3
		출력 예) JAVA프로그래밍
			   JAVA프로그래밍
			   JAVA프로그래밍
		
		int a = sc.nextInt();
		int i;
		
		for (i = 1; i <= a; i++) {
			System.out.println("JAVA프로그래밍");
		}
		*/
		
		/*
		문제) 문자를 입력받아서 입력받은 문자를 20번 반복하여 출력하는 프로그램
		단) 입력받을때 char a = sc.nextLine().charAt(0);
		입력 예) A
		출력 예) AAAAAAAAAAAAAAAAAAAA
		*/
		
		char a = sc.nextLine().charAt(0);	//첫 번쨰 문자열을 받아올 수 있음
		int i;
		
		for (i = 1; i <= 20; i++) {
			System.out.print(a);
		}
	}
}
