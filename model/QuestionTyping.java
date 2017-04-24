package model;
/**Real Class QuestionTyping.
 * @author Alivia Dewi Parahita
 *
 */

public class QuestionTyping extends Question {
  
  /** Constructor dari QuestionTyping.
   * Menghidupkan object QuestionTyping.
   * 
   * @param inputPertanyaan String adalah input untuk atribut Pertanyaan
   * @param inputJawaban String adalah input untuk atribut Jawaban
   * @param inputLevel integer adalah input untuk atribut level
   */
  public QuestionTyping(String inputPertanyaan, String inputJawaban, int inputLevel) {
    super(inputPertanyaan,inputJawaban,inputLevel,3);
  }

}
