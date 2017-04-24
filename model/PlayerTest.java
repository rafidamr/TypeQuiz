/**
 * 
 */

package model;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author aliviaprht
 *
 */
public class PlayerTest {
  private Player testPlayer = new Player();
  
  /**
   * Test method for setName and getName .
   */
  @Test
  public void testSetName() {
    testPlayer.setName("alivia");
    assertEquals("setName() Error!", "alivia", testPlayer.getName());
  }

  /**
   * Test method for setPoint and getPoint .
   */
  @Test
  public void testSetPoint() {
    testPlayer.setPoint(27);
    assertEquals("setPoint() Error!", 27, testPlayer.getPoint());
  }

}
