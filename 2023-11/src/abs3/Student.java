package abs3;

//�߻�Ŭ����
public abstract class Student {
	String name;
	int score;
	
	//������
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	//�߻�޼ҵ�
	abstract void examTake();		//���躸��
	abstract void examSolve();		//����Ǯ��
	abstract void examSubmit();		//��������
}
