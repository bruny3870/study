package etc;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MySample1204_5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File객체를 이용하여 Scanner생성
		/*
		File file = new File("./temp/source_data.txt");
		
		Scanner sc = new Scanner(file);
		
		//파일의 내용을 라인 단위로 출력
		System.out.println(file.getName() + " 파일의 데이터 내용");
		
		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
		*/
		
		/*
		//BufferedReader 이용
		File file = new File("./temp/source_data.txt");
		FileReader reader = new FileReader(file);
		BufferedReader buffReader = new BufferedReader(reader);
		
		//파일 내용 라인 단위 출력
		System.out.println(file.getName() + " 파일 데이터 내용");
		String data = null;
		
		while ((data = buffReader.readLine()) != null) {		//while(data != null)
			System.out.println(data.toString());
		}
		
		//입력스트림 종료
		reader.close();
		buffReader.close();
		*/
		
		String filePath = "./temp/source_data.txt";
		
		File file = new File(filePath);
		
		if (!file.exists()) {		//파일 존재 여부 확인(해당 파일이 없는 경우 생성)
			file.createNewFile();	//새로 생성
		}
		
		//BufferedWriter 생성
		BufferedWriter writer = new BufferedWriter(new FileWriter(file, true));
		
		//파일에 쓰기
		writer.newLine();
		writer.write("앗 월요일이다");
		writer.newLine();
		writer.write("즐거운 점심시간입니다");
		writer.newLine();
		
		//버퍼 및 스트림 정리
		writer.flush();		//버퍼에 남은 데이터를 모두 쓰기
		writer.close();		//스트림 종료
	}

}
