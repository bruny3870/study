import java.util.Scanner;

class Math2 {
	//인스턴스 메서드
	int add (int a, int b) {
		System.out.println("add메서드 시작 : a = " + a + ", b = " + b);
		a = a + 10;
		b = b + 10;
		
		int result = a + b;
		
		System.out.println("add메서드 끝 : a = " + a + ", b = " + b);
		
		return result;		//return a + b 가능
	}
}

class Math3 {
	int add(int a, int b) {
		return a + b;
	}
	
	int sub(int a, int b) {
		return a - b;
		
//		//항상 큰 수에서 작은 수를 뺄 수 있게 처리
//		if (a > b) {
//			return a - b;
//		} else {
//			return b - a;
//		}
		
//		int c = 0;
//		
//		if (a > b) {
//			c = a - b;
//		} else if (b > a) {
//			c = b - a;
//		}
//		
//		return c;
	}
	
	int mul(int a, int b) {
		return a * b;
	}
	
	double div(int a, int b) {
		return (double)a / b;
	}
	
	//인스턴스 변수
	//int a, b;
	
	//클래스 변수	=> 클래스변수는 인스턴스변수와 달리 변수를 공유
	static int a, b;
	
	//인스턴스 메서드
	int add() {
		return a + b;
	}
	
	int sub() {
		return a - b;
	}
	
	int mul() {
		return a * b;
	}
	
	double div() {
		return (double)a / b;
	}

}


public class MySample1114_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		//계산기 클래스
		System.out.print("정수 2개를 입력하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("main() 메서드 호출 전 : a = " + a + ", b = " + b);
		
		Math2 m = new Math2();
		int c = m.add(a, b);
		
		System.out.println("main() 메서드 호출 후 : a = " + a + ", b = " + b + ", c = " + c);
		*/
		
		/*
		 문제) 두 정수를 입력 받아 더하기, 빼기, 곱하기, 나누기 연산결과 출력
		 입력 예) 두 정수를 입력하세요 => 5 3
		 출력 예) add(a, b) = 8
		 		sub(a, b) = 2
		 		mul(a, b) = 15
		 		div(a, b) = 1.6666666666666667 (소수점은 실수로 표현)
		 단) 클래스는 Math3로 정의
		 
		System.out.print("두 정수를 입력하세요 => ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		Math3 m = new Math3();
		int add = m.add(a, b);
		int sub = m.sub(a, b);
		int mul = m.mul(a, b);
		double div = m.div(a, b);
		
		System.out.println("add(a, b) = " + add);
		System.out.println("sub(a, b) = " + sub);
		System.out.println("mul(a, b) = " + mul);
		System.out.println("div(a, b) = " + div);	//double은 소수점이하 15자리로 println으로 표현
		System.out.printf("div(a, b) = %f", div);	//printf는 소수점이하 6자리까지 표현
		*/
		
		/*
		 문제) 위와 동일한 결과로 인스턴스 변수를 이용한 계산기
		 
		Math3 m = new Math3();
		
		System.out.print("두 정수를 입력하세요 => ");
		m.a = sc.nextInt();
		m.b = sc.nextInt();
		
		System.out.println("add(a, b) = " + m.add());
		System.out.println("sub(a, b) = " + m.sub());
		System.out.println("mul(a, b) = " + m.mul());
		System.out.println("div(a, b) = " + m.div());
		*/
		
		/*
		 문제) 위와 동일한 결과로 클래스 변수를 이용한 계산기
		 Math3클래스에 대한 객체 인스턴스 m1, m2에 대해서 정의한 후
		 m1과 m2에서 각각 같은 변수를 공유한다는 의미로 출력
		 클래스 변수명은 기존소스를 수정하여 a, b 그대로 사용
		 */
		Math3 m1 = new Math3();
		Math3 m2 = new Math3();
		
		System.out.print("두 정수를 입력하세요 => ");
		Math3.a = sc.nextInt();		//클래스 호출
		Math3.b = sc.nextInt();
		
		System.out.println("m1 add(a, b) = " + m1.add());
		System.out.println("m1 sub(a, b) = " + m1.sub());
		System.out.println("m1 mul(a, b) = " + m1.mul());
		System.out.println("m1 div(a, b) = " + m1.div());
		System.out.println();
		System.out.println("m2 add(a, b) = " + m2.add());
		System.out.println("m2 sub(a, b) = " + m2.sub());
		System.out.println("m2 mul(a, b) = " + m2.mul());
		System.out.println("m2 div(a, b) = " + m2.div());
		
		
		
	}

}
