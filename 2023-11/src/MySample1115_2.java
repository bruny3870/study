import java.util.Scanner;

class Add {
	int a;
	int b;
	int c;
	
	static void add(Add d) {
		d.c = d.a + d.b;
	}
	
	static void sub(Add d) {
		d.c = d.a - d.b;
	}
	
	static void mul(Add d) {
		d.c = d.a * d.b;
	}
	
	void div(Add d) {
		d.c = d.a / d.b;
	}
}

public class MySample1115_2 {
	/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조형 매개변수
		/*
		 문제) 두 정수를 Add클래스 a, b변수에 입력받은 후 더하기, 빼기, 곱하기, 나누기 메서드를 이용하여 결과를 main에서 출력하는 프로그램
		 단) 더하기 add, 빼기 sub, 곱하기 mul, 나누기 div 정의
		 	 참조형 메서드 구현, 모든 메서드는 반환타입 없음
		 	 결과는 c변수 사용
		 입력 예) 두 정수를 입력하세요 => 5 3
		 출력 예) 더하기 : 8
		   		빼기  : 2
		   		곱하기 : 15
		   		나누기 : 1
		 
		Scanner sc = new Scanner(System.in);
		Add d = new Add();
		
		System.out.print("두 정수를 입력하세요 => ");
		d.a = sc.nextInt();
		d.b = sc.nextInt();
		
		add(d);
		System.out.println("더하기 : " + d.c);
		
		sub(d);
		System.out.println("빼기  : " + d.c);
		
		mul(d);
		System.out.println("곱하기 : " + d.c);
		
		div(d);
		System.out.println("나누기 : " + d.c);
		
	}
	
	static void add(Add d) {
		d.c = d.a + d.b;
	}
	
	static void sub(Add d) {
		d.c = d.a - d.b;
	}
	
	static void mul(Add d) {
		d.c = d.a * d.b;
	}
	
	static void div(Add d) {
		d.c = d.a / d.b;
	}
	
	
	//참조형 매개변수를 이용한 메서드를 Add 클래스에 구현한 경우
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Add d = new Add();
		
		System.out.print("두 정수를 입력하세요 => ");
		d.a = sc.nextInt();
		d.b = sc.nextInt();
		
		//add(d);	//이렇게 하면 안됨
		Add.add(d);	//다른 클래스라 클래스명 꼭 넣어야함
		System.out.println("더하기 : " + d.c);
		
		Add.sub(d);
		System.out.println("빼기  : " + d.c);
		
		Add.mul(d);
		System.out.println("곱하기 : " + d.c);
		
		d.div(d);	//인스턴스라 객체 이용해서 사용 가능
		System.out.println("나누기 : " + d.c);
	}
	*/
	
}
