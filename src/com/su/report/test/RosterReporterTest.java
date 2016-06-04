package com.su.report.test;

import junit.framework.TestCase;
import static com.su.report.RosterReporter.NEWLINE;

import com.su.report.RosterReporter;
import com.su.studentinfo.CourseSession;
import com.su.studentinfo.DateUtil;
import com.su.studentinfo.Student;

public class RosterReporterTest extends TestCase{
	public void testRosterReport(){
		CourseSession session = new CourseSession("ENGL", "101", new DateUtil().createDate(2003, 1, 6));
		session.enroll(new Student("A"));
		session.enroll(new Student("B"));
		
		String rosterReport = new RosterReporter(session).getReport();
		assertEquals(
				RosterReporter.ROSTER_REPORT_HEADER 
				+ "A" + NEWLINE
				+ "B" + NEWLINE
				+ RosterReporter.ROSTER_REPORT_FOOTER + "2" + NEWLINE, rosterReport);
	}
	
/*	public Date createDate(int year,int month,int date){
		//return new Date(year-1900, month - 1, date);
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month - 1 );
		calendar.set(Calendar.DAY_OF_MONTH, date);
		return calendar.getTime();
	}*/
}
