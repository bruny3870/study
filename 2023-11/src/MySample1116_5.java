
public class MySample1116_5 {
	/*
	static int cv = 1;
	int iv = 2;
	
	//Ŭ���� �ʱ�ȭ ���
	static {												//1
		System.out.println("Ŭ���� �ʱ�ȭ ����");					//Ŭ�������� �Ҵ� �ɶ� ���� ����, 1���� ȣ��
		cv = 10;
	}
	
	//�ν��Ͻ� �ʱ�ȭ ���
	{														//3	//6	
		System.out.println("�ν��Ͻ� �ʱ�ȭ ����");				//�����ڸ� ȣ���ϸ� �����ڰ� ȣ��Ǳ� ������ �ʱ�ȭ ����� ȣ��
		iv = 20;
	}
	
	//������
	MySample1116_5() {										//4	//7
		System.out.println("������ ȣ��");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�ʱ�ȭ ���
		System.out.println("���� �޼ҵ� ����");					//2
		
		MySample1116_5 m1 = new MySample1116_5();
		System.out.println("���� �޼ҵ� 2��° ����");				//5
		
		MySample1116_5 m2 = new MySample1116_5();
		
		System.out.println("���� �޼ҵ� ��");					//8
	}
	*/
	
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println("p1 ��ǰ��ȣ(serialNo) : " + p1.serialNo);
		System.out.println("p2 ��ǰ��ȣ(serialNo) : " + p2.serialNo);
		System.out.println("p3 ��ǰ��ȣ(serialNo) : " + p3.serialNo);
		System.out.println("��ü ���� �� : " + Product.count);
	}
}

class Product {
	static int count = 0;
	int serialNo;

	//�ν��Ͻ� �ʱ�ȭ
	{
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��� ���� count : " + count + ", serialNo : " + serialNo);
		
		++count;
		serialNo = count;
		
		System.out.println("�ν��Ͻ� �ʱ�ȭ ��� �� count : " + count + ", serialNo : " + serialNo);
	}
	
	Product() {
		System.out.println("Product() ������");
	}
}
