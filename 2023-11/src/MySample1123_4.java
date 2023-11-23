import java.util.Vector;

class Buyer3 {
	int money = 1000;
	int bonusPoint = 0;
	
	Vector item = new Vector();
	
	void buy(Product3 p) {
		if (money < p.price) {
			System.out.println("�ܾ� ����");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p + " ���� �Ϸ�");
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		int i;
		Product3 p = null;
		
		if (item.isEmpty()) {
			System.out.println("���� ����");
			return;
		}
		
		for (i = 0; i < item.size(); i++) {
			p = (Product3)item.get(i);
			
			sum += p.price;
			itemList += (i == 0) ? p : (", " + p) ;
		}
		
		System.out.println("���� ��ǰ �� ���� " + sum);
		System.out.println("���� ��ǰ " + itemList);
	}
}

public class MySample1123_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Buyer3 b = new Buyer3();
		Tv4 t = new Tv4();
		Computer3 c = new Computer3();
		Audio a = new Audio();
		
		b.buy(t);
		b.buy(c);
		b.buy(a);
		b.summary();
	}

}
