package com.su.test;

import com.su.Student;


public class StudentTest extends junit.framework.TestCase{
	public void testCreate(){
		Student student = new Student("jane Doe");
		String studentName = student.getName();
		assertEquals("jane Doe", studentName);
	}
}
