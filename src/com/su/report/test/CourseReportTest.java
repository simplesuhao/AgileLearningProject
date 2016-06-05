package com.su.report.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

import com.su.report.CourseReport;
import com.su.report.RosterReporter;
import com.su.studentinfo.CourseSession;

import junit.framework.TestCase;

public class CourseReportTest extends TestCase{
	public void testReport(){
		final Date date = new Date();
		CourseReport report = new CourseReport();
		report.add(CourseSession.create("ENGL", "101", date));
		report.add(CourseSession.create("CZEC", "200", date));
		report.add(CourseSession.create("ITAL", "410", date));
		report.add(CourseSession.create("CZEC", "220", date));
		report.add(CourseSession.create("ITAL", "330", date));
		assertEquals("CZEC 200" + RosterReporter.NEWLINE +
						"CZEC 220" + RosterReporter.NEWLINE + 
						"ENGL 101" + RosterReporter.NEWLINE +
						"ITAL 330" + RosterReporter.NEWLINE +
						"ITAL 410" + RosterReporter.NEWLINE, 
						report.text());
		
	}
	
	public void testSortStringsInPlace(){
		ArrayList<String> list = new ArrayList<>();
		list.add("Heller");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		Collections.sort(list);
		assertEquals("Boyle", list.get(0));
		assertEquals("Camus", list.get(1));
		assertEquals("Heller", list.get(2));
		assertEquals("Kafka", list.get(3));
	}
	
	public void testSortStringsInNewList(){
		ArrayList<String> list = new ArrayList<>();
		list.add("Heller");
		list.add("Kafka");
		list.add("Camus");
		list.add("Boyle");
		ArrayList<String> sortedList = new ArrayList<>(list);
		Collections.sort(sortedList);
		assertEquals("Boyle", sortedList.get(0));
		assertEquals("Camus", sortedList.get(1));
		assertEquals("Heller", sortedList.get(2));
		assertEquals("Kafka", sortedList.get(3));
		
		assertEquals("Heller", list.get(0));
		assertEquals("Kafka", list.get(1));
		assertEquals("Camus", list.get(2));
		assertEquals("Boyle", list.get(3));
	}
}
