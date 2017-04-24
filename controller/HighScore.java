package model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**Real Class Player.
 * @author Alivia Dewi Parahita
 *
 */


public class HighScore {
  //atribut
  /** Attribut data yang adalah array of Player dari HighScore.
   */
  private Player[] data;
  /** Attribut size yang adalah Ukuran dari HighScore.
   */
  private int size;
  /** Attribut tail yang menyatakan seberapa banyak data yang sudah ada di HighScore.
   */
  private int tail;
  /** Attribut defaultSize yang adalah ukuran default dari suatu Highscore.
   */
  private final int defaultSize = 10;
  
  //method
  /** Constructor dari HighScore.
   * Menghidupkan object HighScore.
   * 
   * 
   */
  public HighScore() {
    tail = -1;
    size = defaultSize;
    data = new Player[size];
    for (int i = 0; i < size; i++) {
      data[i] = new Player();
    }
  }
  
  /** Prosedur load dari HighScore.
    * Input data highscore dari file eksternal.
    * @throws IOException 
    * I.S : HighScore terdefinisi
    * F.S : data pada file eksternal terinput ke HighScore
    */
  public void loadHighScore() throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("src/model/highscore.txt"));
    String strLine;
    try {
      int indeksData = 0;
      while ((strLine = br.readLine()) != null) {
        int tempPoint = 0;
        String temp;
        int i = 0;
        while (strLine.charAt(i) != '|') {
          i++;
        }
        temp = strLine.substring(0, i);
        i++;
        data[indeksData].setName(temp);
        temp = strLine.substring(i, strLine.length());
        for (i = 0; i < temp.length(); i++) {
          tempPoint = (tempPoint * 10) + ((int) temp.charAt(i) - 48);
        }
        data[indeksData].setPoint(tempPoint);
        indeksData++;
        tail++;
      }
    } finally {
      br.close();
    }
  }
  
  /** Function yang menanyakan HighScore kosong atau tidak.
   * 
   * @return boolean : yang menyatakan HighScore kosong atau tidak
   */
  public boolean isEmpty() {
    return (tail == -1);
  }
  
  /** Function yang menanyakan HighScore penuh atau tidak.
   * 
   * @return boolean : yang menyatakan HighScore penuh atau tidak
   */
  public boolean isFull() {
    return (tail == size - 1);
  }
  
  /** Function yang mengembalikan nilai tail.
   * 
   * @return int : nilai tail
   */
  
  public int getTail() {
    return tail;
  }
  
  /** Prosedur add Player ke HighScore.
   * I.S : Highscore terdefinisi
   * F.S : inputPlayer telah dicoba di masukkan ke dalam highscore
   * 
   * @param inputPlayer Player adalah data Player yang coba dimasukkan
   * 
   */
  public void add(Player inputPlayer) {
    if (this.isEmpty()) {
      tail++;
      data[tail].setName(inputPlayer.getName());
      data[tail].setPoint(inputPlayer.getPoint());
    } else {
      while (inputPlayer.getPoint() > data[tail].getPoint()) {
        int indeksInput = 0;
        while (data[indeksInput].getPoint() > inputPlayer.getPoint()) {
          indeksInput++;
        }
      
        if (indeksInput != size) {
          Player tempPlayer = new Player();
          tempPlayer.setName(data[indeksInput].getName());
          tempPlayer.setPoint(data[indeksInput].getPoint());
          data[indeksInput].setName(inputPlayer.getName());
          data[indeksInput].setPoint(inputPlayer.getPoint());
          inputPlayer.setName(tempPlayer.getName());
          inputPlayer.setPoint(tempPlayer.getPoint());
        }
    
      }
      
      if (tail < size - 1) {
        tail++;
        data[tail].setName(inputPlayer.getName());
        data[tail].setPoint(inputPlayer.getPoint());
      }
    }
  }
  
  /** Prosedur yang menampilkan HighScore ke layar.
   * I.S : Highscore terdefinisi
   * F.S : Highscore tercetak di layar
   * 
   */
  public void showHighScore() {
    System.out.println("High Score!!");
    for (int i = 0; i <= tail; i++) {
      System.out.println(i + 1 + ". " + data[i].getName() + " " + data[i].getPoint());
    }
  }
  
  /** Prosedur yang mencetak HighScore ke file.
   * I.S : Highscore terdefinisi
   * F.S : Highscore tercetak di file
   * @throws IOException 
   * 
   */
  public void printToTxt() throws IOException {
    String text;
    String text2;
    BufferedWriter output = new BufferedWriter(new FileWriter("src/controller/highscore.txt")) ;
    BufferedWriter output2 = new BufferedWriter(new 
        FileWriter("src/controller/highscoreshow.txt")) ;
    if (tail != -1) {
      for (int i = 0; i <= tail; i++) {
        text = data[i].getName().concat("|").concat(String.valueOf(data[i].getPoint()));
        text2 = data[i].getName().concat("\t").concat(String.valueOf(data[i].getPoint()));
        output.write(text);
        output.write("\r\n");
        output2.write(text2);
        output2.write("\r\n");
      }
    }
    
    output.close();
    output2.close();
    
  }
}
