package controller;

import model.Question;

/**Real Class Matcher.
 * @author Vigor Akbar
 *
 */
public class Matcher {
  //atribut
  /** Attribut keyAnswer adalah sebuah Question.
   * Digunakan untuk mencocokkan jawaban
   */
  private Question keyAnswer;
  /**
   * Attribut userAnswer adalah sebuah String.
   * Berupa input dari user yang akan dicocokkan
   */
  private String userAnswer;
  /**
   * Attribut score adalah hasil perolehan score.
   * didapat dari pencocokan jawaban dengan kuncinya
   */
  private int score;

  /**
   * Atribut correct adalah boolean kebenaran jawaban user
   */
  private boolean correct;

  /**
   * Constructor tanpa parameter dari Matcher.
   * Menghidupkan objek Matcher.
   */
  public Matcher() {
    keyAnswer = new Question();
    userAnswer = "";
    score = 0;
  }

  /**
   * Constructor dengan parameter dari Matcher.
   * Menghidupkan objek Matcher.
   * @param keyAnswer Question adalah input Question yang digunakan
   * @param userAnswer String dari masukan pengguna
   */
  public Matcher(Question keyAnswer, String userAnswer) {
    this.keyAnswer = keyAnswer;
    this.userAnswer = userAnswer;
    score = 0;
  }

  /**
   * Getter Question dari keyAnswer.
   * @return Question : Question yang digunakan untuk mencocokkan
   */
  public Question getKeyAnswer() {
    return keyAnswer;
  }

  /**
   * Getter dari userAnswer.
   * @return String : jawaban dari user
   */
  public String getUserAnswer() {
    return userAnswer;
  }

  /**
   * Getter dari Score.
   * @return integer : nilai dari score
   */
  public int getScore() {
    return score;
  }

  /**
   * Getter dari correct
   * @return boolean : nilai kebenaran jawaban
   */
  public boolean getCorrect() {
    return correct;
  }

  /**
   * Setter dari keyAnswer.
   * @param keyAnswer : Question yang akan di masukkan ke keyAnswer
   */
  public void setKeyAnswer(Question keyAnswer) {
    this.keyAnswer = keyAnswer;
  }

  /**
   * Setter dari userAnswer.
   * @param userAnswer String masukkan dari pengguna yang akan di set ke userAnswer
   */
  public void setUserAnswer(String userAnswer) {
    this.userAnswer = userAnswer;
  }

  /**
   * Prosedur countScore mengembalikan nilai integer berupa hasil perhitungan score
   * I.S : Matcher terdefinisi
   * F.S : atribut score terisi sesuai benar tidaknya jawaban user
   */
  public void countScore() {
    if (keyAnswer.getType() == 1) {
      if (keyAnswer.getJawaban().equalsIgnoreCase(userAnswer)) {
        score = keyAnswer.getLevel() * 10;
        correct = true;
      } else {
        correct = false;
        score = 0;
      }
    } else if (keyAnswer.getType() == 2) {
      if (keyAnswer.getJawaban().equalsIgnoreCase(userAnswer)) {
        score = keyAnswer.getLevel() * 10;
        correct = true;
      } else {
        correct = false;
        score = 0;
      }
    } else {
      if (keyAnswer.getJawaban().equalsIgnoreCase(userAnswer)) {
        score = keyAnswer.getLevel() * 10;
        correct = true;
      } else {
        score = 0;
        correct = false;
      }
    }
  }
}
