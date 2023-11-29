package exec;

public class MySample1129_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 문제) 20번 반복해서 랜덤발생을 0 ~ 9까지 발생시킨 후 랜덤값으로 나눈 결과를 화면에 출력하되 0으로 나누면 오류 발생
		 	 ArithmeticException에 대한 예외처리를 적용하고 예외에 대한 출력은 0으로 출력하고, 0으로 나누어 발생한 오류 건수를 최종 출력하는 프로그램
		 출력 예) 16
		 		20
		 		11
		 		0		=> 랜덤발생 시 0으로 되어 예외처리
		 		33
		 		100
		 		....
		 		0 발생 건수 : 1건
		 */
		/*
		int n = 100;
		int r = 0;
		int i;
		int cnt = 0;
		
		for (i = 0; i < 20; i++) {
			try {
				r = n / (int)(Math.random() * 10);
				//System.out.println(r);
				
			} catch (ArithmeticException e) {
				//System.out.println("0");
				r = 0;
				cnt++;
				
			} finally {
				System.out.println(r);
			}
		}
		
		System.out.println("========");
		System.out.println("0 발생 건수 : " + cnt + "건");
		*/
		
		/*
		 결과는 동일하며, try-catch문을 사용하지 않고 프로그램 구현
		 */
		int n = 100;
		int r = 0;
		int i;
		int cnt = 0;
		int tmp;
		
		for (i = 0; i < 20; i++) {
			tmp = (int)(Math.random() * 10);
			
			if (tmp != 0) {
				r = n / tmp;
				
			} else {
				r = 0;
				cnt++;
			}
			
			System.out.println(r);
		}
		
		System.out.println("========");
		System.out.println("0 발생 건수 : " + cnt + "건"); 
	}
}
