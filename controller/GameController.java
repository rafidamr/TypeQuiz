package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import view.GamePlayer;

public class GameController {
  private GamePlayer theView;
  private GamePlayer theView1;
  private PlayGame theModel;
  private int index,level;
  
  public GameController(GamePlayer theView, PlayGame theModel) throws IOException {
    this.theView = theView;
    this.theModel = theModel;
    /*index = 0;
    level = 1;
    
    theModel.generateQueHand(level);
    this.theView.addGameListener(new GameListener());
    index = 1;
    this.theView.addGameListener(new GameListener());
    index = 2;
    this.theView.addGameListener(new GameListener());
    index = 3;
    this.theView.addGameListener(new GameListener());
    index = 4;
    this.theView.addGameListener(new GameListener());
    index = 5;*/
    
   /* theModel.awalGame();
    theView.setQuestion(theModel.getQueHand().getData(0).getPertanyaan());
    String jawab = theView.getAnswer();
    System.out.println(jawab);
    theModel.checkMatch(jawab, 0);*/
    /*int level = 1;
    int index = 0;
    boolean jawabBenar = false;
    
    while ((level <= 5) && (theModel.isMain())) {
      theModel.getQueHand().setLevel(level);
      theModel.getQueHand().drawQuestion();
      while ((theModel.isMain()) && (index < 25)) {
        while (!(jawabBenar)) {
          theView.setQuestion(theModel.getQueHand().getData(index).getPertanyaan());
          String jawab = theView.getAnswer();
          theModel.checkMatch(jawab, index);
          if (theModel.getMatcher().getScore() != 0) {
            jawabBenar = true;
          }
        }
        index++;
      }
      level++;
    }*/
    
  }
  
  class GameListener implements ActionListener {
    public void actionPerformed(ActionEvent arg0) {
      theView.setQuestion(theModel.getQueHand().getData(index).getPertanyaan());
      String jawab = theView.getAnswer();
      System.out.println(jawab);
      theModel.checkMatch(jawab, index);
      }
  }
  
  public int getLevel() {
    return level;
  }
  
  public int getIndex() {
    return index;
  }
  
  public GamePlayer getView() {
    return theView;
  }
  
  public PlayGame getModel() {
    return theModel;
  }
  
  public void game() throws IOException {
    int level = 1;
    int index = 0;
    boolean jawabBenar = false;
    
    while ((level <= 5) && (theModel.isMain())) {
      theModel.getQueHand().setLevel(level);
      theModel.getQueHand().drawQuestion();
      while ((theModel.isMain()) && (index < 25)) {
        while (!(jawabBenar)) {
          theView.setQuestion(theModel.getQueHand().getData(index).getPertanyaan());
          String jawab = theView.getAnswer();
          theModel.checkMatch(jawab, index);
          if (theModel.getMatcher().getScore() != 0) {
            jawabBenar = true;
          }
        }
        index++;
      }
      level++;
    }
  }
  
}
