package inter2;

//����� ���
public class MyClass {
	//������
	RemoteControl rc = new Tv();
	
	//1��
	MyClass() {
		
	}
	
	//2��
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
		this.rc.turnOn();
		this.rc.setVolume(5);
	}
	
	//3��
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	//4��
	//�޼ҵ�����ε�
	void methodA(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}
