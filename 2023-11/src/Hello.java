
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 첫번째 실습
		System.out.println("Hello World...");
		System.out.println("11111111111");
		System.out.println("22222222222");
		System.out.println("333333333333");
		*/
		/*
		//표준 입출력 클래스 (출력)
		System.out.print(7);			//print() 메소드는 줄 바꿈을 하지 않는다.
		System.out.println(3);
		System.out.println(3.14);		//실수 출력
		System.out.println("자바!!!");	//문자열 출력
		System.out.println("문자열끼리의 " + "연결도 가능합니다.");
		System.out.println("숫자" + 3 + 7 + "과 문자열의 연결도 가능합니다.");
		System.out.println(3 + 7 + " 이번 결과는....");
		*/
		
		/*
		//printf 서식문자 (%d, %f, %c, %s)
		System.out.printf("정수 첫번째 %d, 정수 두번째 %d 입니다.%d \n", 10, 20, 5);
		System.out.printf("실수 %f 입니다. \n", 26.123456);
		//실수를 소수점 둘째자리까지만 출력
		System.out.printf("소숫점 둘째자리 실수 %.2f 입니다. \n", 26.123456);
		System.out.println();
		System.out.printf("문자 %c 입니다. \n", 'A');
		System.out.printf("문자 %c 입니다. \n", '가');
		System.out.printf("문자열 %s 입니다. \n", "테스트");
		System.out.println();
		*/
		
		/*
		출력 예) 수식을 출력하면 계산 결과 출력됩니다.
			   10 + 5 = 15
			   내 생일은 2005년 5월 8일 입니다.
			   
		단) printf 메서드 사용
			2번째줄 출력은 => 10, 5, 10 + 5
			3번째줄 출력은 => 2016-11, 5, 8
		
		System.out.printf("%s \n", "수식을 출력하면 계산 결과 출력됩니다.");
		System.out.printf("%d + %d = %d \n", 10, 5, 10 + 5);
		System.out.printf("내 생일은 %d년 %d월 %d일 입니다.", 2016 - 11, 5, 8);
		*/
		
		/*
		//왼쪽과 오른쪽 정렬
		System.out.printf("숫자가 [%8d] 입니다. \n", 123); 		//숫자 오른쪽 정렬
		System.out.printf("숫자가 [%-8d] 입니다. \n", 123); 	//숫자 왼쪽 정렬
		System.out.printf("알파벳 [%10s] 입니다. \n", "abc");	//문자 오른쪽 정렬
		System.out.printf("알파벳 [%-10s] 입니다. \n", "abc");	//문자 왼쪽 정렬
		*/
		
		/*
		출력 예) subject            score
			  =========================
			     korea               90			   
			   english              100
			  computer               80
			  
		단) printf 메서드를 이용하여 ""에는 서식문자와 줄바꿈만 포함.
		   subject와 score 사이에 공백 5개 포함.
		   subject는 문자 8자리 (%8s), socre 숫자 6자리(%6d)로 고정
		   예) System.out.printf("%s \n", "=========================");
		*/
		System.out.printf("%8s     %6s \n", "subject", "score");
		System.out.printf("%s \n", "===================");
		System.out.printf("%8s     %6d \n", "korea", 90);
		System.out.printf("%8s     %6d \n", "english", 100);
		System.out.printf("%8s     %6d \n", "computer", 80);
		
	}
	
}
/*
class Hello2 {
	
	public static void main(String[] args) {
		System.out.println("Hello world...22222");
	}
	
}
*/