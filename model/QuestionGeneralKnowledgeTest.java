package model;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author aliviaprht
 *
 */

public class QuestionGeneralKnowledgeTest {
  private QuestionGeneralKnowledge testQuestion = 
      new QuestionGeneralKnowledge("Ibu kota Indonesia?","Jakarta",1);
  
  /**
   * Test method for getPertanyaan .
   */
  @Test
  public void testGetPertanyaan() {
    assertEquals("getPertanyaan() Error!", "Ibu kota Indonesia?", testQuestion.getPertanyaan());
  }
  
  /**
   * Test method for getJawaban .
   */
  @Test
  public void testGetJawaban() {
    assertEquals("getJawaban() Error!", "Jakarta", testQuestion.getJawaban());
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
    assertEquals("getType() Error!", 2, testQuestion.getType());
  }

}
