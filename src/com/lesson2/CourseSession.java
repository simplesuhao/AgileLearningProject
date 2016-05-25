package com.lesson2;

import java.util.ArrayList;

import com.lesson1.Student;

public class CourseSession {
	private String department;
	private String number;
	private ArrayList<Student> students = new ArrayList<>();
	public CourseSession(String department, String number) {
		super();
		this.department = department;
		this.number = number;
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

}
