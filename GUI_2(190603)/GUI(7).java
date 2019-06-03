import javax.swing.*;
import java.awt.*;    // getSize
import java.awt.event.*;    // ActionListener

public class Welcome{
  class ButtonListener implements ActionListener{
    public void actionPerformed(ActionEvent e){
      if (e.getSource() == button1)
        System.out.println("Button 1 pressed ...");
      if (e.getSource() == button2)
        System.out.println("Button 2 pressed ...");
      // System.out.println("Button preceed ...");
    }
  }
  JButton button1 = new JButton("My First Button");
  JButton button2 = new JButton("My Second Button");

  public void makeFrame(){
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 300);

    Container pane = frame.getContentPane();
    GridLayout GridLayout = new GridLayout();
    pane.setLayout(GridLayout);

    //JButton button1 = new JButton("My First Button");

    pane.add(button1);
    pane.add(button2);
    pane.add(new JButton("My Third Button"));

    button1.addActionListener(new ButtonListener(){
      public void actionPerformed(ActionEvent e){
        System.out.println("Button1 preceed ...");
      }
    } );

    // pane.add(new JButton("My First Button"));
    //pane.add(new JButton("My Second Button"));
    //JButton button2 = new JButton("My Second Button");
    button2.addActionListener(new ButtonListener(){
      public void actionPerformed(ActionEvent e){
        System.out.println("Button1 preceed ...");
      }
    } );

    public void actionPerformed(ActionEvent e){
      System.out.println("Button preceed ...");
    }

    JPanel panel = new JPanel(); pane.add(panel);
    panel.setLayout(new FlowLayout());
    panel.add(new JButton("Button 4")); panel.add(new JButton("Button 5"));

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
  public static void main(String[] args){
    Welcome frame = new Welcome();
    frame.makeFrame();
  }
}
