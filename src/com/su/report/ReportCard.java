package com.su.report;

import java.util.EnumMap;
import java.util.Map;

import com.su.studentinfo.Student;
import com.su.studentinfo.Student.Grade;

public class ReportCard {
	public static final  String A_MESSAGE = "Excellent";
	public static final  String B_MESSAGE = "Very Good";
	public static final  String C_MESSAGE = "Hmmm����";
	public static final  String D_MESSAGE = "you're not trying";
	public static final  String F_MESSAGE = "Loser";
	
	private Map<Student.Grade, String> messages = null;
	public String getMessage(Student.Grade grade){
		return getMessage().get(grade);
	}
	public Map<Student.Grade, String> getMessage(){
		if (messages == null) {
			loadMessages();
		}
		return messages;
	}
	private void loadMessages(){
		messages = new EnumMap<Student.Grade, String>(Student.Grade.class);
		messages.put(Student.Grade.A, A_MESSAGE);
		messages.put(Student.Grade.B, B_MESSAGE);
		messages.put(Student.Grade.C, C_MESSAGE);
		messages.put(Student.Grade.D, D_MESSAGE);
		messages.put(Student.Grade.F, F_MESSAGE);
	}
}
