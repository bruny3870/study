import java.util.Scanner;

public class MySample1108 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 문제) 100개의 정수를 저장할 수 있는 배열을 선언하고 차례대로 입력받다가 0 이 입력되면 0을 제외하고 그때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램
		 입력 예) 3 5 10 55 0
		 출력 예) 55 10 5 3
		 
		int[] a = new int[100];
		int i;
		int cnt = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				break;
			}
			
			cnt++;
		}
		
//		//정출력
//		for (i = 0; i < cnt; i++) {
//			System.out.print(a[i] + " ");
//		}
//		
//		System.out.println();
//		
//		//역출력
//		for (i = cnt - 1; i >= 0; i--) {		//cnt 에 -1 안하면 0까지 출력
//			System.out.print(a[i] + " ");
//		}
		
		//위와 동일한 문제 i변수 사용해서 반복
		int j;
		
		for (j = i - 1; j >= 0; j--) {
			System.out.printf("%d ", a[j]);
		}
		*/
		
		/*
		 문제) 연도와 월을 입력받아 해당 월의 날수를 출력하다가 월이 0이 입력되면 종료하는 프로그램 (무한루프이용)
		 단) 윤년은 400년에 1번, 4년에 1번이면서 100년은 제외
		 	year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)
		 	윤연인 경우 2월의 날수는 29일
		 입력 예) 년 => 2000
		 		월 => 2
		 출력 예) 입력하신 달의 날수는 29일 입니다. //days[month]
		 
		 입력 예) 년 => 2022
		 		월 => 13
		 출력 예) 잘못 입력하셨습니다.			//month 월을 1 ~ 12가 아닌 경우
		 
		 입력 예) 년 => 2023
		 		월 => 0					//종료
		 
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};		//new int[13];
		int m, y;
		
		while (true) {
			System.out.printf("년 => ");
			y = sc.nextInt();
			System.out.printf("월 => ");
			m = sc.nextInt();
			
			if (m == 0) {
				break;
			}
			
			if (m < 1 || m > 12) {
				System.out.printf("잘못 입력하셨습니다. \n");
				continue;
			}
			
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) {
				a[2] = 29;
			} else {
				a[2] = 28;
			}
			
			System.out.printf("입력하신 달의 날수는 %d일 입니다. \n", a[m]);
		}
		*/
		
		/*
		 문제) 10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
		 단) 출력은 max 사용
		 입력 예) 5 10 8 55 6 31 12 24 61 2
		 출력 예) 61
		 
		int[] a = new int[10];
		int i;
		int max = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < a.length; i++) {
			
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.printf("%d", max);
		*/
		
		/*
		 문제) 10개의 수를 입력받아 그 중 가장 작은 수를 출력하는 프로그램
		 단) 가장 작은 수 출력시 min 사용, 선언시 초기값 설정 안함
		 입력 예) 5 -10 8 55 -6 31 12 24 61 -2
		 출력 예) -10
		 
		int[] a = new int[10];
		int i;
		int min;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		min = a[0];			//min값을 배열 0번쨰를 넣어 차례로 비교
		
		for (i = 1; i < a.length; i++) {
		
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.printf("%d", min);
		*/
		
		/*
		 문제) 4자리 이하의 10개의 정수를 입력받아 짝수 중 가장 큰 값과 홀수 중 가장 작은 값을 출력하는 프로그램
		 단) max, min 사용, 초기값 설정 후 진행
		 입력 예) -5 10 -8 55 6 -31 12 -24 61 2
		 출력 예) 짝수 중 가장 큰 값 : 12 (max)
		 		홀수 중 가장 작은 값 : -31 (min)
		 
		int[] a = new int[10];
		int i;
		int max = -10000;					//가장 작은 값 (비교값보다 항상 작음)
		int min = 10000;					//가장 큰 값 (비교값보다 항상 큼)
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < a.length; i++) {
			
			if (a[i] % 2 == 0) {		//짝수
				
				if (a[i] > max) {		//a[i]가 max 보다 클 경우 => max = a[i] => 반복
					max = a[i];
				}
			} else {					//홀수
				
				if (a[i] < min) {
					min = a[i];			//a[i]가 min 보다 작은 경우 => min = a[i]; => 반복
				}
			}
		}	
		
		System.out.println("짝수 중 가장 큰 값 : " + max);
		System.out.println("홀수 중 가장 작은 값 : " + min);
		*/
		
		/*
		 문제) 10명의 컴퓨터 점수를 입력받아 배열에 저장하고 총점과 평균을 구하는 프로그램
		 단) for 1번 사용, 평균은 소수 첫째자리까지 출력
		 입력 예) 95 100 88 65 80 89 58 93 77 99
		 출력 예) 총점 : 840
		 		평균 : 84.0
		 
		int[] a = new int[10];
		int i;
		int sum = 0;
		double avg = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			sum = sum + a[i];
		}
		
		avg = sum / (double)a.length;
		
		System.out.printf("총점 : %d \n", sum);
		System.out.printf("평균 : %.1f", avg);
		*/
		
		/*
		 선택정렬
		 기본 배열 오름차순 정렬문제
		 */
		int[] a = {3, 1, 2, 6, 5, 4};
		int i, j, tmp, k;
		
		for (i = 0; i < a.length - 1; i++) {
			
			for (j = i + 1; j < a.length; j++) {
				
				if (a[i] > a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
			
			System.out.println("\n" + i + "번째 실행 후 결과");
			
			for (k = 0; k < a.length; k++) {
				
				System.out.printf("%d ", a[k]);
			}
		}
		
		System.out.println("\n\n최종 실행 후 결과");
		
		for (i = 0; i < a.length; i++) {
			
			System.out.printf("%d ", a[i]);
		}
	}

}
