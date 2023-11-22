class Parent3 {
	
}

class Child3 extends Parent3 {
	void methodA() {
		System.out.println("methodA()....");
	}
}

class Brother extends Parent3 {
	
}

public class MySample1122_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성 (instanceof 연산자)
		
		//일반적인 객체 선언
		Parent3 p = new Parent3();
		
		System.out.println(p instanceof Object);			//true - Object 접근 가능
		System.out.println(p instanceof Parent3);			//true - Parent3 접근 가능
		System.out.println(p instanceof Child3);			//false - Child3 접근 불가능
		
		
		System.out.println();
		
		
		//업-캐스팅
		Parent3 p2 = new Child3();
		//부모 있음, 자식 있음 -> 자식 실행
		//부모 있음, 자식 없음 -> 부모 실행
		//부모 없음, 자식 있음 -> 오류
		
		System.out.println(p2 instanceof Object);			//true
		System.out.println(p2 instanceof Parent3);			//true
		System.out.println(p2 instanceof Child3);			//true
//		p2.methodA();										//참조 가능, 접근 불가능
		
		
		System.out.println();
		
		
		//다운-캐스팅
		Child3 c = (Child3)p2;
		
		System.out.println(c instanceof Object);			//true
		System.out.println(c instanceof Parent3);			//true
		System.out.println(c instanceof Child3);			//true
		c.methodA();										//참조 가능, 접근 가능
	}

}
