package etc;

import java.util.ArrayList;
import java.util.Scanner;

public class MySample1201_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		/*
		 문제) 5명의 사람 이름을 입력받아 ArrayList에 저장 후 '김'씨 성을 가진 사람을 모두 출력하는 프로그램
		 입력 예) 홍길동
		 		이둘리
		 		김길동
		 		김둘리
		 		최길동
		 출력 예) [김길동]	[김둘리]
		 		김씨 성을 가진 분은 모두 2명 입니다
		 단) 입력시 nextLine() 사용, '김'으로 시작한것을 찾는 메소드는 get(i).startsWith("김") -> true/false 반환
		 */
		ArrayList<String> list = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		int i;
		int cnt = 0;
		
		//5명 입력 받음
		for (i = 0; i < 5; i++) {
			list.add(sc.nextLine());
		}
		
		//김씨 추출
		for (i = 0; i < 5; i++) {
			if (list.get(i).startsWith("김")) {		//리스트에 저장된 값 가져와서(list.get(i) 김씨 찾음(startsWith("김")
				System.out.print("[" + list.get(i) + "] \t");
				cnt++;
			}
		}
		
		System.out.println();
		System.out.println("김씨 성을 가진 분은 모두 " + cnt + "명 입니다");
	}

}
