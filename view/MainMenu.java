package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.IOException;
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
    contentPane.setBackground(new Color(0, 0, 102));
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    JLabel lblNewLabel = new JLabel("Type Quiz");
    lblNewLabel.setForeground(Color.PINK);
    lblNewLabel.setFont(new Font("Matura MT Script Capitals", Font.PLAIN, 30));
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setBounds(149, 40, 157, 46);
    getContentPane().add(lblNewLabel);
    
    JButton btnNewButton = new JButton("Play!");
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Yuk Main!");
      }
    });
    btnNewButton.setForeground(Color.DARK_GRAY);
    btnNewButton.setBackground(new Color(0, 204, 204));
    btnNewButton.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
    btnNewButton.setBounds(172, 100, 117, 29);
    getContentPane().add(btnNewButton);
    
    JButton btnNewButton1 = new JButton("High Score");
    btnNewButton1.addActionListener(new ActionListener() {
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
    btnNewButton1.setBackground(new Color(0, 204, 204));
    btnNewButton1.setForeground(Color.DARK_GRAY);
    btnNewButton1.setBounds(172, 127, 117, 29);
    getContentPane().add(btnNewButton1);
    
    JButton btnNewButton2 = new JButton("Quit");
    btnNewButton2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        dispose();
      }
    });
    btnNewButton2.setBackground(new Color(0, 204, 204));
    btnNewButton2.setForeground(Color.DARK_GRAY);
    btnNewButton2.setBounds(172, 156, 117, 29);
    getContentPane().add(btnNewButton2);
  }
}


