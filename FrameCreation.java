import java.awt.*;
public class FrameCreation extends Frame{
     FrameCreation(){
          //creating a button
          Button b=new Button("Click me");
          //setting button position on screen
          b.setBounds(60, 100, 80, 30);
          //adding button into frame
          add(b);
          //frame size 300 width and 300 height
          setSize(300, 300);
          //setting the title of frame
          setTitle("My First AWT Application");
          //no layout manager
          setLayout(null);
          //now frame will be visible by default it is not visible
          setVisible(true);
     }
     public static void main(String[] args) {
          FrameCreation fc=new FrameCreation();
     }
}