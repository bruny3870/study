class Animal3 {
	void breath() {
		System.out.println("숨쉬기");
	}
	
	public String toString() {
		return "몰라";
	}
}

class Lion3 extends Animal3 {
	//오버라이딩
	public String toString() {
		return "사자";
	}
}

class Rabbit3 extends Animal3 {
	//오버라이딩
	public String toString() {
		return "토끼";
	}
}

class Monkey3 extends Animal3 {
	//오버라이딩
	public String toString() {
		return "원숭이";
	}
	
	public void printA() {
		System.out.println("printA()....");
	}
}

class ZooKeeper {
	/*
	//오버로딩
	void feed(Lion3 lion) {
		System.out.println(lion + "에게 먹이주기....");
	}
	
	//오버로딩
	void feed(Rabbit3 rabbit) {
		System.out.println(rabbit + "에게 먹이주기....");
	}
	
	//오버로딩
	void feed(Monkey3 monkey) {
		System.out.println(monkey + "에게 먹이주기....");
	}
	*/
	
	void feed(Animal3 animal) {
		System.out.println(animal + "에게 먹이주기....");
	}
}

public class MySample1122_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다형성
		ZooKeeper j = new ZooKeeper();
		
		//일반적인 객체 선언
		Lion3 lion = new Lion3();
		j.feed(lion);
		
		Rabbit3 rabbit = new Rabbit3();
		j.feed(rabbit);
		
		Monkey3 monkey = new Monkey3();
		j.feed(monkey);
		
		
		System.out.println();
		
		//업-캐스팅
		Animal3 A1 = new Lion3();
		j.feed(A1);
		
		Animal3 A2 = new Rabbit3();
		j.feed(A2);
		
		Animal3 A3 = new Monkey3();
		j.feed(A3);
		
		j.feed(new Animal3());		//Animal2 animal = new Monkey3();
		
		
		System.out.println();
		
		//다운-캐스팅
		Lion3 lion2 = (Lion3)A1;
		j.feed(lion2);
		
		Rabbit3 rabbit2 = (Rabbit3)A2;
		j.feed(rabbit2);
		
		Monkey3 monkey2 = (Monkey3)A3;
		j.feed(monkey2);
		
		
		System.out.println();
		
		
//		monkey.printA();					//오류 (monkey참조변수는 Animal3클래스의 참조변수이므로 Monkey()클래스에 있는 printA()메소드 접근 불가능
		monkey2.printA();					//가능
											//업-캐스팅 불가능, 다운-캐스팅 가능
	}

}
