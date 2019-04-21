package handout1;

public class Handout1 {
	public static void main(String[] args) {
		boolean a, b, c, d, e, f, g = false;

		int x = -5;
		int power = 512;
		boolean y = true;
		double item = 1.5;
		double MIN = -12.0;
		char DAY = 'M';
		int num = 12;
		int MAX = 512;
		int Sens = 12;

		a = (x > num) && !y;
		b = (item>MIN)||(DAY!='M');
		c = ((num*128)<power)&&y;
		d = (!(power!=MAX))&&(Sens==num);
		e = ((MIN+x)<num)||(DAY=='M');
		f = (Sens*0)!=0;
		g = (!true||y)&&(!y||false);

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
     }
}
