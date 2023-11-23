package abs1;

public class Cat extends Animal {
	private String move;
	private String eat;
	
	Cat() {
		
	}
	
	Cat(String name, int age, String move, String eat) {
		setName(name);
		setAge(age);
		setMove(move);
		setEat(eat);
	}
	
	public String getMove() {
		return this.move;
	}
	
	public void setMove(String move) {
		this.move = move;
		System.out.println(getMove());
	}
	
	public String getEat() {
		return this.eat;
	}
	
	public void setEat(String eat) {
		this.eat = eat;
		System.out.println(getEat());
	}
	
	@Override
	public void bark() {
		System.out.println("Â¢´Â´Ù");
	}
}
