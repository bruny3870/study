class Document {
	static int count = 0;
	String name;
	
	Document() {
		this("�������" + (++count));		//������� ��µǴ� �� ī��Ʈ
	}
	
	Document(String name) {
		this.name = name;
		System.out.println("���� " + name + " �� �����Ǿ����ϴ�.");
	}
}

public class MySample1117 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������
		Document d1 = new Document();
		Document d2 = new Document("�ڹ�.txt");
		Document d3 = new Document();
		Document d4 = new Document();
	}

}
