class Card {
	String kind;				//�ν��Ͻ� ����
	int number;					//�ν��Ͻ� ����
	
	static int width = 100;		//Ŭ���� ����
	static int height = 250;	//Ŭ���� ����
}


public class MySample1114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Ŭ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + " " + c1.number + " �̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + " " + c2.number + " �̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
		c1.number = 12;
		c2.number = 8;
		
		c1.width = 50;		//Ŭ���������� �ν��Ͻ������� �޸� ���� ����
		c1.height = 80;
		
		System.out.println("���� �� ==========================");
		System.out.println("c1�� " + c1.kind + " " + c1.number + " �̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + " " + c2.number + " �̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
	}

}
