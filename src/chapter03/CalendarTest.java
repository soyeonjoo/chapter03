package chapter03;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		printDate(calendar);
		
//		calendar.set(2017, 1,1); // 날짜를 바꿀수있다.
		printDate(calendar);
		
		//년도만 바꾸기		
		calendar.set(Calendar.YEAR, 2017);  
		printDate(calendar);
		
		
		//기념일 계산 태어난지 10000일이 되는날m
		calendar.set(1993, 12, 25);
		calendar.add(Calendar.DATE,10000);
		printDate(calendar);
		
		//오늘 날자로 다시 맞추기
		calendar = Calendar.getInstance();
	
		//10달전 찾기
		calendar.add(Calendar.MONTH, -10);
		printDate(calendar);
	
		//오늘은 올해의 몇일 째 되는날?
		calendar = Calendar.getInstance();
		System.out.println("오늘은 올 해 "+calendar.get(Calendar.DAY_OF_YEAR)+"일 째 되는 날 입니다.");
	}
	public static void printDate(Calendar calendar){
		final String [] DAYS = { "일", "월", "화", "수", "목", "금", "토"};
		System.out.print((calendar.get(Calendar.YEAR))+"년 "); //f3눌러보면 year 는 상수로 final로 
		System.out.print((calendar.get(Calendar.MONTH)+1 ) +"월 " );
		System.out.print(calendar.get(Calendar.DATE)+"일 " );
		
		System.out.print(DAYS [calendar.get(Calendar.DAY_OF_WEEK) -1]+"요일 "); //1빼줘야함
		System.out.print((calendar.get(Calendar.AM_PM)==0 ? " AM":"PM")+" ");
		System.out.print(calendar.get(Calendar.HOUR)+":");
		System.out.print(calendar.get(Calendar.MINUTE)+ ":");
		System.out.println(calendar.get(Calendar.SECOND));
	}
}
