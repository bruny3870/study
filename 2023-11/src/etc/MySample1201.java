package etc;

public class MySample1201 {
	final static int RECORD_NUM = 10;
	final static String TABLE_NAME = "회원정보";
	final static String[] CODE1 = {"010", "011", "017", "018", "019"};
	final static String[] CODE2 = {"남자", "여자"};
	final static String[] CODE3 = {"10대", "20대", "30대", "40대", "50대", "60대"};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		
		for (i = 0; i < RECORD_NUM; i++) {
			//INSERT INTO 회원정보 VALUES ('017', '여자', '20대', 101);
			System.out.println("INSERT INTO " + TABLE_NAME + " VALUES (" + "'"
															+ getRandArr(CODE1) + "', '"
															+ getRandArr(CODE2) + "', '"
															+ getRandArr(CODE3) + "', "
															+ getRand(100, 200) + ");");	//100 ~ 200 사이 값 랜덤
		}
	}
	
	public static String getRandArr(String[] arr) {
		return arr[getRand(arr.length - 1)];		//배열에 저장된 값 중 하나를 반환하는 용도
	}
	
	//오버로딩
	public static int getRand(int n) {
		return getRand(0, n);
	}
	
	//오버로딩
	public static int getRand(int from, int to) {
		System.out.println("from : " + from + ", to : " + to);
		System.out.println("abs : " + (Math.abs(to - from) + 1) + ", min : " + Math.min(from, to));		//절대값, 최소값
		return (int)(Math.random() * (Math.abs(to - from) + 1)) + Math.min(from, to);		//(랜덤값 * 절대값) + 최소값
																							//랜덤 * 5 => 0 ~ 4 사이 랜덤
	}
}
