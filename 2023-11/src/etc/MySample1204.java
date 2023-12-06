package etc;

import java.util.Vector;

public class MySample1204 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector(5);
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		print(v);
		
		//빈 공간 없애기 (용량과 크기가 같게)
		v.trimToSize();		//용량 5에서 3으로 변경 (데이터 길이와 동일하게 변경)
		System.out.println("v.trimToSize()....");
		print(v);
		
		//백터 용량 증가
		v.ensureCapacity(6);	//용량 3에서 6으로 변경
		System.out.println("v.ensureCapacity()....");
		print(v);
		
		 v.setSize(7);		//총 7개 중 3개가 값이 있으므로 4개는 null로 채움, capacity는 6배수로 12개로 변경
		 System.out.println("v.setSize()....");
		 print(v);
		 
		 v.clear();		//데이터를 삭제, 용량은 유지
		 System.out.println("v.clear()....");
		 print(v);
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size : " + v.size());			//백터에 들어가 있는 데이터 길이
		System.out.println("capacity : " + v.capacity());	//백터에 설정 되어있는 용량 길이
	}

}
