package model;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author aliviaprht
 *
 */

public class QuestionMathTest {
  private QuestionMath testQuestion = 
      new QuestionMath("2+2","4",1);
  
  /**
   * Test method for getPertanyaan .
   */
  @Test
  public void testGetPertanyaan() {
    assertEquals("getPertanyaan() Error!", "2+2", testQuestion.getPertanyaan());
  }
  
  /**
   * Test method for getJawaban .
   */
  @Test
  public void testGetJawaban() {
    assertEquals("getJawaban() Error!", "4", testQuestion.getJawaban());
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
    assertEquals("getType() Error!", 1, testQuestion.getType());
  }

}
