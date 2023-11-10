import java.util.Scanner;

public class MySample1101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//제어문 (조건문 - if)
		/*
		문제) 정수를 입력받아 그 수가 10보다 큰 경우 체크하는 프로그램
		입력 예) 정수입력 => 15
		출력 예) 15
			   10보다 큰 수를 입력하셨습니다.
			   if 끝
			   
			   9
			   if 끝
			   
		System.out.print("정수입력 => ");
		int a = sc.nextInt();
		
		System.out.println(a);
		
		if (a > 10) {
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		} 
		System.out.println("if 끝");
		*/
		
		/*
		문제) if문 2개로 구현 
		입력 예) 숫자를 입력하세요 => 3
		출력 예) 입력하신 숫자는 0이 아닙니다.
			   입력하신 숫자는 3입니다.
			   
		입력 예) 숫자를 입력하세요 => 0
		출력 예) 입력하신 숫자는 0입니다.
		
		
		System.out.print("숫자를 입력하세요 => ");
		int a = sc.nextInt();
		
		if (a != 0) {
			System.out.println("입력하신 숫자는 0이 아닙니다.");
			System.out.println("입력하신 숫자는 " + a + "입니다.");
		}
		
		if (a == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		*/

		/*
		문제) 정수를 입력받아 입력받은 정수를 출력하고 음수이면 'minus'라고 출력하는 프로그램
		입력 예) -5
		출력 예) -5
               minus
               
        입력 예) 7
		출력 예) 7
		
		int a = sc.nextInt();
		
		System.out.println(a);
		
		if (a < 0) {	
			System.out.println("minus");
		}
		*/
		
		/*
		문제) 정수를 하나 입력받아서 0보다 큰 경우, 0인 경우, 음수인 경우를 체크해여 출력하는 프로그램
		단) if문 3번 사용
		입력 예) 숫자를 입력하세요 => 5
		출력 예) 입력하신 값은 5이며, 0보다 큽니다.

		입력 예) 숫자를 입력하세요 => 0
		출력 예) 입력하신 값은 0이며, 0과 같습니다.

		입력 예) 숫자를 입력하세요 => -1
		출력 에) 입력하신 값은 -1이며, 음수 입니다.
		
		System.out.print("숫자를 입력하세요 => ");
		int a = sc.nextInt();
		int b = 10;
		
		System.out.print("입력하신 값은 " + a + "이며, ");
		
		if (a > 0) {
			System.out.println("0보다 큽니다.");
		}
		
		////////////////////////////////////
		////위와 동일한 조건으로 &&, || 테스트용////
		System.out.println("b before : " +b);
		
		//if (a > 0 && ++b > a) {
		if (a > 0 || ++b > a) {
			System.out.println("0보다 큽니다.");
		}
		
		System.out.println("b after : " +b);
		////////////////////////////////////
		
		if (a == 0) {
			System.out.println("0과 같습니다.");
		}
		
		if (a < 0) {
			System.out.println("음수 입니다.");
		}
		*/
		
		/*
		문제) 정수 2개를 입력 받아서 큰 수와 작은 수를 차례로 출력하는 프로그램
		입력 예) 2 9
		출력 예) 입력받은 수 중 큰 수는 9이고 작은 수는 2입니다.
		단) 큰 수는 항상 a변수를 사용하고 작은 수는 항상 b변수를 사용하여 출력
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c;
		
		if (a < b) {
			c = a;
			a = b;
			b = c;	
		} 
		System.out.println("입력받은 수 중 큰 수는 " + a + "이고 작은 수는 " + b + "입니다.");
		*/
		
		/*
		문제) 국어, 영어, 수학, 컴퓨터 총 4과목에 대한 시험 점수를 입력 받은 후 평균을 구하고 각 과목당 점수가 60점 미만이 한 과목이라도 있거나, 평균이 70미만이면 불합격 처리하는 프로그램
		입력 예) 국어 점수를 입력하세요 => 60
		       영어 점수를 입력하세요 => 70
		       수학 점수를 입력하세요 => 50
		       컴퓨터 점수를 입력하세요 => 80
		출력 예) 불합격 입니다.
		단) 국어 kor, 영어 eng, 수학 math, 컴퓨터 com, 평균 avg
		   결과 메세지는 String msg 로 사용. 출력은 msg 변수로만 처리
		   if는 1번만 사용
		 
		System.out.print("국어 점수를 입력하세요 => ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 => ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 => ");
		int math = sc.nextInt();
		System.out.print("컴퓨터 점수를 입력하세요 => ");
		int com = sc.nextInt();
		
		int avg = (kor + eng + math + com) / 4;
		
		String msg = "합격 입니다.";
		
		if (kor < 60 || eng < 60 || math < 60 || com < 60 || avg < 70) {
			msg = "불합격 입니다.";
		}
		
		System.out.println(msg);
		*/
		
		//if ~ else 문
		/*
		문제) 정수를 입력받아 10보다 큰 수를 입력받은 경우와 10보다 작은 수를 입력받은 경우를 구분하기 위한 프로그램
		입력 예) 15
		출력 예) 10보다 큰 수를 입력하셨습니다.

		입력 예) 9
		출력 예) 10보다 작은 수를 입력하셨습니다.
		
		int a = sc.nextInt();
		
		if (a > 10) {
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		} else {
			System.out.println("10보다 작은 수를 입력하셨습니다.");
		}
		*/
		
		/*
		문제) 정수를 입력받아 80점 이상이면 합격 아니면 불합격 출력하는 프로그램
		입력 예) 점수를 입력하세요 => 80
		출력 예) 축하합니다. 합격입니다.

		입력 예) 점수를 입력하세요 => 76
		출력 예) 죄송합니다. 불합격입니다.
		
		System.out.print("점수를 입력하세요 => ");
		int a = sc.nextInt();
		
		if (a >= 80) {
			System.out.println("축하합니다. 합격입니다.");
		} else {
			System.out.println("죄송합니다. 불합격입니다.");
		}
		*/
		
		/*
		문제) if ~ else로 구현
		입력 예) 숫자를 입력하세요 => 3
		출력 예) 입력하신 숫자는 3입니다.

		입력 예) 숫자를 입력하세요 => 0
		출력 예) 입력하신 숫자는 0입니다.
		
		System.out.print("숫자를 입력하세요 => ");
		int a = sc.nextInt();
		
		if (a != 0) {
			System.out.println("입력하신 숫자는 " + a + "입니다.");
		} else {
			System.out.println("입력하신 숫자는 0입니다.");
		}
		*/
		
		/*
		//if ~ else if ~ else문
		//1, 2, 3에 대해 처리한 프로그램
		int a = sc.nextInt();
		
		if (a == 1) {
			System.out.println("입력값이 1입니다.");
		} else if (a == 2) {		//if(a > 1 && a < 3)
			System.out.println("입력값이 2입니다.");
		} else if (a == 3) {
			System.out.println("입력값이 3입니다.");
		}
		*/
		
		/*
		문제) if ~ else if ~ else문 사용
			정수를 입력받아 값이 10보다 큰 경우와 0인 경우 음수인 경우를 체크하는 프로그램
		입력 예) 정수를 입력하세요 => 11
		출력 예) 10보다 큰 수를 입력하셨습니다.

		입력 예) 정수를 입력하세요 => -1
		출력 예) 음수를 입력하셨습니다.

		입력 예) 정수를 입력하세요 => 10
		출력 예) 1에서 10 사이의 정수를 입력하셨습니다.
		
		System.out.print("정수를 입력하세요 => ");
		int a = sc.nextInt();
		
		if (a > 10) {
			System.out.println("10보다 큰 수를 입력하셨습니다.");
		} else if (a == 0) {
			System.out.println("0을 입력하셨습니다.");
		} else if (a < 0) {
			System.out.println("음수를 입력하셨습니다.");
		} else if (a >= 1 && a <= 10) {
			System.out.println("1에서 10 사이의 정수를 입력하셨습니다.");
		}
		*/
		
		/*
		문제) 점수를 입력받아 '수우미양가'를 출력하는 프로그램
		입력 예) 점수를 입력하세요 => 89
		출력 예) 우
		단) 100 ~ 90 : 수, 89 ~ 80 : 우, 79 ~ 70 : 미, 69 ~ 60 : 양, 60 미만 : 가
		
		System.out.print("점수를 입력하세요 => ");
		int a = sc.nextInt();
		
		if (a >= 90) {
			System.out.println("수");
		} else if (a >= 80) {
			System.out.println("우");
		} else if (a >= 70) {
			System.out.println("미");
		} else if (a >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
		*/
		
		/*
		위에 문제로 점수는 0 ~ 100점 사이만 입력 가능 할 수있도록 처리하는 프로그램
		입력 예) 점수를 입력하세요 => 110
		출력 예) 점수는 0 ~ 100 사이 입력이 가능합니다.
		
		System.out.print("점수를 입력하세요 => ");
		int a = sc.nextInt();
		
		if (a >= 90) {
			if (a > 100) {
				System.out.println("점수는 0 ~ 100 사이 입력 가능합니다.");
			} else {
				System.out.println("수");
			}
		} else if (a >= 80) {
			System.out.println("우");
		} else if (a >= 70) {
			System.out.println("미");
		} else if (a >= 60) {
			System.out.println("양");
		} else {
			if (a < 0) {
				System.out.println("점수는 0 ~ 100 사이 입력 가능합니다.");
			} else {
				System.out.println("가");
			}
			
		}
		//다른방법
		System.out.print("점수를 입력하세요 => ");
		int b = sc.nextInt();
		
		if (b >= 0 && b <= 100) {
			if (b >= 90) {
				System.out.println("수");
			} else if (b >= 80) {
				System.out.println("우");
			} else if (b >= 70) {
				System.out.println("미");
			} else if (b >= 60) {
				System.out.println("양");
			} else {
				System.out.println("가");
			}
		} else {
			System.out.println("점수는 0 ~ 100 사이 입력 가능합니다.");
		}
		*/
		
		/*
		문제) 정수로 월을 입력받아 계절을 출력하는 프로그램
		입력 예) 11
		출력 예) 가을입니다.
		입력 예) 13
		출력 예) 잘못 입력되었습니다.
		단) 봄 : 3, 4, 5월 / 여름 : 6, 7, 8월 / 가을 : 9, 10, 11월 / 겨울 : 12, 1, 2월
		   월 입력이 1 ~ 12 사이가 아닌 경우 '잘못 입력되었습니다. 1 ~ 12 사이를 입력하세요.
		   비교연산과 논리연산을 활용하여 구현
		*/
		
		int a = sc.nextInt();
		
		if (a >= 1 && a <= 12) {
			if (a >= 3 && a <= 5) {
				System.out.println("봄 입니다.");
			} else if (a >= 6 && a <= 8) {
				System.out.println("여름 입니다.");
			} else if (a >= 9 && a <= 11) {
				System.out.println("가을 입니다.");
			} else if (a <= 2 || a == 12) {
				System.out.println("겨울 입니다.");
			}
		} else {
			System.out.println("잘못 입력되었습니다.");
		}
	}

}
