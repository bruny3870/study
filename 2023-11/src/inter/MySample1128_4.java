package inter;

//�������̽�
interface Gamer {
	//���
	public static final int GAME_MAX_LEVEL = 100;
	
	//�߻�޼ҵ�
	public abstract void doGame();
}

//�������̽�
interface Singer {
	//���
	int AUDITON_MAX_CHANCE = 10;		//public static final ����
	int GAME_MAX_LEVEL = 99;			//public static final ����
	
	//�߻�޼ҵ�
	void singSong();					//public abstract ����
}

class Student implements Gamer, Singer {
	String name;
	int score;
	
	//������
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public void doGame() {
		System.out.println(name + "��(��) ������ �մϴ�.");
	}
	
	@Override
	public void singSong() {
		System.out.println(name + "��(��) �뷡�� �θ��ϴ�.");
	}
}

public class MySample1128_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������̽� ���� ���
		Student s = new Student("��浿", 83);
		
		System.out.println("������ �ְ� ����(Gamer) : " + Gamer.GAME_MAX_LEVEL);
		System.out.println("������ �ְ� ����(Singer) : " + Singer.GAME_MAX_LEVEL);
		
		s.doGame();
		System.out.println(s.name + "�� ���� : " + s.score);
		System.out.println("����� �ִ� ��ȸ : " + Singer.AUDITON_MAX_CHANCE);
	}

}
