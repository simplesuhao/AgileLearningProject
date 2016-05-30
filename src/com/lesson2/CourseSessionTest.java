package com.lesson2;

import java.util.ArrayList;
import java.util.Date;

import com.lesson1.Student;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase{
	private CourseSession session;
	private Date startDate;
	public void setUp(){
		startDate = new Date(2003, 1, 6);
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
		int year = 103;
		int month = 3;
		int date = 25;
		Date sixteenWeeksOut = new Date(year, month, date);
		assertEquals(sixteenWeeksOut, session.getEndDate());
		
	}
	
	public Date createDate(int year,int month,int date){
		return new Date(year-1900, month - 1, date);
	}
	
}
