import java.awt.*;
public class TextAreaDemo {
          TextAreaDemo(){
                    Frame f=new Frame();
                    TextArea ar=new TextArea("welcoe to the java world");
                    ar.setBounds(10,30,300,300);
                    f.add(ar);
                    f.setSize(500,500);
                    f.setLayout(null);f.setVisible(true);
          }
          public static void main(String[] args) {
                    new TextAreaDemo();
          }
}
