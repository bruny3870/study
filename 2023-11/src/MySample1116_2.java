class Computer {
	void show(int a) {
		System.out.println("컴퓨터 가격은 : '" + a + "' 원 입니다.");
	}
	
	void show(String a) {
		System.out.println("제품은 : '" + a + "' 입니다.");
	}
	
	void show(String a, int b) {
		System.out.println("구매한 제품은 '" + a + "' 이며, '" + b + "' 원 입니다.");
	}
}

public class MySample1116_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메소드 오버로딩
		/*
		 실행결과) 컴퓨터 가격은 : 10000 원 입니다.
		 		제품은 : 컴퓨터 입니다.
		 		구매한 제품은 컴퓨터 이며, 10000 원 입니다.
		 */
		Computer c = new Computer();
		c.show(10000);
		c.show("컴퓨터");
		c.show("컴퓨터", 10000);
	}

}

//클래스 변수와 메소드, 인스턴스 변수와 메소드 정리
class Member {
	int iv = 10;						//인스턴스 변수
	static int cv = 20;					//클래스 변수
	
	int iv2 = iv;						//가능 => 둘 다 인스턴스 변수이기 때문에
	//static int cv2 = iv;				//불가능 => iv가 인스턴스 변수이므로
	
	//Member m = new Member();			//객체 생성
	//static int cv2 = m.iv;			//불가능 => 클래스 내에서 객체 생성해도 안됨 (메소드에서 가능)
										//Member 객체 생성 시기와 static 변수 생성 시기가 다르기 때문
	
	static int cv2 = new Member().iv;	//억지로 가능하게 만듬, 굳이 사용 안함
	
	
	static void staticMetod1() {		//클래스 메소드 (객체 생성과 상관없이 생성)
		System.out.println(cv);			//가능 => 같은 클래스 변수이기 떄문에
		
		//System.out.println(iv);		//불가능 => 인스턴스 변수는 클래스 메소드에 적용 안됨 (생성 시기 차이)
		Member m = new Member();		//객체 생성
		System.out.println(m.iv);		//객체 생성 후 인스턴스 변수 사용 가능
	}
	
	void instanceMetod1() {				//인스턴스 메소드
		System.out.println(cv);			
		System.out.println(iv);			//인스턴스 변수, 클래스 변수 둘 다 사용 가능
	}
	
	static void staticMetod2() {		//클래스 메소드
		staticMetod1();					//같은 클래스 메소드 호출 가능
		
		//instanceMetod1();				//인스턴스 메소드는 호출 불가능
		Member m = new Member();		//객체 생성
		m.instanceMetod1();				//객체 생성 후 인스턴스 메소드 호출 가능
	}
	
	void instanceMetod2() {				//인스턴스 메소드
		staticMetod1();
		instanceMetod1();				//인스턴스 메소드, 클래스 메소드 둘 다 호출 가능
	}
	
}

