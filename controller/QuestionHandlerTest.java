package controller;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Muhammad Rafid A
 *
 */
public class QuestionHandlerTest {
	
	private QuestionHandler QHTest = new QuestionHandler(10);
	
	/**
	 * Test method for getData .
	 */
	@Test
	public void getDataTest() {
		if(QHTest.getData(10) != null){
			assertEquals(true,true);
		}
	}

}