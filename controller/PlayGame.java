
import model.HighScore;
import model.Player;
import model.Question;

import java.io.IOException;
import java.util.Scanner;

/**Real Class Player.
 * @author M. Akmal Pratama
 *
 */

public class PlayGame {
  private Player player;
  private Matcher matcher;
  private QuestionHandler questionhandler;
  private HighScore highscore;
  private int level;
  private boolean main;

  public PlayGame() throws IOException {
      player = new Player();
      matcher = new Matcher();
      level = 1;
      highscore = new HighScore();
      highscore.loadHighScore();
      questionhandler = new QuestionHandler(level);
      main = true;
  }

  public void initGame() throws IOException {
    questionhandler.drawQuestion();
    int count = 0;
    int i = 0;
    Question current;
    Scanner scan = new Scanner(System.in);
    String input;
    int totalScore = 0;

    System.out.println("Masukkan username:");
    input = scan.next();
    player.setName(input);
    while (level < 5) {
      i = 0;
      while (main && i < 25) {
        current = questionhandler.getData(i);
        System.out.println(current.getPertanyaan());
        input = scan.next();
        matcher.setKeyAnswer(current);
        matcher.setUserAnswer(input);
        matcher.countScore();
        totalScore += matcher.getScore();
        i++;
      }
      level++;
      if (level <= 5) {
        questionhandler.setLevel(level);
        questionhandler.drawQuestion();
      }
    }
    player.setPoint(totalScore);
    System.out.println("skor anda: "+player.getPoint());
  }
}