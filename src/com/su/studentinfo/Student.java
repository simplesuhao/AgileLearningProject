package com.su.studentinfo;

import java.util.ArrayList;


public class Student {
	private String name;
	private int credits;
	public static final String IN_STATE = "CO";
	private String state = "";
	private ArrayList<String> grades = new ArrayList<String>();
	public static final int CREDITS_REQUIRED_FOR_FULL_TIME= 12;
	public Student(String name){
		this.name = name;
		credits = 0;
	}
	public boolean isFullTime(){
		return credits >= CREDITS_REQUIRED_FOR_FULL_TIME;
	}
	public boolean isInState(){
		return state.equals(Student.IN_STATE);
	}
	public void addCredits(int credits){
		this.credits += credits;
	}
	public void addGrade(String grade){
		grades.add(grade);
	}
	public double getGpa(){
		if (grades.isEmpty()) {
			return 0.0;
		}
		double total = 0.0;
		for(String grade : grades){
			total += gradePointsFor(grade);
		}
		return total/grades.size();
	}
	
	public int gradePointsFor(String grade){
		if (grade.equals("A")) {
			return  4;
		}else if (grade.equals("B")) {
			return  3;
		}else if (grade.equals("C")) {
			return  2;
		}else if(grade.equals("D")){
			return  1;
		}
		return 0;
	}
	
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
