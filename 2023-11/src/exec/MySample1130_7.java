package exec;

import java.util.StringJoiner;

public class MySample1130_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";		//문자열 리터럴 "abc"의 주소가 str1에 저장
		String str2 = "abc";		//문자열 리터럴 "abc"의 주소가 str2에 저장
									//결과적으로 str1과 str2는 문자열 "abc"를 같이 바라봄
		
		System.out.println("String str1 = \"abc\";");		//"" 쓸떄는 \" 를 사용해서 출력
		System.out.println("String str2 = \"abc\";");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("str1 == stt2 : " + (str1 == str2));		//String은 값을 체크
		System.out.println("str1.equals(str2) : " + str1.equals(str2));	//권장
		
		System.out.println();
		
		//new를 사용해서 객체생성하면 새로운 주소에 객체 생성
		String str3 = new String("\"abc\"");		//새로운 String 인스턴스 str3 생성
		String str4 = new String("\"abc\"");		//새로운 String 인스턴스 str4 생성
		
		System.out.println("str3");
		System.out.println("str4");
		
		System.out.println("str3 == stt4 : " + (str3 == str4));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));
		
		System.out.println();
		
		/*
		 확장형 for문
		 String[] arr = {"a", "b", "c"};
		 for (String s : arr)
		 */
		String animal = "dog,cat,bear";
		String[] arr = animal.split(",");
		
		for (String s : arr) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		System.out.println(String.join("-", arr));	//연결방법 선택해서 연결, for문 필요없음
		
		StringJoiner sj = new StringJoiner("/", "[", "]");	//중간구분, 시작구분, 마지막구문
		
		for (String s : arr) {
			sj.add(s);
		}
		
		System.out.println(sj.toString());
	}

}
