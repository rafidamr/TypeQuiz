package controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Muhammad Rafid A
 *
 */
public class MatcherTest {

	private Matcher MTest = new Matcher();
	
	/**
	 * Test method for getScore .
	 */
	@Test
	public void getScoreTest() {
		assertEquals(0, MTest.getScore());
	}

}
