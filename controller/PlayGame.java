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
  
  /** Getter QuestionHandler dari PlayGame.
   * 
   * @return QuestionHandler : questionhandler dari PlayGame
   */
  public QuestionHandler getQueHand() {
    return questionhandler;
  }
  
  /**  Prosedur yang memanggil string matchin jawabanUser dgn kunciJawaban dari PlayGame.
   * I.S : PlayGame terdefinisi
   * F.S : atribut score dari player berubah sesuai dengan score yang didapat
   *  
   * @param jawabanUser String adalah input jawaban dari user
   * @param index integer adalah index pertanyaan yang ingin diperiksa
   */
  public void checkMatch(String jawabanUser,int index) {
    matcher.setKeyAnswer(questionhandler.getData(index));
    matcher.setUserAnswer(jawabanUser);
    matcher.countScore();
    player.setPoint(player.getPoint() + matcher.getScore());
  }
  
  /** Getter Matcher dari PlayGame.
   * 
   * @return Matcher: matcher dari PlayGame
   */
  public Matcher getMatcher() {
    return matcher;
  }
  
  /** Getter Player dari PlayGame.
   * 
   * @return Player: player dari PlayGame
   */
  public Player getPlayer() {
    return player;
  }
  
  /** Getter HighScore dari PlayGame.
   * 
   * @return HighScore: highscore dari PlayGame
   */
  public HighScore getHighscore() {
    return highscore;
  }
  
  /**  Prosedur yang me-generate pertanyaan dari PlayGame.
   * I.S : PlayGame terdefinisi
   * F.S : atribut questionhandler berisi dengan pertanyaan sesuai input level
   * 
   * @param levelInput integer adalah input level dari user
   */
  public void generateQueHand(int levelInput) throws IOException {
    questionhandler.setLevel(levelInput);
    questionhandler.drawQuestion();
  }
  
}