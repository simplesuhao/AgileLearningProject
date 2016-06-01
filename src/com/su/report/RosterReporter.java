package com.su.report;

import com.su.studentinfo.CourseSession;
import com.su.studentinfo.Student;

public class RosterReporter {
	public static final String NEWLINE = System.getProperty("line.separator");
	public static final String ROSTER_REPORT_HEADER = "Student" + NEWLINE + "----" + NEWLINE;
	public static final String ROSTER_REPORT_FOOTER = NEWLINE + "#Students = ";
	
	private CourseSession session;
	public RosterReporter(CourseSession session){
		this.session = session;
	}
	public String getReport(){
		StringBuffer buffer = new StringBuffer();
		writeHeader(buffer);
		writeBody(buffer);
		writeFooter(buffer);
		return buffer.toString();
	}
	void writeHeader(StringBuffer buffer){
		buffer.append(ROSTER_REPORT_HEADER);
	}
	
	void writeBody(StringBuffer buffer){
		for (Student student : session.getStudents()) {
			buffer.append(student.getName());
			buffer.append(NEWLINE);
		}
	}
	
	void writeFooter(StringBuffer buffer){
		buffer.append(ROSTER_REPORT_FOOTER + session.getStudents().size() + NEWLINE);
	}
}
