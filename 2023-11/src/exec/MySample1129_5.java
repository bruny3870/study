package exec;

public class MySample1129_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 - 메소드 예외
		//예) void method() throws Exception1, Exception2, .... {
		try {
			method1();
			System.out.println("55555555");
			
		} catch (Exception e) {
			System.out.println("e.message : " + e.getMessage());
		}
		
		System.out.println("main 끝");
	}
	
	static void method1() throws Exception {		//메소드 오류 출력 시 호출한 쪽으로 리턴
		System.out.println("11111111");
		method2();
		System.out.println("22222222");
	}
	
	static void method2() throws Exception {
		System.out.println("33333333");
		int c = 5 / 0;
		System.out.println("44444444");
	}

}
