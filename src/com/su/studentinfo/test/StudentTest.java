package com.su.studentinfo.test;

import org.omg.CORBA.StructMember;

import com.su.studentinfo.Student;


public class StudentTest extends junit.framework.TestCase{
	private static final double GRADE_TOLERANCE = 0.05;
	public void testCreate(){
		Student student = new Student("jane Doe");
		String studentName = student.getName();
		assertEquals("jane Doe", studentName);
	}
	
	public void testFullTime(){
		Student student = new Student("a");
		assertFalse(student.isFullTime());
	}
	
	public void testCredits(){
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		student.addCredits(4);
		assertEquals(7, student.getCredits());
	}
	
	public void testStudentStatus(){
		Student student = new Student("a");
		assertEquals(0, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(3);
		assertEquals(3, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(4);
		assertEquals(7, student.getCredits());
		assertFalse(student.isFullTime());
		
		student.addCredits(5);
		assertEquals(12, student.getCredits());
		assertEquals(Student.CREDITS_REQUIRED_FOR_FULL_TIME, student.getCredits());
		assertTrue(student.isFullTime());;
	}
	
	public void testInState(){
		Student student = new Student("a");
		assertFalse(student.isInState());
		student.setState(Student.IN_STATE);
		assertTrue(student.isInState());
		student.setState("MD");
		assertFalse(student.isInState());
	}
	
	public void testCalculateGpa(){
		Student student = new Student("a");
		assertGpa(student,0.0);
		student.addGrade("A");
		assertGpa(student,4.0);
		student.addGrade("B");
		assertGpa(student,3.5);
		student.addGrade("C");
		assertGpa(student,3.0);
		student.addGrade("D");
		assertGpa(student,2.5);
		student.addGrade("F");
		assertGpa(student,2.0);	
	}
	
	private void assertGpa(Student student,double expectedGpa){
		assertEquals(expectedGpa, student.getGpa(),GRADE_TOLERANCE);
	}
}
