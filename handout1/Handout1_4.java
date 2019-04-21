package handout1;

public class Handout1
{
	public static void main(String arg[])
	{
		final int NUM_OF_LINES = 5;
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
