
public class MySample1115_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메서드 오버로딩
		MySample1115_3 m = new MySample1115_3();
		
		System.out.println("sum()메서드 매개변수 2개 : " + m.sum(5, 8));
		System.out.println("sum()메서드 매개변수 3개 : " + m.sum(1, 2, 3));
		m.sum(2);
	}
	
	int sum(int a, int b) {
		return a + b;
	}
	
	void sum(int a) {
		System.out.println("sum()메서드 매개변수 1개 : " + a);
	}
	
	int sum(int a, int b, int c) {
		return a + b + c;
	}

}
