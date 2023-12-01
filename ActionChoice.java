import java.awt.*;
import java.awt.event.*;
public class ActionChoice  {
          ActionChoice(){
                    Frame f=new Frame();
                    final Label ll=new Label();
                    ll.setAlignment(Label.CENTER);
                    ll.setSize(400,100);
                    Button b=new Button("Show");

                    b.setBounds(200,100,50,20);
                    final Choice c=new Choice();
                    c.setBounds(100,100,75,75);
                    c.add("Lion");
                    c.add("Tiger");
                    c.add("Elephant");
                    c.add("Beer");
                    c.add("Dinosaur");
                    c.add("Dog");
                    f.add(c);f.add(ll);f.add(b);
                    f.setSize(500,500);f.setLayout(null);
                    f.setVisible(true);

                    b.addActionListener(new ActionListener(){
                              public void actionPerformed(ActionEvent e){
                                        String data="Animals are selected:"+c.getItem(c.getSelectedIndex());
                                        ll.setText(data);
                              }
                    });
                    
          }
          public static void main(String[] args) {
                    new ActionChoice();
          }
          
}
