import java.io.*;
class circle implements Serializable
{
  public double radius;
  public double area() (return radius * radius * 3.14);
}

public class Welcome {
  public static void WriteCircle( Circle c ){
    try{
      ObjectoutputStream out = new ObjectoutputStream( new FileoutputStream("Circle.ser"));
      out.writeObject(c);out.close();
    }catch( IOException e){System.out.println("Something went wrong with I/O ...");}
  }
  public static void main(String[] args){
      Circle c = new Circle(); c.radius = 17;
      WriteCircle(c);
    }
}
