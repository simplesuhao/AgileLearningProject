package com.su.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.su.studentinfo.test.CourseSessionTest;

public class CourseSession {
	private String department;
	private String number;
	private Date startDate;
	private ArrayList<Student> students = new ArrayList<>();
	private static int count;
	public ArrayList<Student> getStudents() {
		return students;
	}
	public static void resetCount(){
		count = 0;
	}
	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		CourseSession.count = count;
	}

	public CourseSession(String department, String number) {
		super();
		this.department = department;
		this.number = number;
	}
	
	public CourseSession(String department, String number, Date startDate){
		super();
		this.department = department;
		this.number = number;
		this.startDate = startDate;
		CourseSession.incrementCount(); 
	}
	
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays = 16 * 7 - 3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		Date endDate = calendar.getTime();
		return endDate;
	}
	
	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void enroll(Student student){
		students.add(student);
	}
	
	public Student get(int index){
		return students.get(index);
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public int getNumberOfStudents(){
		return students.size();
	}
	private static void incrementCount(){
		count = count + 1;
	}
}
