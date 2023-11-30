package exec;

import java.util.StringJoiner;

public class MySample1130_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";		//���ڿ� ���ͷ� "abc"�� �ּҰ� str1�� ����
		String str2 = "abc";		//���ڿ� ���ͷ� "abc"�� �ּҰ� str2�� ����
									//��������� str1�� str2�� ���ڿ� "abc"�� ���� �ٶ�
		
		System.out.println("String str1 = \"abc\";");		//"" ������ \" �� ����ؼ� ���
		System.out.println("String str2 = \"abc\";");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1 == stt2 : " + (str1 == str2));		//String�� ���� üũ
		System.out.println("str1.equals(str2) : " + str1.equals(str2));	//����
		
		System.out.println();
		
		//new�� ����ؼ� ��ü�����ϸ� ���ο� �ּҿ� ��ü ����
		String str3 = new String("\"abc\"");		//���ο� String �ν��Ͻ� str3 ����
		String str4 = new String("\"abc\"");		//���ο� String �ν��Ͻ� str4 ����
		
		System.out.println("str3");
		System.out.println("str4");
		
		System.out.println("str3 == stt4 : " + (str3 == str4));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		System.out.println();
		
		/*
		 Ȯ���� for��
		 String[] arr = {"a", "b", "c"};
		 for (String s : arr)
		 */
		String animal = "dog,cat,bear";
		String[] arr = animal.split(",");
		
		for (String s : arr) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		System.out.println(String.join("-", arr));	//������ �����ؼ� ����, for�� �ʿ����
		
		StringJoiner sj = new StringJoiner("/", "[", "]");	//�߰�����, ���۱���, ����������
		
		for (String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());
	}

}
