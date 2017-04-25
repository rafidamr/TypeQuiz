package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MainMenu extends JFrame {

  private JPanel contentPane;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          MainMenu frame = new MainMenu();
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
  public MainMenu() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBackground(new Color(102, 153, 255));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblJudul = new JLabel("Type Quiz");
    lblJudul.setForeground(Color.WHITE);
    lblJudul.setFont(new Font("Herculanum", Font.BOLD, 37));
    lblJudul.setHorizontalAlignment(SwingConstants.CENTER);
    lblJudul.setBounds(107, 60, 232, 46);
    getContentPane().add(lblJudul);
    
    JButton btnPlay = new JButton("Play!");
    btnPlay.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Yuk Main!");
      }
    });
    btnPlay.setForeground(Color.DARK_GRAY);
    btnPlay.setBackground(new Color(0, 204, 204));
    btnPlay.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
    btnPlay.setBounds(172, 173, 117, 29);
    getContentPane().add(btnPlay);
    
    JButton btnHighScore = new JButton("High Score");
    btnHighScore.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
        HighscoreViewer viewHighscore;
        try {
          viewHighscore = new HighscoreViewer();
          viewHighscore.setVisible(true);
        } catch (IOException e1) {
          // TODO Auto-generated catch block
          e1.printStackTrace();
        }
      }
    });
    btnHighScore.setBackground(new Color(0, 204, 204));
    btnHighScore.setForeground(Color.DARK_GRAY);
    btnHighScore.setBounds(172, 200, 117, 29);
    getContentPane().add(btnHighScore);
    
    JButton btnQuit = new JButton("Quit");
    btnQuit.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
    btnQuit.setBackground(new Color(0, 204, 204));
    btnQuit.setForeground(Color.DARK_GRAY);
    btnQuit.setBounds(172, 228, 117, 29);
    getContentPane().add(btnQuit);
    
    JLabel typeWriter = new JLabel("");
    typeWriter.setBounds(-213, -155, 707, 450);
    Image img = new ImageIcon(getClass().getResource("/typewrite.png")).getImage();
    typeWriter.setIcon(new ImageIcon(img));
    contentPane.add(typeWriter);
  }
}


