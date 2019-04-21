
import java.util.Scanner;

public class Exercise1_2 {
	public static void main(String[] args) {
		boolean b = false, c = false;
	    int z;

	    Scanner scn = new Scanner(System.in);


	    int i = scn.nextInt();

	    if ( i == 11) {
	    	z = b ? 8 : !c ? 3 : 6;
	    }
	    else if(i == 12) {
	    	z = 10;
	    }
	    else if(i == 13) {
	    	z = 10;
	    }
	    else {
	    	z = 15;
	    }

	    System.out.println(z);
    }
}
