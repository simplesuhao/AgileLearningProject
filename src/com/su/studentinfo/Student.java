package com.su.studentinfo;


public class Student {
	private String name;
	private int credits;
	public static final String IN_STATE = "CO";
	private String state = "";
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
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
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
