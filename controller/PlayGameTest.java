package controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Muhammad Rafid A
 *
 */
public class PlayGameTest {
	
	private PlayGame PGTest;
	
	/**
	 * Test method for isMain .
	 */
	@Test
	public void isMainTest() {
		assertEquals(true, PGTest.isMain());
	}

}
