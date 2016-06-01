package com.su.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.su.DateUtil;

import junit.framework.TestCase;

public class DateUtilTest extends TestCase{
	public void testCreateDate(){
		Date date = new DateUtil().createDate(2000, 1, 2);
		Calendar calendar = new GregorianCalendar();
		calendar.setTime(date);
		assertEquals(2000, calendar.get(Calendar.YEAR));
		assertEquals(Calendar.JANUARY, calendar.get(Calendar.MONTH));
		assertEquals(1, calendar.get(Calendar.DAY_OF_MONTH));
	}
}
