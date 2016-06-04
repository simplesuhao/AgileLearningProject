package com.su.studentinfo.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import junit.framework.TestCase;

import com.su.report.RosterReporter;
import com.su.studentinfo.CourseSession;
import com.su.studentinfo.DateUtil;
import com.su.studentinfo.Student;

public class CourseSessionTest extends TestCase{
	private CourseSession session;
	private Date startDate;
	public void setUp(){
		startDate = new DateUtil().createDate(2003, 1, 6);
		session = new CourseSession("ENGL", "101",startDate);
		
	}
	public void testCreate(){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
		assertEquals(startDate, session.getStartDate());
	}
	public void testEnorllStudents(){
		Student student1 = new Student("Cain Divoe");
		session.enroll(student1);
		assertEquals(1, session.getNumberOfStudents());
			
		Student student2 = new Student("JACK");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
		
		assertEquals(student1, session.get(0));
		assertEquals(student2, session.get(1));
		
	}
	public void testCourseDates(){
		Date sixteenWeeksOut = new DateUtil().createDate(2003, 4, 25);
		assertEquals(sixteenWeeksOut, session.getEndDate());
		
	}
	
	public Date createDate(int year,int month,int date){
		//return new Date(year-1900, month - 1, date);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1 );
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
	}
	
	public void testRosterReport(){
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();;
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER 
				+ "A" + RosterReporter.NEWLINE
				+ "B" + RosterReporter.NEWLINE
				+ RosterReporter.ROSTER_REPORT_FOOTER + "2" + RosterReporter.NEWLINE, rosterReport);
	}
	public void testCount(){
		CourseSession.resetCount();
		createCourseSession();
		assertEquals(1, CourseSession.getCount());
		createCourseSession();
		assertEquals(2, CourseSession.getCount());
	}
	public CourseSession createCourseSession(){
		return new CourseSession("ENGL", "101",startDate);
	}
	
}
