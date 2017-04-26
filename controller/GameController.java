package controller;
/**Real controller Class GameController.
 * @author Alivia Dewi Parahita
 *
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import view.GamePlayer;
import view.MainMenu;

public class GameController {
  private GamePlayer theView;
  //private GamePlayer theView1;
  private PlayGame theModel;
  private int index;
  private int level;
  private boolean main = true;
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
  
  class GameListener implements ActionListener {
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
  
  public void setLevel(int levelInput) {
    //while (!available) {}
    //available = true;
    level = levelInput;
  }
  
  public void setIndex(int indexInput) {
    //while (!available) {}
    //available = true;
    index = indexInput;
  }
  
  public int getLevel() {
    return level;
  }
  
  public int getIndex() {
    //while (available) {}
    //available = false;
    return index;
  }
  
  public GamePlayer getView() {
    //while (available) {}
    //available = false;
    return theView;
  }
  
  public PlayGame getModel() {
    //while (available) {}
    //available = false;
    return theModel;
  }
  
}
