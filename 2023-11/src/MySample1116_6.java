
public class MySample1116_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//초기화 블록
		/*
		 출력 예) static method : 1
		 		static block : 2
		 		static method : 3
		 		instance method : 4
		 		instance block : 5
		 		instance method : 6
		 		constructor : 7
		 		instance method : 8
		 		instance block : 9
		 		instance method : 10
		 		constructor : 11
		 */
		STest.test();	//클래스 메소드
		STest a = new STest();
		STest b = new STest();
	}

}

//클래스 초기화 블럭(딱 1번 호출) -> 인스턴스 초기화 블록 -> 생성자
class STest {
	static int cnt;
	//클래스 초기화		첫번쨰 (1, 2)
	static {
		test();		//같은 클래스 안 클래스 메소드
		cnt++;
		System.out.println("static block : " + cnt);
	}
	
	//인스턴스 초기화	a 시작 세번째 (4, 5)		b 시작 다섯번째 (8, 9)
	{
		instanceMethod();	//같은 클래스 안 클래스 메소드 or 인스턴스 메소드
		cnt++;
		System.out.println("instance block : " + cnt);
	}

	//생성자			네번째 (6, 7) a 끝		여섯뻔째 (10, 11) b 끝
	STest() {
		instanceMethod();
		cnt++;
		System.out.println("constructor : " + cnt);
	}
	
	//클래스 메소드		두번쨰 (3) => .test() 있아서 한번 더 출력
	static void test() {
		cnt++;
		System.out.println("static method : " + cnt);
	}
	
	//인스턴스 메소드	
	void instanceMethod() {
		cnt++;
		System.out.println("instance method : " + cnt);
	}
		
}
