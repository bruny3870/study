package abs2;

public class Dog extends Animal {
	
	private String cry;
	private String move;
	private String food;
	
	//생성자는 이름(name)을 매개변수로 하는것과 매개변수가 4개로 생성자를 각각 정의함.
	//이름 : name, 울음 : 멍멍, 움직임 : 뛰어다닌다, 음식 : 사료
	Dog(String name) {
		this(name, "멍멍", "뛰어다닌다", "사료");
	}
	
	Dog(String name, String cry, String move, String food) {
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
		System.out.println("Dog [name : " + getName() + ", cry : " + getCry() + ", move : " + getMove() + ", food : " + getFood() + "]");
	}
}
