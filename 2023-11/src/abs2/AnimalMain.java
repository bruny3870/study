package abs2;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//추상 클래스 메인
		Dog d = new Dog("진돌");
		Cat c = new Cat("나비");
		Bird b = new Bird("참새");
		
		d.print();
		System.out.println();
		c.print();
		System.out.println();
		b.print();
		System.out.println(); 
		
		c.setCry("어흥");
		c.print();
		
		System.out.println();
		
		b.setMove("펄럭펄럭 날아다닌다");
		b.print();
		
		System.out.println();
		
		d.setFood("닭고기 말린거");
		d.print();
	}

}
