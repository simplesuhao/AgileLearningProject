package com.su.studentinfo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SummerCourseSession extends CourseSession{
	@Override
	protected int getSessionLength(){
		return 8;
	}
	
	public static SummerCourseSession create(String department, String number,Date startDate){
		return new SummerCourseSession(department, number, startDate);
	}
	
	public SummerCourseSession(String department, String number, Date startDate) {
		super(department, number, startDate);
	}
	
	/*public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(getStartDate());
		int numberOfDays = 8 * 7 - 3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		Date endDate = calendar.getTime();
		return endDate;
	}*/
}
