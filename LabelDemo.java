import java.awt.*;
public class LabelDemo {
          public static void main(String[] args) {
                    Frame f=new Frame("Label Demo");
                    Label l1,l2;

                    //initializing the label
                    l1=new Label("first label");
                    l2=new Label("second label");

                    //set the location of label
                    l1.setBounds(50,100,100,30);
                    l2.setBounds(50,150,100,30);

                    //adding the label to the frame
                    f.add(l1);f.add(l2);

                    f.setSize(400,400);
                    f.setLayout(null);f.setVisible(true);
                    
          }
}
