
public class MySample1115_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�޼��� �����ε�
		MySample1115_3 m = new MySample1115_3();
		
		System.out.println("sum()�޼��� �Ű����� 2�� : " + m.sum(5, 8));
		System.out.println("sum()�޼��� �Ű����� 3�� : " + m.sum(1, 2, 3));
		m.sum(2);
	}
	
	int sum(int a, int b) {
		return a + b;
	}
	
	void sum(int a) {
		System.out.println("sum()�޼��� �Ű����� 1�� : " + a);
	}
	
	int sum(int a, int b, int c) {
		return a + b + c;
	}

}
