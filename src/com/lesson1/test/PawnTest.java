package com.lesson1.test;

import com.lesson1.Pawn;


public class PawnTest extends junit.framework.TestCase{
	public void testCreate(){
		Pawn pawn = new Pawn("white");
		String color = pawn.getColor();
		assertEquals("white", color);
	}
}
