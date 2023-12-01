import java.awt.*;
import java.awt.event.*;

public class ActionListnerDemo extends Frame implements ActionListener {
          TextField tf;
          ActionListnerDemo(){
                    //crate components
                    tf=new TextField();
                    tf.setBounds(60,50,170,20);
                    Button b=new Button("Click Me");
                    b.setBounds(100,120,80,30);
                    //register listner
                    b.addActionListener(this);
                    add(b);add(tf);
                    setSize(300,300);
                    setLayout(null);setVisible(true);
          }
          public void actionPerformed(ActionEvent e){
                    tf.setText("Welcome");
          }
          public static void main(String[] args) {
                    new ActionListnerDemo();
          }
}
