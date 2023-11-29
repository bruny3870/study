package exec;

public class MySample1129_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		System.out.println("1");
		
		try {
			System.out.println("2");
			System.out.println(2 / 0);
			System.out.println("3");
			
		} catch (ArithmeticException e) {
			System.out.println("4");
			
			if (e instanceof ArithmeticException) {
				System.out.println("true");
			}
			
			System.out.println("ArithmeticException");
			e.printStackTrace();		//어떤 클래스에 몇번쨰 라인에 상세하게 알고 싶을때, 디버깅용
			
			System.out.println("예외 메시지 : " + e.getMessage());		//에러 메시지만 출력
			
		} catch (Exception e) {
			System.out.println("5");
			System.out.println("예외 메세지 : " + e.getMessage());
		}
		
		System.out.println("6");
	}

}
