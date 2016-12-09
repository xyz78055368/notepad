import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.UnsupportedEncodingException;

/**
 * Created by harlan on 2016/12/8.
 */
public class HelpForm {

  private Frame frame;

  public void init() {
    frame = new Frame("开发者信息");

    frame.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent e){
        frame.dispose();
      }
    });

    JPanel jPanel = new JPanel();

    JTextArea textField = new JTextArea();
    textField.setText("指导老师:杨XXX\n开发人员:王小利,韩东,莫剑锋,陈海龙");
    textField.setEditable(false);
    textField.setEnabled(true);
    textField.setBackground(Color.white);
    textField.setFont(new Font("Serif",0,20));
    jPanel.add(textField);
    jPanel.setEnabled(true);
    jPanel.setBackground(Color.white);
    frame.setBackground(Color.white);
    frame.setSize(500,150);
    frame.setLocation(400,200);
    frame.add(jPanel);
    frame.setVisible(true);
  }

}
