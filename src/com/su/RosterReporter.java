package com.su;

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
		buffer.append(ROSTER_REPORT_HEADER);
		
		for (Student student : session.getStudents()) {
			buffer.append(student.getName());
			buffer.append(NEWLINE);
		}
		buffer.append(ROSTER_REPORT_FOOTER + session.getStudents().size() + NEWLINE);
		return buffer.toString();
	}
}
