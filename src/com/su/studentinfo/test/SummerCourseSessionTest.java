package com.su.studentinfo.test;

import java.util.Date;

import com.su.studentinfo.CourseSession;
import com.su.studentinfo.DateUtil;
import com.su.studentinfo.SummerCourseSession;

import junit.framework.TestCase;

public class SummerCourseSessionTest extends TestCase{
	public void testEndDate(){
		Date startDate = DateUtil.createDate(2003, 6, 9);
		CourseSession session = SummerCourseSession.create("ENGL","200",startDate);
		Date eightWeeksOut = DateUtil.createDate(2003, 8, 1);
		assertEquals(eightWeeksOut, session.getEndDate());
	}
}
