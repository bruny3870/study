class Document {
	static int count = 0;
	String name;
	
	Document() {
		this("제목없음" + (++count));		//제목없이 출력되는 수 카운트
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + name + " 이 생성되었습니다.");
	}
}

public class MySample1117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//생성자
		Document d1 = new Document();
		Document d2 = new Document("자바.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}

}
