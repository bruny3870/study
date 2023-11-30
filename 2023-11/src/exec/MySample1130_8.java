package exec;

import java.util.Calendar;

public class MySample1130_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Calendar클래스
		Calendar today = Calendar.getInstance();
		
		System.out.println("년도 : " + today.get(Calendar.YEAR));
		System.out.println("월, 1월(0) : " + today.get(Calendar.MONTH));
		System.out.println("올해의 몇째 주 : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이번달의 몇째 주 : " + today.get(Calendar.WEEK_OF_MONTH));
		System.out.println("이달의 몇일 : " + today.get(Calendar.DATE));
		System.out.println("올해의 몇일 : " + today.get(Calendar.DAY_OF_YEAR));
		System.out.println("요일1(일요일) : " + today.get(Calendar.DAY_OF_WEEK));
		System.out.println("이달의 몇째 요일 : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("오전/오후(0/1) : " + today.get(Calendar.AM_PM));
		System.out.println("시간(0~11) : " + today.get(Calendar.HOUR));			//12시
		System.out.println("시간(0~23) : " + today.get(Calendar.HOUR_OF_DAY));	//24시
		System.out.println("분(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("초(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("이달의 마지막 날 : " + today.getActualMaximum(Calendar.DATE));
			
		final String[] DAY_OF_WEEK = {"","일","월","화","수","목","금","토"};
		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		date1.set(2001, 3, 8);
		
		System.out.println("date1 = " + toString2(date1) + DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] + "요일 입니다");
		System.out.println("date2 = " + toString2(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + "요일 입니다");
		
		System.out.println();
		
		System.out.println("==== 1일 후 ====");
		date2.add(Calendar.DATE, 1);
		System.out.println(toString2(date2));
		
		System.out.println("==== 5달 전 ====");
		date2.add(Calendar.MONTH, -5);
		System.out.println(toString2(date2));
		
		System.out.println("==== 20일 후 ==== (roll)");	//roll 메소드 사용
		date2.roll(Calendar.DATE, 20);					//일은 변경하나 월은 변경되지 않음
		System.out.println(toString2(date2));
		System.out.println("==== 20일 후 ==== (add)");	//add 메소드 사용
		date2.add(Calendar.DATE, 20);					//일수에 의해 월도 함께 변경
		System.out.println(toString2(date2));
		
	}
	
	public static String toString2(Calendar date) {
		return date.get(Calendar.YEAR) + "년 " + (date.get(Calendar.MONTH) + 1) + "월 " + date.get(Calendar.DATE) + "일 ";
	}

}
