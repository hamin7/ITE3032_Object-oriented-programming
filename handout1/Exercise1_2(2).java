package handout1;
import java.util.Scanner;

public class Handout1 {
	public static void main(String[] args) {
	   boolean b = false, c = false;
     int z;

     Scanner scn = new Scanner(System.in);

     int i = scn.nextInt();

     switch (i)
     {
       case 11: z = b ? 8 : !c ? 3 : 6;
          break;
       case 12:
       case 13:
          z = 10;
          break;
       default:
          z = 15;
    }

		System.out.println(b);
    System.out.println(c);
    System.out.println(z);
    System.out.println(i);

	}
}
