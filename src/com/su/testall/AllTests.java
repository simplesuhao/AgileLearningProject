package com.su.testall;

import junit.framework.TestSuite;

public class AllTests {
	public static TestSuite suite(){
		TestSuite suite = new TestSuite();
		suite.addTest(AllTests.suite());
		suite.addTest(com.su.studentinfo.test.AllTests.suite());
		return suite;
	}
}
