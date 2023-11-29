package exec;

public class MySample1129_4 extends Exception {
	MySample1129_4(String a) {
		super(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 - 예외발생
		try {
			//Exception e = new Exception("일부러 오류 발생시킴");		//에러 메세지 관리 가능
			MySample1129_4 e = new MySample1129_4("일부러 오류 발생시킴");
			throw e;
			
		} catch (Exception e) {
			System.out.println("에러 메세지 : " + e.getMessage());
		}
		
		System.out.println("프로그램 정상 종료 되었음");
	}

}
