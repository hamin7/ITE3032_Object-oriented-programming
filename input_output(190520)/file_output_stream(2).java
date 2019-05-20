import java.io.*;
class circle implements Serializable
{
  public Circle ref = null;
  public double radius;
  public double area() {return radius * radius * 3.14;}
}

public class Welcome {
  public static void WriteCircle( Circle c ){
    try{
      ObjectoutputStream out = new ObjectoutputStream( new FileoutputStream("Circle.ser"));
      out.writeObject(c);out.close();
    }catch( IOException e){System.out.println("Something went wrong with I/O ...");}
  }
  public static Cirrcle readCircle()
  {
    try{
      ObjectInputStream in = new objectInputStream( new FileInputStream("circle.ser"));
      Object obj = in.readCircle();
      if (obj instanceof Circle){
        return (Circle)obj;
      }
    }catch( IOException e){System.out.println("Something went wrong with I/O ...");}
    return null;
  }
  public static void main(String[] args){
      Circle c = new Circle(); c.radius = 17; Circle c1 = null;
      WriteCircle(c); c1 = readCircle(); System.out.println(c1.radius);
      System.out.println(c1.ref == c1);
    }
}
