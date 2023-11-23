package abs2;

public class Bird extends Animal {
	
	private String cry;
	private String move;
	private String food;
	
	//생성자는 이름(name)을 매개변수로 하는것과 매개변수가 4개로 생성자를 각각 정의함.
	//이름 : name, 울음 : 짹짹, 움직임 : 날아다닌다, 음식 : 벌레
	Bird(String name) {
		this(name, "짹짹", "날아다닌다", "벌레");
	}
	
	Bird(String name, String cry, String move, String food) {
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
		System.out.println("Bird [name : " + getName() + ", cry : " + getCry() + ", move : " + getMove() + ", food : " + getFood() + "]");
	}
}
