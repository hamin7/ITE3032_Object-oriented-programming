// Circle.java: The circle class that extends GeometricObject
public class Circle {
  protected double radius;

  /** Default constructor */
  public Circle() {
  }

  /** Return radius */
  public double getRadius() {
    return radius;
  }

  /** Set a new radius */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /** Implement the findArea method defined in GeometricObject */
  public double findArea() {
    return radius*radius*Math.PI;
  }

  /** Implement the findPerimeter method defined in GeometricObject */  
  public double findPerimeter() {
    return 2*radius*Math.PI;
  }

  /** Override the equals() method defined in the Object class */
  public boolean equals(Circle circle) {
    return this.radius == circle.getRadius();
  }

  /** Override the toString() method defined in the Object class */
  public String toString() {
    return "[Circle] radius = " + radius;
  }
}