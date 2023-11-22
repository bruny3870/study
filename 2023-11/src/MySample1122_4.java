class Car4 {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive().... Car4");
	}
	
	void stop() {
		System.out.println("stop().... Car4");
	}
}

class FireEngine extends Car4 {
	void water() {
		System.out.println("water().... FireEngine");
	}
}

public class MySample1122_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		/*
		Car4 c = null;
		FireEngine f = new FireEngine();
		FireEngine f2 = null;
		
		f.water();
		c = f;					//������ => Car4 c = new FireEngine(); �� ����
								//���������� �� ��ȯ�� �˾Ƽ� �߻� (up-casting ��-ĳ����)
		
//		c.water();				//�Ұ��� (�θ��� ���������� �ڽ� ��ü�� �ٶ� �� ���� ������ �ڽ� ��ü�� �޼ҵ�� ��� �� �� ����
		
		f2 = (FireEngine)c;		//������ �� ��ȯ�� �߻� (down-casting �ٿ�-ĳ����)
		f2.water();
		*/
		
		//�Ұ����� ����
//		Car4 c = new Car4();				
		Car4 c = new FireEngine();			//���� �ϸ� 1. ����ÿ��� ���� �ȳ�
		Car4 c2 = null;
		
		FireEngine f = null;
		Car4 c3 = new FireEngine();
		
		c.drive();
		f = (FireEngine)c;					// f = c; �Ұ��� �ϳ� �� ��ȯ�� ���� ���� (�ٿ�-ĳ����)
											// FireEngine f = new Car4();   �ڽ��� �θ� ���� �� �� ����
		
		
											//�������� ���� �ϳ� ���� �� ���� �߻�
		
		f.drive();							//���� �� ����
		f.water();							//���� �� ����
		
		c2 = f;								//��-ĳ����
//		c2.water();							//�Ұ��� (c2���������� Ŭ����Ÿ���� Car4 �̰� water()�޼ҵ�� FireEngineŬ������ �޼ҵ� �̱� ������ �Ұ���)
		
		c2.drive();
		c2.stop();
	}

}
