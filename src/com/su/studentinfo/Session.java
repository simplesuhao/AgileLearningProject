package com.su.studentinfo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


abstract public class Session implements Comparable<Session>{
	private String department;
	private String number;
	private Date startDate;
	private ArrayList<Student> students = new ArrayList<>();
	private static int count;
	private int numberOfCredits;
	
	protected Session(String department, String number, Date startDate){
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}
	
	public int compareTo(CourseSession courseSession) {
		int compare = this.getDepartment().compareTo(courseSession.getDepartment());
		if (compare == 0) {
			compare = this.getNumber().compareTo(courseSession.getNumber());
		}
		return compare;
	}
	
	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}
	
	
	
	public int getNumberOfCredits() {
		return numberOfCredits;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}
	public static void resetCount(){
		count = 0;
	}
	public static int getCount() {
		return count;
	}

	abstract protected int getSessionLength();
	
	public Date getEndDate(){
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(getStartDate());
		final int daysInWeek = 7;
		final int daysFromFridayToMonday = 3;
		int numberOfDays = getSessionLength() * daysInWeek - daysFromFridayToMonday;
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
		student.addCredits(numberOfCredits);
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
	
}
