
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* ù��° �ǽ�
		System.out.println("Hello World...");
		System.out.println("11111111111");
		System.out.println("22222222222");
		System.out.println("333333333333");
		*/
		/*
		//ǥ�� ����� Ŭ���� (���)
		System.out.print(7);			//print() �޼ҵ�� �� �ٲ��� ���� �ʴ´�.
		System.out.println(3);
		System.out.println(3.14);		//�Ǽ� ���
		System.out.println("�ڹ�!!!");	//���ڿ� ���
		System.out.println("���ڿ������� " + "���ᵵ �����մϴ�.");
		System.out.println("����" + 3 + 7 + "�� ���ڿ��� ���ᵵ �����մϴ�.");
		System.out.println(3 + 7 + " �̹� �����....");
		*/
		
		/*
		//printf ���Ĺ��� (%d, %f, %c, %s)
		System.out.printf("���� ù��° %d, ���� �ι�° %d �Դϴ�.%d \n", 10, 20, 5);
		System.out.printf("�Ǽ� %f �Դϴ�. \n", 26.123456);
		//�Ǽ��� �Ҽ��� ��°�ڸ������� ���
		System.out.printf("�Ҽ��� ��°�ڸ� �Ǽ� %.2f �Դϴ�. \n", 26.123456);
		System.out.println();
		System.out.printf("���� %c �Դϴ�. \n", 'A');
		System.out.printf("���� %c �Դϴ�. \n", '��');
		System.out.printf("���ڿ� %s �Դϴ�. \n", "�׽�Ʈ");
		System.out.println();
		*/
		
		/*
		��� ��) ������ ����ϸ� ��� ��� ��µ˴ϴ�.
			   10 + 5 = 15
			   �� ������ 2005�� 5�� 8�� �Դϴ�.
			   
		��) printf �޼��� ���
			2��°�� ����� => 10, 5, 10 + 5
			3��°�� ����� => 2016-11, 5, 8
		
		System.out.printf("%s \n", "������ ����ϸ� ��� ��� ��µ˴ϴ�.");
		System.out.printf("%d + %d = %d \n", 10, 5, 10 + 5);
		System.out.printf("�� ������ %d�� %d�� %d�� �Դϴ�.", 2016 - 11, 5, 8);
		*/
		
		/*
		//���ʰ� ������ ����
		System.out.printf("���ڰ� [%8d] �Դϴ�. \n", 123); 		//���� ������ ����
		System.out.printf("���ڰ� [%-8d] �Դϴ�. \n", 123); 	//���� ���� ����
		System.out.printf("���ĺ� [%10s] �Դϴ�. \n", "abc");	//���� ������ ����
		System.out.printf("���ĺ� [%-10s] �Դϴ�. \n", "abc");	//���� ���� ����
		*/
		
		/*
		��� ��) subject            score
			  =========================
			     korea               90			   
			   english              100
			  computer               80
			  
		��) printf �޼��带 �̿��Ͽ� ""���� ���Ĺ��ڿ� �ٹٲ޸� ����.
		   subject�� score ���̿� ���� 5�� ����.
		   subject�� ���� 8�ڸ� (%8s), socre ���� 6�ڸ�(%6d)�� ����
		   ��) System.out.printf("%s \n", "=========================");
		*/
		System.out.printf("%8s     %6s \n", "subject", "score");
		System.out.printf("%s \n", "===================");
		System.out.printf("%8s     %6d \n", "korea", 90);
		System.out.printf("%8s     %6d \n", "english", 100);
		System.out.printf("%8s     %6d \n", "computer", 80);
		
	}
	
}
/*
class Hello2 {
	
	public static void main(String[] args) {
		System.out.println("Hello world...22222");
	}
	
}
*/