import java.awt.*;
public class ChoiceDemo {
          ChoiceDemo(){
                    Frame f=new Frame();
                    Choice c=new Choice();
                    c.setBounds(100,100,75,75);
                    
                    c.add("C Program");
                    c.add("Java Program");
                    c.add("Python Program");
                    c.add("C++ Program");
                    c.add("JS Program");
                    c.add("HTML Program");
                    c.add("CSS Program");
                    c.add("Angular Program");

                    f.add(c);
                    f.setSize(500,500);
                    f.setLayout(null);f.setVisible(true);
          }
          public static void main(String[] args) {
                    new ChoiceDemo();
          }
}
