package exec;

import java.util.Calendar;

public class MySample1130_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("args.lengh : " + args.length);
		
		if (args.length != 2) {
			System.out.println("args 오류.... 년과 월을 입력 하세요");
			return;
		}
		
		//System.out.println("성공....");
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		Calendar sDay = Calendar.getInstance();		//시작일
		Calendar eDay = Calendar.getInstance();		//마지막일
		
		sDay.set(year, month-1, 1);
		
		//해당 월의 마지막날-입력 월의 마지막날 getActualMaximum 사용 
		eDay.set(year, month-1, sDay.getActualMaximum(Calendar.DATE));
		
		//1일이 속한 주의 일요일로 날짜 선정
		sDay.add(Calendar.DATE, -sDay.get(Calendar.DAY_OF_WEEK) + 1);
		
		//말일이 속한 주의 토요일로 날짜 선정
		eDay.add(Calendar.DATE, 7 - eDay.get(Calendar.DAY_OF_WEEK));
		
		System.out.println(year + "년 " + month + "월 ");
		System.out.println(" 일\t 월\t 화\t 수\t 목\t 금\t 토\t");
		
		//시작일부터 마지막일까지 (sDay <= eDay) 1일씩 증가 시키면서
		//일(Calendar.DATE) 출력
		int day; 
		
		for (int n = 1; sDay.before(eDay) || sDay.equals(eDay); sDay.add(Calendar.DATE, 1)) {
			day = sDay.get(Calendar.DATE);
			System.out.print((day < 10) ? (" " + day + "\t") : (day + "\t"));
			
			if (n++ % 7 == 0) {
				System.out.println();
			}
		}
	}

}
