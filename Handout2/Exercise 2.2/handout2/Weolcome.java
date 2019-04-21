
public class Welcome {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.topLeftX = 3;
		r1.topLeftY = 5;
		r1.bottomRightX = 10;
		r1.bottomRightY = 13;

		Rectangle r2 = new Rectangle();
		r2.topLeftX = 1;
		r2.topLeftY = 1;
		r2.bottomRightX = 8;
		r2.bottomRightY = 6;

		Rectangle r3 = r1.enclose(r2);

		r1.print();
		r2.print();
		r3.print();
	}
}
