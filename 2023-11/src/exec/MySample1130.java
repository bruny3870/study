package exec;

public class MySample1130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		try {
			System.out.println("외부 try");
			
			try {
				System.out.println("내부 try");
				Exception e = new Exception();
				throw e;
				
			} catch (Exception e) {
				System.out.println("내부 try-catch exception : " + e);
				System.out.println("예외 던지기 한번 더");
				throw e;
			}
			
		} catch (Exception e) {
			System.out.println("외부 try-catch exception : " + e);
		}
		
		System.out.println("예외처리 끝");
	}

}
