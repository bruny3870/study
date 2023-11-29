package exec;

public class MySample1129_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		//0으로 나누었을떄 "0으로 나눌 수 없습니다" 메세지 출력 후 계속 실행
		
		int number = 10;
		int result = 0;
		int i;
		
		for (i = 0; i < 10; i++) {
			try {
				result = number / (int)(Math.random() * 10);		//0 ~ 9까지 값
				System.out.println(" result : " + result);
				
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다 : " + e);
			}
		}
		
		
		//실행순서
//		System.out.println("1");
//		
//		try {
//			System.out.println("2");
//			
//			int a = 5 / 0;		//오류발생
//			
//			System.out.println("3");	//안찍힘
//			
//		} catch (Exception e) {
//			System.out.println("4");
//			
//		} finally {
//			System.out.println("4-2");
//		}
//		
//		System.out.println("5");
	}

}
