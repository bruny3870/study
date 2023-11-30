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
		//java.lang 패키지
		Value v1 = new Value(20);
		Value v2 = new Value(20);
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다");
			
		} else {
			System.out.println("v1과 v2가 다릅니다");		//주소값이 달라서 다르다고 나옴
		}
		
		v1 = v2;	//v1은 미아
		
		if (v1.equals(v2)) {
			System.out.println("v1과 v2가 같습니다");
			
		} else {
			System.out.println("v1과 v2가 다릅니다");
		}
	}

}
