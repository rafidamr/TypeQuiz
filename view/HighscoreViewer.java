package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;



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
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 479, 399);
    contentPane = new JPanel();
    contentPane.setBackground(Color.PINK);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblJudul = new JLabel("High Score");
    lblJudul.setFont(new Font("Harrington", Font.BOLD, 25));
    lblJudul.setBounds(154, 28, 120, 37);
    contentPane.add(lblJudul);
    
    JTextArea txtHighScore = new JTextArea();
    txtHighScore.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 13));
    txtHighScore.setBackground(new Color(255, 175, 175));
    txtHighScore.setEditable(false);
    txtHighScore.setBounds(152, 88, 133, 203);
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
    btnBack.setBounds(162, 303, 117, 29);
    contentPane.add(btnBack);
    
    JLabel lblTrophy = new JLabel("");
    Image img = new ImageIcon(getClass().getResource("/trophy.png")).getImage();
    lblTrophy.setIcon(new ImageIcon(img));
    lblTrophy.setBounds(318, 6, 128, 128);
    contentPane.add(lblTrophy);
    
    JLabel lblNewLabel1 = new JLabel("");
    lblNewLabel1.setBounds(-135, -37, 614, 427);
    Image img2 = new ImageIcon(getClass().getResource("/firework.png")).getImage();
    lblNewLabel1.setIcon(new ImageIcon(img2));
    contentPane.add(lblNewLabel1);
   
    BufferedReader in = null;
    in = new BufferedReader(new FileReader("external_file/highscoreshow.txt"));
    String str;
    while ((str = in.readLine()) != null) {
      txtHighScore.append(str);
      txtHighScore.append("\n");
    }
    in.close();
  }
}
