package etc;

public class MySample1201 {
	final static int RECORD_NUM = 10;
	final static String TABLE_NAME = "ȸ������";
	final static String[] CODE1 = {"010", "011", "017", "018", "019"};
	final static String[] CODE2 = {"����", "����"};
	final static String[] CODE3 = {"10��", "20��", "30��", "40��", "50��", "60��"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for (i = 0; i < RECORD_NUM; i++) {
			//INSERT INTO ȸ������ VALUES ('017', '����', '20��', 101);
			System.out.println("INSERT INTO " + TABLE_NAME + " VALUES (" + "'"
															+ getRandArr(CODE1) + "', '"
															+ getRandArr(CODE2) + "', '"
															+ getRandArr(CODE3) + "', "
															+ getRand(100, 200) + ");");	//100 ~ 200 ���� �� ����
		}
	}
	
	public static String getRandArr(String[] arr) {
		return arr[getRand(arr.length - 1)];		//�迭�� ����� �� �� �ϳ��� ��ȯ�ϴ� �뵵
	}
	
	//�����ε�
	public static int getRand(int n) {
		return getRand(0, n);
	}
	
	//�����ε�
	public static int getRand(int from, int to) {
		System.out.println("from : " + from + ", to : " + to);
		System.out.println("abs : " + (Math.abs(to - from) + 1) + ", min : " + Math.min(from, to));		//���밪, �ּҰ�
		return (int)(Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);		//(������ * ���밪) + �ּҰ�
																							//���� * 5 => 0 ~ 4 ���� ����
	}
}
