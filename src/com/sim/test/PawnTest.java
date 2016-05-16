package com.sim.test;

import com.sim.student.Pawn;

public class PawnTest extends junit.framework.TestCase{
	public void testCreate(){
		Pawn pawn = new Pawn("white");
		String color = pawn.getColor();
		assertEquals("white", color);
	}
}
