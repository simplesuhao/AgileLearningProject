package com.su.studentinfo.test;

import com.su.studentinfo.Student;


public class StudentTest extends junit.framework.TestCase{
	public void testCreate(){
		Student student = new Student("jane Doe");
		String studentName = student.getName();
		assertEquals("jane Doe", studentName);
	}
}
