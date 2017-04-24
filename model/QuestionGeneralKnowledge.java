package model;
/**Real Class QuestionGeneralKnowledge.
 * @author Alivia Dewi Parahita
 *
 */

public class QuestionGeneralKnowledge extends Question {
  
  /** Constructor dari QuestionGeneralKnowledge.
   * Menghidupkan object QuestionGeneralKnowledge.
   * 
   * @param inputPertanyaan String adalah input untuk atribut Pertanyaan
   * @param inputJawaban String adalah input untuk atribut Jawaban
   * @param inputLevel integer adalah input untuk atribut level
   */
  public QuestionGeneralKnowledge(String inputPertanyaan, String inputJawaban, int inputLevel) {
    super(inputPertanyaan,inputJawaban,inputLevel,2);
  }

}
