/*
 ����������, �������̵�(���)
 ��� ��) ���� ��ħ�Դϴ�. �������� ���� �Դϴ�.
 		��ſ� �����Դϴ�. ���ɿ��� �帲 �Դϴ�.
 		�ູ�� ���ĵǼ���. ���Ŀ��� �� �����ڽ��ϴ�.
 ��) greetig �żҵ� ���
 Morning(��ħ), Lunch(����), Dinner(����) Ŭ������ ����
 */
class Today {
	private String weather;
	
	public String getWeather() {
		return this.weather;
	}
	
	public void setWeather(String weather) {
		this.weather = weather;
	}
	
	void greeting() {
		System.out.println("��ſ� �Ϸ� �Ǽ���.");
	}
	
	//������
//	Today(String weather) {
//		setWeather(weather);
//	}
}

class Morning extends Today {	
	
	//������
	Morning(String weather) {
		setWeather(weather);		//weather ����
//		super(weather);				//Today()Ŭ���� �����ڸ� �̿��� ���� ����
	}
	
	//�������̵�
	void greeting() {		
		System.out.println("���� ��ħ�Դϴ�. �������� " + getWeather() + " �Դϴ�.");			//weather ȣ��
	}
}

class Lunch extends Today {
	
	//������
	Lunch(String weather) {
		setWeather(weather);		//weather ����
	}
	
	//�������̵�
	void greeting() {		
		System.out.println("��ſ� �����Դϴ�. ���ɿ��� " + getWeather() + " �Դϴ�.");		//weather ȣ��
	}
}

class Dinner extends Today {
	
	//������
	Dinner(String weather) {
		setWeather(weather);		//weather ����
	}
	
	//�������̵�
	void greeting() {		
		System.out.println("�ູ�� ���ĵǼ���. ���Ŀ��� " + getWeather() + "�� �����ڽ��ϴ�.");		//weather ȣ��
	}
}

public class MySample1122 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Morning m = new Morning("����");
		Lunch l = new Lunch("�帲");
		Dinner d = new Dinner("��");
		
		m.greeting();
		l.greeting();
		d.greeting();
	}

}
