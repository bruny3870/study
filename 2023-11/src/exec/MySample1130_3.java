package exec;

public class MySample1130_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 - 연결된 예외처리
		try {
			install();
			
		} catch(InstallException e) {
			System.out.println("11111111");
			e.printStackTrace();
			
		} catch(Exception e) {
			System.out.println("22222222");
			e.printStackTrace();
			
		} finally {
			System.out.println("33333333");
		}
	}
	
	//설치 관리
	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
			
		} catch(SpaceException e) {
			InstallException ie = new InstallException("설치 중 예외발생 1111");
			//InstallException의 원인 예외 SpaceException으로 지정
			ie.initCause(e);		//지정된 예외를 예외로 등록
			throw ie;
			
		} catch(MemoryException e) {
			InstallException ie = new InstallException("설치 중 예외발생 2222");
			ie.initCause(e);
			throw ie;
			
		} finally {
			deleteTempFiles();
		}
		
	}
	
	//저장공간, 메모리 부족 관리
	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) {
			throw new SpaceException("저장공간 부족");
		}
		
		if (!enoughMemory()) {
			throw new MemoryException("메모리 부족");
		}
	}
	
	static void copyFiles() {
		System.out.println("설치에 필요한 파일들을 복사");
	}
	
	static boolean enoughSpace() {
		System.out.println("설치에 필요한 저장공간 확인");
		return false;
	}
	
	static boolean enoughMemory() {
		System.out.println("설치에 필요한 메모리 확인");
		return true;
	}
	
	static void deleteTempFiles() {
		System.out.println("설치 후 임시파일 삭제");
	}

}

//설치 에러
class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}

//저장공간 부족
class SpaceException extends Exception {
	SpaceException(String msg) {
		super(msg);
	}
}

//메모리 부족
class MemoryException extends Exception {
	MemoryException(String msg) {
		super(msg);
	}
}
