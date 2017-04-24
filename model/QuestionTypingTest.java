package model;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author aliviaprht
 *
 */

public class QuestionTypingTest {
  private QuestionTyping testQuestion = 
      new QuestionTyping("Pineapple","Pineapple",1);
  
  /**
   * Test method for getPertanyaan .
   */
  @Test
  public void testGetPertanyaan() {
    assertEquals("getPertanyaan() Error!", "Pineapple", testQuestion.getPertanyaan());
  }
  
  /**
   * Test method for getJawaban .
   */
  @Test
  public void testGetJawaban() {
    assertEquals("getJawaban() Error!", "Pineapple", testQuestion.getJawaban());
  }
  
  /**
   * Test method for getLevel .
   */
  @Test
  public void testGetLevel() {
    assertEquals("getLevel() Error!", 1, testQuestion.getLevel());
  }
  
  /**
   * Test method for getType .
   */
  @Test
  public void testGetType() {
    assertEquals("getType() Error!", 3, testQuestion.getType());
  }

}
