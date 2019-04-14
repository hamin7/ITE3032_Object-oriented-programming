public class Point{
  // Fields store the point coordinates
  private double x;
  private double y;

  // Create a Point object from a coordinate pair
  public Point(double x, double y){     // double타입의 변수 x, y를 매개변수로 받아.
    this.x = x;     // 이 객체의 x좌표를 받은 x로 잡고.
    this.y = y;     // 이 객체의 y좌표를 받은 y로 잡음.
  }

  // Create a Point object from another Point
  public Point(Point p){      // 이건 무엇?
    x = p.x;
    y = p.y;
  }

  // Get the value of the x coordinate
  double getX(){    // X좌표를 받아 리턴히기.
    return x;
  }

  // Get the value of the y coordinate
  double getY(){      // y좌표를 받아 리턴하기.
    return y;
  }

  public String toString(){
    return x +","+y;
  }
}
