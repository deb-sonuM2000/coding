import java.awt.*;
import java.awt.event.*;
public class ActionTextArea extends Frame implements ActionListener {
          Label l1,l2;
          TextArea area;
          Button b;
          ActionTextArea(){
                    l1=new Label();
                    l1.setBounds(50,50,100,40);
                    l2=new Label();
                    l2.setBounds(160,50,100,40);
                    area=new TextArea();
                    area.setBounds(20,100,300,300);
                    b=new Button("count word");
                    b.setBounds(100,400,100,40);
                    b.addActionListener(this);
                    add(l1);add(l2);add(area);add(b);
                    setSize(500,500);
                    setLayout(null);setVisible(true);
          }
          public void actionPerformed(ActionEvent e){
                    String text=area.getText();
                    String words[]=text.split("\\s");
                    l1.setText("words: "+words.length);
                    l2.setText("Characters: "+text.length());
          }
          public static void main(String[] args) {
                    new ActionTextArea();
          }
}
