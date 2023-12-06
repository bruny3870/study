package etc;

import java.io.File;
import java.io.IOException;

public class MySample1204_4 {

	public static void main(String[] args) throws IOException {		//메소드 예외처리
		// TODO Auto-generated method stub
		//File클래스
		File directory = new File("./temp");		//상대경로
//		File directory = new File("C:\\project\\JAVA\\MyProject\\temp");		//절대경로
		directory.mkdir();		//디렉토리 생성
		
		//temp디렉토리에 temp_file.txt파일 생성
		File file = new File(directory, "temp_file.txt");
		file.createNewFile();		//파일 생성
		
		//생성file 객체가 디렉토리인지 파일인지 확인
		if (directory.isDirectory()) {
			System.out.println(directory.getName() + "은(는) 디렉토리 입니다");
		}
		
		if (file.isFile()) {
			System.out.println(file.getName() + "은(는) 파일입니다");
			System.out.println("파일 경로 : " + file.getPath());
			System.out.println("파일 크기 : " + file.length() + "(byte)");
			
			System.out.println("쓰기 가능여부 : " + file.canWrite());
			System.out.println("읽기 가능여부 : " + file.canRead());
		}
		
		//파일 삭제
		if (file.delete()) {
			System.out.println(file.getName() + "이(가) 삭제 되었습니다");
		}
		
		//디렉토리 삭제
		if (directory.delete()) {
			System.out.println(directory.getName() + " 디렉토리가 삭제 되었습니다");
		}
	}

}
