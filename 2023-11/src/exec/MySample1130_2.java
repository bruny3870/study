package exec;

import java.util.Scanner;

public class MySample1130_2 {
	static Scanner sc = new Scanner(System.in);
	
	//Ŭ���� �޼ҵ� (�޼ҵ� ����ó�� - �������ʿ��� ����ó��)
	static void ticketing(int age) throws AgeException {
		if (age < 20) {
			AgeException e = new AgeException("�����Է� ����");
			throw e;
//			throw new AgeException("�����Է� ����");
		}
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//����ó�� - ����� ����ó��
		/*
		System.out.print("���̸� �Է��ϼ��� => ");
		int age = sc.nextInt();
		
		try {
			ticketing(age);
			
		} catch (AgeException e) {
			e.printStackTrace();
		}
		
		System.out.println("main() �޼ҵ� ��");
		*/
		
		/*
		 ����) 20�� �̸��� �Է� �� ��� ����ؼ� �Է��� �ް�, 20�� �̻��� �ԷµǸ� "Ƽ�Ϲ��� ����" �̶�� ����ϰ� ���α׷� ����
		 */

		//while ���ѷ���
//		while (true) {
//			System.out.print("���̸� �Է��ϼ��� => ");
//			int age = sc.nextInt();
//			
//			try {
//				ticketing(age);
//				System.out.println("Ƽ�Ϲ��� ����");
//				break;
//				
//			} catch (AgeException e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		//for ���ѷ���
		for(;;) {
			System.out.print("���̸� �Է��ϼ��� => ");
			int age = sc.nextInt();
			
			try {
				ticketing(age);
				System.out.println("Ƽ�Ϲ��� ����");
				break;
				
			} catch (AgeException e) {
				e.printStackTrace();
			}
			
			//�̻ڰ� ó���� ������
			Thread.sleep(1000);		//1000 = 1��
			System.out.println();
		}
	}

}

class AgeException extends Exception {
	AgeException() {
		this("�����Է� ����");
	}
	
	AgeException(String msg) {
		super(msg);
	}
}
