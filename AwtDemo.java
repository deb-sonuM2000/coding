import java.awt.*;
public class AwtDemo {
          AwtDemo(){
                    Frame f=new Frame();
                    //creating a label
                    Label l=new Label("Employee id");
                    Button b=new Button("Submit");
                    //creating a TextField
                    TextField t=new TextField();

                    //setting the position in frame
                    l.setBounds(20,80,80,30);
                    t.setBounds(20,100,80,30);
                    b.setBounds(100,100,80,30);

                    //adding component into frame
                    f.add(b);f.add(l);f.add(t);

                    //frame size 
                    f.setSize(400,300);
                    f.setTitle("Employee info");
                    f.setLayout(null);
                    f.setVisible(true);
          }
          public static void main(String[] args) {
                    new AwtDemo();
          }
}
