package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class HighscoreViewer extends JFrame {

  private JPanel contentPane;
  
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          HighscoreViewer frame = new HighscoreViewer();
          frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }

  /**
   * Create the frame.
   */
  public HighscoreViewer() throws IOException {
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    setBounds(100, 100, 450, 399);
    contentPane = new JPanel();
    contentPane.setBackground(Color.PINK);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("High Score");
    lblNewLabel.setFont(new Font("Harrington", Font.PLAIN, 25));
    lblNewLabel.setBounds(154, 24, 120, 37);
    contentPane.add(lblNewLabel);
    
    JTextArea txtHighScore = new JTextArea();
    txtHighScore.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
    txtHighScore.setBackground(Color.PINK);
    txtHighScore.setEditable(false);
    txtHighScore.setBounds(154, 85, 152, 241);
    contentPane.add(txtHighScore);
    
    JButton btnBack = new JButton("Back");
    btnBack.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
        MainMenu viewMainMenu;
        viewMainMenu = new MainMenu();
        viewMainMenu.setVisible(true);
      }
    });
    btnBack.setBounds(175, 342, 117, 29);
    contentPane.add(btnBack);
    
    BufferedReader in = null;
    in = new BufferedReader(new FileReader("src/controller/highscoreshow.txt"));
    String str;
    while ((str = in.readLine()) != null) {
      txtHighScore.append(str);
      txtHighScore.append("\n");
    }
    in.close();
  }
}
