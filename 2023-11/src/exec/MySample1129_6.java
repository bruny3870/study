package exec;

public class MySample1129_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 - finally 블록
		try {
			startInstall();
			copyFiles();
			//deleteTempFiles();
			
		} catch (Exception e) {
			e.printStackTrace();
			//deleteTempFiles();		//오류 발생에도 임시파일이 있기 때문에 삭제해줘야 함
			
		} finally {
			deleteTempFiles();		//코드 중복성 제거 (finally는 오류 상관없이 무조건 실행되므로 공통으로 넣어줌)
		}
		
		method1();
		
		System.out.println("method1() 실행 끝나고 main으로 돌아롬");
	}
	
	static void startInstall() {
		System.out.println("프로그램 설치에 필요한 준비 작업하는 영역....");
	}
	
	static void copyFiles() {
		System.out.println("파일들을 복사하는 영역....");
	}
	
	static void deleteTempFiles() {
		System.out.println("임시파일을 삭제하는 영역....");
	}
	
	static void method1() {
		try {
			System.out.println("method1() 실행 시작");
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			System.out.println("method1() finally 블록 실행");
		}
	}

}
