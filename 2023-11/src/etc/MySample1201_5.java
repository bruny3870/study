package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class MySample1201_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		/*
		 문제) 5명의 별명을 입력받아 ArrayList에 저장 후 이들 중 별명의 길이가 제일 긴 별명을 출력하는 프로그램
		 입력 예) 세일러문
		 		크루지
		 		놀부
		 		순대렐라
		 		달려라하니
		 출력 예) 가장 길이가 긴 별명은 => 달려라하니
		 단) 각 별명의 길이는 모두 다르게 입력함
		 */
//		ArrayList<String> list = new ArrayList<String>();
//		Scanner sc = new Scanner(System.in);
//		int i;
//		int max = 0;
//		
//		for (i = 0; i < 5; i++) {
//			list.add(sc.nextLine());
//		}
//		
//		for (i = 0; i < 5; i++) {
//			if (list.get(max).length() < list.get(i).length()) {
//				max = i;
//			}
//		}
//		
//		System.out.println("가장 길이가 긴 별명은 => " + list.get(max));
		
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int[] lengthArr = new int[5];
		int max = lengthArr[0];
		int i;
		
		for (i = 0; i < 5; i++) {
			list.add(sc.nextLine());
		}
		
		for (i = 0; i < 5; i++) {
			lengthArr[i] = list.get(i).length();
			
			if (max < lengthArr[i]) {
				max = lengthArr[i];
			}
		}
		
		for (i = 0; i < 5; i++) {
			if (max == list.get(i).length()) {
				System.out.println("가장 길이가 긴 별명은 => " + list.get(i));
				break;
			}
		}
	}

}
