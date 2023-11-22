class A {
	void methodA() {
		System.out.println("methodA()....");
	}
}

class B extends A {
	void methodB() {
		System.out.println("methodB()....");
	}
}

public class MySample1122_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성
		A obj = new B();
		
		obj.methodA();		//가능
//		obj.methodB();		//불가능 자식이 부모를 참조 할 수 없음
		
		B obj2 = new B();
		obj2.methodA();		//가능
		obj2.methodB();		//가능
	}

}
