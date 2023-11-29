package exec;

public class MySample1129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리
		int[] a = {2, 0};
		int b = 4;
		
		//int c = a[2];		//먼저 실행 후 오류 발생 확인
		
		try {
			//int c = a[2];
			int c = b / a[1];
			System.out.println("c : " + c);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 오류 발생");
			
//		} catch (ArithmeticException e) {
//			System.out.println("0으로 나눌 수 없습니다 : " + e);
			
		} catch (Exception e) {
			System.out.println("뭔지 몰라도 오류 발생 : " + e);
			
		} finally {
			System.out.println("무조건 실행됨");
		}
		
		System.out.println("try-catch 끝");
	}

}
