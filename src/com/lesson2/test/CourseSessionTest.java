package com.lesson2.test;

import com.lesson1.Student;
import com.lesson2.CourseSession;

public class CourseSessionTest extends junit.framework.TestCase{
	public void testCreate(){
		CourseSession session = new CourseSession("ENGL","101");
		assertEquals("ENGL" ,session.getDepartment());
		assertEquals("101", session.getNumber());
		assertEquals(0, session.getNumberOfStudents());
	}
	public void testEnrollStudents(){
		CourseSession session = new CourseSession("ENGL", "101");
		Student student = new Student("Cain Divoe");
		session.enroll(student);
		assertEquals(1,session.getNumberOfStudents());
		
		Student student2 = new Student("Coralee DeVaughn");
		session.enroll(student2);
		assertEquals(2, session.getNumberOfStudents());
	}
}
