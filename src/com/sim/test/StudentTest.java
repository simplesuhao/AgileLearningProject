package com.sim.test;

import com.sim.student.Student;

public class StudentTest extends junit.framework.TestCase{
	public void testCreate(){
		Student student = new Student("jane Doe");
		String studentName = student.getName();
		assertEquals("jane Doe", studentName);
	}
}
