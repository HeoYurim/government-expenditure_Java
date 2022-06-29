package ch11.calendarTest;

import java.util.*;

public class CalendarEx {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("America/Chicago");
		Calendar now = Calendar.getInstance(timeZone);
		
		//.get() 메소드를 이용하여 날짜와 시간에 대한 정보를 얻는다.
		int year = now.get(Calendar.YEAR); //년도를 리턴
		int month = now.get(Calendar.MONTH) + 1; //0부터 월이 세짐
		int day = now.get(Calendar.DAY_OF_MONTH); //일을 리턴
		int week = now.get(Calendar.DAY_OF_WEEK); //요일을 리턴
		
		String strWeek = null;
		switch(week) {
			case Calendar.MONDAY :{
				strWeek = "월";
				break;
			}
			case Calendar.TUESDAY :{
				strWeek = "화";
				break;
			}
			case Calendar.WEDNESDAY :{
				strWeek = "수";
				break;
			}
			case Calendar.THURSDAY :{
				strWeek = "목";
				break;
			}
			case Calendar.FRIDAY :{
				strWeek = "금";
				break;
			}
			case Calendar.SATURDAY :{
				strWeek = "토";
				break;
			}
			default:{
				strWeek = "일";
			}
		}
		
		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.println(strWeek + "요일 ");
		
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		}else {
			strAmPm = "오후";
		}
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.println(second + "초 ");;
	}

}
