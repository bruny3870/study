
public class MySample1113_2 {
	//Ŭ����
	int iv;					//�ν��Ͻ� ����
	static int cv;			//Ŭ���� ����
	
	int methodA(int k) {
		int lv = 5;			//�������� lv, k (methodA������ ���)
		k = k + lv;
		System.out.println("methodA() lv : " + lv);
		System.out.println("methodA() a : " + k);
		
		return k;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MySample1113_2 a = new MySample1113_2();
		MySample1113_2 b = new MySample1113_2();
		MySample1113_2 c = new MySample1113_2();
		
		System.out.println("before => a.iv : " + a.iv + ", b.iv : " + b.iv + ", c.iv : " + c.iv);
		
		a.iv = 10;
		b.iv = 20;
		c.iv = 30;
		
		System.out.println("after => a.iv : " + a.iv + ", b.iv : " + b.iv + ", c.iv : " + c.iv);
		
		a.cv = 11;
		b.cv = 22;
		c.cv = 33;
		
		System.out.println("1 a.cv : " + a.cv + ", b.cv : " + b.cv + ", c.cv : " + c.cv);		//Ŭ���� ������ ������ => �������� �� ���� => �� ����
		
		System.out.println("1 MySample1113_2.cv : " + MySample1113_2.cv);
		
		MySample1113_2.cv = 55;
		
		System.out.println("2 a.cv : " + a.cv + ", b.cv : " + b.cv + ", c.cv : " + c.cv);
		
		System.out.println("2 MySample1113_2.cv : " + MySample1113_2.cv);
		
		//�޼��� ȣ��
		int k = 60;			//��������	(main������ ���)
		
		a.methodA(50);
		System.out.println("main() methodA ȣ�� �� k : " + k);
		k = b.methodA(k);
		System.out.println("main() methodA ȣ�� �� k : " + k);
		System.out.println("main() methodA ȣ�� �� �ٷ� ��ȯ : " + b.methodA(k));
		//c.methodA(k + 30);
		
		int a1 = 10;
	}

}
