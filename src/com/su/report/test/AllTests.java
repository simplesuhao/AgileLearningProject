package com.su.report.test;

import junit.framework.TestSuite;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTestSuite(RosterReporterTest.class);
		return suite;
	}
}
