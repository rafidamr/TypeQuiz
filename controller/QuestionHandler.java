import model.Question;
import model.QuestionGeneralKnowledge;
import model.QuestionMath;
import model.QuestionTyping;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by asuspc on 4/24/2017.
 */
public class QuestionHandler {
  Question[] data;
  int level;

  QuestionHandler(int level) {
    this.level = level;
    data = new Question[25];
    for (int i = 0; i < 25; i++) {
      data[i] = new Question();
    }
  }
  public Question getData(int i) {
    return data[i];
  }
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