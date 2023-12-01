import java.awt.*;
public class ButtonDemo {
          public static void main(String[] args) {
                    Frame f=new Frame("Button Example");
                    //create instance of button with lebel
                    Button b=new Button("Click");
                    b.setBounds(50,100,80,30);
                    //add button to the frame
                    f.add(b);
                    //set size,layout and visibility of frame
                    f.setSize(400,400);
                    f.setLayout(null);
                    f.setVisible(true);
          }
}
