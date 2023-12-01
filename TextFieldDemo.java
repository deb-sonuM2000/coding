import java.awt.*;
public class TextFieldDemo {
          public static void main(String[] args) {
                    Frame f=new Frame("Textfield Demo");
                    TextField t1,t2;
                    t1=new TextField("Hello");
                    t1.setBounds(50,150,300,40);
                    t2=new TextField("Welcome");
                    t2.setBounds(50,200,300,40);
                    f.add(t1);f.add(t2);
                    f.setSize(500,500);
                    f.setLayout(null);
                    f.setVisible(true);
          }
}
