package com.lesson2;

import java.util.ArrayList;

import com.lesson1.Student;

import junit.framework.TestCase;

public class CourseSessionTest extends TestCase{
	private CourseSession session;
	public void setUp(){
		session = new CourseSession("ENGL", "101");
	}
	public void testCreate(){
		assertEquals("ENGL", session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
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
}
