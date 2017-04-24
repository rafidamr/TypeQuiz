package controller;
package model;

/**Real Class Player.
 * @author M. Akmal Pratama
 *
 */

public class PlayGame {
  private Player player;
  private Matcher matcher;
  private QuestionHandler questionhandler;
  private Highcore highscore;
  private int level;
  private boolean main;

  public PlayGame() {
      player = new Player();
      matcher = new Matcher();
      level = 1;
      highscore = new Highscore();
      highscore.loadHighScore();
      questionhandler = new QuestionHandler(level);
      main = true;
  }

  public void initGame() {
    questionhandler.drawQuestion();
    int count = 0;

    while(msin && count < 30) {

    }
  }




}