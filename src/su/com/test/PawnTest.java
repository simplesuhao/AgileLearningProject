package su.com.test;

import su.com.Board;
import su.com.Pawn;


public class PawnTest extends junit.framework.TestCase{
	public void testCreate(){
		Pawn pawn = new Pawn("white");
		Pawn pawn2 = new Pawn();
		String color = pawn.getColor();
		assertEquals("white", color);
		assertEquals("white", pawn2.getColor());
	}
	public void testBoard(){
		Board board = new Board();
		assertEquals("", );
	}
}
