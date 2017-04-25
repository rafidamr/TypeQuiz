package controller;

import java.io.IOException;
import model.Player;


/**Real Class PlayGame.
 * @author M. Akmal Pratama, Alivia Dewi Parahita
 *
 */

public class PlayGame {
  private Player player;
  private Matcher matcher;
  private QuestionHandler questionhandler;
  private HighScore highscore;
  private int level;
  private boolean main;
  
  /** Constructor PlayGame.
   * 
   *
   */
  public PlayGame() throws IOException {
    player = new Player();
    matcher = new Matcher();
    level = 1;
    highscore = new HighScore();
    highscore.loadHighScore();
    questionhandler = new QuestionHandler(level);
    main = true;
    
  }
  
  public boolean isMain() {
    return main;
  }
  
  public void awalGame() throws IOException {
    questionhandler.drawQuestion();
  }
  
  public QuestionHandler getQueHand() {
    return questionhandler;
  }
  
  public void checkMatch(String jawabanUser,int index) {
    matcher.setKeyAnswer(questionhandler.getData(index));
    matcher.setUserAnswer(jawabanUser);
    matcher.countScore();
    player.setPoint(player.getPoint() + matcher.getScore());
  }
  
  public Matcher getMatcher() {
    return matcher;
  }
  
  public Player getPlayer() {
    return player;
  }
  
  public HighScore getHighscore() {
    return highscore;
  }
  
  public void generateQueHand(int level) throws IOException {
    questionhandler.setLevel(level);
    questionhandler.drawQuestion();
  }
  
}