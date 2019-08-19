package chapter03;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		Date now = new Date();
		
		System.out.println(now);
		printDate1(now);
		printDate2(now);
		
		
	}
	
	// 보편적인 사용방식
	public static void printDate1(Date d) {
		SimpleDateFormat sdf =
				new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		
		String s = sdf.format(d);
		System.out.println(s);
	}
	
	// Date 값들을 하나씩 뽑아온다.
	public static void printDate2(Date d) {
		// 년도(+1900)
		int year = d.getYear();
		
		// 월(0-11, +1)
		int month = d.getMonth();
		
		// 일
		int date = d.getDate();
		
		// 시
		int hours = d.getHours();
		
		// 분
		int minutes = d.getMinutes();
		
		// 초
		int seconds = d.getSeconds();
		
		System.out.println(
					(year+1900) + "-" +
					(month+1) + "-" +
					date + " " +
					hours + ":" +
					minutes + ":" +
					seconds);
	}

}
