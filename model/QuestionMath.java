package model;
/**Real Class QuestionMath.
 * @author Alivia Dewi Parahita
 *
 */

public class QuestionMath extends Question {
  
  /** Constructor dari QuestionMath.
   * Menghidupkan object QuestionMath.
   * 
   * @param inputPertanyaan String adalah input untuk atribut Pertanyaan
   * @param inputJawaban String adalah input untuk atribut Jawaban
   * @param inputLevel integer adalah input untuk atribut level
   */
  public QuestionMath(String inputPertanyaan, String inputJawaban, int inputLevel) {
    super(inputPertanyaan,inputJawaban,inputLevel,1);
  }

}
