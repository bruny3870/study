import java.util.Scanner;

public class MySample1114_3 {
	
	static void firstMethod() {
		System.out.println("firstMethod start....");	// 2
		secondMethod();
		System.out.println("firstMethod end....");		// 7
	}
	
	static void secondMethod() {
		System.out.println("secondMethod start....");	// 3
		thredMethod();
		System.out.println("secondMethod end....");		// 6
	}
	
	static void thredMethod() {
		System.out.println("thredMethod start....");	// 4
		System.out.println("thredMethod end....");		// 5
	}

	static int add(int a, int b) {
		
		a = a * 2;
		b = b * 2;
		
		System.out.println("add 메서드 a : " + a + ", b : " + b);
		
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		/*
		//메서드 호출 순서 - 스택
		System.out.println("main start....");			// 1
		firstMethod();	//같은 클래스 안에 있어서 클래스명 생략
		System.out.println("main end....");				// 8
		*/
		
		/*
		 문제) 정수 2개를 입력받아 메서드 호출 전과 후에 대한 결과를 출력하는 프로그램
		 입력 예) 정수 2개를 입력하세요 => 5 10
		 출력 예) 호출 전 a : 5, b : 10			(main메서드에서 출력)
		 		add 메서드 a : 10, b : 20		(add메서드에서 출력)
		 		결과 : 30						(main메서드에서 출력)
		 		호출 후 a : 5, b : 10			(main메서드에서 출력)
		 
		System.out.print("정수 2개를 입력하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("호출 전 a : " + a + ", b : " + b);
		System.out.println("결과 : " + add(a, b));
		System.out.println("호출 후 a : " + a + ", b : " + b);
		
		//다른방법 (class Math4 사용)
		System.out.print("정수 2개를 입력하세요 => ");
		int c = sc.nextInt();
		int d = sc.nextInt();
		
		System.out.println("호출 전 c : " + c + ", d : " + d);
		
		Math4 m = new Math4();
		//m.add(c, d);		//결과값만 뽑아오지 않고 차례로 출력
		
		System.out.println("결과 : " + m.add(c, d));
		System.out.println("호출 후 c : " + c + ", d : " + d);
		
		//위와 동일한 결과로 지역변수가 아닌 인스터스 변수 사용
		Math4 m = new Math4();	//객체 생성
		
		System.out.print("정수 2개를 입력하세요 => ");
		m.c = sc.nextInt();
		m.d = sc.nextInt();
		
		System.out.println("호출 전 c : " + m.c + ", d : " + m.d);
		System.out.println("결과 : " + m.add(m.c, m.d));
		System.out.println("호출 후 c : " + m.c + ", d : " + m.d);
		
		//위와 동일한 결과로 지역변수나 인스턴스 변수가 아닌 클래스 변수 사용
		System.out.print("정수 2개를 입력하세요 => ");
		Math4.c = sc.nextInt();
		Math4.d = sc.nextInt();
		
		Math4 m = new Math4();
		
		System.out.println("호출 전 c : " + Math4.c + ", d : " + Math4.d);
		System.out.println("결과 : " + m.add(Math4.c, Math4.d));		//add메소드에서 지역변수를 사용했기 때문에 결과는 동일
		System.out.println("호출 후 c : " + Math4.c + ", d : " + Math4.d);
		*/
		//위와 동일한 결과로 클래스 변수만을 이용하여 출력
		//출력 예) 정수 2개를 입력하세요 => 5 10
		//		 호출 전 a : 5, b : 10
		//		 add 메서드 a : 10, b : 20
		//		 결과 : 30
		//		 호출 후 a : 10, b : 20
		System.out.print("정수 2개를 입력하세요 => ");
		Math4.c = sc.nextInt();
		Math4.d = sc.nextInt();
		
		Math4 m = new Math4();
		
		System.out.println("호출 전 c : " + Math4.c + ", d : " + Math4.d);
		System.out.println("결과 : " + m.add());
		System.out.println("호출 후 c : " + Math4.c + ", d : " + Math4.d);
	}

}

class Math4 {
	//인스턴스 변수
	//int c, d;
	
	//클래스 변수
	static int c, d;
	
	//int add (int c, int d) {	//인스턴스 변수 사용시...
	int add () {				//클래스 변수 사용시... 
		int result;
		
		c = c * 2;		//Math4.c
		d *= 2;
		
		result = c + d;
		
		System.out.println("add 메서드 a : " + c + ", b : " + d);
		
		return result;
	}
}
