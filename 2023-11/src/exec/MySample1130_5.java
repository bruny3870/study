package exec;

public class MySample1130_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//equals �޼ҵ� �������̵�
		Person p1 = new Person(1023456777722L);		//long Ÿ�� �ǵڿ� L ������ �ν�
		Person p2 = new Person(1023456777722L);
		
		if (p1 == p2) {
			System.out.println("p1�� p2�� �����ϴ�");
			
		} else {
			System.out.println("p1�� p2�� �ٸ��ϴ�");
		}
		
		if (p1.equals(p2)) {
			System.out.println("p1�� p2�� �����ϴ�2");
			
		} else {
			System.out.println("p1�� p2�� �ٸ��ϴ�2");
		}
	}

}

class Person {
	long id;
	
	Person(long id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {		//Ÿ�� Ȯ��
			
			if (this.id == ((Person)obj).id) {
				return true;
				
			} else {
				return false;
			}
			
			//�� if���� 1�ٷ� ǥ�� ����
			//return this.id == ((Person)obj).id;
			
		} else {
			return false;
		}
		
	}
}
