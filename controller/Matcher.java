import model.Question;

/**
 * Created by asuspc on 4/24/2017.
 */
public class Matcher {
  Question keyAnswer;
  String userAnswer;
  int score;

  public Matcher() {
    keyAnswer = new Question();
    userAnswer = "";
    score = 0;
  }
  public Matcher(Question keyAnswer, String userAnswer) {
    this.keyAnswer = keyAnswer;
    this.userAnswer = userAnswer;
    score = 0;
  }
  public Question getKeyAnswer() {
    return keyAnswer;
  }
  public String getUserAnswer() {
    return userAnswer;
  }
  public void setKeyAnswer(Question keyAnswer) {
    this.keyAnswer = keyAnswer;
  }
  public void setUserAnswer(String userAnswer) {
    this.userAnswer = userAnswer;
  }
  public int countScore() {
    if (keyAnswer.getType() == 1) {
      if (keyAnswer.getJawaban().equals(userAnswer)) {
        score = keyAnswer.getLevel()*10;
      }
    } else if (keyAnswer.getType() == 2) {
      if (keyAnswer.getJawaban().equalsIgnoreCase(userAnswer)) {
        score = keyAnswer.getLevel()*10;
      }
    } else {
      if (keyAnswer.getJawaban().equals(userAnswer)) {
        score = keyAnswer.getLevel()*10;
      }
    }
    return score;
  }
}
