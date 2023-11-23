package abs2;

public class Cat extends Animal {
	
	private String cry;
	private String move;
	private String food;
	
	//생성자는 이름(name)을 매개변수로 하는것과 매개변수가 4개로 생성자를 각각 정의함.
	//이름 : name, 울음 : 야옹, 움직임 : 걸어다닌다, 음식 : 생선
	Cat(String name) {
		this(name, "야옹", "걸어다닌다", "생선");
	}
	
	Cat(String name, String cry, String move, String food) {
		setName(name);
		setCry(cry);
		setMove(move);
		setFood(food);
	}
	
	@Override
	public String getCry() {
		return this.cry;
	}
	
	public void setCry(String cry) {
		this.cry = cry;
	}
	
	@Override
	public String getMove() {
		return this.move;
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	
	@Override
	public String getFood() {
		return this.food;
	}
	
	public void setFood(String food) {
		this.food = food;
	}
	
	@Override
	public void print() {
		System.out.println("Cat [name : " + getName() + ", cry : " + getCry() + ", move : " + getMove() + ", food : " + getFood() + "]");
	}
}
