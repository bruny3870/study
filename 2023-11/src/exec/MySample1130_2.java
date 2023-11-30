package exec;

import java.util.Scanner;

public class MySample1130_2 {
	static Scanner sc = new Scanner(System.in);
	
	//클래스 메소드 (메소드 예외처리 - 던지는쪽에서 예외처리)
	static void ticketing(int age) throws AgeException {
		if (age < 20) {
			AgeException e = new AgeException("나이입력 오류");
			throw e;
//			throw new AgeException("나이입력 오류");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//예외처리 - 사용자 예외처리
		/*
		System.out.print("나이를 입력하세요 => ");
		int age = sc.nextInt();
		
		try {
			ticketing(age);
			
		} catch (AgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() 메소드 끝");
		*/
		
		/*
		 문제) 20살 미만이 입력 될 경우 계속해서 입력을 받고, 20살 이상이 입력되면 "티켓발행 성공" 이라고 출력하고 프로그램 종료
		 */

		//while 무한루프
//		while (true) {
//			System.out.print("나이를 입력하세요 => ");
//			int age = sc.nextInt();
//			
//			try {
//				ticketing(age);
//				System.out.println("티켓발행 성공");
//				break;
//				
//			} catch (AgeException e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		//for 무한루프
		for(;;) {
			System.out.print("나이를 입력하세요 => ");
			int age = sc.nextInt();
			
			try {
				ticketing(age);
				System.out.println("티켓발행 성공");
				break;
				
			} catch (AgeException e) {
				e.printStackTrace();
			}
			
			//이쁘게 처리용 딜레이
			Thread.sleep(1000);		//1000 = 1초
			System.out.println();
		}
	}

}

class AgeException extends Exception {
	AgeException() {
		this("나이입력 오류");
	}
	
	AgeException(String msg) {
		super(msg);
	}
}
