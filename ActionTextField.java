import java.awt.*;
import java.awt.event.*;
public class ActionTextField extends Frame implements ActionListener {
          TextField t1,t2,t3;
          Button b1,b2,b3,b4;
          ActionTextField(){
                    t1=new TextField();
                    t1.setBounds(50,50,150,20);
                    t2=new TextField();
                    t2.setBounds(50,100,150,20);
                    t3=new TextField();
                    t3.setBounds(50,150,150,20);
                    t3.setEditable(false);
                    b1=new Button("+");
                    b1.setBounds(50,200,50,50);
                    b2=new Button("-");
                    b2.setBounds(120,200,50,50);
                    b3=new Button("*");
                    b3.setBounds(190,200,50,50);
                    b4=new Button("/");
                    b4.setBounds(260,200,50,50);
                    b1.addActionListener(this);
                    b2.addActionListener(this);
                    b3.addActionListener(this);
                    b4.addActionListener(this);
                    add(t1);add(t2);add(t3);add(b1);add(b2);add(b3);add(b4);
                    setSize(500,500);
                    setLayout(null);
                    setVisible(true);
          }
          public void actionPerformed(ActionEvent e){
                    String s1=t1.getText();
                    String s2=t2.getText();
                    int a=Integer.parseInt(s1);
                    int b=Integer.parseInt(s2);
                    int c=0;
                    if(e.getSource()==b1){
                              c=a+b;
                    }else if(e.getSource()==b2){
                              c=a-b;
                    }else if(e.getSource()==b3){
                              c=a*b;
                    }else if(e.getSource()==b4){
                              c=a/b;
                    }
                    String result=String.valueOf(c);
                    t3.setText(result);
          }
          public static void main(String[] args) {
                    new ActionTextField();
                    
          }
}
