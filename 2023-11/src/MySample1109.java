import java.util.Scanner;

public class MySample1109 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		/*
		 문제) 5개의 정수를 {95, 75, 85, 100, 50} 으로 초기화 하고 오름차순으로 정렬하여 출력하는 프로그램
		 출력 예) 50 75 85 95 100
		 
		int[] a = {95, 75, 85, 100, 50};
		int i, j, tmp, k;
		
		for (i = 0; i < a.length - 1; i++) {		// a.length - 1 하는 이유는 마지막 값은 정렬할 필요가 없기 떄문
			for (j = i + 1; j < a.length; j++) {	// i + 1 하는 이유는 자기와 비교할 필요가 없기 떄문
				if (a[i] > a[j]) {					// 오름차순 '>' 내림차순 '<'
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
		*/
		
		/*
		 문제) 10개의 정수를 입력받아 배열에 저장 한 후 내림차순으로 정렬하는 프로그램
		 입력 예) 95 100 88 65 76 89 58 93 77 99
		 출력 예) 100 99 95 93 89 88 77 76 65 58
		 
		//int[] a = {95, 100, 88, 65, 76, 89, 58, 93, 77, 99};
		int[] a = new int[10];
		int i, j, tmp;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		
//		for (i = 0; i < a.length - 1; i++) {
//			for (j = i + 1; j < a.length; j++) {
//				
//				if (a[i] < a[j]) {
//					tmp = a[i];
//					a[i] = a[j];
//					a[j] = tmp;
//				}
//			}	
//	
		
		//바로 위 for문을 정식 선택알고리즘으로 변경
		int val;					//기준값 저장
		int idx = 0;				//교환할 j 인덱스 값
		
		for (i = 0; i < a.length - 1; i++) {
			val = a[i];				//val = 95
			
			for(j = i + 1; j < a.length; j++) {
				if (val < a[j]) {	//95 < 100
					val = a[j];		//val = 100
					idx = j;		//idx = 1
				}
			}
			
			//최종적으로 자리 교환
			if (idx > i) {
				tmp = a[i];
				a[i] = a[idx];
				a[idx] = tmp;
			}
			
			System.out.println("i : " + i + ", idx : " + idx);
			
			for (int k = 0; k < a.length; k++) {
				System.out.printf("%d ", a[k]);
			}
			
			System.out.println();
			idx = i;
		}
		
		for (i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
		*/
		
		/*
		 문제) 최대 100개 정수를 입력받다가 0 이 입력되면 종료하고 그때까지 입력된 수 중 5의 배수의 개수와 합계, 평균을 출력하는 프로그램
		 입력 예) 35 10 23 100 64 51 5 0
		 출력 예) 5의 배수 : 4개
		 		합계 : 150
		 		평균 : 37.5
		 
		int[] a = new int[100];
		int i;
		int cnt = 0;
		int sum = 0;
		double avg = 0;
		
//		for (i = 0; i < a.length; i++) {
//			
//			a[i] = sc.nextInt();
//			
//			if (a[i] == 0) {
//				break;
//			}
//			
//			if (a[i] % 5 == 0) {
//				cnt++;
//				sum += a[i];
//			}
//		}
//		
//		avg = sum / (double)cnt;
		
		//for문 2개로 처리
		int num = 0;
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				break;
			}
			
			num++;
		}
		
		for (i = 0; i < num; i++) {
			if (a[i] % 5 == 0) {
				sum += a[i];
				cnt++;
			}
		}
		
		avg = sum / (double)cnt;
		
		System.out.printf("5의 배수 : %d개 \n", cnt);
		System.out.printf("합계 : %d \n", sum);
		System.out.printf("평균 : %.1f \n", avg);
		*/
		
		/*
		 문제) 100개 이하의 정수를 입력 받다가 0 이 입력되면 0을 제외하고 그때까지 입력받은 개수를 출력한 후 입력받은 정수를 차례로 출력하되 
		 그 수가 홀수이면 2배한 값을 짝수이면 2로 나눈 몫을 출력하는 프로그램
		 단) 값 출력은 배열을 이용하지 않음 (배열의 입력값은 변경 없음)
		 입력 예) 8 10 5 15 100 0
		 출력 예) 5
		 		4 5 10 30 50
		 
		int[] a = new int [100];
		int i;
		int cnt = 0;
		
//		for (i = 0; i < a.length; i++) {
//			a[i] = sc.nextInt();
//			
//			if (a[i] == 0) {
//				break;
//			}
//			
//			cnt++;
//		}
//		
//		System.out.printf("%d \n", cnt);
//		
//		int val;
//		
//		for (i = 0; i < cnt; i++) {	
//			if (a[i] % 2 == 0) {
//				val = a[i] / 2;				//System.out.printf("%d ", a[i] / 2);
//			} else {
//				val = a[i] * 2;				//System.out.printf("%d ", a[i] * 2);
//			}
//			
//			System.out.printf("%d \n", val);
//		}
		
		//for문 1개로 처리 (출력결과 순서 변경)
		int tmp; 
		
		for (i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			
			if (a[i] == 0) {
				System.out.println();
				System.out.printf("%d", cnt);
				break;
			}
			
			cnt++;
			
			if(a[i] % 2 == 0) {
				tmp = a[i] / 2;
			} else {
				tmp = a[i] * 2;
			}
			
			System.out.printf("%d ", tmp);
		}
		*/
		
		/*
		 문제) 정수 10개를 입력받아 최대 값을 출력하는 프로그램
		 단) 변수는 배열변수 score와 출력 max, for문을 i만 선언
		 	정수는 0 ~ 100 사이 값만 입력받으며, 나머지 입력시 "숫자 범위가 초과 되었습니다." "0 ~ 100 사이의 숫자를 다시 입력하세요." 출력
		 입력 예) 110
		 출력 예) 숫자 범위가 초과 되었습니다.
		 		0 ~ 100 사이의 숫자를 다시 입력하세요.
		 
		 입력 예) 95 67 88 65 76 89 58 93 77 99 (입력시마다 하나의 값 입력 후 바로 엔터)
		 출력 예) 가장 큰 값은 99 입니다.
		 
		int[] score = new int[10];
		int i, max;
		
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			
//			if (score[i] < 0 || score[i] > 100) {
//				System.out.println("숫자 범위가 초과 되었습니다.");
//				System.out.println("0 ~ 100 사이의 숫자를 다시 입력하세요.");
//				i--;								//i값 리턴하기 위해 i값 감소
//			}
			
			//다른 방법
			while (score[i] < 0 || score[i] > 100) {
				System.out.println("숫자 범위가 초과 되었습니다.");
				System.out.println("0 ~ 100 사이의 숫자를 다시 입력하세요.");
				score[i] = sc.nextInt();			//다시입력 i값 그대로 (없으면 동일 i값으로 무한루프)
			}
		}
			
		max = score[0];
			
		for (i = 1; i< score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
		}
		System.out.printf("가장 큰 값은 %d 입니다.", max);
		
		
		//for문 1개로 처리
		int [] score = new int[10];
		int i;
		int max = 0;
		
		for (i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
			
			if (score[i] < 0 || score[i] > 100) {
				System.out.println("숫자 범위가 초과 되었습니다.");
				System.out.println("0 ~ 100 사이의 숫자를 다시 입력하세요.");
				i--;
				continue;				//범위 초과인 경우 max값 비교 할 핗요 없음
			}
			
			if (score[i] > max) {
				max = score[i];
			}
		}
		
		System.out.printf("가장 큰 값은 %d 입니다.", max);
		*/
		
		/*
		 문제) 20 이하의 정수 n을 입력받고 n개의 정수를 입력받아 높은 점수 부터 차례로 출력하는 프로그램
		 입력 예) 5
		 		35 10 35 100 64
		 출력 예) 100 64 35 35 10
		 
		int n = sc.nextInt();
		int[] a = new int[n];
		int i, j, tmp;
		
		for (i = 0; i < n; i++) {		//임의정수 n 배열의 길이 (a.length -> a 배열의 길이)
			a[i] = sc.nextInt();
		}
		
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					tmp = a[i];
					a[i] = a[j];
					a[j] = tmp;
				}
			}
		}
		
		for(i = 0; i < n; i++) {
			System.out.printf("%d ", a[i]);
		}
		*/
		
		//배열복사
		/*
		 문제) 정수 크기가 5개인 배열을 선언하고 각 10, 20, 30, 40, 50을 저장한 후
		 2배 크기의 배열을 선언하여 새로 선언한 배열에 복사한 후 출력하는 프로그램
		 출력 예) [변경 전]
		 		arr.length : 5
		 		arr[0] : 10
		 		arr[1] : 20
		 		arr[2] : 30
		 		arr[3] : 40
		 		arr[4] : 50
		 		
		 		[변경 후]
		 		arr.length : 10
		 		arr[0] : 10
		 		arr[1] : 20
		 		arr[2] : 30
		 		arr[3] : 40
		 		arr[4] : 50
		 		arr[5] : 0
		 		arr[6] : 0
		 		arr[7] : 0
		 		arr[8] : 0
		 		arr[9] : 0
		 
		int[] arr = new int[5];						//arr 5개
		int i;
		int num = 10;
		
		for (i = 0; i < arr.length; i++) {
			arr[i] = num * (i + 1);
		}
		
		System.out.println("[변경 전]");
		System.out.printf("arr.length : %d \n", arr.length);
		
		for (i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}
		
		int[] tmp = new int[arr.length * 2];		//tmp 10개
		
		System.out.println("배열 복사 전 주소...");
		System.out.println("arr : " + arr);			//배열명 주소값
		System.out.println("tmp : " + tmp);			//배열명 주소값
													//서로 다른 값
		//배열 값 복사
		for (i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		arr = tmp;									//arr의 주소값을 tmp와 같이 변경 (배열 복사)
		
		System.out.println("배열 복사 후 주소...");
		System.out.println("arr : " + arr);			//배열명 주소값
		System.out.println("tmp : " + tmp);			//배열명 주소값
													//서로 같은 값
		System.out.println("[변경 후]");
		System.out.println("arr.length : " + arr.length);
		
		for (i = 0; i < arr.length; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
		}
		
		System.out.println("tmp[0] : " + tmp[0] + " arr[0] : " + arr[0]);
		System.out.println("tmp[1] : " + tmp[1] + " arr[1] : " + arr[1]);
		
		tmp[1] = 99;
		
		System.out.println("값 변경 후...");
		System.out.println("tmp[1] : " + tmp[1] + " arr[1] : " + arr[1]);
		*/
		
		/*
		 문제) 정수 5개를 입력받을 배열을 선언한 후 정수 5개를 입력받아 배열에 저장한 후 배열복사를 통해 크기가 2배인 배열에 복사하고 
		 원래 배열 크기 뒤부터 다시 입력 5개를 받아 출력하는 프로그램
		 단) 추가 입력까지 모두 한 후에 배열 복사 진행
		 입력 예) 10 20 30 40 50 (arr에 입력)
		 출력 예) arr.length : 5 (arr로 출력)
		 		10 20 30 40 50
		 입력 에) 1 2 3 4 5 (tmp에 입력)
		 배열복수 후 출력
		 출력 예) 10 20 30 40 50 1 2 3 4 5 (arr로 출력)
		 */
		int[] arr = new int[5];
		int i;
		
		//0 ~ 4까지 배열값 입력
		for (i = 0; i < arr.length; i++) {		//arr.length 길이 5
			arr[i] = sc.nextInt();
		}
		
		//arr배열 길이 출력
		System.out.printf("arr.length : %d \n", arr.length);
		
		//arr배열 값 출력
		for (i = 0; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		System.out.println();
		
		//tmp배열
		int[] tmp = new int[arr.length * 2];	//arr배열 크기 2배
		
		//배열 복사
		for (i = 0; i < arr.length; i++) {
			tmp[i] = arr[i];
		}
		
		//arr배열이 0 ~ 4까지 배열 값 있으므로 i = 5 부터 시작
		for (i = arr.length; i < tmp.length; i++) {		//tmp.length 길이 10
			tmp[i] = sc.nextInt();
		}
		
		arr = tmp;
		
		System.out.println("배열 복사 후 출력");
		
		System.out.printf("arr.length : %d \n", arr.length);
		
		//복사 후 arr배열 값 출력
		for (i = 0; i < tmp.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
	}

}
