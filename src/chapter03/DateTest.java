package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {
	public static void main (String[]args){
		Date now = new Date();
		
		//simpledateformat 사용  - 이게 더 좋다.. return 타입이 string이라서 값으로 사용은 못함 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd a hh:mm:ss");
		
	
		System.out.println(sdf.format(now));
		
		
		
		//시간 메소드 사용(deprecated)
		printDate(now);
		System.out.println(now.getYear()+1900); //1900 빼고 나와서 더해줘야함
	
		Date d =new Date(5092302993213L);
		printDate(d);
		
		 
	}
	
	public static void printDate(Date date){
		System.out.print((date.getYear()+1900)+"년 ");
		System.out.print((date.getMonth()+1)+"월 ");	
		System.out.print(date.getDate()+1+"일 ");
		System.out.print(date.getHours()+":");
		System.out.print(date.getMinutes()+":");
		System.out.print(date.getSeconds());
		
		
		
		System.out.println();
	}
	
}
