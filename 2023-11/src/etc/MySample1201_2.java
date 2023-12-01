package etc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MySample1201_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SimpleDateFormat (날짜 데이터를 원하는 형태로 다양하게 출력
		Date today = new Date();
		
		SimpleDateFormat s1, s2, s3, s4;
		SimpleDateFormat s5, s6, s7, s8, s9;
		
		s1 = new SimpleDateFormat("yyyy-MM-dd");
		s2 = new SimpleDateFormat("yy년 MMM dd일 E요일");
		s3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.sss");	//H 24시간
		s4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");		//h 12시간, a 오전/오후
		
		s5 = new SimpleDateFormat("오늘은 올해의 D번째 날입니다");
		s6 = new SimpleDateFormat("오늘은 이달의 d번째 날입니다");
		s7 = new SimpleDateFormat("오늘은 올해의 w번째 주입니다");
		s8 = new SimpleDateFormat("오늘은 이달의 W번째 주입니다");
		s9 = new SimpleDateFormat("오늘은 이달의 F번째 E요일 입니다");
		
		System.out.println(s1.format(today));
		System.out.println(s2.format(today));
		System.out.println(s3.format(today));
		System.out.println(s4.format(today));
		
		System.out.println(s5.format(today));
		System.out.println(s6.format(today));
		System.out.println(s7.format(today));
		System.out.println(s8.format(today));
		System.out.println(s9.format(today));
		
		System.out.println();
		
		/*
		 y 년, M 월, d 일, E 요일, a 오전/오후
		 H 시간(24), h 시간(12), m 분, s 초
		 */
		String patternKorea = "yyyy-MM-dd";
		String patternUSA = "MM-dd-yyyy";
		String patternUK = "dd-MM-yyyy";
		String pattern1 = "E요일 HH시 mm분 ss초";
		
		SimpleDateFormat p1 = new SimpleDateFormat(patternKorea);
		SimpleDateFormat p2 = new SimpleDateFormat(patternUSA);
		SimpleDateFormat p3 = new SimpleDateFormat(patternUK);
		SimpleDateFormat p4 = new SimpleDateFormat(pattern1);
		
		System.out.println("현재 날짜 : " + today);
		System.out.println("한국형(년월일) : " + p1.format(today));
		System.out.println("미국형(월일년) : " + p2.format(today));
		System.out.println("영국형(일월년) : " + p3.format(today));
		System.out.println(p4.format(today));
	}

}
