class Product3 {
	int price;
	int bonusPoint;
	
	//������
	Product3(int price) {
		this.price = price;
		bonusPoint = (int)(price / 10.0);
	}
}

class Tv4 extends Product3 {
	//������
	Tv4() {
		super(300);
	}
	
	//�������̵�
	public String toString() {
		return "Tv";
	}
}

class Computer3 extends Product3 {
	//������
	Computer3() {
		super(100);
	}
	
	//�������̵�
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product3 {
	//������
	Audio() {
		super(50);
	}
	
	//�������̵�
	public String toString() {
		return "Audio";
	}
}

class Buyer2 {
	int money = 1000;
	int bonusPoint = 0;
	
	Product3[] item = new Product3[10];		//��ü �迭 ����
	int cnt = 0;							//�迭�� ���� ī��Ʈ
	
	//�޼ҵ�
	void buy(Product3 p) {					//�Ű����� ������
		if (money < p.price) {
			System.out.println("�ܾ� �������� ������ �� �� �����ϴ�.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item[cnt++] = p;					//��ǰ�� �迭�� ����
		System.out.println(p + "��(��) �����ϼ̽��ϴ�.");		//�� Ŭ������ toString �������̵� �޼ҵ� ȣ��
		
		int i;
		
		//������ǰ ��� �迭 ����
//		for (i = 0; i < item.length; i++) {		//�迭 ����ŭ ��� (item[9]����)
//			System.out.println("item[" + i + "] : " + item[i]);
//		}
		
		for (i = 0; i < cnt; i++) {				//���Ÿ� ��� (item[2]����)
			System.out.println("item[" + i + "] : " + item[i]);
		}
	}
	
	//�޼ҵ�
	void summary() {
		int sum = 0;				//������ǰ ���� �հ�
		String itemList = "";		//������ǰ ���
		int i;
		
		//������ ��ǰ�� �հ�� ���
		for (i = 0; i < item.length; i++) {
			if (item[i] == null) {		//��ǰ���� ����
				break;
			}
			
			sum += item[i].price;
			
			itemList += item[i].toString() + ", ";		//toString �޼ҵ� ���
		}
		
		System.out.println("������ ��ǰ�� �� ������ " + sum + "���� �Դϴ�.");
		System.out.println("������ ��ǰ�� " + itemList + "�Դϴ�.");
		System.out.println("������ ��ǰ�� �� ���ʽ� ����Ʈ�� " + bonusPoint + "�� �Դϴ�.");
	}
}

public class MySample1123_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������ - ��ü�� �迭��
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv4());
		b.buy(new Computer3());
		b.buy(new Audio());
		b.summary();
	}

}
