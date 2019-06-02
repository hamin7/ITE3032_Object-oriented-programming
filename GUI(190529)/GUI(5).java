import javax.swing.*;
import java.awt.*;    // getSize
import java.awt.event.*;    // ActionListener

class ButtonListener implements ActionListener{
  public void actionPerformed(ActionEvent e){
    System.out.println("Button preceed ...");
  }
}

public class Welcome{
  public static void main(String[] args){
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 300);

    Container pane = frame.getContentPane();
    GridLayout GridLayout = new GridLayout();
    pane.setLayout(GridLayout);
    JButton button = new JButton("My First Button");
    button.addActionListener(new ButtonListener() );
    pane.add(button);
    pane.add(new JButton("My First Button"));
    pane.add(new JButton("My Second Button"));
    pane.add(new JButton("My Third Button"));
    JPanel panel = new JPanel(); pane.add(panel);
    panel.setLayout(new FlowLayout());
    panel.add(new JButton("Button 4")); panel.add(new JButton("Button 5"));

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
