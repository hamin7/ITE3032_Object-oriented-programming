import javax.swing.*;
import java.awt.*;    // getSize

public class Welcome{
  public static void main(String[] args){
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 300);

    Container pane = frame.getContentPane();
    FlowLayout flowLayout = new FlowLayout();
    pane.setLayout(flowLayout);
    pane.add(new JButton("My First Button"));
    pane.add(new JButton("My Second Button"));
    pane.add(new JButton("My Third Button"));

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
