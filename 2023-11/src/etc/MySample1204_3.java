package etc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MySample1204_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList 와 LinkedList 비교
		ArrayList a = new ArrayList(2000000);
		LinkedList l = new LinkedList();
		
		System.out.println("순차적으로 추가....");
		//배열이므로 ArrayList가 빠름
		System.out.println("ArrayList : " + add1(a));		
		System.out.println("LinkedList : " + add1(l));
		
		System.out.println();
		
		System.out.println("중간에 추가....");
		//주소값으로 추가하므로 LinkedList가 빠름
		System.out.println("ArrayList : " + add2(a));
		System.out.println("LinkedList : " + add2(l));		
		
		System.out.println();
		
		System.out.println("중간에 삭제....");
		//주소값으로 삭제하므로 LinkedList가 빠름
		System.out.println("ArrayList : " + remove2(a));
		System.out.println("LinkedList : " + remove2(l));	
		
		System.out.println();
		
		System.out.println("순차적으로 삭제....");
		//배열이므로 ArrayList가 빠름
		System.out.println("ArrayList : " + remove1(a));	
		System.out.println("LinkedList : " + remove1(l));
	}
	
	//순차적으로 추가
	public static long add1(List list) {
		long start = System.currentTimeMillis();		//현재 시간을 밀리세컨드단위
		
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");		//문자열로 만듬
			
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;		//끝나는 시간 - 시작한 시간 = 소요시간
	}
	
	//중간에 추가
	public static long add2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 1000; i++) {
			list.add(500, "X");		//500번째에 X값 추가
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;		//끝나는 시간 - 시작한 시간 = 소요시간
	}
	
	//순차적으로 삭제
	public static long remove1(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = list.size() - 1; i >= 0; i--) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
	
	//중간에 삭제
	public static long remove2(List list) {
		long start = System.currentTimeMillis();
		
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		
		long end = System.currentTimeMillis();
		
		return end - start;
	}
}
