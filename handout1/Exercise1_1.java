package handout1;

public class Handout1 {
	public static void main(String[] args) {
		for(int i = 0; i < 20; i++) {
			if(i % 3 == 0)
				continue;
			if(i % 4 == 0)
				i++;
			if(i > 10)
				break;

			System.out.println(i);
		}
	}
}

/* output
1
2
5
7
9
10
*/
