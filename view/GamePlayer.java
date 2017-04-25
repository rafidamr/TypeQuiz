package view;
/**Real view Class GamePlayer.
 * @author Alivia Dewi Parahita
 *
 */

import java.awt.Color;
import java.awt.EventQueue;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

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
    textFieldQuestion.setHorizontalAlignment(SwingConstants.CENTER);
    textFieldQuestion.setEditable(false);
    textFieldQuestion.setBackground(Color.PINK);
    textFieldQuestion.setText("Question Here");
    textFieldQuestion.setBounds(48, 65, 364, 44);
    contentPane.add(textFieldQuestion);
    textFieldQuestion.setColumns(10);
    
    JLabel lblAnswer = new JLabel("Your Answer");
    lblAnswer.setBounds(179, 121, 86, 16);
    contentPane.add(lblAnswer);
    
    textFieldAnswer = new JTextField();
    textFieldAnswer.setBounds(125, 149, 199, 26);
    contentPane.add(textFieldAnswer);
    textFieldAnswer.setColumns(10);
    
    btnSubmit = new JButton("Enter");
    btnSubmit.setBounds(162, 187, 117, 29);
    contentPane.add(btnSubmit);
    
  }
  
  public String getAnswer() {
    return textFieldAnswer.getText();
  }
  
  public void setQuestion(String inputQuestion) {
    textFieldQuestion.setText(inputQuestion);
  }
  
  public void setAnswer(String inputAnswer) {
    textFieldAnswer.setText(inputAnswer);
  }
  
  public void addGameListener(ActionListener listenForSubmitButton) {
    btnSubmit.addActionListener(listenForSubmitButton);
  }
}
