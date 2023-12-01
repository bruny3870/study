package etc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MySample1201_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList
		ArrayList<String> list1 = new ArrayList<String>();		//기본 10개
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("D");
		
		System.out.print("초기상태 : ");
		System.out.println(list1 + " size() : " + list1.size());	//동적으로 사이즈 체크
		
		
		System.out.println("인덱스 1에 B 추가");
		list1.add(1, "B");		// 중간에 삽입 가능
		System.out.println(list1 + " size() : " + list1.size());	//동적으로 사이즈 체크
		
		System.out.println("인덱스 2 값 삭제");
		list1.remove(2);
		System.out.println(list1 + " size() : " + list1.size());	//동적으로 사이즈 체크
		
		System.out.println("인덱스 2번째 위치 값 : " + list1.get(2));
		
		System.out.println();
		
		ArrayList list2 = new ArrayList();
		
		list2.add(new Integer(5));
		list2.add(new Integer(4));
		list2.add(new Integer(2));
		list2.add(new Integer(0));
		list2.add(new Integer(1));
		list2.add(new Integer(3));
		
		System.out.println("list2 : " + list2);
		
		ArrayList list3 = new ArrayList(list2.subList(1, 4));		//인덱스 1째부터 (4-1)번째까지 가져옴
//		System.out.println("list3 : " + list3);
		print(list2, list3);
		
		//정렬
		Collections.sort(list2);
		Collections.sort(list3);
		print(list2, list3);
		
		//list2에 list3 전체가 포함되어 있는지 확인 (true/false)
		System.out.println("list2.containAll(list3) : " + list2.containsAll(list3));
		System.out.println("list3.containAll(list2) : " + list3.containsAll(list2));
		
		list3.add("B");
		list3.add("C");
		list3.add(3, "A");
		print(list2, list3);
		
		//list2에서 list3과 겹치는 부분만 남기고 삭제
		System.out.println("list2.retainAll(list3) : " + list2.retainAll(list3));
		print(list2, list3);
		
		//list3에서 list2에 포함된 객체 삭제
		int i;
		
		for (i = list3.size() - 1; i >= 0; i--) {
			if(list2.contains(list3.get(i))) {
				list3.remove(i);
				
			}
		}
		
		print(list2, list3);
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list2 : " + list1);
		System.out.println("list3 = " + list2);
		System.out.println();
	}
}
