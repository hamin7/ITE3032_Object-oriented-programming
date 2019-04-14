import javax.swing.JOptionPane;

public class TowerOfHanoi {
  public static void main(String[] args) {
	  System.out.println(tower (3, 'A', 'B', 'C'));
  }

  
  static int tower(int n, char src, char aux, char dest) {
    if (n == 1) { // Stopping condition 
		System.out.println("Mode disc " + n + " from " + src + " to " + dest);
		return 1;
	}
    else {
		int moves1 = tower(n - 1, src, dest, aux);
		System.out.println("Mode disc " + n + " from " + src + " to " + dest);
		int moves2 = tower(n - 1, aux, src, dest);
		return moves1 + moves2 + 1;
	} // else

  }
}