package com.su.studentinfo;

import java.util.ArrayList;


public class Student {
	private String name;
	private int credits;
	public static final String IN_STATE = "CO";
	private String state = "";
	private ArrayList<Grade> grades = new ArrayList<Grade>();
	public static final int CREDITS_REQUIRED_FOR_FULL_TIME= 12;
	public enum Grade {
		A(4),
		B(3),
		C(2),
		D(1),
		F(0);
		private int points;
		Grade(int points) {
			this.points = points;
		}
		int getPoints(){
			return points;
		}
	}
	private boolean isHonors = false;
	private GradingStrategy gradingStrategy = new BasicGradingStrategy();
	public void setGradingStrategy(GradingStrategy gradingStrategy){
		this.gradingStrategy = gradingStrategy;
	}
	public boolean isHonors() {
		return isHonors;
	}
	public void setHonors() {
		isHonors = true;
	}
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
	public void addGrade(Grade grade){
		grades.add(grade);
	}
	public double getGpa(){
		if (grades.isEmpty()) {
			return 0.0;
		}
		double total = 0.0;
		for(Grade grade : grades){
			total += gradingStrategy.getGradePointsFor(grade);
		}
		return total/grades.size();
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
