import java.awt.*;
import java.awt.event.*;

public class ActionListner1 {
     public static void main(String[] args) {
          Frame f=new Frame("Button example");
          final TextField tf=new TextField();
          tf.setBounds(50,50,150,20);
          Button b=new Button("Click me");
          b.setBounds(50,100,60,30);
          b.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e){
                              tf.setText("Welcome to the world");
                    }
          });
          f.add(b); f.add(tf);
          f.setSize(500,400);
          f.setLayout(null);f.setVisible(true);
     }          
}
