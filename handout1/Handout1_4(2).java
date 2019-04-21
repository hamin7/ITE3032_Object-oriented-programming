package handout1;
import javax.swing.JOptionPane;

public class Handout1
{
	public static void main(String arg[])
	{
    // Prompt the user to enter a number
    String yearString = JOptionPane.showInputDialog(null,
      "Enter a Numbers of lines:", "Example 2.2 Input (int)",
      JOptionPane.QUESTION_MESSAGE);

    // Convert the string into an int value
    int NUM_OF_LINES = Integer.parseInt(yearString);

		for(int row = 1; row <= NUM_OF_LINES; row++){
			for(int col = 1; col <= NUM_OF_LINES - row; col++){
				System.out.print(' ');
			}
			for(int num = row; num >= 1; num--){
				System.out.print(num);
			}
			for(int num = 2; num <= row; num++){
				System.out.print(num);
			}
			System.out.println();
		}//for
	}//method
}//class
