package model;
/**Real Class Player.
 * @author Alivia Dewi Parahita
 *
 */

public class Player {
  //atribut
  /** Attribut name yang adalah Nama dari Player.
   */
  private String name;
  /** Attribut point yang adalah Jumlah poin dari Player.
   */
  private int point;
  
  //method
  /** Constructor dari Player.
   * Menghidupkan object Player.
   * 
   */
  public Player() {
    name = "null";
    point = -999;
  }
  
  /** Getter nama dari Player.
   * 
   * @return String : nama dari Player
   */
  public String getName() {
    return name;
  }
  
  /** Getter point dari Player.
   * 
   * @return int : point dari Player
   */
  public int getPoint() {
    return point;
  }

  /** Setter nama dari Player.
   * I.S : Player terdefinisi
   * F.S : atribut nama Player berubah sesuai input user
   * 
   * @param inputName String adalah input nama dari user
   */
  public void setName(String inputName) {
    name = inputName;
  }

  /** Setter point dari Player.
   * I.S : Player terdefinisi
   * F.S : atribut poin Player berubah sesuai input user
   * 
   * @param inputPoint String adalah input poin dari user
   */
  public void setPoint(int inputPoint) {
    point = inputPoint;
  }
}
