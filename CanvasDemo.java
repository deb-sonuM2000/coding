import java.awt.*;
public class CanvasDemo {
          CanvasDemo(){
                    Frame f=new Frame();
                    f.add(new MyCanvas());
                    f.setLayout(null);f.setSize(500,500);f.setVisible(true);
          }
          public static void main(String[] args) {
                    new CanvasDemo();
          }
}
//class which inherit the Canvas class
class MyCanvas extends Canvas{
//class constructor
   MyCanvas(){
          setBackground(Color.GREEN);
          setSize(300,400);
   }
   //paint() method to draw inside the canvas
   public void paint(Graphics g){
          g.setColor(Color.red);
          g.fillOval(75,75,150,75);
   }
}
