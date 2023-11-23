package abs2;

public class Bird extends Animal {
	
	private String cry;
	private String move;
	private String food;
	
	//�����ڴ� �̸�(name)�� �Ű������� �ϴ°Ͱ� �Ű������� 4���� �����ڸ� ���� ������.
	//�̸� : name, ���� : ±±, ������ : ���ƴٴѴ�, ���� : ����
	Bird(String name) {
		this(name, "±±", "���ƴٴѴ�", "����");
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
