package exec;

class Value {
	int value;
	
	Value(int value) {
		this.value = value;
	}
}

public class MySample1130_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//java.lang ��Ű��
		Value v1 = new Value(20);
		Value v2 = new Value(20);
		
		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�");
			
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�");		//�ּҰ��� �޶� �ٸ��ٰ� ����
		}
		
		v1 = v2;	//v1�� �̾�
		
		if (v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�");
			
		} else {
			System.out.println("v1�� v2�� �ٸ��ϴ�");
		}
	}

}
