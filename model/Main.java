package model;

import java.io.IOException;

import controller.HighScore;

public class Main {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    HighScore t = new HighScore();
    try {
      t.loadHighScore();
      t.printToTxt();
      t.showHighScore();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
    

  }

}
