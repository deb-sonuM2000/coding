import java.awt.*;
import java.awt.event.*;
public class ActionList {
          ActionList(){
                    Frame f=new Frame();
                    final Label ll=new Label();
                    ll.setAlignment(Label.CENTER);
                    ll.setSize(500,100);
                    Button b=new Button("Show");
                    b.setBounds(200,150,80,30);

                    final List l1=new List(4, false);
                    l1.setBounds(100,100,70,70);
                    l1.add("C");
                    l1.add("C++");l1.add("Java");l1.add("Python");

                    final List l2=new List(4, true);
                    l2.setBounds(100,200,70,70);
                    l2.add("VS Code");
                    l2.add("Eclipse Ide");l2.add("Sublime");
                    l2.add("Notepad");

                    f.add(l1);f.add(l2);f.add(ll);f.add(b);
                    f.setSize(450,450);f.setLayout(null);f.setVisible(true);

                    b.addActionListener(new ActionListener() {
                              public void actionPerformed(ActionEvent e){
                                        String data="Programming language Selected: "+l1.getItem(l1.getSelectedIndex());
                                        data +=",Ide Selected:";
                                        for(String frame:l2.getSelectedItems()){
                                                  data+=frame+" ";
                                        }
                                        ll.setText(data);
                              }
                    });
          }
          public static void main(String[] args) {
                    new ActionList();
          }
}
