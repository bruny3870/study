import java.util.Scanner;

/*
 ����) �̸�, ����, ������ �Է� �޾� ȭ�鿡 ����ϸ�, �̸��� "��"�� �ԷµǸ� ����Ǵ� ���α׷�
 ��) �̸�, ����, ������ ���õ� ������ �޼ҵ带 ����Ͽ� �ۼ� (private)
 	���ڿ� �� => ������.equals("��");
 	�̸�, ����, ������ �����ϴ� Ŭ���� Person3
 	����ó�� => ���α׷� ���� ���ο� ������� msgPrint
 �Է� ��) �̸� => ȫ�浿
 		���� => 23
 		���� => ���α׷���
 ��� ��) ȫ�浿���� ���̴� 23�� �̸�, ������ ���α׷����Դϴ�.
 
 �Է� ��) �̸� => ��
 		���� => 22
 		���� => ���
 ��� ��) ���α׷��� �����մϴ�.
 */
class Person3 {
	private String name;
	private int age;
	private String job;
	
	Person3 () {
		this("", 0, "");
	}
	
	Person3 (String name, int age, String job) {
		setName(name);
		setAge(age);
		setJob(job);
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {		
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJob() {
		return this.job;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	//���α׷� ���Ῡ�ο� ���
	//return boolean
//	public boolean msgPrint() {
//		if (getName().equals("��")) {
//			System.out.println("���α׷��� ����Ǿ����ϴ�.");
//			return true;
//		} else {
//			System.out.println(getName() + " ���� ���̴� " + getAge() + "�� �̸�, ������ " + getJob() + " �Դϴ�.");
//			return false;
//		}
//	}
	
	//return int
	public int msgPrint() {
		if (getName().equals("��")) {
			System.out.println("���α׷��� ����Ǿ����ϴ�.");
			return 1;
		} else {
			System.out.println(getName() + " ���� ���̴� " + getAge() + "�� �̸�, ������ " + getJob() + " �Դϴ�.");
			return 0;
		}
	}
}

public class MySample1121_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���� ������
		/*
		 trim() : ���ڿ��� �� �հ� �� �� ���鸸 ����
		 replace(" ", "") : ���ڿ����� ù��° �μ��� ã�� �ι�° �μ��� ����
		 replaceAll(" ", "") : ���ڿ����� ù��° �μ��� ã�� �ι�° �μ��� ����
		 */
//		String tmp = "   ȫ�浿   ";
//		System.out.println("[" + tmp + "]");
//		System.out.println("trim() : [" + tmp.trim() + "]");
//		System.out.println("replace() : [" + tmp.replace(" ", "") + "]");		//������ ����������� ����
//		System.out.println("replaceAll() : [" + tmp.replaceAll(" ", "") + "]");
		//replace �� replaceAll �� �����
		
		Scanner sc = new Scanner(System.in);
		Person3 p = new Person3();			//while �ȿ� ����� ���� �������� �޸� ���� ����
		
		//���ѷ���
		while (true) {
			System.out.print("�̸� => ");
			p.setName(sc.next());			//nextLine()�޼ҵ�� ����Ű���� ������ �־� next()�޼ҵ� ���
			
			System.out.print("���� => ");
			p.setAge(sc.nextInt());
			
			System.out.print("���� => ");
			p.setJob(sc.next());
			
			//return boolean
//			if (p.msgPrint() == true) {
//				break;
//			}
			
			//return int
			if (p.msgPrint() == 1) {
				break;
			}
		}
	}

}
