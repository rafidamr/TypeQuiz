package controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Muhammad Rafid A
 *
 */
public class GameControllerTest {
	
	private GameController GCTest;
	
	/**
	 * Test method for setLevel and getLevel .
	 */	
	@Test
	public void gameControllerLevelTest() {
		GCTest.setLevel(10);
		assertEquals(10, GCTest.getLevel());
	}
	
	/**
	 * Test method for setIndex and getIndex .
	 */
	@Test
	public void gameControllerIndexTest() {
		GCTest.setIndex(10);;
		assertEquals(10, GCTest.getIndex());
	}
	
	/**
	 * Test method for isMain .
	 */
	public void gameControllerMainTest() {
		boolean x;
		if(GCTest.isMain()){
			x = true;
			assertEquals(true, x);
		}else if(!GCTest.isMain()){
			x = false;
			assertEquals(false, x);
		}
	}

}
