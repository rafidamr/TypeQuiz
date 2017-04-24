import model.Question;
import model.QuestionGeneralKnowledge;
import model.QuestionMath;
import model.QuestionTyping;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**Real Class QuestionHandler
 * @author Vigor Akbar
 *
 */
public class QuestionHandler {
  /**
   * Attribut data adalah sebuah array of Question
   * digunakan untuk menyimpan pertanyaan dari file eksternal
   */
  Question[] data;
  /**
   * Attribut level adalah sebuah integer
   * digunakan untuk menyimpan level dari Question yang akan di load
   */
  int level;

  /**
   * Constructor dengan parameter dari QuestionHandler
   * Menghidupkan objek QuestionHandler
   * @param level int adalah level dari Question yang ingin di load
   */
  QuestionHandler(int level) {
    this.level = level;
    data = new Question[25];
    for (int i = 0; i < 25; i++) {
      data[i] = new Question();
    }
  }

  /**
   * Getter Question dari data
   * @param i = index dari data yang ingin di ambil
   * @return Question : Question yabg ingin diambil
   */
  public Question getData(int i) {
    return data[i];
  }

  /**
   * Prosedur drawQuestion ini digunakan untuk mengambil Question dari file eksternal
   * I.S : QuestionHandler terdefinisi
   * F.S : atribut data berisi question sesuai file eksternal
   */
  public void drawQuestion() throws IOException {
    if (level == 1) {
      int indeksData = 0;
      BufferedReader br = new BufferedReader((new FileReader("external_file/GeneralKnowledgeLvl1.txt")));
        String strLine;
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionGeneralKnowledge(tempQuest, tempAns, 1);
            indeksData++;
          }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("external_file/MathLvl1.txt")));
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionMath(tempQuest, tempAns, 1);
            indeksData++;
          }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("external_file/TypingLvl1.txt")));
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionTyping(tempQuest, tempAns, 1);
            indeksData++;
          }
        } finally {
          br.close();
        }
    } else if (level == 2) {
      int indeksData = 0;
      BufferedReader br = new BufferedReader((new FileReader("external_file/GeneralKnowledgeLvl2.txt")));
        String strLine;
        try {
          while ((strLine = br.readLine()) != null) {
            String tempQuest;
            String tempAns;
            int i = 0;
            while(strLine.charAt(i) != '|') {
              i++;
            }
            tempQuest = strLine.substring(0,i);
            i++;
            tempAns = strLine.substring(i,strLine.length());
            data[indeksData] = new QuestionGeneralKnowledge(tempQuest, tempAns, 2);
            indeksData++;
          }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("external_file/MathLvl2.txt")));
        try {
            while ((strLine = br.readLine()) != null) {
                String tempQuest;
                String tempAns;
                int i = 0;
                while(strLine.charAt(i) != '|') {
                    i++;
                }
                tempQuest = strLine.substring(0,i);
                i++;
                tempAns = strLine.substring(i,strLine.length());
                data[indeksData] = new QuestionMath(tempQuest, tempAns, 2);
                indeksData++;
            }
        } finally {
            br.close();
        }
        br = new BufferedReader((new FileReader("external_file/Typing2.txt")));
        try {
            while ((strLine = br.readLine()) != null) {
                String tempQuest;
                String tempAns;
                int i = 0;
                while(strLine.charAt(i) != '|') {
                    i++;
                }
                tempQuest = strLine.substring(0,i);
                i++;
                tempAns = strLine.substring(i,strLine.length());
                data[indeksData] = new QuestionTyping(tempQuest, tempAns, 2);
                indeksData++;
            }
        } finally {
            br.close();
        }
    } else if (level == 3) {
      int indeksData = 0;
      BufferedReader br = new BufferedReader((new FileReader("external_file/GeneralKnowledgeLvl3.tc")));
      String strLine;
      try {
        while ((strLine = br.readLine()) != null) {
          String tempQuest;
          String tempAns;
          int i = 0;
          while(strLine.charAt(i) != '|') {
            i++;
          }
          tempQuest = strLine.substring(0,i);
          i++;
          tempAns = strLine.substring(i,strLine.length());
          data[indeksData] = new QuestionGeneralKnowledge(tempQuest, tempAns, 3);
          indeksData++;
        }
      } finally {
        br.close();
      }
      br = new BufferedReader((new FileReader("external_file/MathLvl3.txt")));
      try {
        while ((strLine = br.readLine()) != null) {
          String tempQuest;
          String tempAns;
          int i = 0;
          while(strLine.charAt(i) != '|') {
            i++;
          }
          tempQuest = strLine.substring(0,i);
          i++;
          tempAns = strLine.substring(i,strLine.length());
          data[indeksData] = new QuestionMath(tempQuest, tempAns, 3);
          indeksData++;
        }
      } finally {
        br.close();
      }
      br = new BufferedReader((new FileReader("external_file/Typing3.txt")));
      try {
        while ((strLine = br.readLine()) != null) {
          String tempQuest;
          String tempAns;
          int i = 0;
          while(strLine.charAt(i) != '|') {
            i++;
          }
          tempQuest = strLine.substring(0,i);
          i++;
          tempAns = strLine.substring(i,strLine.length());
          data[indeksData] = new QuestionTyping(tempQuest, tempAns, 3);
          indeksData++;
        }
      } finally {
        br.close();
      }
    }
  }
}