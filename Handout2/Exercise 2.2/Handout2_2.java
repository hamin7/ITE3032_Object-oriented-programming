package handout1;
import javax.swing.JOptionPane;

class Rectangle{
  public double topLeftX, topLeftY, bottomRightX, bottomRightY;
  public Rectangle(){}    //default constructor
  public Rectangle(Rectangle r){
    this.topLeftX = r.topLeftX; this.topLeftY = r.topLeftY;
    this.bottomRightX = r.bottomRightX; this.bottomRightY = r.bottomRightY;
  }
  public Rectangle enclose(Rectangle r){
    Rectangle returnedRec = Rectangle();
    returnedRec.topLeftX = Math.min(this.topLeftX, r.topLeftX);
    returnedRec.topLeftY = Math.max(this.topLeftY, r.topLeftY);
    returnedRec.bottomRightX = Math.max(this.bottomRightX, r.bottomRightX);
    returnedRec.bottomRightY = Math.min(this.bottomRightY, r.bottomRightY);
    return returnedRec;
  }
  public void print(){
    System.out.println("Rec:" + topLeftX + " " + topLeftY + " " + bottomRightX + " " + bottomRightY);
  }
};

public class Welcome{
	public static void main(String arg[]){
    Rectangle r1 = new Rectangle(); r1.topLeftX = 3; r1.topLeftY = 5; r1.bottomRightX = 10; r1.bottomRightY = 13;
    Rectangle r2 = new Rectangle(); r2.topLeftX = 1; r2.topLeftY = 1; r2.bottomRightX = 8; r2.bottomRightY = 6;
    Rectangle r3 = r1.encloses(r2);
    r1.print();
    r2.print();
    r3.print();
		}//for
	}//method
}//class
