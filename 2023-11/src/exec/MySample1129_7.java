package exec;

import java.util.Scanner;

public class MySample1129_7 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int inputScore() throws ScoreException {
		int score = sc.nextInt();
		
		if (score < 0 || score > 100) {
			ScoreException ex = new ScoreException("점수는 0 ~ 100점 사이 입력하세요");
//			ScoreException ex = new ScoreException();		//점수입력오류
			throw ex;
		}
			
		return score;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리 - 클래스
		try {
			System.out.print("국어 점수 입력 => ");
			int kor = inputScore();		//메소드 예외처리이기 떄문에 try 안에 있음
			System.out.println("국어 점수는 " + kor + "점 입니다");
			
			System.out.print("영어 점수 입력 => ");
			int eng = inputScore();
			System.out.println("영어 점수는 " + eng + "점 입니다");
			
		} catch (Exception e) {
			System.out.println("오류메세지 : " + e.getMessage());
			
		} finally {
			System.out.println("프로그램 종료");
		}
	}

}

//클래스 예외처리
class ScoreException extends Exception {
	ScoreException() {
		super("점수 입력 오류");
	}
	
	ScoreException(String msg) {
		super(msg);
	}
}
