class Tv2 {
	boolean power;		//��������(on/off)
	int channel;		//ä��
	
	Tv2() {
		channel = 11;		//�θ� ä��
		System.out.println("Tv2() ������...");
	}
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		++channel;
	}
	
	void channelDown() {
		--channel;
	}
}

class CaptionTv extends Tv2 {		//��� extends
	boolean caption;		//�ڸ�����(on/off)
	int channel;
	
	CaptionTv() {
		super();	//�θ�ȣ�� (�����ڿ����� ����)
		channel = 20;		//�ν��Ͻ� ä��
		System.out.println("CaptionTv() ������...");
	}
	
	void displayCaption(String text) {
		int channel = 30;		//���� ä��
		
		if (this.caption) {		//�ڸ����°� on�̸�, this ��������
			System.out.println("�ڸ����� : " + text);
		}

		//�θ�(super), �ν��Ͻ�(this)
		System.out.println("�θ� channel : " + super.channel);	//�θ� ä�� ���
		System.out.println("�ν��Ͻ� channel : " + this.channel);	//�ν��Ͻ� ä�� ���
		System.out.println("���� channel : " + channel);			//���� ä�� ���
	}
	
	int getChannel() {
		return super.channel;		//�θ� ä�� ����
	}
}

public class MySample1117_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
		CaptionTv ctv = new CaptionTv();		//������� �θ� ��ü ���� �� �ص� ��� ����
		//������ �ڽ��� CaptionTv ���� �� �θ��� Tv2�� ���� �����ȴ�
		
		System.out.println("1channel : " + ctv.channel);		//�ڽ� ä�� ���
		
		ctv.channel = 10;		//�ڽ� ä�� ����
		ctv.channelUp();		//�θ� �޼ҵ� ȣ��, �θ� ä�� ��
		System.out.println("2channel : " + ctv.channel);		//�ڽ� ä���̶� ä�� �� �ȵ�, ä�� ���� ����
		
		ctv.displayCaption("Hello JAVA....");		//�ν��Ͻ� ������ �ʱ�ȭ�� false�̹Ƿ� ��� �ȵ�
		ctv.caption = true;
		ctv.displayCaption("Hello JAVA....");		//������ true�� ���� �� ��� Ȯ��
		
		System.out.println("ctv.power : " + ctv.power);		//�θ� �Ŀ� ȣ��
		
		System.out.println("ctv.getChannel : " + ctv.getChannel());		//getChannel �޼ҵ带 ���� �θ� ä�� ȣ��
	}

}
