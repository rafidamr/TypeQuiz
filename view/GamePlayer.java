package view;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

public class GamePlayer extends JFrame {

  private JPanel contentPane;
  private JTextField textFieldQuestion;
  private JTextField textFieldAnswer;
  private JButton btnSubmit;

  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        try {
          GamePlayer frame = new GamePlayer();
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
  public GamePlayer() {
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 450, 300);
    contentPane = new JPanel();
    contentPane.setBackground(Color.PINK);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);
    
    textFieldQuestion = new JTextField();
    textFieldQuestion.setEditable(false);
    textFieldQuestion.setBackground(Color.PINK);
    textFieldQuestion.setText("Question Here");
    textFieldQuestion.setBounds(48, 83, 364, 26);
    contentPane.add(textFieldQuestion);
    textFieldQuestion.setColumns(10);
    
    JLabel lblAnswer = new JLabel("Your Answer");
    lblAnswer.setBounds(179, 121, 86, 16);
    contentPane.add(lblAnswer);
    
    textFieldAnswer = new JTextField();
    textFieldAnswer.setBounds(125, 149, 199, 26);
    contentPane.add(textFieldAnswer);
    textFieldAnswer.setColumns(10);
    
    btnSubmit = new JButton("Submit");
    btnSubmit.setBounds(162, 187, 117, 29);
    contentPane.add(btnSubmit);
    
    //KeyStroke ret = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER,0);
  }
  
  public String getAnswer() {
    return textFieldAnswer.getText();
  }
  
  public void setQuestion(String inputQuestion) {
    textFieldQuestion.setText(inputQuestion);
  }
  
  public void addGameListener(ActionListener listenForSubmitButton) {
    btnSubmit.addActionListener(listenForSubmitButton);
  }
}
