package com.su.report;

import java.util.ArrayList;

import com.su.studentinfo.CourseSession;

public class CourseReport {
	private ArrayList<CourseSession> sessions = new ArrayList<>();
	public void add(CourseSession session){
		sessions.add(session);
	}
	
	public String text(){
		StringBuffer builder = new StringBuffer();
		for (CourseSession session : sessions) {
			builder.append(
					session.getDepartment() + " " + 
					session.getNumber() + RosterReporter.NEWLINE);
		}
		return builder.toString();
	}
}
