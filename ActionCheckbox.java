import java.awt.*;
import java.awt.event.*;
public class ActionCheckbox  {
          ActionCheckbox(){
                    Frame f1=new Frame("checkboxdemo");
                    final Label l=new Label();
                    l.setAlignment(Label.CENTER);
                    l.setSize(400,100);
                    
                    Checkbox ch1=new Checkbox("C");
                    ch1.setBounds(100,100,50,50);
                    Checkbox ch2=new Checkbox("Java");
                    ch2.setBounds(100,150,50,50);
                    f1.add(ch1);f1.add(ch2);f1.add(l);

                    //adding event to the checkboxes
                    ch1.addItemListener(new ItemListener() {
                              public void itemStateChanged(ItemEvent e){
                                        l.setText("C Checkbox"+(e.getStateChange()==1?"checked":"unchecked"));
                              }
                    });
                    ch2.addItemListener(new ItemListener() {
                              public void itemStateChanged(ItemEvent e){
                                        l.setText("Java Checkbox"+(e.getStateChange()==1?"checked":"unchecked"));
                              }
                    });
                    f1.setSize(500,500);f1.setLayout(null);
                    f1.setVisible(true);
          }
          public static void main(String[] args) {
                    new ActionCheckbox();
          }
}
