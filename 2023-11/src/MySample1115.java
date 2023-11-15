import java.util.Scanner;

class Data {
	int x;
	int y;
}

public class MySample1115 {
	/*
	//기본형 매개변수
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Data d = new Data();	//객체 생성
		d.x = 10;
		
		System.out.println("main() x : " + d.x);
		
//		MySample1115 m = new MySample1115();	//change 메서드가 static 이 아닌 경우 클래스 객체 생성 후 호출
//		m.change(d.x);
		
		change(d.x);	//같은 클래스 내에 메서드 있어서 앞에 클래스 이름 생략
		
		System.out.println("main() after x : " + d.x);
	}
	
	//기본형 매개변수
	//void change(int x) {
	static void change(int x) {		//메서드 생성, 매개변수 기본형 (int x) => 값 가져옴 => 변경 없음
		x = 1000;
		
		System.out.println("change() x : " + x);
	}
	*/
	
	/*
	//참조형 매개변수
	public static void main(String[] args) {
		Data d = new Data();	//객체 생성
		d.x = 10;
		
		System.out.println("main() x : " + d.x);
		
		change(d);
		
		System.out.println("main() x after : " + d.x);
	}
	
	static void change(Data d) {	//메서드 생성, 매개변수 참조형 (Data d) => 주소 가져옴 => 변경 유지
		d.x = 1000;
		
		System.out.println("change() x : " + d.x);
	}
	*/
	
	/*
	//참조형 반환타입(리턴타입)
	public static void main(String[] args) {
		Data d = new Data();	//객체 생성
		d.x = 10;
		
		Data d2 = change(d);
		
		System.out.println("d.x  = " + d.x);
		System.out.println("d2.x = " + d2.x);
		
	}
	
	static Data change(Data d) {	//change 메서드 리턴타입 -> 참조형 , 매개변수 -> 참조형 
		//main d 와 change d 는 같은 주소
		Data tmp = new Data();	//객체 생성
		tmp.x = d.x;	//d 와 다른 주소 생성
		//tmp.x = 2000;
		
		return tmp;
	}
	*/
	
	/*
	//기본형 매개변수, 참조형 반환타입(리턴타입)
	public static void main(String[] args) {
		int a = 5;
		Data d;
		
		System.out.println("main() a : " + a);
		
		d = change(a);
		
		System.out.println("main() after d.x " + d.x);
	}
	
	static Data change(int a) {		//change 메서드 리턴타입 -> 참조형, 매개변수 -> 기본형
		Data tmp = new Data();	//객체 생성
		tmp.x = a + 10;
		
		return tmp;
	}
	*/
	
	/*
	 문제) Data 객체에 y변수를 추가하고 main에서 2개 정수를 입력받아 Data 객체 각 변수에 대입하고, main에서 각 값을 출력 한 후 
	 	  copy 메서드를 통해 값에 2를 곱한 결과를 출력하는 프로그램
	 입력 예) 정수 2개를 입력하세요 => 10 20
	 출력 예) main입력 d.x : 10, d.y : 20
	 		copy매서드 d.x : 10, d.y : 20
	 		copy매서드 tmp.x : 20, tmp.y : 40
	 		main마지막 d.x : 10, d.y : 20
	 		main마지막 d2.x : 20 d2.y ; 40
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Data d = new Data();
		
		System.out.print("정수 2개를 입력하세요 => ");
		d.x = sc.nextInt();
		d.y = sc.nextInt();
		
		System.out.println("main입력 d.x : " + d.x + ", d.y : " + d.y);
		
		Data d2 = copy(d);
		
		System.out.println("main마지막 d.x : " + d.x + ", d.y : " + d.y);
		System.out.println("main마지막 d2.x : " + d2.x + ", d2.y : " + d2.y);
		
	}
	
	static Data copy(Data d) {
		Data tmp = new Data();
		
		tmp.x = d.x * 2;
		tmp.y = d.y * 2;
		
		System.out.println("copy매서드 d.x : " + d.x + ", d.y : " + d.y);
		System.out.println("copy매서드 tmp.x : " + tmp.x + ", tmp.y : " + tmp.y);
		
		return tmp;
		
	}
	*/
	
	/*
	 문제) 위 문제와 동일하나 다른 방법
	 단) copy 메서드 반환타입(리턴타입) 없음
	 입력 예) 정수 2개를 입력하세요 => 10 20
	 출력 예) main입력 d.x : 10, d.y : 20
	 		copy매서드 tmp.x : 10, tmp.y : 20
	 		copy매서드 tmp.x : 20, tmp.y : 40
	 		main마지막 d.x : 20, d.y : 40
	 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Data d = new Data();
		
		System.out.print("정수 2개를 입력하세요 => ");
		d.x = sc.nextInt();
		d.y = sc.nextInt();
		
		System.out.println("main입력 d.x : " + d.x + ", d.y : " + d.y);
		
		copy(d);
		
		System.out.println("main마지막 d.x : " + d.x + ", d.y : " + d.y);
		
	}
	
	static void copy(Data tmp) {	//tmp 와 d 같은 주소
		System.out.println("copy매서드 tmp.x : " + tmp.x + ", tmp.y : " + tmp.y);
		
		tmp.x = tmp.x * 2;
		tmp.y = tmp.y * 2;
		
		System.out.println("copy매서드 tmp.x : " + tmp.x + ", tmp.y : " + tmp.y);
	}
	*/
	
	/*
	//배열을 이용한 참조형 매개변수
	public static void main(String[] args) {
		int[] a = {10, 20};
		
		System.out.println("main() a[0] : " + a[0]);
		
		change(a);
		
		System.out.println("main() after a[0] : " + a[0]);
	}
	
	static void change(int[] x) {
		x[0] = 2000;
		
		System.out.println("change() x[0] : " + x[0]);
	}
	*/
	
	/*
	 문제) 배열에 {3, 2, 1, 6, 5, 4}을 초기값으로 선언 후에 오름차순으로 정렬하여 출력하는 프로그램
	 단) 각 메서드는 배열출력 printArr, 배열합 sumArr, 배열정렬 sortArr 선언
	 	sumArr 메서드만 리턴 존재
	 출력 예) [3, 2, 1, 6, 5, 4]
	 		[1, 2, 3, 4, 5, 6]
	 		sum = 21
	 */
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 6, 5, 4};
		
		printArr(a);
		sortArr(a);
		printArr(a);
		
		System.out.println("sum = " + sumArr(a));
	}
	
	static void printArr(int[] x) {
		int i;
		
		System.out.print("[");
		
		for (i = 0; i < x.length; i++) {
			System.out.print(x[i]);
			
			if(i != x.length - 1) {
				System.out.print(", ");
			}
		}
		
		System.out.print("] \n");
	}
		
	static void sortArr(int[] x) {
		int i, j;
		int tmp;
		
		for (i = 0; i < x.length - 1; i++) {
			for (j = i + 1; j < x.length; j++) {
				if (x[i] > x[j]) {
					tmp = x[i];
					x[i] = x[j];
					x[j] = tmp;
				}
			}
		}
	}
	
	static int sumArr(int[] x) {
		int i;
		int sum = 0;
		
		for (i = 0; i < x.length; i++) {
			sum = sum + x[i];
		}
		
		return sum;
	}
	
}
