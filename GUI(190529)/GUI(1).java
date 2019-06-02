import javax.swing.*;
import java.awt.*;    // getSize

public class Welcome{
  public static void main(String[] args){
    JFrame frame = new JFrame("Test Frame");
    frame.setSize(400, 300);

    // Get the dimension of the screen
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int screenWidth = screenSize.width;
    int screenHeight = screenSize.height;

    // Get the dimension of the frame
    Dimension frameSize = frame.getSize();
    int x = (screenWidth - frameSize.width)/2;
    int y = (screenHeight - frameSize.height)/2;

    frame.setLocation(x, y);

    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
}
