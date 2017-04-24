package model;
/**Abstract Base Class Question.
 * @author Alivia Dewi Parahita
 *
 */


public class Question {
  //atribut
  /** Attribut pertanyaan yang adalah Pertanyaan dari Question.
   */
  private String pertanyaan;
  /** Attribut jawaban yang adalah Jawaban dari Question.
   */
  private String jawaban;
  /** Attribut level yang adalah Level dari Question.
   */
  private int level;
  /** Attribut type yang adalah Tipe dari Question.
   */
  private int type;
  
  //method
  public Question() {
    
  }
  
  /** Constructor dari Question.
   * Menghidupkan object Question.
   * 
   * @param inputPertanyaan String adalah input untuk atribut Pertanyaan
   * @param inputJawaban String adalah input untuk atribut Jawaban
   * @param inputLevel integer adalah input untuk atribut level
   * @param inputType integer adalah input untuk atribut type
   */
  public Question(String inputPertanyaan, String inputJawaban, int inputLevel, int inputType) {
    pertanyaan = inputPertanyaan;
    jawaban = inputJawaban;
    level = inputLevel;
    type = inputType;
  }
  
  /** Getter atribut pertanyan dari Question.
   * 
   * @return String : pertanyaan dari Question
   */
  public String getPertanyaan() {
    return pertanyaan;
  }
  
  /** Getter atribut jawaban dari Question.
   * 
   * @return String : jawaban dari Question
   */
  public String getJawaban() {
    return jawaban;
  }
  
  /** Getter atribut level dari Question.
   * 
   * @return int : level dari Question
   */
  public int getLevel() {
    return level;
  }
  
  /** Getter atribut type dari Question.
   * 
   * @return integer : type dari Question
   */
  public int getType() {
    return type;
  }

}
