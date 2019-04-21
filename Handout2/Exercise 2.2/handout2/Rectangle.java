
public class Rectangle {
	public double topLeftX, topLeftY, bottomRightX, bottomRightY;
	public Rectangle() {}	// default constructor
	public Rectangle(Rectangle r) {
		this.topLeftX = r.topLeftX;
		this.topLeftY = r.topLeftY;
		this.bottomRightX = r.bottomRightX;
		this.bottomRightY = r.bottomRightY;
	}

	public Rectangle enclose(Rectangle r) {
		Rectangle returnedRec = new Rectangle();

		returnedRec.topLeftX = Math.min(this.topLeftX, r.topLeftX);
		returnedRec.topLeftY = Math.max(this.topLeftY, r.topLeftY);
		returnedRec.bottomRightX = Math.max(this.bottomRightX, r.bottomRightX);
		returnedRec.bottomRightY = Math.min(this.bottomRightY, r.bottomRightY);
		return returnedRec;
	}
	public void print() {
		System.out.println("Rec:("+topLeftX+", "+topLeftY+"), ("+bottomRightX+", "+bottomRightY + ")");
	}
};
