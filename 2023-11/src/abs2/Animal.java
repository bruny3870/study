package abs2;

public abstract class Animal {
	//�����̸�
	protected String name;		//private String name;
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//��� �����
	public abstract String getCry();
	
	//��� �����̴���
	public abstract String getMove();
	
	//������ �Դ���
	public abstract String getFood();
	
	//���
	public abstract void print();
}
