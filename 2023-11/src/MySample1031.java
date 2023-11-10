import java.util.Scanner;

public class MySample1031 {

	public static void main(String[] args) {
		/*
		int year = 0;
		int age = 15;
		
		System.out.println("year : " + year);
		System.out.println("age : " + age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
		*/
		
		/*
		int x, y, z;					//자바에서는 변수선언과 동시에 초기값을 설정해야 사용 가능
		int a = 1, b= 2, c = 3;
		
		x = 10;
		y = 20;
		z = 30;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		*/
		
		/*
		출력 예) x : 10 y : 20
			   x : 20 y : 10
		단) x y 변수로만 출력 가능
		예) System.out.println("x : " + x + " y : " + y);
		
		int x = 10, y = 20;
		int tmp = 0;
		
		System.out.println("x : " + x + " y : " + y);
		
		tmp = x;
		x = y;
		y = tmp;
		
		System.out.println("x : " + x + " y : " + y);
		*/
		
		/*
		//두 자리 정수를 하나 입력받아 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요. => ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("입력받은 값 : " + input);
		System.out.printf("num = %d \n", num);
		*/
		
		/*
		문제) 나이를 입력받아 출력하는 프로그램
		입력 예) 나이를 입력하세요. => 25
		출력 예) 당신의 나이는 25살 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요. => ");
		String input = sc.nextLine();
		int num = Integer.parseInt(input);
		
		System.out.println("당신의 나이는 " + input + "살 입니다.");
		System.out.println("당신의 나이는 " + num + "살 입니다.");
		System.out.printf("당신의 나이는 %d살 입니다. \n", num);
		System.out.printf("당신의 나이는 %s살 입니다. \n", input);
		*/
		
		/*
		//상수 (final)
		final int MAX_SPEED;			//상수 선언 시 초기값 설정도 같이하도록 함. (jdk 1.6이하)
		final int MAX_VALUE = 10;
		
		MAX_SPEED = 20;					//상수 선언 후 첫번째 값 대입 가능 (jdk 1.6 이후 부터)
		
		System.out.println(MAX_SPEED);
		System.out.println(MAX_VALUE);
		*/
		
		/*
		//산술연산자 (+, -, *, /, %)
		int a = 5;
		int b = a + 2;
		
		a = 7;
		b = 5;
		
		int plus = a + b;
		int minus = a - b;
		int multi = a * b;
		int div = a / b;
		int rest = a % b;
		
		System.out.printf("%d + %d = %d \n", a, b, plus);
		System.out.printf("%d - %d = %d \n", a, b, minus);
		System.out.printf("%d * %d = %d \n", a, b, multi);
		System.out.printf("%d / %d = %d \n", a, b, div);
		System.out.printf("%d %% %d = %d \n", a, b, rest);	// %만 표시하면 에러출력, %%로 가능
		
		System.out.println();
		
		//증감연산자 (++)
		//++a, a++ => a = a + 1 (자신 1 증가)
		//--a, a-- => a = a - 1 (자신 1 감소)
		a = 5;
		
		System.out.println("a = " + a);			//5
		a++;									//후치증가연산
		System.out.println("a1 = " + a);		//6
		++a;									//전치증가연산
		System.out.println("a2 = " + a);		//7
		
		System.out.println();
		
		a = 5;
		System.out.println("a = " + a);			//5
		System.out.println("a++ = " + a++);		//5 먼저 a값 출력 후 a값 증가 a값은 6
		System.out.println("++a = " + ++a);		//7 먼저 a값 증가 후 a값 출력 a값은 7
		
		System.out.println();
		
		//감소연산자 (--)
		a = 5;
		System.out.println("a = " + a);			//5
		a--;									//후치감소연산
		System.out.println("a1 = " + a);		//4
		--a;									//전치감소연산
		System.out.println("a2 = " + a);		//3
		
		System.out.println();
		
		a = 5;
		System.out.println("a = " + a);			//5
		System.out.println("a-- = " + a--);		//5 먼저 a값 출력 후 a값 감소 a값은 4
		System.out.println("--a = " + --a);		//3 먼저 a값 감소 후 a값 출력 a값은 3
		*/
		
		/*
		출력 예) a++ = 10, ++b = 11
			   실행 후 a = 11, b = 11
			   a-- = 11, --b = 10
			   실행 후 a = 10, b = 10
		단) 최초 값은 a = 10, b = 10 으로 설정 후 적용
		
		int a = 10;
		int b = 10;
		
		System.out.println("a++ = " + a++ + ", ++b = " + ++b);
		System.out.println("실행 후 a = " + a + ", b = " + b);
		System.out.println("a-- = " + a-- + ", --b = " + --b);
		System.out.println("실행 후 a = " + a + ", b = " + b);
		
		System.out.println();
		
		System.out.printf("a++ = %d, ++b = %d \n", a++, ++b);
		System.out.printf("실행 후 a = %d, b = %d \n", a, b);
		System.out.printf("a-- = %d, --b = %d \n", a--, --b);
		System.out.printf("실행 후 a = %d, b = %d \n", a, b);
		*/

		/*
		문제) 정수 변수 a 와 b 를 입력 받아서 a는 전치증가연산자를 사용하고 b는 후치감소연산자를 사용하여 두 수의 합을 c에 저장한 후 각각 출력하는 프로그램 작성
		입력 예) 첫번째 정수 => 5
		       두번째 정수 => 6
		출력 예) a = 6, b = 5, c = 12
		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
		단) 입력받을 때 nextInt()로 처리하여 정수로 받아 처리함.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 => ");
		int a = sc.nextInt();
		System.out.print("두번째 정수 => ");
		int b = sc.nextInt();
	
		int c = ++a + b--;
		
		System.out.printf("a = %d, b = %d, c = %d", a, b, c);
		*/
		
		/*
		//비교연산자 (결과가 true / false 중 하나)
		int a = 10;
		int b = 20;
		int c = 20;
		
		System.out.println("a == b : " + (a == b));		//false
		System.out.println("b == c : " + (b == c));		//true
		System.out.println("a != b : " + (a != b));		//true
		System.out.println("b != c : " + (b != c));		//false
		System.out.println("a > b : " + (a > b));		//false
		System.out.println("b >= c : " + (b >= c));		//true
		System.out.println("a <= c : " + (a <= c));		//true
		System.out.println("b < c : " + (b < c));		//false
		*/
		
		/*
		문제) 3개의 정수를 각각 a, b, c 변수에 입력을 받아 a와 b, b와 c를 각각 비교하여 같으면 true, 같지 않으면 false를 출력하는 프로그램
		입력 예) a값을 입력하세요. => 10
			   b값을 입력하세요. => 20
			   c값을 입력하세요. => 20 	   
		출력 예) a == b : false
		       b == c : true
		       a != b : true
		       b != c : false
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값을 입력하세요 => ");
		int a = sc.nextInt();
		System.out.print("b값을 입력하세요 => ");
		int b = sc.nextInt();
		System.out.print("c값을 입력하세요 => ");
		int c = sc.nextInt();
		
		System.out.println("a == b : " + (a == b));
		System.out.println("b == c : " + (b == c));
		System.out.println("a != b : " + (a != b));
		System.out.println("b != c : " + (b != c));
		*/

		/*
		//논리연산자 (&&, ||)
		int a = 1;
		int b = 2;
		int c = 3;
		
		System.out.println("(a > b) && (b < c) : " + (a > b && b < c));
		System.out.println("(a > b) || (b < c) : " + (a > b || b < c));
		*/
		
		/*
		문제) 3개의 정수를 각각 a, b, c 변수를 선언하고 각각 10, 20 ,30 으로 초기화 한 후 비교연산과 논리연산자를 이용하여 참이면 true, 거짓이면 false를 출력하는 프로그램
		출력 예) a > b && a <= b : false
		       a > b || a <= b : true
		       b < c && a < c : true
		       !(a > b && a <= b) : true
		
		int a = 10;
		int b = 20;
		int c = 30;
		
		System.out.println("(a > b) && (a <= b) : " + (a > b && a <= b));
		System.out.println("(a > b) || (a <= b) : " + (a > b || a <= b));
		System.out.println("(b < c) && (a < c) : " + (b < c && a < c));
		System.out.println("!(a > b && a <= b) : " + (!(a > b && a <= b)));
		*/
		
		/*
		//삼항연산자
		int x = 10;
		int y = 5;
		int result = (x >= y) ? x : y;
		
		System.out.println("x와 y값 중 큰 값은 " + result + " 입니다.");
		*/
		
		/*
		문제) 정수변수 a에 나이를 입력 받아 19보다 큰 값을 입력 받았으면 '성인입니다.'로 출력하고 19보다 작으면 '청소년입니다.'라고 출력하는 프로그램
		입력 예) 나이를 입력하세요 => 15
		출력 예) 청소년입니다.
		단) 삼항 연산자를 이용하여 출력에 사용할 변수는 String memo로 정의함.
		예) String memo = "";
			memo = "청소년입니다.";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 => ");
		int a = sc.nextInt();
		
		String x = "성인입니다";
		String y = "청소년입니다";
		
		String memo = (a > 19) ? x : y;
		
		System.out.println(memo);
		*/
		
		/*
		문제) 시험점수 3과목을 입력받아 평균을 구한 후 통과 유무를 출력하는 프로그램
			 평균점수가 70점 이상이면 통과, 미만이면 미통과
		입력 예) 국어 점수를 입력하세요 => 80
			   영어 점수를 입력하세요 => 70
			   수학 점수를 입력하세요 => 90
		출력 예) 당신의 평균은 80점이고 통과 하셨습니다. (70점 이상인 경우)
			   당신의 평균은 65점이고 미통과 하셨습니다. (70점 미만인 경우)
		단) 국어 kor, 영어 eng, 수학 math, 평균 avg, 통과 여부 memo
		   memo변수는 '통과', '미통과' 만 저장 (삼항연산자를 이용)
		   String 타입의 printf 서식문자는 %s
		   평균은 (국어 + 영어 + 수학) / 3
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요 => ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 => ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 => ");
		int math = sc.nextInt();
		
		int avg = (kor + eng + math) / 3;
		
		String x = "통과";
		String y = "미통과";
				
		String memo = (avg >= 70) ? x : y;
		
		System.out.println("당신의 평균은 " + avg + "점이고 " + memo + " 하셨습니다.");
	}
}
