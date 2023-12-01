import java.awt.*;
public class CheckboxDemo {
          CheckboxDemo(){
                    Frame f=new Frame("checkbox demo");
                    Checkbox check1=new Checkbox("Java");
                    check1.setBounds(100,100,50,50);
                    Checkbox check2=new Checkbox("Python",true);
                    check2.setBounds(100,150,50,50);
                    f.add(check1);f.add(check2);
                    f.setSize(500,500);
                    f.setLayout(null);f.setVisible(true);
          }
          public static void main(String[] args) {
                    new CheckboxDemo();
          }
}
