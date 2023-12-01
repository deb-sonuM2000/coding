import java.awt.*;
public class ListDemo {
          ListDemo(){
                    Frame f=new Frame();
                    //creating the list of 5 rows
                    List ll=new List(5);
                    ll.setBounds(100,100,75,75);
                    //adding list item into the list
                    ll.add("Apple");
                    ll.add("Banana");
                    ll.add("Cucumber");
                    ll.add("Orange");
                    ll.add("Lichi");
                    f.add(ll);
                    f.setSize(400,400);
                    f.setLayout(null);f.setVisible(true);
          }
          public static void main(String[] args) {
                    new ListDemo();
          }
}
