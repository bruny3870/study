package abs1;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("����", 3);
		Dog d = new Dog("����", 5);
		
		d.dog();
		d.move();
		d.bark();
		d.eat();
		
		c.cat();
		c.move();
		c.bark();
		c.eat();
	}
}
