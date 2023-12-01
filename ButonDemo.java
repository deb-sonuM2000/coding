import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ButonDemo {
          Frame fObj;
          Button button1,button2,button3;
          ButonDemo(){
                    fObj=new Frame("Frame to display button");
                    button1=new Button();
                    button2=new Button("Click here");
                    button3=new Button();
                    button3.setLabel("Button3");
                    fObj.add(button1);
                    fObj.add(button2);
                    fObj.add(button3);
                    fObj.setLayout(new FlowLayout());
                    fObj.setSize(300,400);
                    fObj.setVisible(true);
          }
          public static void main(String[] args) {
                    new ButonDemo();
          }
}
