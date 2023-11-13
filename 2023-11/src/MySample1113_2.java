
public class MySample1113_2 {
	//클래스
	int iv;					//인스턴스 변수
	static int cv;			//클래스 변수
	
	int methodA(int k) {
		int lv = 5;			//지역변수 lv, k (methodA에서만 사용)
		k = k + lv;
		System.out.println("methodA() lv : " + lv);
		System.out.println("methodA() a : " + k);
		
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySample1113_2 a = new MySample1113_2();
		MySample1113_2 b = new MySample1113_2();
		MySample1113_2 c = new MySample1113_2();
		
		System.out.println("before => a.iv : " + a.iv + ", b.iv : " + b.iv + ", c.iv : " + c.iv);
		
		a.iv = 10;
		b.iv = 20;
		c.iv = 30;
		
		System.out.println("after => a.iv : " + a.iv + ", b.iv : " + b.iv + ", c.iv : " + c.iv);
		
		a.cv = 11;
		b.cv = 22;
		c.cv = 33;
		
		System.out.println("1 a.cv : " + a.cv + ", b.cv : " + b.cv + ", c.cv : " + c.cv);		//클래스 변수는 같은집 => 같은집에 값 대입 => 값 덮음
		
		System.out.println("1 MySample1113_2.cv : " + MySample1113_2.cv);
		
		MySample1113_2.cv = 55;
		
		System.out.println("2 a.cv : " + a.cv + ", b.cv : " + b.cv + ", c.cv : " + c.cv);
		
		System.out.println("2 MySample1113_2.cv : " + MySample1113_2.cv);
		
		//메서드 호출
		int k = 60;			//지역변수	(main에서만 사용)
		
		a.methodA(50);
		System.out.println("main() methodA 호출 전 k : " + k);
		k = b.methodA(k);
		System.out.println("main() methodA 호출 후 k : " + k);
		System.out.println("main() methodA 호출 후 바로 반환 : " + b.methodA(k));
		//c.methodA(k + 30);
		
		int a1 = 10;
	}

}
