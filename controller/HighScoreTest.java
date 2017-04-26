package controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Muhammad Rafid A
 *
 */
public class HighScoreTest {
	
	private HighScore HGTest = new HighScore();
	
	/**
	 * Test method for getTail and isEmpty .
	 */
	@Test
	public void isEmptyTest() {
		if(HGTest.getTail() == -1){
			assertEquals(true, HGTest.isEmpty());
		}else{
			assertEquals(false, HGTest.isEmpty());
		}
	}
	
	/**
	 * Test method for getTail .
	 */
	@Test
	public void getTailTest() {
		assertEquals(-1, HGTest.getTail());
	}
	
	/**
	 * Test method for getTail and isFull .
	 */
	@Test
	public void isFullTest() {
		if(HGTest.getTail() == 9){	
			assertEquals(true, HGTest.isFull());
		}else{
			assertEquals(false,HGTest.isFull());
		}
	}

}
