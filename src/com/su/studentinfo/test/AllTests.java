package com.su.studentinfo.test;

import junit.framework.TestSuite;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(StudentTest.class);
		suite.addTestSuite(CourseSessionTest.class);
		//suite.addTestSuite(RosterReporterTest.class);
		suite.addTestSuite(DateUtilTest.class);;
		return suite;
	}
}
  