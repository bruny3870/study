class Card2 {
	//��� ����
	static final int KIND_MAX = 4;		//ī�� ���� ��
	static final int NUM_MAX = 13;		//���̺� ī�� ��
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	//���� ����
	int kind;
	int number;
	
	Card2() {
		this(SPADE, 1);		//(4, 1)
	}
	
	Card2(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";		//0 ~ 13���� (X-10 J-11 Q-12 K-13)
		
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}
}

class Deck {
	final int CARD_NUM = 52;					//ī�� ����
	Card2[] cardArr = new Card2[CARD_NUM];		//ī�� ������ŭ �迭 ����
	
	//ī�� 52�� ����
	Deck() {
		int i = 0;
		int k, n;
		
		for (k = Card2.KIND_MAX; k > 0; k--) {		//KIND_MAX = 4	(4 ~ 1)
			for (n = 0; n < Card2.NUM_MAX; n++) {	//NUM_MAX = 13	(0 ~ 12)
				System.out.println("Deck() ������ : i = " + i + ", k = " + k + ", n : " + n);
				
				cardArr[i++] = new Card2(k, n+1);	//�迭 ��ü ���� (4�� 1 ~ 13, 3�� 1 ~ 13, 2�� 1 ~ 13, 1�� 1 ~13)
			}
		}
	}
	
	//������ ��ġ(index)�� �ִ� ī�� �ϳ��� ������ ��ȯ
	Card2 pick(int index) {
		return cardArr[index];
	}
	
	//�Ű����� ����
	Card2 pick() {
		int index = (int)(Math.random() * CARD_NUM);		//random�� double�� ��ȯ�ؼ� int�� �� ��ȯ, 0 ~ 51 ���� ���� ��
		return pick(index);
	}
	
	//ī�� ���� ����
	void shuffle() {
		int i, r;
		Card2 tmp;
		
		for (i = 0; i < cardArr.length; i++) {
			r = (int)(Math.random() * CARD_NUM);			//random�� double�� ��ȯ�ؼ� int�� �� ��ȯ, 0 ~ 51 ���� ���� ��
			
			//ī�� ���� (������ Ÿ�� ����ߵ� - Card2)
			tmp = cardArr[i];
			cardArr[i] = cardArr[r];
			cardArr[r] = tmp;
		}
	}
	
	void printArr() {
		int i;
		
		for (i = 0; i < cardArr.length; i++) {
			System.out.println("cardArr[" + i + "] : " + cardArr[i]);
		}
	}
}

public class MySample1121_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���
		/*
		 * 
		 * 
		 ������) kind : SPADE, number : 1
		 		 kind : HEART, number : 7
		 */
		Deck d = new Deck();
		Card2 c = d.pick(0);		//ī�� ���� ���� ���� �� ī�� �̱�
		System.out.println("before => " + c.toString());
		System.out.println("before => " + c);		//���̾��� (toString ��������)
		
		System.out.println();
		
		d.printArr();		//�迭�� ī�� ������� ����, ��ȣ �ο�
		
		d.shuffle();		//ī�� ����
		c = d.pick(0);		//ī�� ���� �� �� ���� �� ī�� �̱�
		System.out.println("after => " + c.toString());
	}

}
