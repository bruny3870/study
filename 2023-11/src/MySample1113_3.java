class Tv {
	//�ν��Ͻ� ����
	String color;		//tv����
	boolean power;		//�������� (on/off)
	int channel;		//ä��
	
	//�ż���
	void power() {
		power = !power;		//true�� false / false�� true
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
	
	//������������ Ȱ���� ���� ���ÿ�
	void channelTest(Tv a) {
		System.out.println("Tv channelTest() a.channel : " + a.channel);
		a.channel = 20;
		System.out.println("�� Tv channelTest() a.channel : " + a.channel);
	}
	
	void channelTest2(int ch) {
		System.out.println("Tv channelTest2() ch : " + ch);
		ch = 20;
		System.out.println("�� Tv channelTest2() ch : " + ch);
	}
}


public class MySample1113_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Tv t = new Tv();		//��ü ����
		
		t.channel = 11;
		t.channelDown();
		t.channelUp();
		System.out.println("���� ü���� " + t.channel + " �Դϴ�.");
		
		//���� ü�� 11���� 7�� ���� ����
		t.power();
		t.color = "����";
		
		for (int i = t.channel; i > 7; i--) {
			t.channelDown();
		}
		
		System.out.printf("tv������ %b �̰�, ������ %s, ä���� %d �Դϴ�.\n", t.power, t.color, t.channel);
		*/
		
		/*
		 ������) t1�� channel ���� 0 �Դϴ�.
		 		t2�� channel ���� 0 �Դϴ�.
		 		t1�� channel ���� 7 �� �����߽��ϴ�.
		 		t1�� channel ���� 7 �Դϴ�.
		 		t2�� channel ���� 7 �Դϴ�.		//������ �������� ó��
		 
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
		t1.channel = 7;
		
		System.out.println("t1�� channel���� " + t1.channel + " �� �����߽��ϴ�.");
		
		t2 = t1;
		
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		*/
		
		/*
		 ������) t1�� channel ���� 0 �Դϴ�.
		 		t2�� channel ���� 0 �Դϴ�.
		 		t1�� channel ���� 5 �� �����߽��ϴ�.		//������ �� ����
		 		t2�� channel ���� 11 �� �����߽��ϴ�.		//������ �� ����
		 		t1�� channel ���� 11 �Դϴ�.
		 		t2�� channel ���� 11 �Դϴ�.
		 
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		
		t1.channel = 5;
		t2.channel = 11;
		
		System.out.println("t1�� channel���� " + t1.channel + " �� �����߽��ϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �� �����߽��ϴ�.");
		
		t1 = t2;
		
		System.out.println("t1�� channel���� " + t1.channel + " �Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + " �Դϴ�.");
		*/
		
		//��ü �迭
		Tv[] t1 = new Tv[3];		
		int i;
		
		for (i = 0; i < t1.length; i++) {
			t1[i] = new Tv();		//��ü ����
			t1[i].channel = i + 10;
			
			System.out.printf("�� t1[%d], channel = %d \n", i, t1[i].channel);
		}
		
		System.out.println();
		
		for (i = 0; i < t1.length; i++) {
			t1[i].channelUp();
			
			System.out.printf("�� t1[%d], channel = %d \n", i, t1[i].channel);
		}
		
		//��ü�迭 ���� ����
		System.out.println("t1 : " + t1);			//t1[0] �����ּ� ��
		System.out.println("t1[0] : " + t1[0]);		//new Tv �����ּ� ��
		System.out.println("t1[1] : " + t1[1]);
		System.out.println("t1[2] : " + t1[2]);
		
		Tv a = new Tv();
		
		System.out.println("a : " + a);
		
		a = t1[1];
		
		System.out.println("�� a : " + a);
		
		System.out.println("a.channel : " + a.channel + ", t1[1].channel : " + t1[1].channel);
		
		a.channel = 20;
		
		System.out.println("�� a.channel : " + a.channel + ", t1[1].channel : " + t1[1].channel);
		
		System.out.println();
		
		//������ ������ Ȱ���� ����
		Tv z = new Tv();
		z.channel = 11;		//������ - �ּ�
		
		System.out.println("main() z.channel : " + z.channel);
		
		z.channelTest(z);
		
		System.out.println("�� main() z.channel : " + z.channel);
		
		System.out.println();
		
		int ch = 11;		//�⺻�� - ��
		
		System.out.println("main() ch : " + ch);
		z.channelTest2(ch);
		System.out.println("�� main() ch : " + ch);
	}

}
