package etc;

import java.io.File;
import java.io.IOException;

public class MySample1204_4 {

	public static void main(String[] args) throws IOException {		//�޼ҵ� ����ó��
		// TODO Auto-generated method stub
		//FileŬ����
		File directory = new File("./temp");		//�����
//		File directory = new File("C:\\project\\JAVA\\MyProject\\temp");		//������
		directory.mkdir();		//���丮 ����
		
		//temp���丮�� temp_file.txt���� ����
		File file = new File(directory, "temp_file.txt");
		file.createNewFile();		//���� ����
		
		//����file ��ü�� ���丮���� �������� Ȯ��
		if (directory.isDirectory()) {
			System.out.println(directory.getName() + "��(��) ���丮 �Դϴ�");
		}
		
		if (file.isFile()) {
			System.out.println(file.getName() + "��(��) �����Դϴ�");
			System.out.println("���� ��� : " + file.getPath());
			System.out.println("���� ũ�� : " + file.length() + "(byte)");
			
			System.out.println("���� ���ɿ��� : " + file.canWrite());
			System.out.println("�б� ���ɿ��� : " + file.canRead());
		}
		
		//���� ����
		if (file.delete()) {
			System.out.println(file.getName() + "��(��) ���� �Ǿ����ϴ�");
		}
		
		//���丮 ����
		if (directory.delete()) {
			System.out.println(directory.getName() + " ���丮�� ���� �Ǿ����ϴ�");
		}
	}

}
