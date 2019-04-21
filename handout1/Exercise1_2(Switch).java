
import java.util.Scanner;

public class Exercise1_2 {
	public static void main(String[] args) {
		boolean b = false, c = false;
	    int z;

	    Scanner scn = new Scanner(System.in);


	    int i = scn.nextInt();

	    switch(i) {
		    case 11:
		    	z = b ? 8 : !c ? 3 : 6;			// !c = true --> 3, b = false --> 3 z = 3;
		    	break;
		    case 12:
		    case 13:
		    	z = 10;
		    	break;
		    default:
		    	z = 15;
	    }
	    System.out.println(z);
    }
}
