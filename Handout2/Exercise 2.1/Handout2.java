// TestDo.java: Test the do-while loop
import javax.swing.JOptionPane;

public class TestDo {

   public static void main(String[] args) {
     int data;       // 세미콜론 빠짐
     int sum = 0;

     // Keep reading data until the input is 0
     do {
       // Read the next data
       String dataString = JOptionPane.showInputDialog(null,      // Stirng -> String, JOPTionPane->JOptionPane
         "Enter an int value, \nthe program exits if the input is 0",
         "TestDo", JOptionPane.QUESTION_MESSAGE);      // "닫는거 빠짐 "TestDo", MASSAGE -> MESSAGE

       data = Integer.parseInt(dataSting);       // Stirng -> String

       sum += data;       // ; 빠짐
     } while (data != 0);     // }아니고 )

     JOptionPane.showMessageDialog(null, "The sum is " + sum,
       "TestDo", JOptionPane.INFORMATION_MESSAGE);       // Plane 아니고 Pane

     System.exit(0);
   }
 }
