package com.su.report;

import java.util.ArrayList;
import java.util.Collections;

import com.su.studentinfo.CourseSession;

public class CourseReport {
	private ArrayList<CourseSession> sessions = new ArrayList<>();
	public void add(CourseSession session){
		sessions.add(session);
	}
	
	public String text(){
		Collections.sort(sessions);
		StringBuffer builder = new StringBuffer();
		for (CourseSession session : sessions) {
			builder.append(
					session.getDepartment() + " " + 
					session.getNumber() + RosterReporter.NEWLINE);
		}
		return builder.toString();
	}
}
