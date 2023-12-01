package etc;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MySample1201_6 {
	
	public static int randomRange(int min, int max, Random random) {
		if (min > max) {
			return min;
		}
		
		//난수발생 - min ~ max 사이 난수 발생
		return random.nextInt((max + 1) - min) + min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		//학생 리스트 생성
		List<Student> list = new ArrayList<Student>();
		
		//랜덤 점수 입력
		int i;
		
		for (i = 1; i <= 20; i++) {
			list.add(new Student(1, 1, i, "홍길동" + i, randomRange(40, 100, random), randomRange(40, 100, random), randomRange(40, 100, random)));
		}
		
		//등수 산정 전 출력
		System.out.println("################");
		System.out.println("# 등수 산정 전 출력 #");
		System.out.println("################");
		
		for (i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s);
		}
		
		//등수를 적용하기 위해 내림차순 정렬
		int j;
		Student tmp;
		
		for (i = 0; i < list.size() - 1; i++) {
			for (j = i + 1; j < list.size(); j++) {
				if (list.get(i).getSum() < list.get(j).getSum()) {
					tmp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, tmp);
				}
			}
		}
		
		System.out.println();
		
		//등수 산정 후 출력
		System.out.println("################");
		System.out.println("# 등수 산정 후 출력 #");
		System.out.println("################");
		int rank = 0;		//등수
		int order = 0;		//동일 등수 증가 값
		
		//등수 산정 및 출력
		Student s;
		for (i = 0; i < list.size(); i++) {
			s = list.get(i);
			
			if (i == 0) {
				//등수 초기값 1로 설정
				rank++;
				//동일 등수 증가값 1로 설정
				order++;
				
			} else {
				//총점이 같을떄
				if (list.get(i - 1).getSum() == s.getSum()) {
					//동일 등수 증가값 적용 (등수 rank는 앞과 동일)
					order++;
					
				} else {
					//총점이 다르면 (이전 등수에 동일 등수 증가 값을 더함)
					rank += order;
					//동일 등수 증가 값 초기화
					order = 1;
				}
			}
			
			//등수 부여
			s.setRank(rank);
			
			//출력
			System.out.println(s);
		}
	}

}
