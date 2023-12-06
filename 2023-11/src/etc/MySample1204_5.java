package etc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MySample1204_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File��ü�� �̿��Ͽ� Scanner����
		/*
		File file = new File("./temp/source_data.txt");
		
		Scanner sc = new Scanner(file);
		
		//������ ������ ���� ������ ���
		System.out.println(file.getName() + " ������ ������ ����");
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		*/
		
		/*
		//BufferedReader �̿�
		File file = new File("./temp/source_data.txt");
		FileReader reader = new FileReader(file);
		BufferedReader buffReader = new BufferedReader(reader);
		
		//���� ���� ���� ���� ���
		System.out.println(file.getName() + " ���� ������ ����");
		String data = null;
		
		while ((data = buffReader.readLine()) != null) {		//while(data != null)
			System.out.println(data.toString());
		}
		
		//�Է½�Ʈ�� ����
		reader.close();
		buffReader.close();
		*/
		
		String filePath = "./temp/source_data.txt";
		
		File file = new File(filePath);
		
		if (!file.exists()) {		//���� ���� ���� Ȯ��(�ش� ������ ���� ��� ����)
			file.createNewFile();	//���� ����
		}
		
		//BufferedWriter ����
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		
		//���Ͽ� ����
		writer.newLine();
		writer.write("�� �������̴�");
		writer.newLine();
		writer.write("��ſ� ���ɽð��Դϴ�");
		writer.newLine();
		
		//���� �� ��Ʈ�� ����
		writer.flush();		//���ۿ� ���� �����͸� ��� ����
		writer.close();		//��Ʈ�� ����
	}

}
