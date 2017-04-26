package controller;
/**Real controller Class GameController.
 * @author Alivia Dewi Parahita
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import view.GamePlayer;
import view.MainMenu;

public class GameController {
  /** Attribut theView yang adalah View dari Game.
   */
  private GamePlayer theView;
  /** Attribut theModel yang adalah Model dari Game.
   */
  private PlayGame theModel;
  /** Attribut index yang adalah int yang menandakan pertanyaan telah sampai
   * indeks ke berapa dari Game.
   */
  private int index;
  /** Attribut level yang adalah int yang menandakan telah mencapai level
   *  ke berapa dari Game.
   */
  private int level;
  /** Attribut main yang adalah boolean apakah game masih bermain atau tidak.
   */
  private boolean main = true;
  /** Attribut timer yang adalah Timer dari Game.
   */
  private Timer time;
  //private Timer timeShow;
  //private int counter;
  
  /** Constructor dari GameController.
   * Menghidupkan object GameController.
   * 
   */
  public GameController() throws IOException {
    theView = new GamePlayer();
    theModel = new PlayGame();
    theView.setVisible(true);
    
    index = 0;
    level = 1;
    
    time = new Timer(10000, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        main = false;
        String name = JOptionPane.showInputDialog(null, "Input your name");
        if (name == null) {
          name = "Anonymous";
        }
        theModel.getPlayer().setName(name);
        theModel.getHighscore().add(theModel.getPlayer());
        try {
          theModel.getHighscore().printToTxt();
        } catch (IOException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
        theView.dispose();
        MainMenu viewMainMenu;
        viewMainMenu = new MainMenu();
        viewMainMenu.setVisible(true);
      }
      
    });
    /*counter = 10;
    JLabel jl = new JLabel();
    jl.setText(Integer.toString(counter));
    jl.setLocation(10, 10);
    jl.setVisible(true);
    theView.add(jl);
    timeShow = new Timer(1000, new ActionListener() {

      @Override
      public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        --counter;
        jl.setText(Integer.toString(counter));
      }
      
    });*/
    time.setRepeats(false);
    //timeShow.setRepeats(true);
    theModel.generateQueHand(level);
    time.start();
    //timeShow.start();
    theView.setQuestion(theModel.getQueHand().getData(index).getPertanyaan());
    this.theView.addGameListener(new GameListener());
    
    if (!main) {
      theView.dispose();
    }
  }
  
  /** Class GameListener.
   * Penanganan dari tombol yang di berikan Action oleh user.
   * 
   */
  class GameListener implements ActionListener {
    
    /** Prosedur actionPerformed.
     * @Overide
     */
    public void actionPerformed(ActionEvent arg0) {
      boolean jawabBenar = false;
      String jawab = theView.getAnswer();
      System.out.println(jawab);
      theModel.checkMatch(jawab, index);
      if (theModel.getMatcher().getScore() != 0) {
        jawabBenar = true;
      }
      if (jawabBenar) {
        if (index + 1 != 25) {
          index++;
        } else if (level != 5) {
          level++;
          try {
            theModel.generateQueHand(level);
          } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
          }
          index = 0;
        } else {
          main = false;
          JOptionPane.showMessageDialog(null, "Congratulation! You Win!!");
          String name = JOptionPane.showInputDialog(null, "Input your name");
          if (name == null) {
            name = "Anonymous";
          }
          theModel.getPlayer().setName(name);
          theModel.getHighscore().add(theModel.getPlayer());
          try {
            theModel.getHighscore().printToTxt();
          } catch (IOException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
          }
          theView.dispose();
          MainMenu viewMainMenu;
          viewMainMenu = new MainMenu();
          viewMainMenu.setVisible(true);
        }
        theModel.getPlayer().setPoint(theModel.getPlayer().getPoint() 
            + theModel.getMatcher().getScore());
        
      }
      theView.setQuestion(theModel.getQueHand().getData(index).getPertanyaan());
      if (jawabBenar) {
        time.restart();
      }
      theView.setAnswer("");
    }
  }
  
  public boolean isMain() {
    return main;
  }
  
  /** Setter level dari Game.
   * I.S : GameController terdefinisi
   * F.S : atribut level game berubah sesuai input user
   * 
   * @param levelInput integer adalah input leveldari user
   */
  public void setLevel(int levelInput) {
    //while (!available) {}
    //available = true;
    level = levelInput;
  }
  
  /** Setter index dari Game.
   * I.S : GameController terdefinisi
   * F.S : atribut index game berubah sesuai input user
   * 
   * @param indexInput integer adalah input index dari user
   */
  public void setIndex(int indexInput) {
    //while (!available) {}
    //available = true;
    index = indexInput;
  }
  
  /** Getter level dari Game.
   * 
   * @return integer : level dari Game
   */
  public int getLevel() {
    return level;
  }
  
  /** Getter index dari Game.
   * 
   * @return integer : indeks pertanyaan dari Game
   */
  public int getIndex() {
    //while (available) {}
    //available = false;
    return index;
  }
  
  /** Getter View dari Game.
   * 
   * @return GamePlayer : view dari Game
   */
  public GamePlayer getView() {
    //while (available) {}
    //available = false;
    return theView;
  }
  
  /** Getter Model dari Game.
   * 
   * @return PlayGame : model dari Game
   */
  public PlayGame getModel() {
    //while (available) {}
    //available = false;
    return theModel;
  }
  
}
